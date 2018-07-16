webpackJsonp([1,5],[
/* 0 */,
/* 1 */,
/* 2 */,
/* 3 */,
/* 4 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return MoskitoApplicationService; });
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var MoskitoApplicationService = (function () {
    function MoskitoApplicationService() {
        this.version = "1.1.1-SNAPSHOT";
        this.configToggle = false;
        this.dataRefreshEvent = new __WEBPACK_IMPORTED_MODULE_0__angular_core__["d" /* EventEmitter */]();
        this.applicationChangedEvent = new __WEBPACK_IMPORTED_MODULE_0__angular_core__["d" /* EventEmitter */]();
    }
    MoskitoApplicationService.prototype.refreshData = function () {
        this.dataRefreshEvent.emit();
    };
    MoskitoApplicationService.prototype.switchApplication = function (app) {
        if (!app)
            return;
        this.currentApplication = app;
        this.applicationChangedEvent.emit();
    };
    MoskitoApplicationService.prototype.getComponent = function (componentName) {
        if (!componentName)
            return;
        for (var _i = 0, _a = this.currentApplication.components; _i < _a.length; _i++) {
            var component = _a[_i];
            if (component.name == componentName)
                return component;
        }
        return null;
    };
    MoskitoApplicationService.prototype.setApplicationContextPath = function (path) {
        this.applicationContextPath = path;
    };
    MoskitoApplicationService.prototype.getApplicationContextPath = function () {
        return this.applicationContextPath;
    };
    return MoskitoApplicationService;
}());
MoskitoApplicationService = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["c" /* Injectable */])(),
    __metadata("design:paramtypes", [])
], MoskitoApplicationService);

//# sourceMappingURL=moskito-application.service.js.map

/***/ }),
/* 5 */,
/* 6 */,
/* 7 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_http__ = __webpack_require__(74);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_rxjs_add_operator_map__ = __webpack_require__(252);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_rxjs_add_operator_map___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_2_rxjs_add_operator_map__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3_rxjs_add_operator_catch__ = __webpack_require__(251);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3_rxjs_add_operator_catch___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_3_rxjs_add_operator_catch__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__entities_system_status__ = __webpack_require__(132);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__moskito_application_service__ = __webpack_require__(4);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return HttpService; });
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};






var AccumulatorChartParameters = (function () {
    function AccumulatorChartParameters(application, component, accumulators) {
        this.application = application;
        this.component = component;
        this.accumulators = accumulators;
    }
    return AccumulatorChartParameters;
}());
/**
 * Service responsible for communicating with Moskito-control REST services.
 * @author strel
 */
var HttpService = (function () {
    function HttpService(http, moskitoApplicationService) {
        this.http = http;
        this.moskitoApplicationService = moskitoApplicationService;
        this.x_www_form_urlendoed_header = new __WEBPACK_IMPORTED_MODULE_1__angular_http__["a" /* Headers */]({ 'Content-Type': 'application/x-www-form-urlencoded;charset=utf-8' });
        this.json_header = new __WEBPACK_IMPORTED_MODULE_1__angular_http__["a" /* Headers */]({ 'Content-Type': 'application/json' });
        // Subtracting path to root of application
        var href = window.location.href;
        var javaAppPathIndex = href.indexOf('beta');
        this.url = href.substring(0, javaAppPathIndex == -1 ? href.length : javaAppPathIndex);
        this.url = this.url.endsWith('/') ? this.url : this.url + '/';
        this.moskitoApplicationService.setApplicationContextPath(window.location.pathname.replace('beta', ''));
    }
    HttpService.prototype.changeServer = function (url) {
        this.url = url;
        this.moskitoApplicationService.setApplicationContextPath(window.location.pathname.replace('beta', ''));
        this.moskitoApplicationService.refreshData();
    };
    HttpService.prototype.getUrl = function () {
        return this.url;
    };
    HttpService.prototype.getMoskitoApplications = function () {
        return this.http.get(this.url + 'rest/control').map(function (resp) {
            return resp.json().applications;
        });
    };
    HttpService.prototype.getApplicationComponents = function (appName) {
        return this.http.get(this.url + 'rest/control').map(function (resp) {
            var applications = resp.json().applications;
            for (var _i = 0, applications_1 = applications; _i < applications_1.length; _i++) {
                var app = applications_1[_i];
                if (app.name == appName) {
                    return app.components;
                }
            }
            return [];
        });
    };
    HttpService.prototype.getMoskitoStatus = function () {
        return this.http.get(this.url + 'rest/status').map(function (resp) {
            var response = resp.json();
            var moskitoStatus = new __WEBPACK_IMPORTED_MODULE_4__entities_system_status__["a" /* SystemStatus */]();
            // Getting application statuses
            for (var appName in response.statuses) {
                moskitoStatus.applicationStatuses.push(response.statuses[appName]);
            }
            // Getting updater statuses
            moskitoStatus.chartsUpdater = response.updaterStatuses.charts;
            moskitoStatus.statusUpdater = response.updaterStatuses.status;
            return moskitoStatus;
        });
    };
    HttpService.prototype.getMoskitoConfiguration = function () {
        return this.http.get(this.url + 'rest/configuration').map(function (resp) {
            return resp.json();
        });
    };
    HttpService.prototype.getApplicationHistory = function (application) {
        return this.http.get(this.url + 'rest/history/' + application).map(function (resp) {
            return resp.json().historyItems;
        });
    };
    HttpService.prototype.getApplicationCharts = function (application) {
        return this.http.get(this.url + 'rest/charts/points/' + application).map(function (resp) {
            return resp.json().charts;
        });
    };
    HttpService.prototype.getThresholds = function (application, component) {
        return this.http.get(this.url + 'rest/thresholds/' + application + '/' + component).map(function (resp) {
            return resp.json().thresholds;
        });
    };
    HttpService.prototype.getAccumulatorNames = function (application, component) {
        return this.http.get(this.url + 'rest/accumulators/' + application + '/' + component).map(function (resp) {
            return resp.json().names;
        });
    };
    HttpService.prototype.getAccumulatorCharts = function (application, component, accumulators) {
        var params = new AccumulatorChartParameters(application, component, accumulators);
        return this.http.post(this.url + 'rest/accumulators/charts', params, { headers: this.json_header }).map(function (resp) {
            return resp.json().charts;
        });
    };
    HttpService.prototype.getConnectorConfiguration = function (application, component) {
        return this.http.get(this.url + 'rest/connectors/configuration/' + application + '/' + component).map(function (resp) {
            return resp.json().connectorConfiguration;
        });
    };
    HttpService.prototype.getConnectorInformation = function (application, component) {
        return this.http.get(this.url + 'rest/connectors/information/' + application + '/' + component).map(function (resp) {
            return resp.json().connectorInformation;
        });
    };
    HttpService.prototype.getComponentHistory = function (application, component) {
        return this.http.get(this.url + ("rest/history/" + application + "/" + component)).map(function (resp) {
            return resp.json().historyItems;
        });
    };
    HttpService.prototype.muteNotifications = function () {
        this.http.get(this.url + 'rest/notifications/mute').subscribe();
    };
    HttpService.prototype.unmuteNotifications = function () {
        this.http.get(this.url + 'rest/notifications/unmute').subscribe();
    };
    return HttpService;
}());
HttpService = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["c" /* Injectable */])(),
    __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1__angular_http__["b" /* Http */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__angular_http__["b" /* Http */]) === "function" && _a || Object, typeof (_b = typeof __WEBPACK_IMPORTED_MODULE_5__moskito_application_service__["a" /* MoskitoApplicationService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_5__moskito_application_service__["a" /* MoskitoApplicationService */]) === "function" && _b || Object])
], HttpService);

var _a, _b;
//# sourceMappingURL=http.service.js.map

/***/ }),
/* 8 */,
/* 9 */,
/* 10 */,
/* 11 */,
/* 12 */,
/* 13 */,
/* 14 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__moskito_application_service__ = __webpack_require__(4);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__shared_moskito_component_utils__ = __webpack_require__(44);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__entities_moskito_category__ = __webpack_require__(129);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return CategoriesService; });
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};




/**
 * Manages {MoskitoComponent} categories. Used to retrieve possible
 * categories from components and stores currently applied category filter.
 *
 * @author strel
 */
var CategoriesService = (function () {
    function CategoriesService(moskitoApplicationService) {
        this.moskitoApplicationService = moskitoApplicationService;
        /**
         * Default category, indicating that component belongs to
         * all possible categories.
         */
        this.defaultCategory = new __WEBPACK_IMPORTED_MODULE_3__entities_moskito_category__["a" /* MoskitoCategory */]("All Categories", true);
        this._filter = JSON.parse(sessionStorage.getItem('category'));
        if (!this._filter)
            this._filter = this.defaultCategory;
    }
    /**
     * Builds list of all possible categories from
     * current application components.
     *
     * @returns {Array} current application categories
     */
    CategoriesService.prototype.getCategories = function () {
        // Getting list of current application components
        var components = this.moskitoApplicationService.currentApplication.components;
        var categoriesDictionary = {};
        // Adding default category to dictionary
        this.defaultCategory.status = __WEBPACK_IMPORTED_MODULE_2__shared_moskito_component_utils__["a" /* MoskitoComponentUtils */].getWorthComponentStatus(components);
        this.defaultCategory.components = components;
        categoriesDictionary[this.defaultCategory.name] = this.defaultCategory;
        // Building categories for all components
        for (var _i = 0, components_1 = components; _i < components_1.length; _i++) {
            var component = components_1[_i];
            var category = categoriesDictionary[component.category];
            if (!category) {
                category = new __WEBPACK_IMPORTED_MODULE_3__entities_moskito_category__["a" /* MoskitoCategory */]();
                category.name = component.category;
                category.status = component.color;
                category.active = this.filter.name === category.name;
                category.all = false;
                category.components = [];
            }
            // Changing category status to worth
            category.status = __WEBPACK_IMPORTED_MODULE_2__shared_moskito_component_utils__["a" /* MoskitoComponentUtils */].getWorthStatus([component.color, category.status]);
            category.components.push(component);
            categoriesDictionary[component.category] = category;
        }
        // Moving categories from dictionary to array
        var categories = [];
        for (var categoryName in categoriesDictionary) {
            categories.push(categoriesDictionary[categoryName]);
        }
        return categories;
    };
    CategoriesService.prototype.resetFilter = function () {
        this._filter = this.defaultCategory;
        sessionStorage.setItem('category', JSON.stringify(this.defaultCategory));
    };
    Object.defineProperty(CategoriesService.prototype, "filter", {
        get: function () {
            if (!this._filter)
                this._filter = JSON.parse(sessionStorage.getItem('category'));
            return this._filter;
        },
        set: function (filter) {
            this._filter = filter;
            sessionStorage.setItem('category', JSON.stringify(this._filter));
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(CategoriesService.prototype, "filterString", {
        get: function () {
            if (!this._filter)
                this._filter = JSON.parse(sessionStorage.getItem('category'));
            return this._filter == this.defaultCategory ? "" : this._filter.name;
        },
        enumerable: true,
        configurable: true
    });
    return CategoriesService;
}());
CategoriesService = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["c" /* Injectable */])(),
    __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1__moskito_application_service__["a" /* MoskitoApplicationService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__moskito_application_service__["a" /* MoskitoApplicationService */]) === "function" && _a || Object])
], CategoriesService);

var _a;
//# sourceMappingURL=categories.service.js.map

/***/ }),
/* 15 */,
/* 16 */,
/* 17 */,
/* 18 */,
/* 19 */,
/* 20 */,
/* 21 */,
/* 22 */,
/* 23 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ChartService; });
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var ChartService = (function () {
    function ChartService() {
        this.initializedChartNames = [];
        this.chartsCache = {};
    }
    ChartService.prototype.initializeChart = function (chart, container) {
        var chartData = [];
        for (var _i = 0, _a = chart.points; _i < _a.length; _i++) {
            var point = _a[_i];
            var jsonWithTimestamp = [point.timestamp];
            for (var _b = 0, _c = point.values; _b < _c.length; _b++) {
                var value = _c[_b];
                // Checking is it really number
                var linePoint = Number(value);
                if (!isNaN(linePoint)) {
                    jsonWithTimestamp.push(linePoint);
                }
            }
            chartData.push(jsonWithTimestamp);
        }
        var names = chart.lineNames.map(function (graphNames) {
            return graphNames;
        });
        var domContainer = container.nativeElement ? container.nativeElement : container;
        var chartParams = {
            container: domContainer.id,
            names: names,
            data: chartData,
            colors: [],
            type: 'LineChart',
            title: names,
            dataType: 'datetime',
            previous_chart_params: {},
            options: {
                legendsPerSlice: 5,
                margin: { top: 20, right: 20, bottom: 20, left: 40 }
            }
        };
        chartParams.previous_chart_params = {
            width: domContainer.clientWidth,
            height: domContainer.clientHeight
        };
        // Creating chart
        chartEngineIniter.init(chartParams);
    };
    ChartService.prototype.refreshChart = function (chart, container) {
        var chartData = [];
        for (var _i = 0, _a = chart.points; _i < _a.length; _i++) {
            var point = _a[_i];
            var jsonWithTimestamp = [point.timestamp];
            for (var _b = 0, _c = point.values; _b < _c.length; _b++) {
                var value = _c[_b];
                // Checking is it really number
                var linePoint = Number(value);
                if (!isNaN(linePoint)) {
                    jsonWithTimestamp.push(linePoint);
                }
            }
            chartData.push(jsonWithTimestamp);
        }
        var names = chart.lineNames.map(function (graphNames) {
            return graphNames;
        });
        var containerSelector = '#' + container.nativeElement.id;
        chartEngineIniter.d3charts.dispatch.refreshLineCharts({
            "containerId": containerSelector,
            "data": chartData,
            "names": names
        });
    };
    ChartService.prototype.getChartContent = function (chartName) {
        return this.chartsCache[chartName];
    };
    ChartService.prototype.buildChartBoxID = function (chartName) {
        // If chart name is empty generate id
        if (!chartName) {
            return "chart-" + (Math.floor(Math.random() * 9999) + 1000);
        }
        return chartName.replace(/ /gi, "_");
    };
    return ChartService;
}());
ChartService = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["c" /* Injectable */])(),
    __metadata("design:paramtypes", [])
], ChartService);

//# sourceMappingURL=chart.service.js.map

/***/ }),
/* 24 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return StatusService; });
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var StatusService = (function () {
    function StatusService() {
        this._filter = JSON.parse(sessionStorage.getItem('status'));
        if (!this._filter)
            this._filter = [];
    }
    StatusService.prototype.resetFilter = function () {
        this._filter = [];
        sessionStorage.setItem('status', JSON.stringify([]));
    };
    Object.defineProperty(StatusService.prototype, "filter", {
        get: function () {
            if (!this._filter)
                this._filter = JSON.parse(sessionStorage.getItem('status'));
            return this._filter;
        },
        set: function (filter) {
            this._filter = filter;
            sessionStorage.setItem('status', JSON.stringify(filter));
        },
        enumerable: true,
        configurable: true
    });
    StatusService.prototype.addFilter = function (color) {
        if (this._filter.indexOf(color) === -1) {
            this._filter.push(color);
            // Make new copy of array and assign to same variable to trigger angular change detection
            this._filter = this._filter.slice();
            sessionStorage.setItem('status', JSON.stringify(this._filter));
        }
    };
    StatusService.prototype.removeFilter = function (filterColor) {
        this._filter = this._filter.filter(function (color) {
            return color !== filterColor;
        });
        sessionStorage.setItem('status', JSON.stringify(this._filter));
    };
    return StatusService;
}());
StatusService = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["c" /* Injectable */])(),
    __metadata("design:paramtypes", [])
], StatusService);

//# sourceMappingURL=status.service.js.map

/***/ }),
/* 25 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return Widget; });
var Widget = (function () {
    function Widget() {
    }
    return Widget;
}());

//# sourceMappingURL=widget.component.js.map

/***/ }),
/* 26 */,
/* 27 */,
/* 28 */,
/* 29 */,
/* 30 */,
/* 31 */,
/* 32 */,
/* 33 */,
/* 34 */,
/* 35 */,
/* 36 */,
/* 37 */,
/* 38 */,
/* 39 */,
/* 40 */,
/* 41 */,
/* 42 */,
/* 43 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return WidgetService; });
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var WidgetService = (function () {
    function WidgetService() {
        this.widgets = {
            "status": {
                name: "status",
                component: "MoskitoComponentsWidget",
                displayName: "Status",
                className: "statuses",
                icon: "fa fa-adjust",
                enabled: false
            },
            "tv": {
                name: "tv",
                component: "TvWidget",
                displayName: "TV",
                className: "tv",
                icon: "fa fa-smile-o",
                enabled: false
            },
            "charts": {
                name: "charts",
                component: "ChartsWidget",
                displayName: "Charts",
                className: "charts",
                icon: "fa fa-bar-chart-o",
                enabled: true
            },
            "history": {
                name: "history",
                component: "HistoryWidget",
                displayName: "History",
                className: "history",
                icon: "fa fa-bars",
                enabled: true
            },
            "statusBeta": {
                name: "statusBeta",
                component: "MoskitoBetaComponentsWidget",
                displayName: "Status (beta)",
                className: "statuses",
                icon: "fa fa-adjust",
                enabled: true
            }
        };
    }
    WidgetService.prototype.isWidgetEnabled = function (widget) {
        return this.widgets[widget] && this.widgets[widget].enabled;
    };
    WidgetService.prototype.setWidgetEnabled = function (widget, enabled) {
        if (this.widgets[widget])
            this.widgets[widget].enabled = enabled;
    };
    WidgetService.prototype.toggleWidgetEnabled = function (widget) {
        if (this.widgets[widget])
            this.widgets[widget].enabled = !this.widgets[widget].enabled;
    };
    WidgetService.prototype.getWidgets = function () {
        return this.widgets;
    };
    return WidgetService;
}());
WidgetService = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["c" /* Injectable */])(),
    __metadata("design:paramtypes", [])
], WidgetService);

//# sourceMappingURL=widget.service.js.map

/***/ }),
/* 44 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return MoskitoComponentUtils; });
var Status;
(function (Status) {
    Status[Status["NONE"] = 0] = "NONE";
    Status[Status["PURPLE"] = 1] = "PURPLE";
    Status[Status["RED"] = 2] = "RED";
    Status[Status["ORANGE"] = 3] = "ORANGE";
    Status[Status["YELLOW"] = 4] = "YELLOW";
    Status[Status["GREEN"] = 5] = "GREEN";
})(Status || (Status = {}));
var MoskitoComponentUtils = (function () {
    function MoskitoComponentUtils() {
    }
    MoskitoComponentUtils.getWorthComponentStatus = function (components) {
        var worthStatus = Status.GREEN;
        for (var _i = 0, components_1 = components; _i < components_1.length; _i++) {
            var component = components_1[_i];
            var componentStatus = Status[component.color];
            if (componentStatus < worthStatus) {
                worthStatus = componentStatus;
            }
        }
        return Status[worthStatus];
    };
    MoskitoComponentUtils.getWorthStatus = function (statuses) {
        var worthStatus = Status.GREEN;
        for (var _i = 0, statuses_1 = statuses; _i < statuses_1.length; _i++) {
            var status = statuses_1[_i];
            if (Status[status] < worthStatus) {
                worthStatus = Status[status];
            }
        }
        return Status[worthStatus];
    };
    MoskitoComponentUtils.orderComponentsByCategories = function (components) {
        var categories = {};
        for (var _i = 0, components_2 = components; _i < components_2.length; _i++) {
            var component = components_2[_i];
            if (!categories[component.category]) {
                categories[component.category] = [];
            }
            categories[component.category].push(component);
        }
        return categories;
    };
    return MoskitoComponentUtils;
}());

//# sourceMappingURL=moskito-component-utils.js.map

/***/ }),
/* 45 */,
/* 46 */,
/* 47 */,
/* 48 */,
/* 49 */,
/* 50 */,
/* 51 */,
/* 52 */,
/* 53 */,
/* 54 */,
/* 55 */,
/* 56 */,
/* 57 */,
/* 58 */,
/* 59 */,
/* 60 */,
/* 61 */,
/* 62 */,
/* 63 */,
/* 64 */,
/* 65 */,
/* 66 */,
/* 67 */,
/* 68 */,
/* 69 */,
/* 70 */,
/* 71 */,
/* 72 */,
/* 73 */,
/* 74 */,
/* 75 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return TimerComponent; });
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var TimerComponent = (function () {
    function TimerComponent() {
    }
    TimerComponent.prototype.ngOnInit = function () {
        this.initTimer();
    };
    TimerComponent.prototype.hasFinished = function () {
        return this.timer.hasFinished;
    };
    TimerComponent.prototype.initTimer = function () {
        if (!this.timeInSeconds) {
            this.timeInSeconds = 0;
        }
        this.timer = {
            seconds: this.timeInSeconds,
            runTimer: false,
            hasStarted: false,
            hasFinished: false,
            secondsRemaining: this.timeInSeconds
        };
        this.lastRefreshTimestamp = new Date();
    };
    TimerComponent.prototype.startTimer = function () {
        this.timer.hasStarted = true;
        this.timer.runTimer = true;
        this.timerTick();
    };
    TimerComponent.prototype.restartTimer = function () {
        this.initTimer();
        this.startTimer();
    };
    TimerComponent.prototype.pauseTimer = function () {
        this.timer.runTimer = false;
    };
    TimerComponent.prototype.resumeTimer = function () {
        this.startTimer();
    };
    TimerComponent.prototype.timerTick = function () {
        var _this = this;
        setTimeout(function () {
            if (!_this.timer.runTimer) {
                return;
            }
            _this.timer.secondsRemaining--;
            if (_this.timer.secondsRemaining > 0) {
                _this.timerTick();
            }
            else {
                _this.timer.hasFinished = true;
                _this.callback();
                _this.restartTimer();
            }
        }, 1000);
    };
    return TimerComponent;
}());
__decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["O" /* Input */])(),
    __metadata("design:type", Number)
], TimerComponent.prototype, "timeInSeconds", void 0);
__decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["O" /* Input */])(),
    __metadata("design:type", Function)
], TimerComponent.prototype, "callback", void 0);
TimerComponent = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_13" /* Component */])({
        selector: 'timer',
        template: __webpack_require__(240)
    }),
    __metadata("design:paramtypes", [])
], TimerComponent);

//# sourceMappingURL=timer.component.js.map

/***/ }),
/* 76 */,
/* 77 */,
/* 78 */,
/* 79 */,
/* 80 */,
/* 81 */,
/* 82 */,
/* 83 */,
/* 84 */,
/* 85 */,
/* 86 */,
/* 87 */,
/* 88 */,
/* 89 */,
/* 90 */,
/* 91 */,
/* 92 */,
/* 93 */,
/* 94 */,
/* 95 */,
/* 96 */,
/* 97 */,
/* 98 */,
/* 99 */,
/* 100 */,
/* 101 */,
/* 102 */,
/* 103 */
/***/ (function(module, exports) {

function webpackEmptyContext(req) {
	throw new Error("Cannot find module '" + req + "'.");
}
webpackEmptyContext.keys = function() { return []; };
webpackEmptyContext.resolve = webpackEmptyContext;
module.exports = webpackEmptyContext;
webpackEmptyContext.id = 103;


/***/ }),
/* 104 */,
/* 105 */,
/* 106 */,
/* 107 */,
/* 108 */,
/* 109 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
Object.defineProperty(__webpack_exports__, "__esModule", { value: true });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_platform_browser_dynamic__ = __webpack_require__(122);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__app_app_module__ = __webpack_require__(125);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__environments_environment__ = __webpack_require__(155);




if (__WEBPACK_IMPORTED_MODULE_3__environments_environment__["a" /* environment */].production) {
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["a" /* enableProdMode */])();
}
__webpack_require__.i(__WEBPACK_IMPORTED_MODULE_1__angular_platform_browser_dynamic__["a" /* platformBrowserDynamic */])().bootstrapModule(__WEBPACK_IMPORTED_MODULE_2__app_app_module__["a" /* AppModule */]);
//# sourceMappingURL=main.js.map

/***/ }),
/* 110 */,
/* 111 */,
/* 112 */,
/* 113 */,
/* 114 */,
/* 115 */,
/* 116 */,
/* 117 */,
/* 118 */,
/* 119 */,
/* 120 */,
/* 121 */,
/* 122 */,
/* 123 */,
/* 124 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return AppComponent; });
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};

var AppComponent = (function () {
    function AppComponent() {
    }
    return AppComponent;
}());
AppComponent = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_13" /* Component */])({
        selector: 'app-root',
        template: __webpack_require__(230),
        styles: [__webpack_require__(214)]
    })
], AppComponent);

//# sourceMappingURL=app.component.js.map

/***/ }),
/* 125 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__shared_shared_module__ = __webpack_require__(148);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_core__ = __webpack_require__(0);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__app_component__ = __webpack_require__(124);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__scan_column_navigation_scan_column_navigation_component__ = __webpack_require__(142);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__scan_column_navigation_connect_component__ = __webpack_require__(141);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__content_content_component__ = __webpack_require__(126);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6__scan_column_navigation_categories_component__ = __webpack_require__(140);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_7__scan_column_navigation_widgets_toggle_component__ = __webpack_require__(144);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_8__scan_column_navigation_statistics_component__ = __webpack_require__(143);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_9__widgets_tv_widget_component__ = __webpack_require__(154);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_10__widgets_charts_widget_component__ = __webpack_require__(149);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_11__widgets_history_widget_component__ = __webpack_require__(150);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_12__widgets_moskito_components_widget_component__ = __webpack_require__(153);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_13__settings_settings_component__ = __webpack_require__(146);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_14__services_widget_service__ = __webpack_require__(43);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_15__services_http_service__ = __webpack_require__(7);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_16__services_moskito_application_service__ = __webpack_require__(4);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_17__services_chart_service__ = __webpack_require__(23);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_18__shared_notifications_notifications_config_component__ = __webpack_require__(147);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_19__pipes_keys_pipe__ = __webpack_require__(138);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_20__widgets_moskito_beta_components_widget_component__ = __webpack_require__(152);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_21__services_categories_service__ = __webpack_require__(14);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_22__services_status_service__ = __webpack_require__(24);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_23__pipes_components_category_filter_pipe__ = __webpack_require__(134);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_24__pipes_history_category_filter_pipe__ = __webpack_require__(136);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_25__pipes_components_status_filter_pipe__ = __webpack_require__(135);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_26__pipes_history_status_filter_pipe__ = __webpack_require__(137);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_27__pipes_sanitarize_html_pipe__ = __webpack_require__(139);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_28__services_health_status_service__ = __webpack_require__(145);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_29__angular_router__ = __webpack_require__(123);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_30__home_home_component__ = __webpack_require__(133);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_31__widgets_modal_component_inspection_modal_component__ = __webpack_require__(151);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return AppModule; });
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
































var appRoutes = [
    {
        path: 'beta',
        component: __WEBPACK_IMPORTED_MODULE_30__home_home_component__["a" /* HomeComponent */]
    },
    {
        path: '',
        redirectTo: '/beta',
        pathMatch: 'full'
    }
];
var AppModule = (function () {
    function AppModule() {
    }
    return AppModule;
}());
AppModule = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_1__angular_core__["b" /* NgModule */])({
        declarations: [
            __WEBPACK_IMPORTED_MODULE_2__app_component__["a" /* AppComponent */],
            __WEBPACK_IMPORTED_MODULE_30__home_home_component__["a" /* HomeComponent */],
            __WEBPACK_IMPORTED_MODULE_3__scan_column_navigation_scan_column_navigation_component__["a" /* ScanColumnNavigationComponent */],
            __WEBPACK_IMPORTED_MODULE_5__content_content_component__["a" /* ContentComponent */],
            __WEBPACK_IMPORTED_MODULE_6__scan_column_navigation_categories_component__["a" /* CategoriesComponent */],
            __WEBPACK_IMPORTED_MODULE_7__scan_column_navigation_widgets_toggle_component__["a" /* WidgetsToggleComponent */],
            __WEBPACK_IMPORTED_MODULE_8__scan_column_navigation_statistics_component__["a" /* StatisticsComponent */],
            __WEBPACK_IMPORTED_MODULE_9__widgets_tv_widget_component__["a" /* TvWidget */],
            __WEBPACK_IMPORTED_MODULE_10__widgets_charts_widget_component__["a" /* ChartsWidget */],
            __WEBPACK_IMPORTED_MODULE_11__widgets_history_widget_component__["a" /* HistoryWidget */],
            __WEBPACK_IMPORTED_MODULE_12__widgets_moskito_components_widget_component__["a" /* MoskitoComponentsWidget */],
            __WEBPACK_IMPORTED_MODULE_13__settings_settings_component__["a" /* SettingsComponent */],
            __WEBPACK_IMPORTED_MODULE_18__shared_notifications_notifications_config_component__["a" /* NotificationsConfigComponent */],
            __WEBPACK_IMPORTED_MODULE_4__scan_column_navigation_connect_component__["a" /* ConnectComponent */],
            __WEBPACK_IMPORTED_MODULE_20__widgets_moskito_beta_components_widget_component__["a" /* MoskitoBetaComponentsWidget */],
            __WEBPACK_IMPORTED_MODULE_31__widgets_modal_component_inspection_modal_component__["a" /* ComponentInspectionModalComponent */],
            // Pipes
            __WEBPACK_IMPORTED_MODULE_19__pipes_keys_pipe__["a" /* KeysPipe */],
            __WEBPACK_IMPORTED_MODULE_23__pipes_components_category_filter_pipe__["a" /* ComponentsCategoryFilterPipe */],
            __WEBPACK_IMPORTED_MODULE_25__pipes_components_status_filter_pipe__["a" /* ComponentsStatusFilterPipe */],
            __WEBPACK_IMPORTED_MODULE_24__pipes_history_category_filter_pipe__["a" /* HistoryCategoryFilterPipe */],
            __WEBPACK_IMPORTED_MODULE_26__pipes_history_status_filter_pipe__["a" /* HistoryStatusFilterPipe */],
            __WEBPACK_IMPORTED_MODULE_27__pipes_sanitarize_html_pipe__["a" /* SanitizeHtmlPipe */]
        ],
        imports: [
            __WEBPACK_IMPORTED_MODULE_0__shared_shared_module__["a" /* SharedModule */],
            // Routes
            __WEBPACK_IMPORTED_MODULE_29__angular_router__["a" /* RouterModule */].forRoot(appRoutes)
        ],
        providers: [
            __WEBPACK_IMPORTED_MODULE_14__services_widget_service__["a" /* WidgetService */],
            __WEBPACK_IMPORTED_MODULE_15__services_http_service__["a" /* HttpService */],
            __WEBPACK_IMPORTED_MODULE_28__services_health_status_service__["a" /* HealthStatusService */],
            __WEBPACK_IMPORTED_MODULE_16__services_moskito_application_service__["a" /* MoskitoApplicationService */],
            __WEBPACK_IMPORTED_MODULE_17__services_chart_service__["a" /* ChartService */],
            __WEBPACK_IMPORTED_MODULE_21__services_categories_service__["a" /* CategoriesService */],
            __WEBPACK_IMPORTED_MODULE_22__services_status_service__["a" /* StatusService */]
        ],
        bootstrap: [__WEBPACK_IMPORTED_MODULE_2__app_component__["a" /* AppComponent */]]
    })
], AppModule);

//# sourceMappingURL=app.module.js.map

/***/ }),
/* 126 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__services_http_service__ = __webpack_require__(7);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__services_moskito_application_service__ = __webpack_require__(4);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__shared_timer_timer_component__ = __webpack_require__(75);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__services_categories_service__ = __webpack_require__(14);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__services_widget_service__ = __webpack_require__(43);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ContentComponent; });
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};






/**
 * Responsible for general view: component widgets, charts, tv widget, history items
 * and header rendering. Loads moskito applications list and initializes refresh timer component.
 *
 * @author strel
 */
var ContentComponent = (function () {
    function ContentComponent(widgetService, moskitoApplicationService, httpService, categoriesService) {
        this.widgetService = widgetService;
        this.moskitoApplicationService = moskitoApplicationService;
        this.httpService = httpService;
        this.categoriesService = categoriesService;
        this.applicationDataLoaded = false;
    }
    ContentComponent.prototype.ngOnInit = function () {
        var _this = this;
        // Getting list of all applications
        this.httpService.getMoskitoApplications().subscribe(function (applications) {
            _this.applications = applications;
            _this.moskitoApplicationService.currentApplication = applications[0];
            _this.applicationDataLoaded = true;
        });
        this.initTimer();
    };
    /**
     * Handler is called by data refresh timer each 60 seconds.
     * It refreshes all Moskito Control data without reload.
     */
    ContentComponent.prototype.onDataRefresh = function () {
        this.moskitoApplicationService.refreshData();
    };
    /**
     * Sets Moskito-Control configuration mode.
     * @param mode configuration mode indicator
     */
    ContentComponent.prototype.setConfigurationMode = function (mode) {
        this.configToggle = mode;
        // Not
        if (!mode)
            this.initTimer();
        else
            this.timer.pauseTimer();
    };
    ContentComponent.prototype.setApplication = function (app) {
        this.categoriesService.resetFilter();
        this.moskitoApplicationService.switchApplication(app);
    };
    ContentComponent.prototype.initTimer = function () {
        var _this = this;
        setTimeout(function () {
            _this.timer.callback = _this.onDataRefresh.bind(_this);
            _this.timer.startTimer();
        }, 1000);
    };
    ContentComponent.prototype.keys = function () {
        return Object.keys(this.applications);
    };
    return ContentComponent;
}());
__decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_16" /* ViewChild */])('dataRefreshTimer'),
    __metadata("design:type", typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_3__shared_timer_timer_component__["a" /* TimerComponent */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_3__shared_timer_timer_component__["a" /* TimerComponent */]) === "function" && _a || Object)
], ContentComponent.prototype, "timer", void 0);
ContentComponent = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_13" /* Component */])({
        selector: 'content',
        template: __webpack_require__(231)
    }),
    __metadata("design:paramtypes", [typeof (_b = typeof __WEBPACK_IMPORTED_MODULE_5__services_widget_service__["a" /* WidgetService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_5__services_widget_service__["a" /* WidgetService */]) === "function" && _b || Object, typeof (_c = typeof __WEBPACK_IMPORTED_MODULE_2__services_moskito_application_service__["a" /* MoskitoApplicationService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_2__services_moskito_application_service__["a" /* MoskitoApplicationService */]) === "function" && _c || Object, typeof (_d = typeof __WEBPACK_IMPORTED_MODULE_1__services_http_service__["a" /* HttpService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__services_http_service__["a" /* HttpService */]) === "function" && _d || Object, typeof (_e = typeof __WEBPACK_IMPORTED_MODULE_4__services_categories_service__["a" /* CategoriesService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_4__services_categories_service__["a" /* CategoriesService */]) === "function" && _e || Object])
], ContentComponent);

var _a, _b, _c, _d, _e;
//# sourceMappingURL=content.component.js.map

/***/ }),
/* 127 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return HistoryItem; });
/**
 * Contains one element in the history view widget.
 * A history event is a change in the component's health status.
 *
 * @author strel
 */
var HistoryItem = (function () {
    function HistoryItem() {
    }
    return HistoryItem;
}());

//# sourceMappingURL=history-item.js.map

/***/ }),
/* 128 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return MoskitoApplication; });
/**
 * Represents an application in the view.
 * @author strel
 */
var MoskitoApplication = (function () {
    function MoskitoApplication() {
    }
    return MoskitoApplication;
}());

//# sourceMappingURL=moskito-application.js.map

/***/ }),
/* 129 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return MoskitoCategory; });
/**
 * Represents a single category in the view menu.
 *
 * @author strel
 */
var MoskitoCategory = (function () {
    function MoskitoCategory(name, active, status) {
        this.name = name;
        this.active = active;
        this.status = status;
    }
    return MoskitoCategory;
}());

//# sourceMappingURL=moskito-category.js.map

/***/ }),
/* 130 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return MoskitoComponent; });
/**
 * Application component.
 *
 * @author strel
 */
var MoskitoComponent = (function () {
    function MoskitoComponent() {
    }
    return MoskitoComponent;
}());

//# sourceMappingURL=moskito-component.js.map

/***/ }),
/* 131 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return StatusStatistics; });
/**
 * Possible moskito health statuses varying from none and very bad
 * to good or healthy.
 */
var HealthStatus;
(function (HealthStatus) {
    HealthStatus[HealthStatus["NONE"] = 0] = "NONE";
    HealthStatus[HealthStatus["PURPLE"] = 1] = "PURPLE";
    HealthStatus[HealthStatus["RED"] = 2] = "RED";
    HealthStatus[HealthStatus["ORANGE"] = 3] = "ORANGE";
    HealthStatus[HealthStatus["YELLOW"] = 4] = "YELLOW";
    HealthStatus[HealthStatus["GREEN"] = 5] = "GREEN";
})(HealthStatus || (HealthStatus = {}));
/**
 * Represents health status statistics used in statistics view.
 * Stores number of components for each health status.
 */
var StatusStatistics = (function () {
    function StatusStatistics(status, componentsCount, selected) {
        this.status = status;
        this.numberOfComponents = componentsCount;
        this.selected = selected || false;
    }
    /**
     * Returns empty statistics, i.e. all possible statuses with no components in it.
     *
     * @returns {{PURPLE: number, RED: number, ORANGE: number, YELLOW: number, GREEN: number}}
     */
    StatusStatistics.getDefaultStatistics = function () {
        return {
            PURPLE: 0,
            RED: 0,
            ORANGE: 0,
            YELLOW: 0,
            GREEN: 0
        };
    };
    return StatusStatistics;
}());

//# sourceMappingURL=status-statistic.js.map

/***/ }),
/* 132 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return SystemStatus; });
/**
 * Shows general system configuration and status.
 * It includes:
 *
 * <ul>
 *     <li>Applications:
 *      <ul>
 *         <li>Components settings: name, category, connector type, location</li>
 *         <li>Charts data description: components and accumulators to be visualized, chart limit</li>
 *      </ul>
 *     </li>
 *     <li>Used connectors</li>
 *     <li>Status updater configuration</li>
 *     <li>Charts updater configuration</li>
 * </ul>
 *
 * @author strel
 */
var SystemStatus = (function () {
    function SystemStatus() {
        this.applicationStatuses = [];
    }
    return SystemStatus;
}());

//# sourceMappingURL=system-status.js.map

/***/ }),
/* 133 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__services_http_service__ = __webpack_require__(7);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__services_moskito_application_service__ = __webpack_require__(4);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return HomeComponent; });
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};



var HomeComponent = (function () {
    function HomeComponent(moskitoApplicationService, httpService) {
        this.moskitoApplicationService = moskitoApplicationService;
        this.httpService = httpService;
    }
    HomeComponent.prototype.ngOnInit = function () {
        var _this = this;
        // Getting list of all applications
        this.httpService.getMoskitoApplications().subscribe(function (applications) {
            _this.moskitoApplicationService.applications = applications;
            _this.moskitoApplicationService.currentApplication = applications[0];
            _this.applicationDataLoaded = true;
        });
    };
    return HomeComponent;
}());
HomeComponent = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_13" /* Component */])({
        selector: 'home',
        template: __webpack_require__(232)
    }),
    __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_2__services_moskito_application_service__["a" /* MoskitoApplicationService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_2__services_moskito_application_service__["a" /* MoskitoApplicationService */]) === "function" && _a || Object, typeof (_b = typeof __WEBPACK_IMPORTED_MODULE_1__services_http_service__["a" /* HttpService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__services_http_service__["a" /* HttpService */]) === "function" && _b || Object])
], HomeComponent);

var _a, _b;
//# sourceMappingURL=home.component.js.map

/***/ }),
/* 134 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__services_categories_service__ = __webpack_require__(14);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ComponentsCategoryFilterPipe; });
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


/**
 * Components pipe used to filter components by
 * specified category. Filter is triggered by scan column
 * item toggles in Category section.
 *
 * @author strel
 */
var ComponentsCategoryFilterPipe = (function () {
    function ComponentsCategoryFilterPipe(_categoryService) {
        this._categoryService = _categoryService;
    }
    /**
     * Filters list of {MoksitoComponent} by specified category.
     * If category name is empty, filter is bypassed.
     *
     * @param components List of {MoskitoComponent} to filter
     * @param category Component category name used as filter
     * @returns List of filtered {MoskitoComponent}
     */
    ComponentsCategoryFilterPipe.prototype.transform = function (components, category) {
        if (!components) {
            return [];
        }
        if (!category || this._categoryService.defaultCategory.name === category) {
            return components;
        }
        var filteredComponents = [];
        for (var _i = 0, components_1 = components; _i < components_1.length; _i++) {
            var component = components_1[_i];
            if (component.category == category) {
                filteredComponents.push(component);
            }
        }
        return filteredComponents;
    };
    return ComponentsCategoryFilterPipe;
}());
ComponentsCategoryFilterPipe = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Y" /* Pipe */])({ name: 'componentsByCategoryFilter' }),
    __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1__services_categories_service__["a" /* CategoriesService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__services_categories_service__["a" /* CategoriesService */]) === "function" && _a || Object])
], ComponentsCategoryFilterPipe);

var _a;
//# sourceMappingURL=components-category-filter.pipe.js.map

/***/ }),
/* 135 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ComponentsStatusFilterPipe; });
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};

/**
 * Components pipe used to filter components by
 * specified health status. Filter is triggered by scan column
 * item toggles in Statistics section.
 *
 * @author strel
 */
var ComponentsStatusFilterPipe = (function () {
    function ComponentsStatusFilterPipe() {
    }
    /**
     * Filters Moskito components by specified health status.
     * If status name is empty, filter is bypassed.
     *
     * @param components List of Moskito components to filter
     * @param statuses Health status used as filter
     * @returns List of filtered Moskito components
     */
    ComponentsStatusFilterPipe.prototype.transform = function (components, statuses) {
        if (!components) {
            return [];
        }
        if (!statuses || statuses.length === 0) {
            return components;
        }
        var filteredComponents = [];
        for (var _i = 0, components_1 = components; _i < components_1.length; _i++) {
            var component = components_1[_i];
            for (var _a = 0, statuses_1 = statuses; _a < statuses_1.length; _a++) {
                var selectedStatus = statuses_1[_a];
                if (component.color === selectedStatus) {
                    filteredComponents.push(component);
                    break;
                }
            }
        }
        return filteredComponents;
    };
    return ComponentsStatusFilterPipe;
}());
ComponentsStatusFilterPipe = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Y" /* Pipe */])({ name: 'componentsByStatusFilter' })
], ComponentsStatusFilterPipe);

//# sourceMappingURL=components-status-filter.pipe.js.map

/***/ }),
/* 136 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__services_categories_service__ = __webpack_require__(14);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return HistoryCategoryFilterPipe; });
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


/**
 * History items pipe used to filter history items by
 * specified component category. Filter is triggered by scan column
 * item toggles in Category section.
 *
 * @author strel
 */
var HistoryCategoryFilterPipe = (function () {
    function HistoryCategoryFilterPipe(_categoryService) {
        this._categoryService = _categoryService;
    }
    /**
     * Filters list of history items by specified component category.
     * If category name is empty, filter is bypassed.
     *
     * @param historyItems List of history items to filter
     * @param category Affected component category name used as filter
     * @returns List of filtered history items
     */
    HistoryCategoryFilterPipe.prototype.transform = function (historyItems, category) {
        if (!historyItems) {
            return [];
        }
        if (!category || this._categoryService.defaultCategory.name === category) {
            return historyItems;
        }
        var filteredHistoryItems = [];
        for (var _i = 0, historyItems_1 = historyItems; _i < historyItems_1.length; _i++) {
            var item = historyItems_1[_i];
            if (item.component && item.component.category == category) {
                filteredHistoryItems.push(item);
            }
        }
        return filteredHistoryItems;
    };
    return HistoryCategoryFilterPipe;
}());
HistoryCategoryFilterPipe = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Y" /* Pipe */])({ name: 'historyByCategoryFilter' }),
    __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1__services_categories_service__["a" /* CategoriesService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__services_categories_service__["a" /* CategoriesService */]) === "function" && _a || Object])
], HistoryCategoryFilterPipe);

var _a;
//# sourceMappingURL=history-category-filter.pipe.js.map

/***/ }),
/* 137 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return HistoryStatusFilterPipe; });
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};

/**
 * History items pipe used to filter history items by
 * specified health status. Filter is triggered by scan column
 * item toggles in Statistics section.
 *
 * @author strel
 */
var HistoryStatusFilterPipe = (function () {
    function HistoryStatusFilterPipe() {
    }
    /**
     * Filters history items by specified health status.
     * If status name is empty, filter is bypassed.
     *
     * @param historyItems List of history items to filter
     * @param status Health status used as filter
     * @returns List of filtered history items
     */
    HistoryStatusFilterPipe.prototype.transform = function (historyItems, status) {
        if (!historyItems) {
            return [];
        }
        if (!status || status.length === 0) {
            return historyItems;
        }
        var filteredHistoryItems = [];
        for (var _i = 0, historyItems_1 = historyItems; _i < historyItems_1.length; _i++) {
            var item = historyItems_1[_i];
            for (var _a = 0, status_1 = status; _a < status_1.length; _a++) {
                var selectedStatus = status_1[_a];
                if (item.component && item.component.color === selectedStatus) {
                    filteredHistoryItems.push(item);
                }
            }
        }
        return filteredHistoryItems;
    };
    return HistoryStatusFilterPipe;
}());
HistoryStatusFilterPipe = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Y" /* Pipe */])({ name: 'historyByStatusFilter' })
], HistoryStatusFilterPipe);

//# sourceMappingURL=history-status-filter.pipe.js.map

/***/ }),
/* 138 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return KeysPipe; });
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};

/**
 * Presents object as array of key - value pairs.
 * Used mainly in ngFor directive to iterate over objects.
 *
 * @author strel
 */
var KeysPipe = (function () {
    function KeysPipe() {
    }
    KeysPipe.prototype.transform = function (value, args) {
        var keys = [];
        for (var key in value) {
            keys.push({ key: key, value: value[key] });
        }
        return keys;
    };
    return KeysPipe;
}());
KeysPipe = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Y" /* Pipe */])({ name: 'keys' })
], KeysPipe);

//# sourceMappingURL=keys.pipe.js.map

/***/ }),
/* 139 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_platform_browser__ = __webpack_require__(22);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return SanitizeHtmlPipe; });
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


/**
 * Sanitizes HTML layout and produces safe HTML for
 * further embedding in DOM.
 *
 * Used mainly in component inspection modal
 * to sanitize checkboxes for accumulators tab.
 *
 * @author strel
 */
var SanitizeHtmlPipe = (function () {
    function SanitizeHtmlPipe(_sanitizer) {
        this._sanitizer = _sanitizer;
    }
    SanitizeHtmlPipe.prototype.transform = function (v) {
        return this._sanitizer.bypassSecurityTrustHtml(v);
    };
    return SanitizeHtmlPipe;
}());
SanitizeHtmlPipe = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Y" /* Pipe */])({
        name: 'sanitizeHtml'
    }),
    __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1__angular_platform_browser__["c" /* DomSanitizer */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__angular_platform_browser__["c" /* DomSanitizer */]) === "function" && _a || Object])
], SanitizeHtmlPipe);

var _a;
//# sourceMappingURL=sanitarize-html.pipe.js.map

/***/ }),
/* 140 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__services_categories_service__ = __webpack_require__(14);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__services_moskito_application_service__ = __webpack_require__(4);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return CategoriesComponent; });
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};



var CategoriesComponent = (function () {
    function CategoriesComponent(moskitoApplicationService, categoriesService) {
        this.moskitoApplicationService = moskitoApplicationService;
        this.categoriesService = categoriesService;
    }
    CategoriesComponent.prototype.ngOnInit = function () {
        var _this = this;
        this.moskitoApplicationService.dataRefreshEvent.subscribe(function () { return _this.refresh(); });
        this.moskitoApplicationService.applicationChangedEvent.subscribe(function () { return _this.refresh(); });
        this.refresh();
    };
    CategoriesComponent.prototype.refresh = function () {
        this.categories = this.categoriesService.getCategories();
    };
    CategoriesComponent.prototype.setFilter = function (category) {
        this.categoriesService.filter = category;
    };
    CategoriesComponent.prototype.clearFilter = function (event) {
        event.preventDefault();
        this.categoriesService.resetFilter();
    };
    return CategoriesComponent;
}());
CategoriesComponent = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_13" /* Component */])({
        selector: 'categories',
        template: __webpack_require__(233)
    }),
    __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_2__services_moskito_application_service__["a" /* MoskitoApplicationService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_2__services_moskito_application_service__["a" /* MoskitoApplicationService */]) === "function" && _a || Object, typeof (_b = typeof __WEBPACK_IMPORTED_MODULE_1__services_categories_service__["a" /* CategoriesService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__services_categories_service__["a" /* CategoriesService */]) === "function" && _b || Object])
], CategoriesComponent);

var _a, _b;
//# sourceMappingURL=categories.component.js.map

/***/ }),
/* 141 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__services_http_service__ = __webpack_require__(7);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ConnectComponent; });
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


/**
 * @author strel
 */
var ConnectComponent = (function () {
    function ConnectComponent(httpService) {
        this.httpService = httpService;
    }
    ConnectComponent.prototype.connectServer = function () {
        this.httpService.changeServer(this.host + this.port + this.path);
    };
    return ConnectComponent;
}());
ConnectComponent = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_13" /* Component */])({
        selector: 'quick-connect',
        template: __webpack_require__(234),
        styles: [__webpack_require__(215)]
    }),
    __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1__services_http_service__["a" /* HttpService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__services_http_service__["a" /* HttpService */]) === "function" && _a || Object])
], ConnectComponent);

var _a;
//# sourceMappingURL=connect.component.js.map

/***/ }),
/* 142 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__services_moskito_application_service__ = __webpack_require__(4);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ScanColumnNavigationComponent; });
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var ScanColumnNavigationComponent = (function () {
    function ScanColumnNavigationComponent(moskitoApplicationService) {
        this.moskitoApplicationService = moskitoApplicationService;
    }
    ScanColumnNavigationComponent.prototype.ngOnInit = function () {
        this.version = this.moskitoApplicationService.version;
        this.configToggle = this.moskitoApplicationService.configToggle;
    };
    return ScanColumnNavigationComponent;
}());
ScanColumnNavigationComponent = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_13" /* Component */])({
        selector: 'scan-column',
        template: __webpack_require__(235)
    }),
    __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1__services_moskito_application_service__["a" /* MoskitoApplicationService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__services_moskito_application_service__["a" /* MoskitoApplicationService */]) === "function" && _a || Object])
], ScanColumnNavigationComponent);

var _a;
//# sourceMappingURL=scan-column-navigation.component.js.map

/***/ }),
/* 143 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__services_moskito_application_service__ = __webpack_require__(4);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__entities_status_statistic__ = __webpack_require__(131);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__services_status_service__ = __webpack_require__(24);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return StatisticsComponent; });
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};




var StatisticsComponent = (function () {
    function StatisticsComponent(moskitoApplicationService, statusService) {
        this.moskitoApplicationService = moskitoApplicationService;
        this.statusService = statusService;
    }
    StatisticsComponent.prototype.ngOnInit = function () {
        var _this = this;
        this.moskitoApplicationService.dataRefreshEvent.subscribe(function () { return _this.refresh(); });
        this.moskitoApplicationService.applicationChangedEvent.subscribe(function () { return _this.refresh(); });
        this.refresh();
    };
    StatisticsComponent.prototype.refresh = function () {
        this.statistics = [];
        var statsDictionary = __WEBPACK_IMPORTED_MODULE_2__entities_status_statistic__["a" /* StatusStatistics */].getDefaultStatistics();
        for (var _i = 0, _a = this.moskitoApplicationService.currentApplication.components; _i < _a.length; _i++) {
            var component = _a[_i];
            if (!statsDictionary[component.color]) {
                statsDictionary[component.color] = 0;
            }
            statsDictionary[component.color] += 1;
        }
        var statusFilter = this.statusService.filter;
        // Transfer status dictionary to array of statistics objects
        for (var status in statsDictionary) {
            this.statistics.push(new __WEBPACK_IMPORTED_MODULE_2__entities_status_statistic__["a" /* StatusStatistics */](status, statsDictionary[status], statusFilter.indexOf(status) !== -1));
        }
    };
    StatisticsComponent.prototype.addStatusFilter = function (status) {
        this.statusService.addFilter(status.status);
        status.selected = true;
    };
    StatisticsComponent.prototype.removeStatusFilter = function (status) {
        this.statusService.removeFilter(status.status);
        status.selected = false;
    };
    StatisticsComponent.prototype.clearFilter = function (event) {
        event.preventDefault();
        this.statusService.resetFilter();
        // Clear selected for all stats
        this.statistics.forEach(function (stat) { return stat.selected = false; });
    };
    return StatisticsComponent;
}());
StatisticsComponent = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_13" /* Component */])({
        selector: 'statistics',
        template: __webpack_require__(236)
    }),
    __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1__services_moskito_application_service__["a" /* MoskitoApplicationService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__services_moskito_application_service__["a" /* MoskitoApplicationService */]) === "function" && _a || Object, typeof (_b = typeof __WEBPACK_IMPORTED_MODULE_3__services_status_service__["a" /* StatusService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_3__services_status_service__["a" /* StatusService */]) === "function" && _b || Object])
], StatisticsComponent);

var _a, _b;
//# sourceMappingURL=statistics.component.js.map

/***/ }),
/* 144 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__services_moskito_application_service__ = __webpack_require__(4);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__services_widget_service__ = __webpack_require__(43);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return WidgetsToggleComponent; });
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};



var WidgetsToggleComponent = (function () {
    function WidgetsToggleComponent(widgetService, moskitoApplicationService) {
        this.widgetService = widgetService;
        this.moskitoApplicationService = moskitoApplicationService;
    }
    WidgetsToggleComponent.prototype.ngOnInit = function () {
        var _this = this;
        this.moskitoApplicationService.dataRefreshEvent.subscribe(function () { return _this.refresh(); });
        this.moskitoApplicationService.applicationChangedEvent.subscribe(function () { return _this.refresh(); });
        this.refresh();
    };
    WidgetsToggleComponent.prototype.refresh = function () {
        this.widgets = [];
        var widgetDictionary = this.widgetService.getWidgets();
        for (var widgetName in widgetDictionary) {
            this.widgets.push(widgetDictionary[widgetName]);
        }
    };
    WidgetsToggleComponent.prototype.toggleWidget = function (widget) {
        this.widgetService.toggleWidgetEnabled(widget.name);
    };
    WidgetsToggleComponent.prototype.isWidgetEnabled = function (widget) {
        return this.widgetService.isWidgetEnabled(widget.name);
    };
    return WidgetsToggleComponent;
}());
WidgetsToggleComponent = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_13" /* Component */])({
        selector: 'widgets-toggle',
        template: __webpack_require__(237)
    }),
    __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_2__services_widget_service__["a" /* WidgetService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_2__services_widget_service__["a" /* WidgetService */]) === "function" && _a || Object, typeof (_b = typeof __WEBPACK_IMPORTED_MODULE_1__services_moskito_application_service__["a" /* MoskitoApplicationService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__services_moskito_application_service__["a" /* MoskitoApplicationService */]) === "function" && _b || Object])
], WidgetsToggleComponent);

var _a, _b;
//# sourceMappingURL=widgets-toggle.component.js.map

/***/ }),
/* 145 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return HealthStatusService; });
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};

/**
 * Service is responsible for managing health statuses / colors.
 */
var HealthStatusService = (function () {
    function HealthStatusService() {
        this.NONE = "none";
        this.PURPLE = "purple";
        this.RED = "red";
        this.ORANGE = "orange";
        this.YELLOW = "yellow";
        this.GREEN = "green";
        this.colors = [
            this.NONE, this.PURPLE, this.RED,
            this.ORANGE, this.YELLOW, this.GREEN
        ];
    }
    /**
     * Returns health status by specified name.
     */
    HealthStatusService.prototype.resolveColor = function (name) {
        for (var _i = 0, _a = this.colors; _i < _a.length; _i++) {
            var color = _a[_i];
            if (color == name.toLowerCase())
                return color;
        }
        return this.NONE;
    };
    return HealthStatusService;
}());
HealthStatusService = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["c" /* Injectable */])()
], HealthStatusService);

//# sourceMappingURL=health-status.service.js.map

/***/ }),
/* 146 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__services_http_service__ = __webpack_require__(7);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return SettingsComponent; });
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var SettingsComponent = (function () {
    function SettingsComponent(httpService) {
        this.httpService = httpService;
    }
    SettingsComponent.prototype.ngOnInit = function () {
        var _this = this;
        this.httpService.getMoskitoConfiguration().subscribe(function (configuration) {
            _this.configuration = configuration;
        });
    };
    return SettingsComponent;
}());
SettingsComponent = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_13" /* Component */])({
        selector: 'settings',
        template: __webpack_require__(238),
        styles: [__webpack_require__(216)]
    }),
    __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1__services_http_service__["a" /* HttpService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__services_http_service__["a" /* HttpService */]) === "function" && _a || Object])
], SettingsComponent);

var _a;
//# sourceMappingURL=settings.component.js.map

/***/ }),
/* 147 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__services_http_service__ = __webpack_require__(7);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return NotificationsConfigComponent; });
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var NotificationsConfigComponent = (function () {
    function NotificationsConfigComponent(httpService) {
        this.httpService = httpService;
        this.notificationsMuted = false;
        this.notificationsMutingTime = 60;
        this.notificationsRemainingMutingTime = 0;
    }
    NotificationsConfigComponent.prototype.muteNotifications = function () {
        if (this.notificationsMuted) {
            return;
        }
        this.notificationsMuted = true;
        this.notificationsMutingTime = 60;
        this.notificationsRemainingMutingTime = 60;
        this.httpService.muteNotifications();
        // Starting timer
        this.timerTick();
    };
    NotificationsConfigComponent.prototype.unmuteNotifications = function () {
        this.notificationsMuted = false;
        this.notificationsMutingTime = 60;
        this.notificationsRemainingMutingTime = 0;
        this.httpService.unmuteNotifications();
    };
    NotificationsConfigComponent.prototype.timerTick = function () {
        var _this = this;
        setTimeout(function () {
            if (!_this.notificationsMuted) {
                return;
            }
            _this.notificationsRemainingMutingTime--;
            if (_this.notificationsRemainingMutingTime > 0) {
                _this.timerTick();
            }
            else {
                _this.unmuteNotifications();
            }
        }, 60000);
    };
    return NotificationsConfigComponent;
}());
NotificationsConfigComponent = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_13" /* Component */])({
        selector: 'notifications-config',
        template: __webpack_require__(239)
    }),
    __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1__services_http_service__["a" /* HttpService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__services_http_service__["a" /* HttpService */]) === "function" && _a || Object])
], NotificationsConfigComponent);

var _a;
//# sourceMappingURL=notifications-config.component.js.map

/***/ }),
/* 148 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_platform_browser__ = __webpack_require__(22);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__angular_forms__ = __webpack_require__(121);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__angular_http__ = __webpack_require__(74);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__timer_timer_component__ = __webpack_require__(75);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return SharedModule; });
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};





var SharedModule = (function () {
    function SharedModule() {
    }
    return SharedModule;
}());
SharedModule = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["b" /* NgModule */])({
        declarations: [
            __WEBPACK_IMPORTED_MODULE_4__timer_timer_component__["a" /* TimerComponent */]
        ],
        imports: [
            __WEBPACK_IMPORTED_MODULE_1__angular_platform_browser__["b" /* BrowserModule */],
            __WEBPACK_IMPORTED_MODULE_2__angular_forms__["a" /* FormsModule */],
            __WEBPACK_IMPORTED_MODULE_2__angular_forms__["b" /* ReactiveFormsModule */],
            __WEBPACK_IMPORTED_MODULE_3__angular_http__["c" /* HttpModule */]
        ],
        exports: [
            // Shared Modules
            __WEBPACK_IMPORTED_MODULE_1__angular_platform_browser__["b" /* BrowserModule */],
            __WEBPACK_IMPORTED_MODULE_2__angular_forms__["a" /* FormsModule */],
            __WEBPACK_IMPORTED_MODULE_2__angular_forms__["b" /* ReactiveFormsModule */],
            __WEBPACK_IMPORTED_MODULE_3__angular_http__["c" /* HttpModule */],
            // Shared Components
            __WEBPACK_IMPORTED_MODULE_4__timer_timer_component__["a" /* TimerComponent */]
        ],
        providers: [],
    })
], SharedModule);

//# sourceMappingURL=shared.module.js.map

/***/ }),
/* 149 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__widget_component__ = __webpack_require__(25);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__services_http_service__ = __webpack_require__(7);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__services_moskito_application_service__ = __webpack_require__(4);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__services_chart_service__ = __webpack_require__(23);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ChartsWidget; });
var __extends = (this && this.__extends) || (function () {
    var extendStatics = Object.setPrototypeOf ||
        ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
        function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};





var ChartsWidget = (function (_super) {
    __extends(ChartsWidget, _super);
    function ChartsWidget(httpService, moskitoApplicationService, chartService) {
        var _this = _super.call(this) || this;
        _this.httpService = httpService;
        _this.moskitoApplicationService = moskitoApplicationService;
        _this.chartService = chartService;
        _this.chartsDataLoaded = false;
        _this.chartBoxesInitialized = false;
        return _this;
    }
    ChartsWidget.prototype.ngOnInit = function () {
        var _this = this;
        this.moskitoApplicationService.dataRefreshEvent.subscribe(function () { return _this.refresh(); });
        this.moskitoApplicationService.applicationChangedEvent.subscribe(function () { return _this.createBoxes(); });
        // Loading charts
        this.httpService.getApplicationCharts(this.moskitoApplicationService.currentApplication.name).subscribe(function (charts) {
            _this.charts = charts;
            _this.chartsDataLoaded = true;
        });
    };
    ChartsWidget.prototype.ngAfterViewInit = function () {
        var _this = this;
        this.boxes.changes.subscribe(function (boxes) {
            var boxesAsArray = boxes.toArray();
            if (_this.chartsDataLoaded) {
                _this.initializeCharts(_this.charts, boxesAsArray);
            }
        });
    };
    ChartsWidget.prototype.initializeCharts = function (charts, chartBoxes) {
        for (var i = 0; i < charts.length; i++) {
            this.chartService.initializeChart(charts[i], chartBoxes[i]);
        }
    };
    ChartsWidget.prototype.refreshCharts = function (charts, chartBoxes) {
        for (var i = 0; i < charts.length; i++) {
            this.chartService.refreshChart(charts[i], chartBoxes[i]);
        }
    };
    ChartsWidget.prototype.onChartClick = function (event, chart) {
        var target = event.currentTarget;
        var body = document.querySelector('body');
        var svg = target.querySelector('svg');
        // Getting first non fullscreen box
        var referenceElement;
        for (var _i = 0, _a = this.boxes.toArray(); _i < _a.length; _i++) {
            var chartBox = _a[_i];
            if (!chartBox.nativeElement.classList.contains('chart_fullscreen')) {
                referenceElement = chartBox.nativeElement.querySelector('svg');
                break;
            }
        }
        body.classList.toggle('fullscreen');
        target.classList.toggle('chart_fullscreen');
        this.fullscreenChart = chart;
        if (!target.classList.contains('chart_fullscreen')) {
            svg.setAttribute("width", referenceElement ? referenceElement.clientWidth : 800);
            svg.setAttribute("height", referenceElement ? referenceElement.clientHeight - 3 : 300);
            this.fullscreenChart = null;
        }
        chartEngineIniter.d3charts.dispatch.refreshLineChart("#" + target.id, true);
    };
    ChartsWidget.prototype.createBoxes = function () {
        var _this = this;
        this.httpService.getApplicationCharts(this.moskitoApplicationService.currentApplication.name).subscribe(function (charts) {
            _this.charts = charts;
        });
    };
    /**
    *
    */
    ChartsWidget.prototype.refresh = function () {
        var _this = this;
        this.httpService.getApplicationCharts(this.moskitoApplicationService.currentApplication.name).subscribe(function (charts) {
            _this.refreshCharts(charts, _this.boxes.toArray());
        });
    };
    return ChartsWidget;
}(__WEBPACK_IMPORTED_MODULE_1__widget_component__["a" /* Widget */]));
__decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_14" /* ViewChildren */])('chart_box'),
    __metadata("design:type", typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_0__angular_core__["_15" /* QueryList */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_0__angular_core__["_15" /* QueryList */]) === "function" && _a || Object)
], ChartsWidget.prototype, "boxes", void 0);
ChartsWidget = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_13" /* Component */])({
        selector: 'charts-widget',
        template: __webpack_require__(241)
    }),
    __metadata("design:paramtypes", [typeof (_b = typeof __WEBPACK_IMPORTED_MODULE_2__services_http_service__["a" /* HttpService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_2__services_http_service__["a" /* HttpService */]) === "function" && _b || Object, typeof (_c = typeof __WEBPACK_IMPORTED_MODULE_3__services_moskito_application_service__["a" /* MoskitoApplicationService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_3__services_moskito_application_service__["a" /* MoskitoApplicationService */]) === "function" && _c || Object, typeof (_d = typeof __WEBPACK_IMPORTED_MODULE_4__services_chart_service__["a" /* ChartService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_4__services_chart_service__["a" /* ChartService */]) === "function" && _d || Object])
], ChartsWidget);

var _a, _b, _c, _d;
//# sourceMappingURL=charts-widget.component.js.map

/***/ }),
/* 150 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__services_http_service__ = __webpack_require__(7);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__services_moskito_application_service__ = __webpack_require__(4);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__widget_component__ = __webpack_require__(25);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__entities_history_item__ = __webpack_require__(127);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__services_categories_service__ = __webpack_require__(14);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6__services_status_service__ = __webpack_require__(24);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return HistoryWidget; });
var __extends = (this && this.__extends) || (function () {
    var extendStatics = Object.setPrototypeOf ||
        ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
        function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};







var HistoryWidget = (function (_super) {
    __extends(HistoryWidget, _super);
    function HistoryWidget(httpService, moskitoApplicationService, categoriesService, statusService) {
        var _this = _super.call(this) || this;
        _this.httpService = httpService;
        _this.moskitoApplicationService = moskitoApplicationService;
        _this.categoriesService = categoriesService;
        _this.statusService = statusService;
        return _this;
    }
    HistoryWidget.prototype.ngOnInit = function () {
        var _this = this;
        this.moskitoApplicationService.dataRefreshEvent.subscribe(function () { return _this.refresh(); });
        this.moskitoApplicationService.applicationChangedEvent.subscribe(function () { return _this.refresh(); });
        this.refresh();
    };
    HistoryWidget.prototype.refresh = function () {
        var _this = this;
        // Getting list of history items for given application
        this.httpService.getApplicationHistory(this.moskitoApplicationService.currentApplication.name).subscribe(function (historyItems) {
            _this.historyItems = [];
            for (var _i = 0, historyItems_1 = historyItems; _i < historyItems_1.length; _i++) {
                var historyItem = historyItems_1[_i];
                var item = new __WEBPACK_IMPORTED_MODULE_4__entities_history_item__["a" /* HistoryItem */]();
                item.component = _this.moskitoApplicationService.getComponent(historyItem.componentName);
                item.oldStatus = historyItem.oldStatus;
                item.newStatus = historyItem.newStatus;
                item.timestamp = historyItem.timestamp;
                item.isoTimestamp = historyItem.isoTimestamp;
                item.oldMessages = historyItem.oldMessages;
                item.newMessages = historyItem.newMessages;
                _this.historyItems.push(item);
            }
        });
    };
    return HistoryWidget;
}(__WEBPACK_IMPORTED_MODULE_3__widget_component__["a" /* Widget */]));
HistoryWidget = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_13" /* Component */])({
        selector: 'history-widget',
        template: __webpack_require__(242)
    }),
    __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1__services_http_service__["a" /* HttpService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__services_http_service__["a" /* HttpService */]) === "function" && _a || Object, typeof (_b = typeof __WEBPACK_IMPORTED_MODULE_2__services_moskito_application_service__["a" /* MoskitoApplicationService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_2__services_moskito_application_service__["a" /* MoskitoApplicationService */]) === "function" && _b || Object, typeof (_c = typeof __WEBPACK_IMPORTED_MODULE_5__services_categories_service__["a" /* CategoriesService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_5__services_categories_service__["a" /* CategoriesService */]) === "function" && _c || Object, typeof (_d = typeof __WEBPACK_IMPORTED_MODULE_6__services_status_service__["a" /* StatusService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_6__services_status_service__["a" /* StatusService */]) === "function" && _d || Object])
], HistoryWidget);

var _a, _b, _c, _d;
//# sourceMappingURL=history-widget.component.js.map

/***/ }),
/* 151 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__entities_moskito_application__ = __webpack_require__(128);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__entities_moskito_component__ = __webpack_require__(130);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__services_http_service__ = __webpack_require__(7);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__services_chart_service__ = __webpack_require__(23);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ComponentInspectionModalComponent; });
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};





var ComponentInspectionModalComponent = (function () {
    function ComponentInspectionModalComponent(httpService, chartService) {
        this.httpService = httpService;
        this.chartService = chartService;
    }
    ComponentInspectionModalComponent.prototype.ngOnInit = function () {
        var _this = this;
        // Getting list of thresholds
        this.httpService.getThresholds(this.application.name, this.component.name).subscribe(function (thresholds) {
            _this.thresholds = thresholds;
        });
        // Getting list of accumulator names
        this.httpService.getAccumulatorNames(this.application.name, this.component.name).subscribe(function (names) {
            _this.accumulatorNames = names;
        });
        this.accumulatorCharts = [];
        this.checkedAccumulators = [];
    };
    ComponentInspectionModalComponent.prototype.ngAfterViewInit = function () {
        var _this = this;
        this.chartBoxes.changes.subscribe(function (boxes) {
            if (_this.accumulatorChartsDataLoaded) {
                _this.initializeCharts(_this.accumulatorCharts, boxes.toArray());
            }
        });
    };
    ComponentInspectionModalComponent.prototype.toggleAccumulatorChart = function (event, accumulatorName) {
        var _this = this;
        // Toggling accumulator charts
        var showChart = event.target.checked;
        if (showChart) {
            // If checkbox is checked and there is no accumulator in list, add it
            if (this.checkedAccumulators.indexOf(accumulatorName, 0) == -1) {
                this.checkedAccumulators.push(accumulatorName);
            }
        }
        else {
            // Removing accumulator name from list if checkbox is unchecked
            var index = this.checkedAccumulators.indexOf(accumulatorName, 0);
            if (index > -1) {
                this.checkedAccumulators.splice(index, 1);
            }
        }
        this.httpService.getAccumulatorCharts(this.application.name, this.component.name, this.checkedAccumulators).subscribe(function (charts) {
            _this.accumulatorCharts = charts;
            _this.accumulatorChartsDataLoaded = true;
        });
    };
    ComponentInspectionModalComponent.prototype.initializeCharts = function (charts, chartBoxes) {
        if (!charts || !chartBoxes) {
            return;
        }
        for (var i = 0; i < charts.length; i++) {
            this.chartService.initializeChart(charts[i], chartBoxes[i]);
        }
    };
    return ComponentInspectionModalComponent;
}());
__decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["O" /* Input */])(),
    __metadata("design:type", typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1__entities_moskito_application__["a" /* MoskitoApplication */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__entities_moskito_application__["a" /* MoskitoApplication */]) === "function" && _a || Object)
], ComponentInspectionModalComponent.prototype, "application", void 0);
__decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["O" /* Input */])(),
    __metadata("design:type", typeof (_b = typeof __WEBPACK_IMPORTED_MODULE_2__entities_moskito_component__["a" /* MoskitoComponent */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_2__entities_moskito_component__["a" /* MoskitoComponent */]) === "function" && _b || Object)
], ComponentInspectionModalComponent.prototype, "component", void 0);
__decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_14" /* ViewChildren */])('chart_box'),
    __metadata("design:type", typeof (_c = typeof __WEBPACK_IMPORTED_MODULE_0__angular_core__["_15" /* QueryList */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_0__angular_core__["_15" /* QueryList */]) === "function" && _c || Object)
], ComponentInspectionModalComponent.prototype, "chartBoxes", void 0);
ComponentInspectionModalComponent = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_13" /* Component */])({
        selector: 'component-inspection-modal',
        template: __webpack_require__(243)
    }),
    __metadata("design:paramtypes", [typeof (_d = typeof __WEBPACK_IMPORTED_MODULE_3__services_http_service__["a" /* HttpService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_3__services_http_service__["a" /* HttpService */]) === "function" && _d || Object, typeof (_e = typeof __WEBPACK_IMPORTED_MODULE_4__services_chart_service__["a" /* ChartService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_4__services_chart_service__["a" /* ChartService */]) === "function" && _e || Object])
], ComponentInspectionModalComponent);

var _a, _b, _c, _d, _e;
//# sourceMappingURL=component-inspection-modal.component.js.map

/***/ }),
/* 152 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__widget_component__ = __webpack_require__(25);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__shared_moskito_component_utils__ = __webpack_require__(44);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__services_moskito_application_service__ = __webpack_require__(4);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__services_http_service__ = __webpack_require__(7);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__services_categories_service__ = __webpack_require__(14);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6__services_status_service__ = __webpack_require__(24);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_7__services_chart_service__ = __webpack_require__(23);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return MoskitoBetaComponentsWidget; });
var __extends = (this && this.__extends) || (function () {
    var extendStatics = Object.setPrototypeOf ||
        ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
        function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};








var MoskitoBetaComponentsWidget = (function (_super) {
    __extends(MoskitoBetaComponentsWidget, _super);
    function MoskitoBetaComponentsWidget(httpService, moskitoApplicationService, categoriesService, statusService, chartService) {
        var _this = _super.call(this) || this;
        _this.httpService = httpService;
        _this.moskitoApplicationService = moskitoApplicationService;
        _this.categoriesService = categoriesService;
        _this.statusService = statusService;
        _this.chartService = chartService;
        _this.componentUtils = __WEBPACK_IMPORTED_MODULE_2__shared_moskito_component_utils__["a" /* MoskitoComponentUtils */];
        _this.resetAccumulatorsData();
        return _this;
    }
    MoskitoBetaComponentsWidget.prototype.ngOnInit = function () {
        var _this = this;
        this.moskitoApplicationService.dataRefreshEvent.subscribe(function () { return _this.refresh(); });
        this.moskitoApplicationService.applicationChangedEvent.subscribe(function () {
            _this.refresh();
            _this.resetAccumulatorsData();
        });
        this.refresh();
    };
    MoskitoBetaComponentsWidget.prototype.ngAfterViewInit = function () {
        var _this = this;
        this.chartBoxes.changes.subscribe(function (boxes) {
            if (_this.accumulatorChartsDataLoaded) {
                _this.initializeCharts(_this.accumulatorCharts);
            }
        });
    };
    MoskitoBetaComponentsWidget.prototype.getComponentInspectionModalData = function (componentName) {
        var _this = this;
        this.resetComponentInspectionData();
        // Getting component's connector information
        this.httpService.getConnectorConfiguration(this.currentApplication.name, componentName).subscribe(function (connector) {
            _this.connector = connector;
            // Loading data for the first available tab
            if (connector) {
                if (connector.supportsThresholds) {
                    _this.loadThresholdsData(componentName);
                }
                else if (connector.supportsAccumulators) {
                    _this.loadAccumulatorsData(componentName);
                }
                else if (connector.supportsInfo) {
                    _this.loadConnectorInformation(componentName);
                }
            }
            _this.loadComponentHistory(componentName);
        }, function (error) {
            console.error("Can't obtain connector for component %s: %s", componentName, error);
        });
    };
    MoskitoBetaComponentsWidget.prototype.loadThresholdsData = function (componentName) {
        var _this = this;
        if (this.connector.supportsThresholds) {
            this.httpService.getThresholds(this.currentApplication.name, componentName).subscribe(function (thresholds) {
                _this.thresholds = thresholds;
            });
        }
    };
    MoskitoBetaComponentsWidget.prototype.loadAccumulatorsData = function (componentName) {
        var _this = this;
        if (this.connector.supportsAccumulators) {
            this.httpService.getAccumulatorNames(this.currentApplication.name, componentName).subscribe(function (names) {
                _this.accumulatorNames = names;
            });
            // Getting checked accumulator charts
            this.accumulatorCharts = this.accumulatorChartsMap[componentName];
        }
    };
    MoskitoBetaComponentsWidget.prototype.loadConnectorInformation = function (componentName) {
        var _this = this;
        if (this.connector.supportsInfo) {
            this.httpService.getConnectorInformation(this.currentApplication.name, componentName).subscribe(function (connector) {
                _this.connector.info = connector.info;
            });
        }
    };
    MoskitoBetaComponentsWidget.prototype.loadComponentHistory = function (componentName) {
        var _this = this;
        this.httpService.getComponentHistory(this.currentApplication.name, componentName).subscribe(function (history) {
            _this.history = history;
        });
    };
    MoskitoBetaComponentsWidget.prototype.toggleAccumulatorChart = function (event, componentName, accumulatorName) {
        var _this = this;
        var currentApp = this.moskitoApplicationService.currentApplication;
        if (!currentApp) {
            return;
        }
        // Toggling accumulator charts
        var showChart = event.target.checked;
        // Initializing accumulator names array
        if (!this.checkedAccumulatorsMap[componentName]) {
            this.checkedAccumulatorsMap[componentName] = [];
        }
        if (showChart) {
            // If checkbox is checked and there is no accumulator in list, add it
            if (this.checkedAccumulatorsMap[componentName].indexOf(accumulatorName, 0) == -1) {
                this.checkedAccumulatorsMap[componentName].push(accumulatorName);
            }
        }
        else {
            // Removing accumulator name from list if checkbox is unchecked
            var index = this.checkedAccumulatorsMap[componentName].indexOf(accumulatorName, 0);
            if (index > -1) {
                this.checkedAccumulatorsMap[componentName].splice(index, 1);
            }
        }
        this.httpService.getAccumulatorCharts(currentApp.name, componentName, this.checkedAccumulatorsMap[componentName]).subscribe(function (charts) {
            _this.accumulatorCharts = charts;
            _this.accumulatorChartsMap[componentName] = charts;
            _this.accumulatorChartsDataLoaded = true;
        });
        // Scroll top
        this.inspectionModals.forEach(function (modal) {
            var modalContent = modal.nativeElement.querySelector('.modal-body');
            if (modalContent)
                modalContent.scrollTop = 0;
        });
    };
    MoskitoBetaComponentsWidget.prototype.initializeCharts = function (charts) {
        if (!charts) {
            return;
        }
        var _loop_1 = function (chart) {
            var chartBox = this_1.chartBoxes.find(function (element) {
                return element.nativeElement.id == chart.divId;
            });
            this_1.chartService.initializeChart(chart, chartBox);
        };
        var this_1 = this;
        for (var _i = 0, charts_1 = charts; _i < charts_1.length; _i++) {
            var chart = charts_1[_i];
            _loop_1(chart);
        }
    };
    MoskitoBetaComponentsWidget.prototype.resetComponentInspectionData = function () {
        this.connector = null;
        this.thresholds = [];
        this.accumulatorNames = [];
        this.accumulatorCharts = [];
    };
    MoskitoBetaComponentsWidget.prototype.resetAccumulatorsData = function () {
        this.checkedAccumulatorsMap = {};
        this.accumulatorChartsMap = {};
        this.accumulatorChartsDataLoaded = false;
    };
    MoskitoBetaComponentsWidget.prototype.refresh = function () {
        this.currentApplication = this.moskitoApplicationService.currentApplication;
        this.components = this.moskitoApplicationService.currentApplication.components;
        this.categories = __WEBPACK_IMPORTED_MODULE_2__shared_moskito_component_utils__["a" /* MoskitoComponentUtils */].orderComponentsByCategories(this.components);
        // Initialize drag-n-drop and tooltips for components
        setTimeout(function () {
            SetupComponentsView();
        }, 1000);
    };
    return MoskitoBetaComponentsWidget;
}(__WEBPACK_IMPORTED_MODULE_1__widget_component__["a" /* Widget */]));
__decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_14" /* ViewChildren */])('chart_box'),
    __metadata("design:type", typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_0__angular_core__["_15" /* QueryList */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_0__angular_core__["_15" /* QueryList */]) === "function" && _a || Object)
], MoskitoBetaComponentsWidget.prototype, "chartBoxes", void 0);
__decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_14" /* ViewChildren */])('componentInspectionModal'),
    __metadata("design:type", typeof (_b = typeof __WEBPACK_IMPORTED_MODULE_0__angular_core__["_15" /* QueryList */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_0__angular_core__["_15" /* QueryList */]) === "function" && _b || Object)
], MoskitoBetaComponentsWidget.prototype, "inspectionModals", void 0);
MoskitoBetaComponentsWidget = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_13" /* Component */])({
        selector: 'beta-components-widget',
        template: __webpack_require__(244)
    }),
    __metadata("design:paramtypes", [typeof (_c = typeof __WEBPACK_IMPORTED_MODULE_4__services_http_service__["a" /* HttpService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_4__services_http_service__["a" /* HttpService */]) === "function" && _c || Object, typeof (_d = typeof __WEBPACK_IMPORTED_MODULE_3__services_moskito_application_service__["a" /* MoskitoApplicationService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_3__services_moskito_application_service__["a" /* MoskitoApplicationService */]) === "function" && _d || Object, typeof (_e = typeof __WEBPACK_IMPORTED_MODULE_5__services_categories_service__["a" /* CategoriesService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_5__services_categories_service__["a" /* CategoriesService */]) === "function" && _e || Object, typeof (_f = typeof __WEBPACK_IMPORTED_MODULE_6__services_status_service__["a" /* StatusService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_6__services_status_service__["a" /* StatusService */]) === "function" && _f || Object, typeof (_g = typeof __WEBPACK_IMPORTED_MODULE_7__services_chart_service__["a" /* ChartService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_7__services_chart_service__["a" /* ChartService */]) === "function" && _g || Object])
], MoskitoBetaComponentsWidget);

var _a, _b, _c, _d, _e, _f, _g;
//# sourceMappingURL=moskito-beta-components-widget.component.js.map

/***/ }),
/* 153 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__widget_component__ = __webpack_require__(25);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__shared_moskito_component_utils__ = __webpack_require__(44);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__services_moskito_application_service__ = __webpack_require__(4);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__services_http_service__ = __webpack_require__(7);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__services_status_service__ = __webpack_require__(24);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6__services_categories_service__ = __webpack_require__(14);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_7__services_chart_service__ = __webpack_require__(23);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return MoskitoComponentsWidget; });
var __extends = (this && this.__extends) || (function () {
    var extendStatics = Object.setPrototypeOf ||
        ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
        function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};








var ComponentInspectionModalData = (function () {
    function ComponentInspectionModalData() {
    }
    return ComponentInspectionModalData;
}());
var MoskitoComponentsWidget = (function (_super) {
    __extends(MoskitoComponentsWidget, _super);
    function MoskitoComponentsWidget(httpService, moskitoApplicationService, categoriesService, statusService, chartService) {
        var _this = _super.call(this) || this;
        _this.httpService = httpService;
        _this.moskitoApplicationService = moskitoApplicationService;
        _this.categoriesService = categoriesService;
        _this.statusService = statusService;
        _this.chartService = chartService;
        _this.componentUtils = __WEBPACK_IMPORTED_MODULE_2__shared_moskito_component_utils__["a" /* MoskitoComponentUtils */];
        _this.resetComponentInspectionData();
        return _this;
    }
    MoskitoComponentsWidget.prototype.ngOnInit = function () {
        var _this = this;
        this.moskitoApplicationService.dataRefreshEvent.subscribe(function () { return _this.refresh(); });
        this.moskitoApplicationService.applicationChangedEvent.subscribe(function () {
            _this.refresh();
            _this.resetComponentInspectionData();
        });
        this.refresh();
    };
    MoskitoComponentsWidget.prototype.ngAfterViewInit = function () {
        var _this = this;
        this.chartBoxes.changes.subscribe(function (boxes) {
            if (_this.accumulatorChartsDataLoaded) {
                _this.initializeCharts(_this.accumulatorCharts);
            }
        });
    };
    MoskitoComponentsWidget.prototype.getComponentInspectionModalData = function (componentName) {
        var _this = this;
        // Getting component's connector information
        this.httpService.getConnectorConfiguration(this.currentApplication.name, componentName).subscribe(function (connector) {
            _this.connector = connector;
            // Loading data for the first available tab
            if (connector) {
                if (connector.supportsThresholds) {
                    _this.loadThresholdsData(componentName);
                }
                else if (connector.supportsAccumulators) {
                    _this.loadAccumulatorsData(componentName);
                }
                else if (connector.supportsInfo) {
                    _this.loadConnectorInformation(componentName);
                }
            }
            _this.loadComponentHistory(componentName);
        });
    };
    MoskitoComponentsWidget.prototype.loadThresholdsData = function (componentName) {
        var _this = this;
        if (this.connector.supportsThresholds) {
            this.httpService.getThresholds(this.currentApplication.name, componentName).subscribe(function (thresholds) {
                _this.thresholds = thresholds;
            });
        }
    };
    MoskitoComponentsWidget.prototype.loadAccumulatorsData = function (componentName) {
        var _this = this;
        if (this.connector.supportsAccumulators) {
            this.httpService.getAccumulatorNames(this.currentApplication.name, componentName).subscribe(function (names) {
                _this.accumulatorNames = names;
            });
            // Getting checked accumulator charts
            this.accumulatorCharts = this.accumulatorChartsMap[componentName];
        }
    };
    MoskitoComponentsWidget.prototype.loadConnectorInformation = function (componentName) {
        var _this = this;
        if (this.connector.supportsInfo) {
            this.httpService.getConnectorInformation(this.currentApplication.name, componentName).subscribe(function (connector) {
                _this.connector.info = connector.info;
            });
        }
    };
    MoskitoComponentsWidget.prototype.toggleAccumulatorChart = function (event, componentName, accumulatorName) {
        var _this = this;
        var currentApp = this.moskitoApplicationService.currentApplication;
        if (!currentApp) {
            return;
        }
        // Toggling accumulator charts
        var showChart = event.target.checked;
        // Initializing accumulator names array
        if (!this.checkedAccumulatorsMap[componentName]) {
            this.checkedAccumulatorsMap[componentName] = [];
        }
        if (showChart) {
            // If checkbox is checked and there is no accumulator in list, add it
            if (this.checkedAccumulatorsMap[componentName].indexOf(accumulatorName, 0) == -1) {
                this.checkedAccumulatorsMap[componentName].push(accumulatorName);
            }
        }
        else {
            // Removing accumulator name from list if checkbox is unchecked
            var index = this.checkedAccumulatorsMap[componentName].indexOf(accumulatorName, 0);
            if (index > -1) {
                this.checkedAccumulatorsMap[componentName].splice(index, 1);
            }
        }
        this.httpService.getAccumulatorCharts(currentApp.name, componentName, this.checkedAccumulatorsMap[componentName]).subscribe(function (charts) {
            _this.accumulatorCharts = charts;
            _this.accumulatorChartsMap[componentName] = charts;
            _this.accumulatorChartsDataLoaded = true;
        });
        // Scroll top
        this.inspectionModals.forEach(function (modal) {
            var modalContent = modal.nativeElement.querySelector('.modal-body');
            if (modalContent)
                modalContent.scrollTop = 0;
        });
    };
    MoskitoComponentsWidget.prototype.loadComponentHistory = function (componentName) {
        var _this = this;
        this.httpService.getComponentHistory(this.currentApplication.name, componentName).subscribe(function (history) {
            _this.history = history;
        });
    };
    MoskitoComponentsWidget.prototype.initializeCharts = function (charts) {
        if (!charts) {
            return;
        }
        var _loop_1 = function (chart) {
            var chartBox = this_1.chartBoxes.find(function (element) {
                return element.nativeElement.id == chart.divId;
            });
            this_1.chartService.initializeChart(chart, chartBox);
        };
        var this_1 = this;
        for (var _i = 0, charts_1 = charts; _i < charts_1.length; _i++) {
            var chart = charts_1[_i];
            _loop_1(chart);
        }
    };
    MoskitoComponentsWidget.prototype.resetComponentInspectionData = function () {
        this.checkedAccumulatorsMap = {};
        this.accumulatorChartsMap = {};
        this.accumulatorChartsDataLoaded = false;
    };
    MoskitoComponentsWidget.prototype.refresh = function () {
        this.currentApplication = this.moskitoApplicationService.currentApplication;
        this.components = this.moskitoApplicationService.currentApplication.components;
        this.categories = __WEBPACK_IMPORTED_MODULE_2__shared_moskito_component_utils__["a" /* MoskitoComponentUtils */].orderComponentsByCategories(this.components);
        // Initialize drag-n-drop and tooltips for components
        setTimeout(function () {
            SetupComponentsView();
        }, 1000);
    };
    return MoskitoComponentsWidget;
}(__WEBPACK_IMPORTED_MODULE_1__widget_component__["a" /* Widget */]));
__decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_14" /* ViewChildren */])('chart_box'),
    __metadata("design:type", typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_0__angular_core__["_15" /* QueryList */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_0__angular_core__["_15" /* QueryList */]) === "function" && _a || Object)
], MoskitoComponentsWidget.prototype, "chartBoxes", void 0);
__decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_14" /* ViewChildren */])('componentInspectionModal'),
    __metadata("design:type", typeof (_b = typeof __WEBPACK_IMPORTED_MODULE_0__angular_core__["_15" /* QueryList */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_0__angular_core__["_15" /* QueryList */]) === "function" && _b || Object)
], MoskitoComponentsWidget.prototype, "inspectionModals", void 0);
MoskitoComponentsWidget = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_13" /* Component */])({
        selector: 'components-widget',
        template: __webpack_require__(245)
    }),
    __metadata("design:paramtypes", [typeof (_c = typeof __WEBPACK_IMPORTED_MODULE_4__services_http_service__["a" /* HttpService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_4__services_http_service__["a" /* HttpService */]) === "function" && _c || Object, typeof (_d = typeof __WEBPACK_IMPORTED_MODULE_3__services_moskito_application_service__["a" /* MoskitoApplicationService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_3__services_moskito_application_service__["a" /* MoskitoApplicationService */]) === "function" && _d || Object, typeof (_e = typeof __WEBPACK_IMPORTED_MODULE_6__services_categories_service__["a" /* CategoriesService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_6__services_categories_service__["a" /* CategoriesService */]) === "function" && _e || Object, typeof (_f = typeof __WEBPACK_IMPORTED_MODULE_5__services_status_service__["a" /* StatusService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_5__services_status_service__["a" /* StatusService */]) === "function" && _f || Object, typeof (_g = typeof __WEBPACK_IMPORTED_MODULE_7__services_chart_service__["a" /* ChartService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_7__services_chart_service__["a" /* ChartService */]) === "function" && _g || Object])
], MoskitoComponentsWidget);

var _a, _b, _c, _d, _e, _f, _g;
//# sourceMappingURL=moskito-components-widget.component.js.map

/***/ }),
/* 154 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__widget_component__ = __webpack_require__(25);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__services_moskito_application_service__ = __webpack_require__(4);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return TvWidget; });
var __extends = (this && this.__extends) || (function () {
    var extendStatics = Object.setPrototypeOf ||
        ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
        function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};



var TvWidget = (function (_super) {
    __extends(TvWidget, _super);
    function TvWidget(moskitoApplicationService) {
        var _this = _super.call(this) || this;
        _this.moskitoApplicationService = moskitoApplicationService;
        return _this;
    }
    TvWidget.prototype.ngOnInit = function () {
        var _this = this;
        this.moskitoApplicationService.dataRefreshEvent.subscribe(function () { return _this.refresh(); });
        this.moskitoApplicationService.applicationChangedEvent.subscribe(function () { return _this.refresh(); });
        this.refresh();
    };
    TvWidget.prototype.refresh = function () {
        this.status = this.moskitoApplicationService.currentApplication.applicationColor;
    };
    return TvWidget;
}(__WEBPACK_IMPORTED_MODULE_1__widget_component__["a" /* Widget */]));
TvWidget = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_13" /* Component */])({
        selector: 'tv-widget',
        template: __webpack_require__(246)
    }),
    __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_2__services_moskito_application_service__["a" /* MoskitoApplicationService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_2__services_moskito_application_service__["a" /* MoskitoApplicationService */]) === "function" && _a || Object])
], TvWidget);

var _a;
//# sourceMappingURL=tv-widget.component.js.map

/***/ }),
/* 155 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return environment; });
// The file contents for the current environment will overwrite these during build.
// The build system defaults to the dev environment which uses `environment.ts`, but if you do
// `ng build --env=prod` then `environment.prod.ts` will be used instead.
// The list of which env maps to which file can be found in `.angular-cli.json`.
// The file contents for the current environment will overwrite these during build.
var environment = {
    production: false
};
//# sourceMappingURL=environment.js.map

/***/ }),
/* 156 */,
/* 157 */,
/* 158 */,
/* 159 */,
/* 160 */,
/* 161 */,
/* 162 */,
/* 163 */,
/* 164 */,
/* 165 */,
/* 166 */,
/* 167 */,
/* 168 */,
/* 169 */,
/* 170 */,
/* 171 */,
/* 172 */,
/* 173 */,
/* 174 */,
/* 175 */,
/* 176 */,
/* 177 */,
/* 178 */,
/* 179 */,
/* 180 */,
/* 181 */,
/* 182 */,
/* 183 */,
/* 184 */,
/* 185 */,
/* 186 */,
/* 187 */,
/* 188 */,
/* 189 */,
/* 190 */,
/* 191 */,
/* 192 */,
/* 193 */,
/* 194 */,
/* 195 */,
/* 196 */,
/* 197 */,
/* 198 */,
/* 199 */,
/* 200 */,
/* 201 */,
/* 202 */,
/* 203 */,
/* 204 */,
/* 205 */,
/* 206 */,
/* 207 */,
/* 208 */,
/* 209 */,
/* 210 */,
/* 211 */,
/* 212 */,
/* 213 */,
/* 214 */
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__(10)(false);
// imports


// module
exports.push([module.i, "", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),
/* 215 */
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__(10)(false);
// imports


// module
exports.push([module.i, "\n.form-box {\n  padding: 5px 10px 0;\n}\n\n.form-group {\n  margin-bottom: 5px;\n}\n\n.form-control {\n  background: #3c3f49;\n  border: none;\n  box-shadow: none;\n  color: #AFB0B2;\n  border-radius: 5px;\n}\n\n.btn {\n  background-color: #85bd0a;\n  display: block;\n  width: 100%;\n}\n", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),
/* 216 */
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__(10)(false);
// imports


// module
exports.push([module.i, "\nh1, h2, h3, h4, h5, h6 {\n  margin: 10px 0;\n  font-family: inherit;\n  font-weight: bold;\n  line-height: 20px;\n  color: inherit;\n  text-rendering: optimizelegibility;\n}\n\nli {\n  line-height: 20px;\n}\n\nul, ol {\n  padding: 0;\n  margin: 10px 0 10px 25px;\n}\n", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),
/* 217 */,
/* 218 */,
/* 219 */,
/* 220 */,
/* 221 */,
/* 222 */,
/* 223 */,
/* 224 */,
/* 225 */,
/* 226 */,
/* 227 */,
/* 228 */,
/* 229 */,
/* 230 */
/***/ (function(module, exports) {

module.exports = "\n<router-outlet></router-outlet>\n"

/***/ }),
/* 231 */
/***/ (function(module, exports) {

module.exports = "<div class=\"content\">\n  <div *ngIf=\"configToggle\">\n    <div class=\"infobar\">\n      <div class=\"infoline\">\n        <div class=\"pull-left\">\n          <span class=\"configuration\">Settings</span>\n        </div>\n        <div class=\"pull-right\">\n          <a  class=\"btn2\" (click)=\"setConfigurationMode(false)\"><span class=\"inbtn\">Back</span></a>\n        </div>\n      </div>\n    </div>\n\n    <settings></settings>\n  </div>\n\n  <div *ngIf=\"!configToggle\">\n    <div class=\"header\">\n      <ul class=\"applications-list\">\n        <li *ngFor=\"let app of applications\" [class]=\"app.applicationColor | lowercase\" [class.active]=\"moskitoApplicationService.currentApplication == app\">\n          <a  (click)=\"setApplication(app)\">\n            {{ app.name }}\n            <span class=\"status\"></span>\n          </a>\n        </li>\n      </ul>\n\n      <div class=\"pull-right\">\n        <a class=\"design-toggle\" href=\"{{ moskitoApplicationService.getApplicationContextPath() + 'control/main' }}\">\n          Regular\n        </a>\n      </div>\n    </div>\n\n    <div class=\"infobar\">\n      <div class=\"infoline\">\n        <div class=\"pull-left\">\n          <timer #dataRefreshTimer timeInSeconds=\"60\" [callback]=\"onDataRefresh\"></timer>\n        </div>\n        <div class=\"pull-right\">\n          <notifications-config></notifications-config>\n\n          <span class=\"vline\"></span>\n          <a  class=\"btn2 settings\">\n            <span class=\"inbtn\" (click)=\"setConfigurationMode(true)\"><i class=\"fa fa-cog\"></i>Settings</span>\n          </a>\n        </div>\n      </div>\n    </div>\n\n    <div class=\"box-list\" *ngIf=\"applicationDataLoaded\">\n      <tv-widget #tvWidget *ngIf=\"widgetService.isWidgetEnabled('tv')\"></tv-widget>\n      <components-widget #componentsWidget *ngIf=\"widgetService.isWidgetEnabled('status')\"></components-widget>\n      <beta-components-widget #betaComponentsWidget *ngIf=\"widgetService.isWidgetEnabled('statusBeta')\"></beta-components-widget>\n      <charts-widget #chartsWidget *ngIf=\"widgetService.isWidgetEnabled('charts')\"></charts-widget>\n      <history-widget #historyWidget *ngIf=\"widgetService.isWidgetEnabled('history')\"></history-widget>\n    </div>\n  </div>\n</div>\n\n<img src=\"//counter.moskito.org/counter/control/{{ moskitoApplicationService.version }}/main\" class=\"ipix\">\n"

/***/ }),
/* 232 */
/***/ (function(module, exports) {

module.exports = "<div *ngIf=\"applicationDataLoaded\" class=\"wrapper\">\n  <scan-column></scan-column>\n  <content></content>\n</div>\n"

/***/ }),
/* 233 */
/***/ (function(module, exports) {

module.exports = "\n\n<div class=\"block\">\n  <h3 class=\"block-title\">\n    Category<a class=\"pull-right clear-filter-toggle\" (click)=\"clearFilter($event)\" href=\"#\">clear</a>\n  </h3>\n  <ul class=\"category-list\">\n    <li *ngFor='let category of categories' (click)=\"setFilter(category)\" [class]='category.status | lowercase' [class.active]='category.name == categoriesService.filter?.name'>\n      <a>\n        <i class=\"fa fa-folder\"></i>\n        {{ category.name }}&nbsp;({{ category.components.length }})\n        <span class=\"status\"></span>\n      </a>\n    </li>\n  </ul>\n</div>\n"

/***/ }),
/* 234 */
/***/ (function(module, exports) {

module.exports = "\n<div class=\"block\">\n  <h3 class=\"block-title\">Connect</h3>\n  <div class=\"form-box\">\n    <form name=\"QuickConnect\" novalidate=\"\" class=\"ng-untouched ng-pristine ng-valid\">\n      <div class=\"form-group\">\n        <input class=\"form-control\" [(ngModel)]=\"host\" name=\"pServerName\" placeholder=\"Host\" type=\"text\">\n      </div>\n      <div class=\"form-group\">\n        <input class=\"form-control\" [(ngModel)]=\"port\" name=\"pServerPort\" placeholder=\"Port\" type=\"text\">\n      </div>\n      <div class=\"form-group\">\n        <input class=\"form-control\" [(ngModel)]=\"path\" name=\"pServerPath\" placeholder=\"Path\" type=\"text\">\n      </div>\n      <div class=\"form-group\">\n        <button class=\"btn btn-success\" (click)=\"connectServer()\" type=\"button\">Connect</button>\n      </div>\n    </form>\n  </div>\n</div>\n"

/***/ }),
/* 235 */
/***/ (function(module, exports) {

module.exports = "\n\n<div class=\"left-bar\">\n    <a  class=\"logo\">\n        <img src=\"./assets/img/logo.png\" alt=\"MoSKito Control\" border=\"0\"/>\n        <span class=\"version\">{{ version }}</span>\n    </a>\n\n    <div *ngIf = \"!configToggle\">\n        <categories></categories>\n        <widgets-toggle></widgets-toggle>\n        <statistics></statistics>\n    </div>\n</div>\n"

/***/ }),
/* 236 */
/***/ (function(module, exports) {

module.exports = "\n\n<div class=\"block\">\n  <h3 class=\"block-title\">\n    Statistics<a class=\"pull-right clear-filter-toggle\" (click)=\"clearFilter($event)\" href=\"#\">clear</a>\n  </h3>\n  <ul class=\"statistics-list\">\n    <li *ngFor=\"let stat of statistics\" [class]=\"stat.status | lowercase\" [class.active]=\"stat.selected\"\n        (click)=\"stat.selected ? removeStatusFilter(stat) : addStatusFilter(stat)\">\n      <a >{{ stat.numberOfComponents }} <span class=\"status\"></span></a>\n    </li>\n  </ul>\n</div>\n"

/***/ }),
/* 237 */
/***/ (function(module, exports) {

module.exports = "\n\n<div class=\"block\">\n  <h3 class=\"block-title\">Widgets</h3>\n  <ul class=\"widgets-list\">\n    <li *ngFor=\"let widget of widgets\" [class]=\"widget.className\" [class.active]=\"isWidgetEnabled( widget )\">\n      <a  (click)=\"toggleWidget( widget )\">\n        <i class=\"{{ widget.icon }}\"></i>{{ widget.displayName }}\n      </a>\n    </li>\n  </ul>\n</div>\n"

/***/ }),
/* 238 */
/***/ (function(module, exports) {

module.exports = "\n  <ul *ngIf=\"configuration\">\n    <li>Notifications muting time: 60 minutes</li>\n    <li>History items amount: 100</li>\n\n    <div *ngIf=\"configuration.applications\">\n      <li><h5>Applications</h5></li>\n      <ul *ngFor=\"let app of configuration.applications\">\n        <li><h6>Name: {{ app.name }}</h6></li>\n        <li><h6>Components</h6></li>\n        <ul *ngFor=\"let component of app.components\">\n          <li>Name: {{ component.name }}</li>\n          <li>Category: {{ component.category }}</li>\n          <li>Connector type: {{ component.connectorType }}</li>\n          <li>Location: {{ component.location }}</li>\n        </ul>\n        <br/>\n\n        <div *ngIf=\"app.charts\">\n          <li><h6>Charts</h6></li>\n          <ul *ngFor=\"let chart of app.charts\">\n            <li>Name: {{ chart.name }}</li>\n            <li>Limit: {{ chart.limit }}</li>\n            <ul *ngFor=\"let line of chart.lines\">\n              <li>Component: {{ line.component }}</li>\n              <li>Accumulator: {{ line.accumulator }}</li>\n            </ul>\n            <br/>\n          </ul>\n          <br/>\n        </div>\n      </ul>\n    </div>\n\n    <li><h5>Connectors</h5></li>\n    <ul *ngFor=\"let connector of configuration.connectors\">\n      <li>Type: {{ connector.type }}</li>\n      <li>Class name: {{ connector.className }}</li>\n    </ul>\n\n    <br/>\n    <li><h5>Status updater</h5></li>\n    <ul>\n      <li>Check period in seconds: {{ configuration.statusUpdater.checkPeriodInSeconds }}</li>\n      <li>Thread pool size: {{ configuration.statusUpdater.threadPoolSize }}</li>\n      <li>Timeout in seconds: {{ configuration.statusUpdater.timeoutInSeconds }}</li>\n      <li>Enabled: {{ configuration.statusUpdater.enabled }}</li>\n    </ul>\n    <br/>\n    <li><h5>Charts updater</h5></li>\n    <ul>\n      <li>Check period in seconds: {{ configuration.chartsUpdater.checkPeriodInSeconds }}</li>\n      <li>Thread pool size: {{ configuration.chartsUpdater.threadPoolSize }}</li>\n      <li>Timeout in seconds: {{ configuration.chartsUpdater.timeoutInSeconds }}</li>\n      <li>Enabled: {{ configuration.chartsUpdater.enabled }}</li>\n    </ul>\n  </ul>\n"

/***/ }),
/* 239 */
/***/ (function(module, exports) {

module.exports = "\n<span *ngIf=\"!notificationsMuted\" class=\"mute-title\">Mute for {{ notificationsMutingTime }} minutes</span>\n<span *ngIf=\"notificationsMuted\" class=\"mute-title\">Remaining muting time {{ notificationsRemainingMutingTime }} minutes</span>\n\n<a *ngIf=\"!notificationsMuted\" id=\"mute\"  class=\"btn2\" title=\"Mute mail notifications\" (click)=\"muteNotifications()\">\n  <span class=\"inbtn\">Mute</span>\n</a>\n<a *ngIf=\"notificationsMuted\" id=\"unmute\"  class=\"btn2\" title=\"Unmute mail notifications\" (click)=\"unmuteNotifications()\">\n  <span class=\"inbtn\">Unmute</span>\n</a>\n"

/***/ }),
/* 240 */
/***/ (function(module, exports) {

module.exports = "\n<div class=\"timer\" (click)=\"callback()\">\n  <span class=\"last-refresh\"><i class=\"fa fa-clock-o\"></i>Last refresh: {{ lastRefreshTimestamp | date: 'yyyy-MM-ddTHH:mm:ss' }}</span>\n  <span *ngIf=\"timeInSeconds && timeInSeconds > 0\" class=\"next-refresh\"><i class=\"fa fa-clock-o\"></i>Next refresh in <span id=\"remains\">{{ timer.secondsRemaining }}</span> seconds</span>\n</div>\n"

/***/ }),
/* 241 */
/***/ (function(module, exports) {

module.exports = "\n\n<div class=\"box charts\">\n  <div class=\"content-title\"><h3><i class=\"fa fa-bar-chart-o\"></i>Charts</h3></div>\n  <div class=\"chart-list\">\n    <div class=\"row\">\n      <div *ngFor=\"let chart of charts\" class=\"col-md-6\">\n        <div class=\"chart-item\">\n          <div class=\"chart-box-name\">{{ chart.name }}</div>\n          <div [id]=\"chartService.buildChartBoxID(chart.name)\" class=\"chart-box\" [class.chart_fullscreen]=\"chart.name == fullscreenChart?.name\" #chart_box (click)=\"onChartClick($event, chart)\"></div>\n          <i class='fa fa-compress'></i>\n          <i class='fa fa-expand'></i>\n          <span class=\"footitle one-line-text\">{{ chart.legend }}</span>\n        </div>\n      </div>\n    </div>\n  </div>\n</div>\n"

/***/ }),
/* 242 */
/***/ (function(module, exports) {

module.exports = "\n\n<div class=\"box history\">\n  <div class=\"content-title \"><h3><i class=\"fa fa-reorder\"></i>History</h3></div>\n  <div class=\"history-box\">\n    <table class=\"table table-striped\">\n      <thead>\n      <tr>\n        <th width=\"250\">Timestamp</th>\n        <th>Name</th>\n        <th width=\"200\">Status change</th>\n      </tr>\n      </thead>\n      <tbody>\n      <tr *ngFor=\"let item of historyItems | historyByCategoryFilter: categoriesService.filterString | historyByStatusFilter: statusService.filter\">\n        <td>{{ item.isoTimestamp }}</td>\n        <td>{{ item.component?.name }}</td>\n        <td>\n          <span class=\"status {{ item.oldStatus | lowercase }}\"></span>\n          <span class=\"arrow-right\"></span>\n          <span class=\"status {{ item.newStatus | lowercase }}\"></span>\n        </td>\n      </tr>\n      </tbody>\n    </table>\n  </div>\n</div>\n"

/***/ }),
/* 243 */
/***/ (function(module, exports) {

module.exports = "\n<!-- Modal for component inspection -->\n<div class=\"modal modal-stretch\" tabindex=\"-1\" role=\"dialog\">\n  <div class=\"modal-dialog components-inspection-modal\">\n    <div class=\"modal-content\">\n      <div class=\"modal-header custom-modal-header\">\n        <button type=\"button\" class=\"close custom-close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n        <h3><span class=\"status {{ component.color | lowercase }}\"></span>{{ component.name }}</h3>\n\n        <!-- Thresholds & Accumulators tabs -->\n        <ul class=\"nav nav-tabs tabs-pane\">\n          <li class=\"active\">\n            <a href=\"#thresholds-tab\" data-toggle=\"tab\">\n              Thresholds\n            </a>\n          </li>\n          <li>\n            <a href=\"#accumulators-tab\" data-toggle=\"tab\">\n              Accumulators\n            </a>\n          </li>\n        </ul>\n      </div>\n\n      <!-- Thresholds & Accumulators tabs -->\n      <div class=\"modal-body custom-modal-body\">\n        <!-- Thresholds & Accumulators tabs content -->\n        <div class=\"tab-content\">\n          <div class=\"tab-pane active\" id=\"thresholds-tab\">\n            <div class=\"loading\" style=\"display: none\">\n              <span class=\"spinner\"></span>\n            </div>\n            <div id=\"thresholds-view\">\n              <!-- Thresholds -->\n              <div *ngIf=\"thresholds\" class=\"thresholds\">\n                <table class=\"table table-striped table-modal\">\n                  <thead>\n                  <tr>\n                    <th>Threshold name</th>\n                    <th width=\"50\">Status</th>\n                    <th width=\"90\">Last value</th>\n                    <th width=\"200\">Last change timestamp</th>\n                  </tr>\n                  </thead>\n                  <tbody>\n                    <tr *ngFor=\"let threshold of thresholds\">\n                      <td>{{ threshold.name }}</td>\n                      <td><div class=\"{{ threshold.status }} status\"></div></td>\n                      <td>{{ threshold.lastValue }}</td>\n                      <td>{{ threshold.statusChangeTimestamp }}</td>\n                    </tr>\n                  </tbody>\n                </table>\n              </div>\n\n              <!-- No data message -->\n              <div *ngIf=\"!thresholds\" class=\"response-message\">\n                <p>Data is not available for this application component</p>\n              </div>\n            </div>\n          </div>\n\n          <div class=\"tab-pane\" id=\"accumulators-tab\">\n            <div class=\"loading\" style=\"display: none\">\n              <span class=\"spinner\"></span>\n            </div>\n            <div id=\"accumulators-view\">\n              <!-- Accumulator charts -->\n              <div *ngIf=\"accumulatorCharts\" class=\"accumulators-charts\">\n                <div *ngFor=\"let chart of accumulatorCharts\" class=\"chart-item chart-item-modal\">\n                  <div class=\"chart-box-name\">{{ chart.name }}</div>\n                  <div id=\"{{ chart.divId }}\" class=\"chart-box\" #chart_box style=\"width: 800px; height: 300px;\"></div>\n                  <span class=\"footitle one-line-text\">{{ chart.legend }}</span>\n                </div>\n              </div>\n\n              <!-- Accumulator names -->\n              <div *ngIf=\"accumulatorNames\" class=\"accumulators-list\">\n                <table class=\"table table-striped table-modal\">\n                  <thead>\n                    <tr>\n                      <th width=\"30\">Show</th>\n                      <th>Accumulator name</th>\n                    </tr>\n                  </thead>\n                  <tbody>\n                    <tr *ngFor=\"let accumulatorName of accumulatorNames\">\n                      <td><input type=\"checkbox\" name=\"{{ accumulatorName }}\" value=\"{{ accumulatorName }}\" (change)=\"toggleAccumulatorChart( $event, accumulatorName )\" /></td>\n                      <td>{{ accumulatorName }}</td>\n                    </tr>\n                  </tbody>\n                </table>\n              </div>\n\n              <!-- No data message -->\n              <div *ngIf=\"!accumulatorNames\" class=\"response-message\">\n                <p>Data is not available for this application component</p>\n              </div>\n            </div>\n          </div>\n        </div>\n        <!-- Thresholds & Accumulators tabs content end -->\n      </div>\n      <div class=\"modal-footer modal-footer-custom\"></div>\n    </div>\n    <!-- Modal for component inspection end -->\n  </div>\n</div>\n"

/***/ }),
/* 244 */
/***/ (function(module, exports) {

module.exports = "<div class=\"box\">\n  <div class=\"content-title\"><h3><i class=\"fa fa-adjust\"></i>Status (beta)</h3></div>\n  <ul class=\"controls\">\n    <li *ngFor=\"let component of components | componentsByCategoryFilter: categoriesService.filterString | componentsByStatusFilter: statusService.filter; let componentIndex = index;\" [class]=\"component.color | lowercase\"\n        role=\"button\" data-toggle=\"modal\" [attr.data-target]=\"'#component-modal-' + componentIndex\"\n        (click)=\"getComponentInspectionModalData(component.name)\">\n      <a >\n                <span class=\"control-tooltip form-control\">\n                  <span *ngIf=\"component.messages.length > 0\" class=\"tooltip-top-line\">\n                    <span class=\"status\"></span>\n                    <div *ngFor=\"let message of component.messages\">\n                      <div *ngIf=\"message\">\n                        {{ message }}<br>\n                      </div>\n                    </div>\n                  </span>\n                  <span class=\"tooltip-lower-line time\">{{ component.ISO8601Timestamp }}</span>\n                  <span class=\"arrow\"></span>\n                </span>\n                <span class=\"control-title\">\n                  <span class=\"status\"></span>\n                  {{ component.category }}:{{ component.name }}\n                </span>\n      </a>\n    </li>\n  </ul>\n</div>\n\n<!-- Modal for component inspection -->\n<div #componentInspectionModal *ngFor=\"let component of components | componentsByCategoryFilter: categoriesService.filterString | componentsByStatusFilter: statusService.filter; let componentIndex = index\"\n     class=\"modal fade modal-stretch component-inspection\" tabindex=\"-1\" role=\"dialog\">\n  <div class=\"modal-dialog components-inspection-modal\">\n    <div class=\"modal-content\">\n      <div class=\"modal-header custom-modal-header\">\n        <button type=\"button\" class=\"close custom-close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n        <h3><span class=\"status {{ component.color | lowercase }}\"></span>{{ component.name }}</h3>\n\n        <!-- Thresholds, Accumulators & Connector tabs -->\n        <ul class=\"nav nav-tabs tabs-pane\">\n          <li *ngIf=\"connector?.supportsThresholds\">\n            <a href=\"#thresholds-tab-{{ componentIndex }}\" data-toggle=\"tab\"  (click)=\"loadThresholdsData( component.name )\">\n              Thresholds\n            </a>\n          </li>\n          <li *ngIf=\"connector?.supportsAccumulators\">\n            <a href=\"#accumulators-tab-{{ componentIndex }}\" data-toggle=\"tab\"  (click)=\"loadAccumulatorsData( component.name )\">\n              Accumulators\n            </a>\n          </li>\n          <li *ngIf=\"connector?.supportsInfo\">\n            <a href=\"#info-tab-{{ componentIndex }}\" data-toggle=\"tab\" (click)=\"loadConnectorInformation( component.name )\">\n              Connector Information\n            </a>\n          </li>\n        </ul>\n      </div>\n\n      <!-- Thresholds & Accumulators tabs -->\n      <div class=\"modal-body custom-modal-body\">\n        <!-- Thresholds & Accumulators tabs content -->\n        <div class=\"tab-content\">\n          <!-- Thresholds tab -->\n          <div *ngIf=\"connector?.supportsThresholds\" class=\"tab-pane active\" id=\"thresholds-tab-{{ componentIndex }}\">\n            <div class=\"loading\" style=\"display: none\">\n              <span class=\"spinner\"></span>\n            </div>\n            <div id=\"thresholds-view-{{ componentIndex }}\">\n              <!-- Thresholds -->\n              <div *ngIf=\"thresholds\" class=\"thresholds\">\n                <table class=\"table table-striped table-modal\">\n                  <thead>\n                  <tr>\n                    <th>Threshold name</th>\n                    <th width=\"50\">Status</th>\n                    <th width=\"90\">Last value</th>\n                    <th width=\"200\">Last change timestamp</th>\n                  </tr>\n                  </thead>\n                  <tbody>\n                    <tr *ngFor=\"let threshold of thresholds\">\n                      <td>{{ threshold.name }}</td>\n                      <td><div class=\"{{ threshold.status }} status\"></div></td>\n                      <td>{{ threshold.lastValue }}</td>\n                      <td>{{ threshold.statusChangeTimestamp }}</td>\n                    </tr>\n                  </tbody>\n                </table>\n              </div>\n\n              <!-- No data message -->\n              <div *ngIf=\"!thresholds\" class=\"response-message\">\n                <p>Data is not available for this application component</p>\n              </div>\n            </div>\n          </div>\n\n          <!-- Accumulator tab -->\n          <div *ngIf=\"connector?.supportsAccumulators\" class=\"tab-pane\" id=\"accumulators-tab-{{ componentIndex }}\">\n            <div class=\"loading\" style=\"display: none\">\n              <span class=\"spinner\"></span>\n            </div>\n            <div id=\"accumulators-view-{{ componentIndex }}\">\n              <!-- Accumulator charts -->\n              <div *ngIf=\"accumulatorChartsMap[component.name]\" class=\"accumulators-charts\">\n                <div *ngFor=\"let chart of accumulatorChartsMap[component.name]\" class=\"chart-item chart-item-modal\">\n                  <div class=\"chart-box-name\">{{ chart.name }}</div>\n                  <div id=\"{{ chart.divId }}\" class=\"chart-box\" #chart_box style=\"width: 800px; height: 300px;\"></div>\n                  <span class=\"footitle one-line-text\">{{ chart.legend }}</span>\n                </div>\n              </div>\n\n              <!-- Accumulator names -->\n              <div *ngIf=\"accumulatorNames\" class=\"accumulators-list\">\n                <table class=\"table table-striped table-modal\">\n                  <thead>\n                    <tr>\n                      <th width=\"30\">Show</th>\n                      <th>Accumulator name</th>\n                    </tr>\n                  </thead>\n                  <tbody>\n                    <tr *ngFor=\"let accumulatorName of accumulatorNames\">\n                      <td><input type=\"checkbox\" name=\"{{ accumulatorName }}\" value=\"{{ accumulatorName }}\" (change)=\"toggleAccumulatorChart( $event, component.name, accumulatorName )\" /></td>\n                      <td>{{ accumulatorName }}</td>\n                    </tr>\n                  </tbody>\n                </table>\n              </div>\n\n              <!-- No data message -->\n              <div *ngIf=\"!accumulatorNames\" class=\"response-message\">\n                <p>Data is not available for this application component</p>\n              </div>\n            </div>\n          </div>\n\n          <!-- Info tab -->\n          <div *ngIf=\"connector?.supportsInfo\" class=\"tab-pane\" id=\"info-tab-{{ componentIndex }}\">\n            <div id=\"info-view-{{ componentIndex }}\">\n              <!-- Connector general information -->\n              <div *ngIf=\"connector.info\" class=\"connector-info\">\n                <table class=\"table table-striped table-modal\">\n                  <thead>\n                    <tr>\n                      <th>Property</th>\n                      <th>Value</th>\n                    </tr>\n                  </thead>\n                  <tbody>\n                    <tr *ngFor=\"let property of connector.info | keys\">\n                      <td>{{ property.key }}</td>\n                      <td>{{ property.value }}</td>\n                    </tr>\n                  </tbody>\n                </table>\n              </div>\n\n              <!-- No data message -->\n              <div *ngIf=\"!connector.info\" class=\"response-message\">\n                <p>Data is not available for this application component</p>\n              </div>\n            </div>\n          </div>\n        </div>\n        <!-- Thresholds & Accumulators tabs content end -->\n      </div>\n      <div class=\"modal-footer modal-footer-custom\"></div>\n    </div>\n    <!-- Modal for component inspection end -->\n  </div>\n</div>\n"

/***/ }),
/* 245 */
/***/ (function(module, exports) {

module.exports = "\n\n<div *ngFor=\"let category of categories | keys; let categoryIndex = index;\">\n  <div class=\"box {{ componentUtils.getWorthComponentStatus( category.value ) | lowercase }}\">\n    <div class=\"content-title\"><h3><span class=\"status\"></span>{{ category.key }}</h3></div>\n    <ul class=\"controls\">\n      <li *ngFor=\"let component of category.value | componentsByCategoryFilter: categoriesService.filterString | componentsByStatusFilter: statusService.filter; let componentIndex = index;\" [class]=\"component.color | lowercase\" role=\"button\" data-toggle=\"modal\" [attr.data-target]=\"'#component-modal-' + categoryIndex + '' + componentIndex\" (click)=\"getComponentInspectionModalData(component.name)\">\n        <a >\n                <span class=\"control-tooltip form-control\">\n                  <span *ngIf=\"component.messages.length > 0\" class=\"tooltip-top-line\">\n                    <span class=\"status\"></span>\n                    <div *ngFor=\"let message of component.messages\">\n                      <div *ngIf=\"message\">\n                        {{ message }}<br>\n                      </div>\n                    </div>\n                  </span>\n                  <span class=\"tooltip-lower-line time\">{{ component.ISO8601Timestamp }}</span>\n                  <span class=\"arrow\"></span>\n                </span>\n                <span class=\"control-title\">\n                  <span class=\"status\"></span>\n                  {{ component.name }}\n                </span>\n        </a>\n      </li>\n    </ul>\n  </div>\n\n  <!-- Modal for component inspection -->\n  <div #componentInspectionModal *ngFor=\"let component of category.value | componentsByCategoryFilter: categoriesService.filterString | componentsByStatusFilter: statusService.filter; let componentIndex = index\" id=\"component-modal-{{ categoryIndex }}{{ componentIndex }}\"\n       class=\"modal fade modal-stretch component-inspection\" tabindex=\"-1\" role=\"dialog\">\n    <div class=\"modal-dialog components-inspection-modal\">\n      <div class=\"modal-content\">\n        <div class=\"modal-header custom-modal-header\">\n          <button type=\"button\" class=\"close custom-close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n          <h3><span class=\"status {{ component.color | lowercase }}\"></span>{{ component.name }}</h3>\n\n          <!-- Thresholds, Accumulators & Connector tabs -->\n          <ul class=\"nav nav-tabs tabs-pane\">\n            <li *ngIf=\"connector?.supportsThresholds\">\n              <a href=\"#thresholds-tab-{{ categoryIndex }}{{ componentIndex }}\" data-toggle=\"tab\" (click)=\"loadThresholdsData( component.name )\">\n                Thresholds\n              </a>\n            </li>\n            <li *ngIf=\"connector?.supportsAccumulators\">\n              <a href=\"#accumulators-tab-{{ categoryIndex }}{{ componentIndex }}\" data-toggle=\"tab\" (click)=\"loadAccumulatorsData( component.name )\">\n                Accumulators\n              </a>\n            </li>\n            <li *ngIf=\"connector?.supportsInfo\">\n              <a href=\"#info-tab-{{ componentIndex }}\" data-toggle=\"tab\" (click)=\"loadConnectorInformation( component.name )\">\n                Connector Information\n              </a>\n            </li>\n            <li>\n              <a href=\"#history-tab-{{ componentIndex }}\" data-toggle=\"tab\" (click)=\"loadComponentHistory( component.name )\">\n                History\n              </a>\n            </li>\n          </ul>\n        </div>\n\n        <!-- Thresholds & Accumulators tabs -->\n        <div class=\"modal-body custom-modal-body\">\n          <!-- Thresholds & Accumulators tabs content -->\n          <div class=\"tab-content\">\n            <div *ngIf=\"connector?.supportsThresholds\" class=\"tab-pane active\" id=\"thresholds-tab-{{ categoryIndex }}{{ componentIndex }}\">\n              <div class=\"loading\" style=\"display: none\">\n                <span class=\"spinner\"></span>\n              </div>\n              <div id=\"thresholds-view-{{ categoryIndex }}{{ componentIndex }}\">\n                <!-- Thresholds -->\n                <div *ngIf=\"thresholds\" class=\"thresholds\">\n                  <table class=\"table table-striped table-modal\">\n                    <thead>\n                    <tr>\n                      <th>Threshold name</th>\n                      <th width=\"50\">Status</th>\n                      <th width=\"90\">Last value</th>\n                      <th width=\"200\">Last change timestamp</th>\n                    </tr>\n                    </thead>\n                    <tbody>\n                    <tr *ngFor=\"let threshold of thresholds\">\n                      <td>{{ threshold.name }}</td>\n                      <td><div class=\"{{ threshold.status }} status\"></div></td>\n                      <td>{{ threshold.lastValue }}</td>\n                      <td>{{ threshold.statusChangeTimestamp }}</td>\n                    </tr>\n                    </tbody>\n                  </table>\n                </div>\n\n                <!-- No data message -->\n                <div *ngIf=\"!thresholds\" class=\"response-message\">\n                  <p>Data is not available for this application component</p>\n                </div>\n              </div>\n            </div>\n\n            <div *ngIf=\"connector?.supportsAccumulators\" class=\"tab-pane\" id=\"accumulators-tab-{{ categoryIndex }}{{ componentIndex }}\">\n              <div class=\"loading\" style=\"display: none\">\n                <span class=\"spinner\"></span>\n              </div>\n              <div id=\"accumulators-view-{{ categoryIndex }}{{ componentIndex }}\">\n                <!-- Accumulator charts -->\n                <div *ngIf=\"accumulatorChartsMap[component.name]\" class=\"accumulators-charts\">\n                  <div *ngFor=\"let chart of accumulatorChartsMap[component.name]\" class=\"chart-item chart-item-modal\">\n                    <div class=\"chart-box-name\">{{ chart.name }}</div>\n                    <div id=\"{{ chart.divId }}\" class=\"chart-box\" #chart_box style=\"width: 800px; height: 300px;\"></div>\n                    <span class=\"footitle one-line-text\">{{ chart.legend }}</span>\n                  </div>\n                </div>\n\n                <!-- Accumulator names -->\n                <div *ngIf=\"accumulatorNames\" class=\"accumulators-list\">\n                  <table class=\"table table-striped table-modal\">\n                    <thead>\n                    <tr>\n                      <th width=\"30\">Show</th>\n                      <th>Accumulator name</th>\n                    </tr>\n                    </thead>\n                    <tbody>\n                    <tr *ngFor=\"let accumulatorName of accumulatorNames\">\n                      <td><input type=\"checkbox\" name=\"{{ accumulatorName }}\" value=\"{{ accumulatorName }}\" (change)=\"toggleAccumulatorChart( $event, component.name, accumulatorName )\" /></td>\n                      <td>{{ accumulatorName }}</td>\n                    </tr>\n                    </tbody>\n                  </table>\n                </div>\n\n                <!-- No data message -->\n                <div *ngIf=\"!accumulatorNames\" class=\"response-message\">\n                  <p>Data is not available for this application component</p>\n                </div>\n              </div>\n            </div>\n\n            <!-- Info tab -->\n            <div *ngIf=\"connector?.supportsInfo\" class=\"tab-pane\" id=\"info-tab-{{ componentIndex }}\">\n              <div id=\"info-view-{{ componentIndex }}\">\n                <!-- Connector general information -->\n                <div *ngIf=\"connector.info\" class=\"connector-info\">\n                  <table class=\"table table-striped table-modal\">\n                    <thead>\n                    <tr>\n                      <th>Property</th>\n                      <th>Value</th>\n                    </tr>\n                    </thead>\n                    <tbody>\n                    <tr *ngFor=\"let property of connector.info | keys\">\n                      <td>{{ property.key }}</td>\n                      <td>{{ property.value }}</td>\n                    </tr>\n                    </tbody>\n                  </table>\n                </div>\n\n                <!-- No data message -->\n                <div *ngIf=\"!connector.info\" class=\"response-message\">\n                  <p>Data is not available for this application component</p>\n                </div>\n              </div>\n            </div>\n\n            <!-- Component history tab -->\n            <div class=\"tab-pane\" id=\"history-tab-{{ componentIndex }}\">\n              <div *ngIf=\"isLoading\" class=\"loading\">\n                <span class=\"spinner\"></span>\n              </div>\n              <div *ngIf=\"!isLoading\" id=\"history-view-{{ componentIndex }}\">\n                <!-- Connector general information -->\n                <div *ngIf=\"history?.length > 0\" class=\"component-history\">\n                  <table class=\"table table-striped\">\n                    <thead>\n                    <tr>\n                      <th width=\"250\">Timestamp</th>\n                      <th>Name</th>\n                      <th width=\"200\">Status change</th>\n                    </tr>\n                    </thead>\n                    <tbody>\n                    <tr *ngFor=\"let item of history\">\n                      <td>{{ item.isoTimestamp }}</td>\n                      <td>{{ item.component?.name }}</td>\n                      <td>\n                        <span class=\"status {{ item.oldStatus | lowercase }}\"></span>\n                        <span class=\"arrow-right\"></span>\n                        <span class=\"status {{ item.newStatus | lowercase }}\"></span>\n                      </td>\n                    </tr>\n                    </tbody>\n                  </table>\n                </div>\n\n                <!-- No data message -->\n                <div *ngIf=\"!history || history.length === 0\" class=\"response-message\">\n                  <p>Data is not available for this application component</p>\n                </div>\n              </div>\n            </div>\n          </div>\n          <!-- Thresholds & Accumulators tabs content end -->\n        </div>\n        <div class=\"modal-footer modal-footer-custom\"></div>\n      </div>\n      <!-- Modal for component inspection end -->\n    </div>\n  </div>\n</div>\n"

/***/ }),
/* 246 */
/***/ (function(module, exports) {

module.exports = "\n<div class=\"box tv\">\n  <div class=\"content-title\"><h3><i class=\"fa fa-smile-o\"></i>TV</h3></div>\n  <div class=\"smiley\">\n    <img src=\"./assets/img/smiley_{{ status | lowercase }}.png\" alt=\"status: {{ status | lowercase }}\"/>\n  </div>\n</div>\n"

/***/ }),
/* 247 */,
/* 248 */,
/* 249 */,
/* 250 */,
/* 251 */,
/* 252 */,
/* 253 */,
/* 254 */,
/* 255 */,
/* 256 */,
/* 257 */,
/* 258 */,
/* 259 */,
/* 260 */,
/* 261 */,
/* 262 */,
/* 263 */,
/* 264 */,
/* 265 */,
/* 266 */,
/* 267 */,
/* 268 */,
/* 269 */,
/* 270 */,
/* 271 */,
/* 272 */,
/* 273 */,
/* 274 */,
/* 275 */,
/* 276 */,
/* 277 */,
/* 278 */,
/* 279 */,
/* 280 */,
/* 281 */,
/* 282 */,
/* 283 */,
/* 284 */,
/* 285 */,
/* 286 */,
/* 287 */,
/* 288 */,
/* 289 */,
/* 290 */,
/* 291 */,
/* 292 */,
/* 293 */,
/* 294 */,
/* 295 */,
/* 296 */,
/* 297 */
/***/ (function(module, exports, __webpack_require__) {

module.exports = __webpack_require__(109);


/***/ })
],[297]);
//# sourceMappingURL=main.bundle.js.map
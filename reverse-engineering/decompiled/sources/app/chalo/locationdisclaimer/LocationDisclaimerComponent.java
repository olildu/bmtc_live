package app.chalo.locationdisclaimer;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.location.AppPermissionRequest;
import app.chalo.location.ChaloLocationManager;
import app.chalo.location.ChaloLocationManagerKt;
import app.chalo.location.GpsState;
import app.chalo.locationdisclaimer.domain.GetLocationDisclaimerStepsAndLottieTypeUseCase;
import app.chalo.locationdisclaimer.domain.LocationDisclaimerStepsAndLottiType;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.permissions.gps.GpsRequestHandlerProvider;
import app.chalo.permissions.handler.PermissionHandlerProvider;
import app.chalo.permissions.models.AppPermission;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.LocationDisclaimerArgs;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.button.ButtonUIStateFactory;
import app.chalo.uistate.image.GifImageUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.usecase.ArePermissionsGrantedUseCase;
import app.chalo.utils.LocationPermissionCallbackHandler;
import app.chalo.utils.SystemHelper;
import com.arkivanov.decompose.ComponentContext;
import defpackage.gd0;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/locationdisclaimer/LocationDisclaimerComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/locationdisclaimer/LocationDisclaimerIntent;", "Lapp/chalo/locationdisclaimer/LocationDisclaimerDataState;", "Lapp/chalo/locationdisclaimer/LocationDisclaimerViewState;", "Lapp/chalo/locationdisclaimer/LocationDisclaimerSideEffect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LocationDisclaimerComponent extends ChaloBaseStateMviComponent<LocationDisclaimerIntent, LocationDisclaimerDataState, LocationDisclaimerViewState, LocationDisclaimerSideEffect> {
    public final AnalyticsContract k;
    public final GetLocationDisclaimerStepsAndLottieTypeUseCase l;
    public final ArePermissionsGrantedUseCase m;
    public final ChaloLocationManager n;
    public final ChaloNavigationManager o;
    public final PermissionHandlerProvider p;
    public final LocationPermissionCallbackHandler q;
    public final GpsRequestHandlerProvider r;
    public final SystemHelper s;
    public final StringProvider t;
    public Source u;
    public Job v;
    public Job w;
    public Job x;
    public Job y;

    public LocationDisclaimerComponent(LocationDisclaimerArgs locationDisclaimerArgs, ComponentContext componentContext, AnalyticsContract analyticsContract, GetLocationDisclaimerStepsAndLottieTypeUseCase getLocationDisclaimerStepsAndLottieTypeUseCase, ArePermissionsGrantedUseCase arePermissionsGrantedUseCase, ChaloLocationManager chaloLocationManager, ChaloNavigationManager chaloNavigationManager, PermissionHandlerProvider permissionHandlerProvider, LocationPermissionCallbackHandler locationPermissionCallbackHandler, GpsRequestHandlerProvider gpsRequestHandlerProvider, SystemHelper systemHelper, StringProvider stringProvider) {
        super(componentContext);
        this.k = analyticsContract;
        this.l = getLocationDisclaimerStepsAndLottieTypeUseCase;
        this.m = arePermissionsGrantedUseCase;
        this.n = chaloLocationManager;
        this.o = chaloNavigationManager;
        this.p = permissionHandlerProvider;
        this.q = locationPermissionCallbackHandler;
        this.r = gpsRequestHandlerProvider;
        this.s = systemHelper;
        this.t = stringProvider;
        this.u = Source.UNKNOWN;
        K0(new LocationDisclaimerIntent.ViewCreatedIntent(locationDisclaimerArgs.b));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object F0(LocationDisclaimerComponent locationDisclaimerComponent, ContinuationImpl continuationImpl) {
        LocationDisclaimerComponent$isFineLocationPermissionEnabled$1 locationDisclaimerComponent$isFineLocationPermissionEnabled$1;
        locationDisclaimerComponent.getClass();
        if (continuationImpl instanceof LocationDisclaimerComponent$isFineLocationPermissionEnabled$1) {
            locationDisclaimerComponent$isFineLocationPermissionEnabled$1 = (LocationDisclaimerComponent$isFineLocationPermissionEnabled$1) continuationImpl;
            int i = locationDisclaimerComponent$isFineLocationPermissionEnabled$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                locationDisclaimerComponent$isFineLocationPermissionEnabled$1.label = i - Integer.MIN_VALUE;
            } else {
                locationDisclaimerComponent$isFineLocationPermissionEnabled$1 = new LocationDisclaimerComponent$isFineLocationPermissionEnabled$1(locationDisclaimerComponent, continuationImpl);
            }
        } else {
            locationDisclaimerComponent$isFineLocationPermissionEnabled$1 = new LocationDisclaimerComponent$isFineLocationPermissionEnabled$1(locationDisclaimerComponent, continuationImpl);
        }
        Object objA = locationDisclaimerComponent$isFineLocationPermissionEnabled$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = locationDisclaimerComponent$isFineLocationPermissionEnabled$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            ArePermissionsGrantedUseCase arePermissionsGrantedUseCase = locationDisclaimerComponent.m;
            AppPermission[] appPermissionArr = {AppPermission.FINE_LOCATION};
            locationDisclaimerComponent$isFineLocationPermissionEnabled$1.label = 1;
            arePermissionsGrantedUseCase.getClass();
            objA = arePermissionsGrantedUseCase.a(ArraysKt.h0(appPermissionArr), locationDisclaimerComponent$isFineLocationPermissionEnabled$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        return Boolean.valueOf(ChaloLocationManagerKt.a((AppPermissionRequest) objA));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object G0(LocationDisclaimerComponent locationDisclaimerComponent, ContinuationImpl continuationImpl) {
        LocationDisclaimerComponent$raiseLocationPermissionResultEvent$1 locationDisclaimerComponent$raiseLocationPermissionResultEvent$1;
        AnalyticsContract analyticsContract;
        Source source;
        String str;
        locationDisclaimerComponent.getClass();
        if (continuationImpl instanceof LocationDisclaimerComponent$raiseLocationPermissionResultEvent$1) {
            locationDisclaimerComponent$raiseLocationPermissionResultEvent$1 = (LocationDisclaimerComponent$raiseLocationPermissionResultEvent$1) continuationImpl;
            int i = locationDisclaimerComponent$raiseLocationPermissionResultEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                locationDisclaimerComponent$raiseLocationPermissionResultEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                locationDisclaimerComponent$raiseLocationPermissionResultEvent$1 = new LocationDisclaimerComponent$raiseLocationPermissionResultEvent$1(locationDisclaimerComponent, continuationImpl);
            }
        } else {
            locationDisclaimerComponent$raiseLocationPermissionResultEvent$1 = new LocationDisclaimerComponent$raiseLocationPermissionResultEvent$1(locationDisclaimerComponent, continuationImpl);
        }
        Object obj = locationDisclaimerComponent$raiseLocationPermissionResultEvent$1.result;
        Serializable serializable = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = locationDisclaimerComponent$raiseLocationPermissionResultEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            AnalyticsContract analyticsContract2 = locationDisclaimerComponent.k;
            Source source2 = Source.LOCATION_DISCLAIMER_ACTIVITY;
            locationDisclaimerComponent$raiseLocationPermissionResultEvent$1.L$0 = analyticsContract2;
            locationDisclaimerComponent$raiseLocationPermissionResultEvent$1.L$1 = "location permission result event";
            locationDisclaimerComponent$raiseLocationPermissionResultEvent$1.L$2 = source2;
            locationDisclaimerComponent$raiseLocationPermissionResultEvent$1.label = 1;
            Serializable serializableJ0 = locationDisclaimerComponent.J0(locationDisclaimerComponent$raiseLocationPermissionResultEvent$1);
            if (serializableJ0 == serializable) {
                return serializable;
            }
            analyticsContract = analyticsContract2;
            source = source2;
            str = "location permission result event";
            obj = serializableJ0;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Source source3 = (Source) locationDisclaimerComponent$raiseLocationPermissionResultEvent$1.L$2;
            String str2 = (String) locationDisclaimerComponent$raiseLocationPermissionResultEvent$1.L$1;
            AnalyticsContract analyticsContract3 = (AnalyticsContract) locationDisclaimerComponent$raiseLocationPermissionResultEvent$1.L$0;
            ResultKt.b(obj);
            source = source3;
            analyticsContract = analyticsContract3;
            str = str2;
        }
        AnalyticsContractImplKt.b(analyticsContract, str, source, (Map) obj, false, 24);
        return Unit.f17538a;
    }

    public static final void H0(LocationDisclaimerComponent locationDisclaimerComponent) {
        Job job = locationDisclaimerComponent.y;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        locationDisclaimerComponent.y = BuildersKt.d(locationDisclaimerComponent.j, null, null, new LocationDisclaimerComponent$showLocationEnablePrompt$1(locationDisclaimerComponent, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x010c  */
    /* JADX WARN: Code duplicated, block: B:30:0x010f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0119  */
    /* JADX WARN: Code duplicated, block: B:39:0x0125  */
    /* JADX WARN: Code duplicated, block: B:42:0x013c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0145  */
    /* JADX WARN: Code duplicated, block: B:48:0x015c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    /* JADX INFO: renamed from: I0, reason: merged with bridge method [inline-methods] */
    public final Object p0(LocationDisclaimerDataState locationDisclaimerDataState, ContinuationImpl continuationImpl) {
        LocationDisclaimerComponent$convertToUiState$1 locationDisclaimerComponent$convertToUiState$1;
        LocationDisclaimerDataState locationDisclaimerDataState2;
        TextUIState chaloTextUIState;
        StringProvider stringProvider;
        Object objB;
        StringProvider stringProvider2;
        LocationDisclaimerHeaderUIState locationDisclaimerHeaderUIState;
        LocationDisclaimerInstructionsSectionUIState locationDisclaimerInstructionsSectionUIState;
        LocationDisclaimerStepsAndLottiType locationDisclaimerStepsAndLottiType;
        GifImageUIState gifImageUIState;
        List list;
        boolean z;
        ButtonUIStateFactory buttonUIStateFactory;
        Object objB2;
        LocationDisclaimerDataState locationDisclaimerDataState3;
        LocationDisclaimerHeaderUIState locationDisclaimerHeaderUIState2;
        ButtonUIStateFactory buttonUIStateFactory2;
        LocationDisclaimerInstructionsSectionUIState locationDisclaimerInstructionsSectionUIState2;
        Object objB3;
        String str;
        if (continuationImpl instanceof LocationDisclaimerComponent$convertToUiState$1) {
            locationDisclaimerComponent$convertToUiState$1 = (LocationDisclaimerComponent$convertToUiState$1) continuationImpl;
            int i = locationDisclaimerComponent$convertToUiState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                locationDisclaimerComponent$convertToUiState$1.label = i - Integer.MIN_VALUE;
            } else {
                locationDisclaimerComponent$convertToUiState$1 = new LocationDisclaimerComponent$convertToUiState$1(this, continuationImpl);
            }
        } else {
            locationDisclaimerComponent$convertToUiState$1 = new LocationDisclaimerComponent$convertToUiState$1(this, continuationImpl);
        }
        Object objB4 = locationDisclaimerComponent$convertToUiState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = locationDisclaimerComponent$convertToUiState$1.label;
        ChaloColorToken.Black_87 black_87 = ChaloColorToken.Black_87.f9768a;
        StringProvider stringProvider3 = this.t;
        if (i2 == 0) {
            ResultKt.b(objB4);
            locationDisclaimerComponent$convertToUiState$1.L$0 = locationDisclaimerDataState;
            locationDisclaimerComponent$convertToUiState$1.label = 1;
            objB4 = stringProvider3.b(StringEnum.ALLOW_LOCATION_ACCESS, new Object[0], locationDisclaimerComponent$convertToUiState$1);
            if (objB4 != coroutineSingletons) {
                locationDisclaimerDataState2 = locationDisclaimerDataState;
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    buttonUIStateFactory2 = (ButtonUIStateFactory) locationDisclaimerComponent$convertToUiState$1.L$3;
                    locationDisclaimerInstructionsSectionUIState2 = (LocationDisclaimerInstructionsSectionUIState) locationDisclaimerComponent$convertToUiState$1.L$2;
                    locationDisclaimerHeaderUIState2 = (LocationDisclaimerHeaderUIState) locationDisclaimerComponent$convertToUiState$1.L$1;
                    locationDisclaimerDataState3 = (LocationDisclaimerDataState) locationDisclaimerComponent$convertToUiState$1.L$0;
                    ResultKt.b(objB4);
                    str = (String) objB4;
                    return new LocationDisclaimerViewState(locationDisclaimerDataState3.b, locationDisclaimerHeaderUIState2, locationDisclaimerInstructionsSectionUIState2, ButtonUIStateFactory.f(buttonUIStateFactory2, new TextUIState.ChaloTextUIState(str, UITextStyle.HeadlineSmall, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new gd0(this, 7), null, false, 0.0f, 60));
                }
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                buttonUIStateFactory2 = (ButtonUIStateFactory) locationDisclaimerComponent$convertToUiState$1.L$3;
                locationDisclaimerInstructionsSectionUIState2 = (LocationDisclaimerInstructionsSectionUIState) locationDisclaimerComponent$convertToUiState$1.L$2;
                locationDisclaimerHeaderUIState2 = (LocationDisclaimerHeaderUIState) locationDisclaimerComponent$convertToUiState$1.L$1;
                locationDisclaimerDataState3 = (LocationDisclaimerDataState) locationDisclaimerComponent$convertToUiState$1.L$0;
                ResultKt.b(objB4);
                str = (String) objB4;
                return new LocationDisclaimerViewState(locationDisclaimerDataState3.b, locationDisclaimerHeaderUIState2, locationDisclaimerInstructionsSectionUIState2, ButtonUIStateFactory.f(buttonUIStateFactory2, new TextUIState.ChaloTextUIState(str, UITextStyle.HeadlineSmall, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new gd0(this, 7), null, false, 0.0f, 60));
            }
            TextUIState textUIState = (TextUIState) locationDisclaimerComponent$convertToUiState$1.L$1;
            LocationDisclaimerDataState locationDisclaimerDataState4 = (LocationDisclaimerDataState) locationDisclaimerComponent$convertToUiState$1.L$0;
            ResultKt.b(objB4);
            objB = objB4;
            chaloTextUIState = textUIState;
            locationDisclaimerDataState2 = locationDisclaimerDataState4;
            stringProvider = stringProvider3;
            stringProvider2 = stringProvider;
            locationDisclaimerHeaderUIState = new LocationDisclaimerHeaderUIState(chaloTextUIState, new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodyLarge, black_87, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152));
            locationDisclaimerStepsAndLottiType = locationDisclaimerDataState2.c;
            if (locationDisclaimerStepsAndLottiType != null) {
                gifImageUIState = locationDisclaimerStepsAndLottiType.b;
            } else {
                gifImageUIState = null;
            }
            if (locationDisclaimerStepsAndLottiType != null || (list = locationDisclaimerStepsAndLottiType.f5175a) == null) {
                list = EmptyList.f17557a;
            }
            locationDisclaimerInstructionsSectionUIState = new LocationDisclaimerInstructionsSectionUIState(gifImageUIState, list, 1);
            z = locationDisclaimerDataState2.f5165a;
            buttonUIStateFactory = ButtonUIStateFactory.f9921a;
            if (z) {
                locationDisclaimerComponent$convertToUiState$1.L$0 = locationDisclaimerDataState2;
                locationDisclaimerComponent$convertToUiState$1.L$1 = locationDisclaimerHeaderUIState;
                locationDisclaimerComponent$convertToUiState$1.L$2 = locationDisclaimerInstructionsSectionUIState;
                locationDisclaimerComponent$convertToUiState$1.L$3 = buttonUIStateFactory;
                locationDisclaimerComponent$convertToUiState$1.label = 3;
                objB3 = stringProvider2.b(StringEnum.ENABLE_LOCATION, new Object[0], locationDisclaimerComponent$convertToUiState$1);
                if (objB3 != coroutineSingletons) {
                    locationDisclaimerDataState3 = locationDisclaimerDataState2;
                    locationDisclaimerHeaderUIState2 = locationDisclaimerHeaderUIState;
                    buttonUIStateFactory2 = buttonUIStateFactory;
                    locationDisclaimerInstructionsSectionUIState2 = locationDisclaimerInstructionsSectionUIState;
                    objB4 = objB3;
                    str = (String) objB4;
                    return new LocationDisclaimerViewState(locationDisclaimerDataState3.b, locationDisclaimerHeaderUIState2, locationDisclaimerInstructionsSectionUIState2, ButtonUIStateFactory.f(buttonUIStateFactory2, new TextUIState.ChaloTextUIState(str, UITextStyle.HeadlineSmall, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new gd0(this, 7), null, false, 0.0f, 60));
                }
            } else {
                locationDisclaimerComponent$convertToUiState$1.L$0 = locationDisclaimerDataState2;
                locationDisclaimerComponent$convertToUiState$1.L$1 = locationDisclaimerHeaderUIState;
                locationDisclaimerComponent$convertToUiState$1.L$2 = locationDisclaimerInstructionsSectionUIState;
                locationDisclaimerComponent$convertToUiState$1.L$3 = buttonUIStateFactory;
                locationDisclaimerComponent$convertToUiState$1.label = 4;
                objB2 = stringProvider2.b(StringEnum.GO_TO_SETTINGS_CAPS, new Object[0], locationDisclaimerComponent$convertToUiState$1);
                if (objB2 != coroutineSingletons) {
                    locationDisclaimerDataState3 = locationDisclaimerDataState2;
                    locationDisclaimerHeaderUIState2 = locationDisclaimerHeaderUIState;
                    buttonUIStateFactory2 = buttonUIStateFactory;
                    locationDisclaimerInstructionsSectionUIState2 = locationDisclaimerInstructionsSectionUIState;
                    objB4 = objB2;
                    str = (String) objB4;
                    return new LocationDisclaimerViewState(locationDisclaimerDataState3.b, locationDisclaimerHeaderUIState2, locationDisclaimerInstructionsSectionUIState2, ButtonUIStateFactory.f(buttonUIStateFactory2, new TextUIState.ChaloTextUIState(str, UITextStyle.HeadlineSmall, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new gd0(this, 7), null, false, 0.0f, 60));
                }
            }
            return coroutineSingletons;
        }
        locationDisclaimerDataState2 = (LocationDisclaimerDataState) locationDisclaimerComponent$convertToUiState$1.L$0;
        ResultKt.b(objB4);
        chaloTextUIState = new TextUIState.ChaloTextUIState((String) objB4, UITextStyle.DisplayMedium, black_87, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
        locationDisclaimerComponent$convertToUiState$1.L$0 = locationDisclaimerDataState2;
        locationDisclaimerComponent$convertToUiState$1.L$1 = chaloTextUIState;
        locationDisclaimerComponent$convertToUiState$1.label = 2;
        stringProvider = stringProvider3;
        objB = stringProvider.b(StringEnum.LOCATION_DISCLAIMER_SUBHEADING, new Object[0], locationDisclaimerComponent$convertToUiState$1);
        if (objB != coroutineSingletons) {
            stringProvider2 = stringProvider;
            locationDisclaimerHeaderUIState = new LocationDisclaimerHeaderUIState(chaloTextUIState, new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodyLarge, black_87, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152));
            locationDisclaimerStepsAndLottiType = locationDisclaimerDataState2.c;
            if (locationDisclaimerStepsAndLottiType != null) {
                gifImageUIState = locationDisclaimerStepsAndLottiType.b;
            } else {
                gifImageUIState = null;
            }
            if (locationDisclaimerStepsAndLottiType != null) {
                list = EmptyList.f17557a;
            } else {
                list = EmptyList.f17557a;
            }
            locationDisclaimerInstructionsSectionUIState = new LocationDisclaimerInstructionsSectionUIState(gifImageUIState, list, 1);
            z = locationDisclaimerDataState2.f5165a;
            buttonUIStateFactory = ButtonUIStateFactory.f9921a;
            if (z) {
                locationDisclaimerComponent$convertToUiState$1.L$0 = locationDisclaimerDataState2;
                locationDisclaimerComponent$convertToUiState$1.L$1 = locationDisclaimerHeaderUIState;
                locationDisclaimerComponent$convertToUiState$1.L$2 = locationDisclaimerInstructionsSectionUIState;
                locationDisclaimerComponent$convertToUiState$1.L$3 = buttonUIStateFactory;
                locationDisclaimerComponent$convertToUiState$1.label = 3;
                objB3 = stringProvider2.b(StringEnum.ENABLE_LOCATION, new Object[0], locationDisclaimerComponent$convertToUiState$1);
                if (objB3 != coroutineSingletons) {
                    locationDisclaimerDataState3 = locationDisclaimerDataState2;
                    locationDisclaimerHeaderUIState2 = locationDisclaimerHeaderUIState;
                    buttonUIStateFactory2 = buttonUIStateFactory;
                    locationDisclaimerInstructionsSectionUIState2 = locationDisclaimerInstructionsSectionUIState;
                    objB4 = objB3;
                    str = (String) objB4;
                    return new LocationDisclaimerViewState(locationDisclaimerDataState3.b, locationDisclaimerHeaderUIState2, locationDisclaimerInstructionsSectionUIState2, ButtonUIStateFactory.f(buttonUIStateFactory2, new TextUIState.ChaloTextUIState(str, UITextStyle.HeadlineSmall, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new gd0(this, 7), null, false, 0.0f, 60));
                }
            } else {
                locationDisclaimerComponent$convertToUiState$1.L$0 = locationDisclaimerDataState2;
                locationDisclaimerComponent$convertToUiState$1.L$1 = locationDisclaimerHeaderUIState;
                locationDisclaimerComponent$convertToUiState$1.L$2 = locationDisclaimerInstructionsSectionUIState;
                locationDisclaimerComponent$convertToUiState$1.L$3 = buttonUIStateFactory;
                locationDisclaimerComponent$convertToUiState$1.label = 4;
                objB2 = stringProvider2.b(StringEnum.GO_TO_SETTINGS_CAPS, new Object[0], locationDisclaimerComponent$convertToUiState$1);
                if (objB2 != coroutineSingletons) {
                    locationDisclaimerDataState3 = locationDisclaimerDataState2;
                    locationDisclaimerHeaderUIState2 = locationDisclaimerHeaderUIState;
                    buttonUIStateFactory2 = buttonUIStateFactory;
                    locationDisclaimerInstructionsSectionUIState2 = locationDisclaimerInstructionsSectionUIState;
                    objB4 = objB2;
                    str = (String) objB4;
                    return new LocationDisclaimerViewState(locationDisclaimerDataState3.b, locationDisclaimerHeaderUIState2, locationDisclaimerInstructionsSectionUIState2, ButtonUIStateFactory.f(buttonUIStateFactory2, new TextUIState.ChaloTextUIState(str, UITextStyle.HeadlineSmall, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new gd0(this, 7), null, false, 0.0f, 60));
                }
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable J0(ContinuationImpl continuationImpl) {
        LocationDisclaimerComponent$getPermissionsStatusMap$1 locationDisclaimerComponent$getPermissionsStatusMap$1;
        Pair[] pairArr;
        String str;
        Pair[] pairArr2;
        if (continuationImpl instanceof LocationDisclaimerComponent$getPermissionsStatusMap$1) {
            locationDisclaimerComponent$getPermissionsStatusMap$1 = (LocationDisclaimerComponent$getPermissionsStatusMap$1) continuationImpl;
            int i = locationDisclaimerComponent$getPermissionsStatusMap$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                locationDisclaimerComponent$getPermissionsStatusMap$1.label = i - Integer.MIN_VALUE;
            } else {
                locationDisclaimerComponent$getPermissionsStatusMap$1 = new LocationDisclaimerComponent$getPermissionsStatusMap$1(this, continuationImpl);
            }
        } else {
            locationDisclaimerComponent$getPermissionsStatusMap$1 = new LocationDisclaimerComponent$getPermissionsStatusMap$1(this, continuationImpl);
        }
        Object objA = locationDisclaimerComponent$getPermissionsStatusMap$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = locationDisclaimerComponent$getPermissionsStatusMap$1.label;
        int i3 = 2;
        if (i2 == 0) {
            ResultKt.b(objA);
            locationDisclaimerComponent$getPermissionsStatusMap$1.label = 1;
            AppPermission[] appPermissionArr = {AppPermission.FINE_LOCATION, AppPermission.COARSE_LOCATION};
            ArePermissionsGrantedUseCase arePermissionsGrantedUseCase = this.m;
            arePermissionsGrantedUseCase.getClass();
            objA = arePermissionsGrantedUseCase.a(ArraysKt.h0(appPermissionArr), locationDisclaimerComponent$getPermissionsStatusMap$1);
            if (objA != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            ResultKt.b(objA);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = locationDisclaimerComponent$getPermissionsStatusMap$1.I$0;
            str = (String) locationDisclaimerComponent$getPermissionsStatusMap$1.L$2;
            pairArr = (Pair[]) locationDisclaimerComponent$getPermissionsStatusMap$1.L$1;
            pairArr2 = (Pair[]) locationDisclaimerComponent$getPermissionsStatusMap$1.L$0;
            ResultKt.b(objA);
        }
        pairArr[i3] = new Pair(str, Boolean.valueOf(objA == GpsState.ENABLED));
        pairArr2[3] = new Pair("previousScreen", this.u.getSourceName());
        return (Serializable) MapsKt.i(pairArr2);
        AppPermissionRequest appPermissionRequest = (AppPermissionRequest) objA;
        pairArr = new Pair[4];
        pairArr[0] = new Pair("is fine location enabled", Boolean.valueOf(appPermissionRequest.f5114a.contains(AppPermission.FINE_LOCATION)));
        pairArr[1] = new Pair("is coarse location enabled", Boolean.valueOf(appPermissionRequest.f5114a.contains(AppPermission.COARSE_LOCATION)));
        locationDisclaimerComponent$getPermissionsStatusMap$1.L$0 = pairArr;
        locationDisclaimerComponent$getPermissionsStatusMap$1.L$1 = pairArr;
        locationDisclaimerComponent$getPermissionsStatusMap$1.L$2 = "is gps enabled";
        locationDisclaimerComponent$getPermissionsStatusMap$1.I$0 = 2;
        locationDisclaimerComponent$getPermissionsStatusMap$1.label = 2;
        Enum enumB = this.n.b(locationDisclaimerComponent$getPermissionsStatusMap$1);
        if (enumB != coroutineSingletons) {
            str = "is gps enabled";
            objA = enumB;
            pairArr2 = pairArr;
            pairArr[i3] = new Pair(str, Boolean.valueOf(objA == GpsState.ENABLED));
            pairArr2[3] = new Pair("previousScreen", this.u.getSourceName());
            return (Serializable) MapsKt.i(pairArr2);
        }
        return coroutineSingletons;
    }

    public final void K0(LocationDisclaimerIntent locationDisclaimerIntent) {
        C0(locationDisclaimerIntent);
        boolean z = locationDisclaimerIntent instanceof LocationDisclaimerIntent.ViewCreatedIntent;
        ContextScope contextScope = this.j;
        if (z) {
            this.u = ((LocationDisclaimerIntent.ViewCreatedIntent) locationDisclaimerIntent).f5171a;
            BuildersKt.d(contextScope, null, null, new LocationDisclaimerComponent$handleViewCreatedIntent$1(this, null), 3);
        } else {
            if (locationDisclaimerIntent instanceof LocationDisclaimerIntent.OnStartIntent) {
                BuildersKt.d(contextScope, null, null, new LocationDisclaimerComponent$handleOnStartIntent$1(this, null), 3);
                return;
            }
            if (!locationDisclaimerIntent.equals(LocationDisclaimerIntent.GoToSettingsBtnClicked.f5169a)) {
                throw new NoWhenBranchMatchedException();
            }
            Job job = this.v;
            if (job == null || !((AbstractCoroutine) job).isActive()) {
                this.v = BuildersKt.d(contextScope, null, null, new LocationDisclaimerComponent$handleGoToSettingsBtnClicked$1(this, null), 3);
            }
        }
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new LocationDisclaimerDataState(false, false, null, false);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final void y0() {
        K0(LocationDisclaimerIntent.OnStartIntent.f5170a);
    }
}

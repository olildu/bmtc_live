package app.chalo.livetracking.ui.routedetailsscreen.uistatefactory;

import androidx.media3.exoplayer.analytics.AnalyticsListener;
import app.chalo.compose.components.chalomap.ChaloMapMarkerIconType;
import app.chalo.compose.components.chalomap.ChaloMapMarkerInfoWindow;
import app.chalo.compose.components.chalomap.ChaloMapMarkerInfoWindowProvider;
import app.chalo.compose.components.chalomap.ChaloMapMarkerUIEventHandler;
import app.chalo.compose.components.chalomap.MapOffset;
import app.chalo.compose.components.chalomap.MapPolylinePointStateType;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.livetracking.routedetails.data.model.ui.BusMapInfoWindowUiModel;
import app.chalo.livetracking.routedetails.data.model.ui.MarkerStopType;
import app.chalo.livetracking.routedetails.data.model.ui.StopEtaStatus;
import app.chalo.livetracking.routedetails.data.model.ui.StopEtaUiModel;
import app.chalo.livetracking.ui.routedetailsscreen.RouteBookingType;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsIntent;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsViewTypeUIState;
import app.chalo.livetracking.ui.routedetailsscreen.routemap.LiveVehiclesMarkerInfo;
import app.chalo.livetracking.ui.routedetailsscreen.routemap.LiveVehiclesMarkerUIState;
import app.chalo.livetracking.ui.routedetailsscreen.routemap.RouteDetailsMapMarkerKt;
import app.chalo.livetracking.ui.routedetailsscreen.routemap.VehicleNumberViewUISpec;
import app.chalo.location.LatLng;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.error.StandardErrorScreenUIStateFactory;
import app.chalo.uistate.text.StyledTextDataUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.uistate.toolbar.ToolbarUIState;
import defpackage.t11;
import defpackage.vo1;
import defpackage.y21;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.apache.commons.io.IOUtils;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/RouteDetailsUIStateFactory;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RouteDetailsUIStateFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringProvider f4923a;
    public final RouteTimeTableUIStateFactory b;
    public final LivePassengerIndicatorUIStateFactory c;
    public final RouteDetailsStopsListUIStateFactory d;
    public final RouteStopCardUIStateFactory e;
    public final ChaloMapMarkerInfoWindowProvider f;
    public final Lazy g = LazyKt.b(new y21(19));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4924a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;
        public static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[MapPolylinePointStateType.values().length];
            try {
                iArr[MapPolylinePointStateType.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MapPolylinePointStateType.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f4924a = iArr;
            int[] iArr2 = new int[MarkerStopType.values().length];
            try {
                iArr2[MarkerStopType.CurrentSelectedStopInStopList.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[MarkerStopType.PremiumBusPickupStop.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[MarkerStopType.PremiumBusDropStop.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[MarkerStopType.FirstStop.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[MarkerStopType.LastStop.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[MarkerStopType.IntermediateStop.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[MarkerStopType.DisabledStop.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[MarkerStopType.BoardingStop.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[MarkerStopType.DeboardingStop.ordinal()] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            b = iArr2;
            int[] iArr3 = new int[StopEtaStatus.values().length];
            try {
                iArr3[StopEtaStatus.FETCHING_STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[StopEtaStatus.ETA_NOT_AVAILABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[StopEtaStatus.FETCHING_SUCCESS_AND_IN_PROGRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            c = iArr3;
            int[] iArr4 = new int[RouteBookingType.values().length];
            try {
                iArr4[RouteBookingType.TICKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[RouteBookingType.PASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[RouteBookingType.AIRPORT_ROUTE_TICKET.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[RouteBookingType.PREMIUM_BUS_TICKET.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            d = iArr4;
        }
    }

    public RouteDetailsUIStateFactory(StringProvider stringProvider, RouteTimeTableUIStateFactory routeTimeTableUIStateFactory, LivePassengerIndicatorUIStateFactory livePassengerIndicatorUIStateFactory, RouteDetailsStopsListUIStateFactory routeDetailsStopsListUIStateFactory, RouteStopCardUIStateFactory routeStopCardUIStateFactory, ChaloMapMarkerInfoWindowProvider chaloMapMarkerInfoWindowProvider) {
        this.f4923a = stringProvider;
        this.b = routeTimeTableUIStateFactory;
        this.c = livePassengerIndicatorUIStateFactory;
        this.d = routeDetailsStopsListUIStateFactory;
        this.e = routeStopCardUIStateFactory;
        this.f = chaloMapMarkerInfoWindowProvider;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0180  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object a(String str, String str2, String str3, StopEtaUiModel.WithEtaAvailable withEtaAvailable, boolean z, boolean z2, Function1 function1, ContinuationImpl continuationImpl) {
        RouteDetailsUIStateFactory$allLiveVehicles$1 routeDetailsUIStateFactory$allLiveVehicles$1;
        char c;
        StyledTextDataUIState[] styledTextDataUIStateArr;
        String str4;
        StopEtaUiModel.WithEtaAvailable withEtaAvailable2;
        boolean z3;
        int i;
        Function1 function2;
        boolean z4;
        StyledTextDataUIState[] styledTextDataUIStateArr2;
        ToolbarUIState toolbarUIState;
        StopEtaUiModel.WithEtaAvailable withEtaAvailable3;
        boolean z5;
        Function1 function3;
        TextUIState.ChaloTextUIState chaloTextUIState;
        Object objA;
        TextUIState textUIState;
        ToolbarUIState toolbarUIState2;
        if (continuationImpl instanceof RouteDetailsUIStateFactory$allLiveVehicles$1) {
            routeDetailsUIStateFactory$allLiveVehicles$1 = (RouteDetailsUIStateFactory$allLiveVehicles$1) continuationImpl;
            int i2 = routeDetailsUIStateFactory$allLiveVehicles$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                routeDetailsUIStateFactory$allLiveVehicles$1.label = i2 - Integer.MIN_VALUE;
            } else {
                routeDetailsUIStateFactory$allLiveVehicles$1 = new RouteDetailsUIStateFactory$allLiveVehicles$1(this, continuationImpl);
            }
        } else {
            routeDetailsUIStateFactory$allLiveVehicles$1 = new RouteDetailsUIStateFactory$allLiveVehicles$1(this, continuationImpl);
        }
        RouteDetailsUIStateFactory$allLiveVehicles$1 routeDetailsUIStateFactory$allLiveVehicles$2 = routeDetailsUIStateFactory$allLiveVehicles$1;
        Object objB = routeDetailsUIStateFactory$allLiveVehicles$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = routeDetailsUIStateFactory$allLiveVehicles$2.label;
        StringProvider stringProvider = this.f4923a;
        if (i3 == 0) {
            c = 0;
            ResultKt.b(objB);
            styledTextDataUIStateArr = new StyledTextDataUIState[3];
            styledTextDataUIStateArr[0] = new StyledTextDataUIState(str, null, null, UITextStyle.BodyLarge, null, null, null, 1014);
            styledTextDataUIStateArr[1] = new StyledTextDataUIState(IOUtils.LINE_SEPARATOR_UNIX, null, null, null, null, null, null, AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED);
            str4 = str3;
            routeDetailsUIStateFactory$allLiveVehicles$2.L$0 = str4;
            withEtaAvailable2 = withEtaAvailable;
            routeDetailsUIStateFactory$allLiveVehicles$2.L$1 = withEtaAvailable2;
            routeDetailsUIStateFactory$allLiveVehicles$2.L$2 = function1;
            routeDetailsUIStateFactory$allLiveVehicles$2.L$3 = styledTextDataUIStateArr;
            routeDetailsUIStateFactory$allLiveVehicles$2.L$4 = styledTextDataUIStateArr;
            z3 = z;
            routeDetailsUIStateFactory$allLiveVehicles$2.Z$0 = z3;
            routeDetailsUIStateFactory$allLiveVehicles$2.Z$1 = z2;
            routeDetailsUIStateFactory$allLiveVehicles$2.I$0 = 2;
            routeDetailsUIStateFactory$allLiveVehicles$2.label = 1;
            objB = stringProvider.b(StringEnum.ROUTE_DETAILS_TO_STOP, new Object[]{str2}, routeDetailsUIStateFactory$allLiveVehicles$2);
            if (objB != coroutineSingletons) {
                i = 2;
                function2 = function1;
                z4 = z2;
                styledTextDataUIStateArr2 = styledTextDataUIStateArr;
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            i = routeDetailsUIStateFactory$allLiveVehicles$2.I$0;
            z4 = routeDetailsUIStateFactory$allLiveVehicles$2.Z$1;
            z3 = routeDetailsUIStateFactory$allLiveVehicles$2.Z$0;
            styledTextDataUIStateArr = (StyledTextDataUIState[]) routeDetailsUIStateFactory$allLiveVehicles$2.L$4;
            styledTextDataUIStateArr2 = (StyledTextDataUIState[]) routeDetailsUIStateFactory$allLiveVehicles$2.L$3;
            function2 = (Function1) routeDetailsUIStateFactory$allLiveVehicles$2.L$2;
            c = 0;
            StopEtaUiModel.WithEtaAvailable withEtaAvailable4 = (StopEtaUiModel.WithEtaAvailable) routeDetailsUIStateFactory$allLiveVehicles$2.L$1;
            String str5 = (String) routeDetailsUIStateFactory$allLiveVehicles$2.L$0;
            ResultKt.b(objB);
            withEtaAvailable2 = withEtaAvailable4;
            str4 = str5;
        } else {
            if (i3 == 2) {
                boolean z6 = routeDetailsUIStateFactory$allLiveVehicles$2.Z$1;
                boolean z7 = routeDetailsUIStateFactory$allLiveVehicles$2.Z$0;
                ToolbarUIState toolbarUIState3 = (ToolbarUIState) routeDetailsUIStateFactory$allLiveVehicles$2.L$2;
                Function1 function4 = (Function1) routeDetailsUIStateFactory$allLiveVehicles$2.L$1;
                StopEtaUiModel.WithEtaAvailable withEtaAvailable5 = (StopEtaUiModel.WithEtaAvailable) routeDetailsUIStateFactory$allLiveVehicles$2.L$0;
                ResultKt.b(objB);
                z5 = z7;
                withEtaAvailable3 = withEtaAvailable5;
                z4 = z6;
                toolbarUIState = toolbarUIState3;
                function3 = function4;
                chaloTextUIState = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.HeadlineMedium, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8188);
                routeDetailsUIStateFactory$allLiveVehicles$2.L$0 = toolbarUIState;
                routeDetailsUIStateFactory$allLiveVehicles$2.L$1 = chaloTextUIState;
                routeDetailsUIStateFactory$allLiveVehicles$2.L$2 = null;
                routeDetailsUIStateFactory$allLiveVehicles$2.label = 3;
                objA = this.e.a(withEtaAvailable3, Integer.MAX_VALUE, false, true, true, z5, z4, function3, routeDetailsUIStateFactory$allLiveVehicles$2);
                if (objA != coroutineSingletons) {
                    textUIState = chaloTextUIState;
                    objB = objA;
                    toolbarUIState2 = toolbarUIState;
                }
                return coroutineSingletons;
            }
            if (i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            textUIState = (TextUIState) routeDetailsUIStateFactory$allLiveVehicles$2.L$1;
            toolbarUIState2 = (ToolbarUIState) routeDetailsUIStateFactory$allLiveVehicles$2.L$0;
            ResultKt.b(objB);
        }
        return new RouteDetailsViewTypeUIState.AllLiveVehicles(toolbarUIState2, textUIState, (RouteEtaStatusUIState) objB);
        styledTextDataUIStateArr[i] = new StyledTextDataUIState((String) objB, null, null, UITextStyle.BodySmall, null, null, null, 1014);
        ToolbarUIState toolbarUIState4 = new ToolbarUIState(null, new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr2), null, null, 30), null, UiEventHandler.Companion.a(new t11(function2, 20)), null, 0.0f, null, null, 245);
        StringEnum stringEnum = StringEnum.ALL_VEHICLES_ETA_STOP_HEADER_TEXT;
        Object[] objArr = new Object[1];
        objArr[c] = str4;
        routeDetailsUIStateFactory$allLiveVehicles$2.L$0 = withEtaAvailable2;
        routeDetailsUIStateFactory$allLiveVehicles$2.L$1 = function2;
        routeDetailsUIStateFactory$allLiveVehicles$2.L$2 = toolbarUIState4;
        routeDetailsUIStateFactory$allLiveVehicles$2.L$3 = null;
        routeDetailsUIStateFactory$allLiveVehicles$2.L$4 = null;
        routeDetailsUIStateFactory$allLiveVehicles$2.Z$0 = z3;
        routeDetailsUIStateFactory$allLiveVehicles$2.Z$1 = z4;
        routeDetailsUIStateFactory$allLiveVehicles$2.label = 2;
        Object objB2 = stringProvider.b(stringEnum, objArr, routeDetailsUIStateFactory$allLiveVehicles$2);
        if (objB2 != coroutineSingletons) {
            toolbarUIState = toolbarUIState4;
            objB = objB2;
            withEtaAvailable3 = withEtaAvailable2;
            z5 = z3;
            function3 = function2;
            chaloTextUIState = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.HeadlineMedium, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8188);
            routeDetailsUIStateFactory$allLiveVehicles$2.L$0 = toolbarUIState;
            routeDetailsUIStateFactory$allLiveVehicles$2.L$1 = chaloTextUIState;
            routeDetailsUIStateFactory$allLiveVehicles$2.L$2 = null;
            routeDetailsUIStateFactory$allLiveVehicles$2.label = 3;
            objA = this.e.a(withEtaAvailable3, Integer.MAX_VALUE, false, true, true, z5, z4, function3, routeDetailsUIStateFactory$allLiveVehicles$2);
            if (objA != coroutineSingletons) {
                textUIState = chaloTextUIState;
                objB = objA;
                toolbarUIState2 = toolbarUIState;
                return new RouteDetailsViewTypeUIState.AllLiveVehicles(toolbarUIState2, textUIState, (RouteEtaStatusUIState) objB);
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0084, code lost:
    
        if (r12 == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
    
        if (r12 == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ad, code lost:
    
        if (r12 == r1) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(app.chalo.livetracking.ui.routedetailsscreen.RouteBookingType r10, kotlin.jvm.functions.Function1 r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteDetailsUIStateFactory.b(app.chalo.livetracking.ui.routedetailsscreen.RouteBookingType, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(t11 t11Var, ContinuationImpl continuationImpl) {
        RouteDetailsUIStateFactory$errorScreen$1 routeDetailsUIStateFactory$errorScreen$1;
        Function0 function0;
        int i;
        StandardErrorScreenUIStateFactory standardErrorScreenUIStateFactory;
        String str;
        StandardErrorScreenUIStateFactory standardErrorScreenUIStateFactory2;
        Function0 function1;
        if (continuationImpl instanceof RouteDetailsUIStateFactory$errorScreen$1) {
            routeDetailsUIStateFactory$errorScreen$1 = (RouteDetailsUIStateFactory$errorScreen$1) continuationImpl;
            int i2 = routeDetailsUIStateFactory$errorScreen$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                routeDetailsUIStateFactory$errorScreen$1.label = i2 - Integer.MIN_VALUE;
            } else {
                routeDetailsUIStateFactory$errorScreen$1 = new RouteDetailsUIStateFactory$errorScreen$1(this, continuationImpl);
            }
        } else {
            routeDetailsUIStateFactory$errorScreen$1 = new RouteDetailsUIStateFactory$errorScreen$1(this, continuationImpl);
        }
        Object objB = routeDetailsUIStateFactory$errorScreen$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = routeDetailsUIStateFactory$errorScreen$1.label;
        StringProvider stringProvider = this.f4923a;
        if (i3 == 0) {
            ResultKt.b(objB);
            routeDetailsUIStateFactory$errorScreen$1.L$0 = t11Var;
            StandardErrorScreenUIStateFactory standardErrorScreenUIStateFactory3 = StandardErrorScreenUIStateFactory.f10025a;
            routeDetailsUIStateFactory$errorScreen$1.L$1 = standardErrorScreenUIStateFactory3;
            routeDetailsUIStateFactory$errorScreen$1.I$0 = 0;
            routeDetailsUIStateFactory$errorScreen$1.label = 1;
            objB = stringProvider.b(StringEnum.REFRESH_CALL_FAILURE, new Object[0], routeDetailsUIStateFactory$errorScreen$1);
            if (objB != coroutineSingletons) {
                function0 = t11Var;
                i = 0;
                standardErrorScreenUIStateFactory = standardErrorScreenUIStateFactory3;
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            i = routeDetailsUIStateFactory$errorScreen$1.I$0;
            standardErrorScreenUIStateFactory = (StandardErrorScreenUIStateFactory) routeDetailsUIStateFactory$errorScreen$1.L$1;
            function0 = (Function0) routeDetailsUIStateFactory$errorScreen$1.L$0;
            ResultKt.b(objB);
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str2 = (String) routeDetailsUIStateFactory$errorScreen$1.L$2;
            StandardErrorScreenUIStateFactory standardErrorScreenUIStateFactory4 = (StandardErrorScreenUIStateFactory) routeDetailsUIStateFactory$errorScreen$1.L$1;
            Function0 function2 = (Function0) routeDetailsUIStateFactory$errorScreen$1.L$0;
            ResultKt.b(objB);
            str = str2;
            function1 = function2;
            standardErrorScreenUIStateFactory2 = standardErrorScreenUIStateFactory4;
        }
        return new RouteDetailsViewTypeUIState.Error(StandardErrorScreenUIStateFactory.b(standardErrorScreenUIStateFactory2, null, str, null, (String) objB, function1, 2));
        String str3 = (String) objB;
        routeDetailsUIStateFactory$errorScreen$1.L$0 = function0;
        routeDetailsUIStateFactory$errorScreen$1.L$1 = standardErrorScreenUIStateFactory;
        routeDetailsUIStateFactory$errorScreen$1.L$2 = str3;
        routeDetailsUIStateFactory$errorScreen$1.I$0 = i;
        routeDetailsUIStateFactory$errorScreen$1.label = 2;
        Object objB2 = stringProvider.b(StringEnum.TRY_AGAIN, new Object[0], routeDetailsUIStateFactory$errorScreen$1);
        if (objB2 != coroutineSingletons) {
            str = str3;
            standardErrorScreenUIStateFactory2 = standardErrorScreenUIStateFactory;
            function1 = function0;
            objB = objB2;
            return new RouteDetailsViewTypeUIState.Error(StandardErrorScreenUIStateFactory.b(standardErrorScreenUIStateFactory2, null, str, null, (String) objB, function1, 2));
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Serializable d(List list, List list2, Function1 function1, ContinuationImpl continuationImpl) {
        RouteDetailsUIStateFactory$mapMarkersList$1 routeDetailsUIStateFactory$mapMarkersList$1;
        List list3;
        Object objH;
        int i;
        int i2;
        int i3;
        BusMapInfoWindowUiModel busMapInfoWindowUiModel;
        LiveVehiclesMarkerUIState.VehicleNumberViewUIState vehicleNumberViewUIState;
        final Function1 function2 = function1;
        if (continuationImpl instanceof RouteDetailsUIStateFactory$mapMarkersList$1) {
            routeDetailsUIStateFactory$mapMarkersList$1 = (RouteDetailsUIStateFactory$mapMarkersList$1) continuationImpl;
            int i4 = routeDetailsUIStateFactory$mapMarkersList$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                routeDetailsUIStateFactory$mapMarkersList$1.label = i4 - Integer.MIN_VALUE;
            } else {
                routeDetailsUIStateFactory$mapMarkersList$1 = new RouteDetailsUIStateFactory$mapMarkersList$1(this, continuationImpl);
            }
        } else {
            routeDetailsUIStateFactory$mapMarkersList$1 = new RouteDetailsUIStateFactory$mapMarkersList$1(this, continuationImpl);
        }
        Object obj = routeDetailsUIStateFactory$mapMarkersList$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = routeDetailsUIStateFactory$mapMarkersList$1.label;
        int i6 = 1;
        if (i5 == 0) {
            ResultKt.b(obj);
            list3 = list2;
            routeDetailsUIStateFactory$mapMarkersList$1.L$0 = list3;
            routeDetailsUIStateFactory$mapMarkersList$1.L$1 = function2;
            routeDetailsUIStateFactory$mapMarkersList$1.label = 1;
            objH = h(list, function2, routeDetailsUIStateFactory$mapMarkersList$1);
            if (objH == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function2 = (Function1) routeDetailsUIStateFactory$mapMarkersList$1.L$1;
            List list4 = (List) routeDetailsUIStateFactory$mapMarkersList$1.L$0;
            ResultKt.b(obj);
            objH = obj;
            list3 = list4;
        }
        Collection collection = (Collection) objH;
        List list5 = list3;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list5, 10));
        Iterator it = list5.iterator();
        while (it.hasNext()) {
            final LiveVehiclesMarkerInfo liveVehiclesMarkerInfo = (LiveVehiclesMarkerInfo) it.next();
            String str = liveVehiclesMarkerInfo.f4896a;
            LatLng latLng = liveVehiclesMarkerInfo.b;
            ChaloMapMarkerIconType.BitmapRes bitmapRes = liveVehiclesMarkerInfo.d;
            MapOffset mapOffset = (liveVehiclesMarkerInfo.e || liveVehiclesMarkerInfo.f) ? new MapOffset(0.15f, 0.7f) : new MapOffset(0.5f, 0.5f);
            ChaloMapMarkerInfoWindow chaloMapMarkerInfoWindowA = null;
            if (!liveVehiclesMarkerInfo.c || (busMapInfoWindowUiModel = liveVehiclesMarkerInfo.g) == null) {
                it = it;
                i = i6;
                i2 = 2;
                i3 = 0;
            } else {
                i3 = 0;
                int i7 = RouteDetailsMapMarkerKt.WhenMappings.f4899a[busMapInfoWindowUiModel.h.ordinal()];
                if (i7 == i6) {
                    i = i6;
                    i2 = 2;
                    vehicleNumberViewUIState = new LiveVehiclesMarkerUIState.VehicleNumberViewUIState(CollectionsKt.R(new TextUIState.ChaloTextUIState(busMapInfoWindowUiModel.b, UITextStyle.TitleLarge, ChaloColorToken.Black_87.f9768a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184)), new VehicleNumberViewUISpec(null, null, 7));
                } else {
                    if (i7 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = 2;
                    i = i6;
                    String strM = vo1.m("Bus Number:  ", busMapInfoWindowUiModel.b);
                    UITextStyle uITextStyle = UITextStyle.BodyMedium;
                    TextUIState.ChaloTextUIState chaloTextUIState = new TextUIState.ChaloTextUIState(strM, uITextStyle, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8188);
                    TextUIState.ChaloTextUIState chaloTextUIState2 = new TextUIState.ChaloTextUIState(vo1.m("Next stopId:  ", busMapInfoWindowUiModel.c), uITextStyle, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8188);
                    TextUIState.ChaloTextUIState chaloTextUIState3 = new TextUIState.ChaloTextUIState(vo1.m("Last stopId:  ", busMapInfoWindowUiModel.d), uITextStyle, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8188);
                    TextUIState.ChaloTextUIState chaloTextUIState4 = new TextUIState.ChaloTextUIState(vo1.m("Eta:  ", busMapInfoWindowUiModel.e), uITextStyle, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8188);
                    TextUIState.ChaloTextUIState chaloTextUIState5 = new TextUIState.ChaloTextUIState(vo1.m("Last update(mins ago):  ", busMapInfoWindowUiModel.f), uITextStyle, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8188);
                    TextUIState.ChaloTextUIState[] chaloTextUIStateArr = new TextUIState.ChaloTextUIState[5];
                    chaloTextUIStateArr[0] = chaloTextUIState;
                    chaloTextUIStateArr[i] = chaloTextUIState2;
                    chaloTextUIStateArr[2] = chaloTextUIState3;
                    chaloTextUIStateArr[3] = chaloTextUIState4;
                    chaloTextUIStateArr[4] = chaloTextUIState5;
                    List listS = CollectionsKt.S(chaloTextUIStateArr);
                    float f = ChaloThemeHelper.a().g;
                    vehicleNumberViewUIState = new LiveVehiclesMarkerUIState.VehicleNumberViewUIState(listS, new VehicleNumberViewUISpec(new ChaloPadding(f, f, f, f), Float.valueOf(ChaloThemeHelper.a().w), 4));
                }
                chaloMapMarkerInfoWindowA = this.f.a(vehicleNumberViewUIState);
            }
            ChaloMapMarkerInfoWindow chaloMapMarkerInfoWindow = chaloMapMarkerInfoWindowA;
            ChaloMapMarkerUIEventHandler.Companion companion = ChaloMapMarkerUIEventHandler.f1869a;
            final int i8 = i3;
            Function0 function0 = new Function0() { // from class: a41
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i8) {
                        case 0:
                            function2.invoke(new RouteDetailsIntent.MapMarkerInteraction.MapMarkerClicked(liveVehiclesMarkerInfo));
                            return Boolean.FALSE;
                        case 1:
                            function2.invoke(new RouteDetailsIntent.MapMarkerInteraction.OnMapInfoWindowClicked(liveVehiclesMarkerInfo));
                            return Unit.f17538a;
                        default:
                            function2.invoke(new RouteDetailsIntent.MapMarkerInteraction.MapInfoWindowClosed(liveVehiclesMarkerInfo));
                            return Unit.f17538a;
                    }
                }
            };
            final int i9 = i;
            Function0 function3 = new Function0() { // from class: a41
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i9) {
                        case 0:
                            function2.invoke(new RouteDetailsIntent.MapMarkerInteraction.MapMarkerClicked(liveVehiclesMarkerInfo));
                            return Boolean.FALSE;
                        case 1:
                            function2.invoke(new RouteDetailsIntent.MapMarkerInteraction.OnMapInfoWindowClicked(liveVehiclesMarkerInfo));
                            return Unit.f17538a;
                        default:
                            function2.invoke(new RouteDetailsIntent.MapMarkerInteraction.MapInfoWindowClosed(liveVehiclesMarkerInfo));
                            return Unit.f17538a;
                    }
                }
            };
            final int i10 = i2;
            Function0 function4 = new Function0() { // from class: a41
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i10) {
                        case 0:
                            function2.invoke(new RouteDetailsIntent.MapMarkerInteraction.MapMarkerClicked(liveVehiclesMarkerInfo));
                            return Boolean.FALSE;
                        case 1:
                            function2.invoke(new RouteDetailsIntent.MapMarkerInteraction.OnMapInfoWindowClicked(liveVehiclesMarkerInfo));
                            return Unit.f17538a;
                        default:
                            function2.invoke(new RouteDetailsIntent.MapMarkerInteraction.MapInfoWindowClosed(liveVehiclesMarkerInfo));
                            return Unit.f17538a;
                    }
                }
            };
            companion.getClass();
            arrayList.add(new LiveVehiclesMarkerUIState(str, latLng, bitmapRes, mapOffset, chaloMapMarkerInfoWindow, ChaloMapMarkerUIEventHandler.Companion.a(function0, function3, function4)));
            it = it;
            i6 = 1;
        }
        return CollectionsKt.c0(arrayList, collection);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x030b  */
    /* JADX WARN: Code duplicated, block: B:114:0x0375  */
    /* JADX WARN: Code duplicated, block: B:120:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:122:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:124:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:128:0x03db  */
    /* JADX WARN: Code duplicated, block: B:133:0x0416  */
    /* JADX WARN: Code duplicated, block: B:171:0x03d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x016b  */
    /* JADX WARN: Code duplicated, block: B:38:0x016e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0191  */
    /* JADX WARN: Code duplicated, block: B:49:0x0194  */
    /* JADX WARN: Code duplicated, block: B:82:0x024b  */
    /* JADX WARN: Code duplicated, block: B:83:0x024e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0275  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:90:0x0282  */
    /* JADX WARN: Code duplicated, block: B:93:0x0292  */
    /* JADX WARN: Code duplicated, block: B:95:0x0298  */
    /* JADX WARN: Code duplicated, block: B:98:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:99:0x0306  */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v27 java.lang.Object, still in use, count: 2, list:
          (r4v27 java.lang.Object) from 0x0167: PHI (r4 I:??) = (r4v24 java.lang.Object), (r4v27 java.lang.Object) binds: [B:34:0x0166, B:172:0x0167] A[DONT_GENERATE, DONT_INLINE]
          (r4v27 java.lang.Object) from 0x015f: CHECK_CAST (app.chalo.livetracking.ui.routedetailsscreen.routemap.RouteDetailsMapStopMarkerInfo) (r4v27 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public final java.lang.Object e(app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsDataState r35, kotlin.jvm.functions.Function1 r36, kotlin.coroutines.jvm.internal.ContinuationImpl r37) {
        /*
            Method dump skipped, instruction units count: 1328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteDetailsUIStateFactory.e(app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsDataState, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0207 A[LOOP:0: B:40:0x0201->B:42:0x0207, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c1, code lost:
    
        if (r6 == r8) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e4, code lost:
    
        if (r6 == r8) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.util.List r33, java.lang.String r34, boolean r35, kotlin.jvm.functions.Function2 r36, kotlin.jvm.functions.Function1 r37, kotlin.jvm.functions.Function0 r38, kotlin.coroutines.jvm.internal.ContinuationImpl r39) {
        /*
            Method dump skipped, instruction units count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteDetailsUIStateFactory.f(java.util.List, java.lang.String, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:44:0x013f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0146  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c6, code lost:
    
        if (r2 == r3) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e3, code lost:
    
        if (r2 == r3) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(app.chalo.livetracking.ui.routedetailsscreen.routemap.RouteDetailsMapStopMarkerInfo r32, kotlin.coroutines.jvm.internal.ContinuationImpl r33) {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteDetailsUIStateFactory.g(app.chalo.livetracking.ui.routedetailsscreen.routemap.RouteDetailsMapStopMarkerInfo, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x007b  */
    /* JADX WARN: Code duplicated, block: B:19:0x009a  */
    /* JADX WARN: Code duplicated, block: B:21:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:22:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:26:0x00af  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:41:0x0101 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x0102  */
    /* JADX WARN: Code duplicated, block: B:45:0x0116  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0102 -> B:43:0x0105). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0116 -> B:44:0x010f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:36:0x00d7
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object h(java.util.List r21, kotlin.jvm.functions.Function1 r22, kotlin.coroutines.jvm.internal.ContinuationImpl r23) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteDetailsUIStateFactory.h(java.util.List, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}

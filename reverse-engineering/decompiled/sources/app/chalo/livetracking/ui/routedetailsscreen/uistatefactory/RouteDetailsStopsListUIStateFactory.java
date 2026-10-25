package app.chalo.livetracking.ui.routedetailsscreen.uistatefactory;

import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import app.chalo.ads.NativeInlineAdSlot;
import app.chalo.compose.theme.ChaloDimens;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.ShapedContentUIState;
import app.chalo.compose.theme.ShapedContentUIStateFactory;
import app.chalo.livetracking.routedetails.data.model.app.RouteAvailabilityBannerDetails;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsStopHelpTag;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsStopUiModel;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.divider.DividerOrientation;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.SpecialFeaturesTagListUIState;
import app.chalo.uistate.text.SpecialFeaturesTagListUIStateFactory;
import app.chalo.uistate.text.StyledTextDataUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import defpackage.py;
import defpackage.s01;
import defpackage.t11;
import defpackage.u10;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/RouteDetailsStopsListUIStateFactory;", "", "Companion", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RouteDetailsStopsListUIStateFactory {
    public static final float c = Dp.m7278constructorimpl(Dp.m7278constructorimpl(ChaloThemeHelper.a().m + ChaloThemeHelper.a().g) + ChaloThemeHelper.a().h);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringProvider f4921a;
    public final RouteStopCardUIStateFactory b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/RouteDetailsStopsListUIStateFactory$Companion;", "", "Landroidx/compose/ui/unit/Dp;", "BOOKING_BUTTON_BOTTOM_PADDING", "F", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4922a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[RouteDetailsStopHelpTag.values().length];
            try {
                iArr[RouteDetailsStopHelpTag.NEAREST_STOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RouteDetailsStopHelpTag.PREMIUM_BUS_PICKUP_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RouteDetailsStopHelpTag.PREMIUM_BUS_DROP_STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RouteDetailsStopHelpTag.USER_DESTINATION_STOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RouteDetailsStopHelpTag.BOARDING_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[RouteDetailsStopHelpTag.DEBOARDING_STOP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f4922a = iArr;
            int[] iArr2 = new int[RouteNamingSchemeType.values().length];
            try {
                iArr2[RouteNamingSchemeType.VIA.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[RouteNamingSchemeType.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            b = iArr2;
        }
    }

    public RouteDetailsStopsListUIStateFactory(StringProvider stringProvider, RouteStopCardUIStateFactory routeStopCardUIStateFactory) {
        this.f4921a = stringProvider;
        this.b = routeStopCardUIStateFactory;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x012d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0147  */
    /* JADX WARN: Code duplicated, block: B:51:0x0152  */
    /* JADX WARN: Code duplicated, block: B:52:0x0159  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    public final Object a(String str, String str2, List list, boolean z, String str3, List list2, String str4, String str5, RouteNamingSchemeType routeNamingSchemeType, Function1 function1, ContinuationImpl continuationImpl) {
        RouteDetailsStopsListUIStateFactory$headerDetails$1 routeDetailsStopsListUIStateFactory$headerDetails$1;
        boolean z2;
        Function1 function2;
        SpecialFeaturesTagListUIState specialFeaturesTagListUIState;
        SpecialFeaturesTagListUIState specialFeaturesTagListUIState2;
        List list3;
        String str6;
        String str7;
        Function1 function3;
        SpecialFeaturesTagListUIState specialFeaturesTagListUIState3;
        Object obj;
        RouteNameAndSchemeDetailsUIState routeNameAndSchemeDetailsUIState;
        boolean z3;
        RouteWithBookingDetailsUIState routeWithBookingDetailsUIState;
        SpecialFeaturesTagListUIState specialFeaturesTagListUIState4;
        RouteWithBookingDetailsUIState routeWithBookingDetailsUIState2;
        float f;
        if (continuationImpl instanceof RouteDetailsStopsListUIStateFactory$headerDetails$1) {
            routeDetailsStopsListUIStateFactory$headerDetails$1 = (RouteDetailsStopsListUIStateFactory$headerDetails$1) continuationImpl;
            int i = routeDetailsStopsListUIStateFactory$headerDetails$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                routeDetailsStopsListUIStateFactory$headerDetails$1.label = i - Integer.MIN_VALUE;
            } else {
                routeDetailsStopsListUIStateFactory$headerDetails$1 = new RouteDetailsStopsListUIStateFactory$headerDetails$1(this, continuationImpl);
            }
        } else {
            routeDetailsStopsListUIStateFactory$headerDetails$1 = new RouteDetailsStopsListUIStateFactory$headerDetails$1(this, continuationImpl);
        }
        RouteDetailsStopsListUIStateFactory$headerDetails$1 routeDetailsStopsListUIStateFactory$headerDetails$2 = routeDetailsStopsListUIStateFactory$headerDetails$1;
        Object objC = routeDetailsStopsListUIStateFactory$headerDetails$2.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = routeDetailsStopsListUIStateFactory$headerDetails$2.label;
        RouteUserDestinationStopUIState routeUserDestinationStopUIState = null;
        if (i2 == 0) {
            ArrayList arrayListL = py.l(objC);
            if (!list2.isEmpty()) {
                if (list2.size() < 3) {
                    arrayListL.addAll(list2);
                } else {
                    arrayListL.addAll(list2.subList(0, 3));
                }
            }
            if (str4 != null && str4.length() != 0) {
                arrayListL.add(str4);
            }
            SpecialFeaturesTagListUIState specialFeaturesTagListUIStateA = arrayListL.isEmpty() ? null : SpecialFeaturesTagListUIStateFactory.a(arrayListL);
            t11 t11Var = new t11(function1, 16);
            routeDetailsStopsListUIStateFactory$headerDetails$2.L$0 = list;
            routeDetailsStopsListUIStateFactory$headerDetails$2.L$1 = str3;
            routeDetailsStopsListUIStateFactory$headerDetails$2.L$2 = function1;
            routeDetailsStopsListUIStateFactory$headerDetails$2.L$3 = specialFeaturesTagListUIStateA;
            routeDetailsStopsListUIStateFactory$headerDetails$2.L$4 = specialFeaturesTagListUIStateA;
            z2 = z;
            routeDetailsStopsListUIStateFactory$headerDetails$2.Z$0 = z2;
            routeDetailsStopsListUIStateFactory$headerDetails$2.label = 1;
            objC = c(str, str2, str5, routeNamingSchemeType, t11Var, routeDetailsStopsListUIStateFactory$headerDetails$2);
            if (objC != obj2) {
                function2 = function1;
                specialFeaturesTagListUIState = specialFeaturesTagListUIStateA;
                specialFeaturesTagListUIState2 = specialFeaturesTagListUIState;
                list3 = list;
                str6 = str3;
            }
            return obj2;
        }
        if (i2 == 1) {
            boolean z4 = routeDetailsStopsListUIStateFactory$headerDetails$2.Z$0;
            specialFeaturesTagListUIState = (SpecialFeaturesTagListUIState) routeDetailsStopsListUIStateFactory$headerDetails$2.L$4;
            specialFeaturesTagListUIState2 = (SpecialFeaturesTagListUIState) routeDetailsStopsListUIStateFactory$headerDetails$2.L$3;
            function2 = (Function1) routeDetailsStopsListUIStateFactory$headerDetails$2.L$2;
            str6 = (String) routeDetailsStopsListUIStateFactory$headerDetails$2.L$1;
            list3 = (List) routeDetailsStopsListUIStateFactory$headerDetails$2.L$0;
            ResultKt.b(objC);
            z2 = z4;
        } else {
            if (i2 == 2) {
                z3 = routeDetailsStopsListUIStateFactory$headerDetails$2.Z$0;
                RouteNameAndSchemeDetailsUIState routeNameAndSchemeDetailsUIState2 = (RouteNameAndSchemeDetailsUIState) routeDetailsStopsListUIStateFactory$headerDetails$2.L$4;
                SpecialFeaturesTagListUIState specialFeaturesTagListUIState5 = (SpecialFeaturesTagListUIState) routeDetailsStopsListUIStateFactory$headerDetails$2.L$3;
                specialFeaturesTagListUIState3 = (SpecialFeaturesTagListUIState) routeDetailsStopsListUIStateFactory$headerDetails$2.L$2;
                function3 = (Function1) routeDetailsStopsListUIStateFactory$headerDetails$2.L$1;
                str7 = (String) routeDetailsStopsListUIStateFactory$headerDetails$2.L$0;
                ResultKt.b(objC);
                routeNameAndSchemeDetailsUIState = routeNameAndSchemeDetailsUIState2;
                specialFeaturesTagListUIState = specialFeaturesTagListUIState5;
                obj = objC;
                routeWithBookingDetailsUIState = new RouteWithBookingDetailsUIState(routeNameAndSchemeDetailsUIState, (RouteDetailsOptionsUIState) obj);
                if (z3) {
                    t11 t11Var2 = new t11(function3, 18);
                    routeDetailsStopsListUIStateFactory$headerDetails$2.L$0 = specialFeaturesTagListUIState3;
                    routeDetailsStopsListUIStateFactory$headerDetails$2.L$1 = specialFeaturesTagListUIState;
                    routeDetailsStopsListUIStateFactory$headerDetails$2.L$2 = routeWithBookingDetailsUIState;
                    routeDetailsStopsListUIStateFactory$headerDetails$2.L$3 = null;
                    routeDetailsStopsListUIStateFactory$headerDetails$2.L$4 = null;
                    routeDetailsStopsListUIStateFactory$headerDetails$2.label = 3;
                    objC = g(str7, t11Var2, routeDetailsStopsListUIStateFactory$headerDetails$2);
                    if (objC != obj2) {
                        specialFeaturesTagListUIState4 = specialFeaturesTagListUIState3;
                        routeWithBookingDetailsUIState2 = routeWithBookingDetailsUIState;
                    }
                    return obj2;
                }
                if (specialFeaturesTagListUIState3 != null) {
                    f = ChaloThemeHelper.a().e;
                } else {
                    f = ChaloThemeHelper.a().f1916a;
                }
                return new RouteHeaderDetailsUIState(specialFeaturesTagListUIState, routeWithBookingDetailsUIState, routeUserDestinationStopUIState, new RouteHeaderDetailsUISpecs(f));
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            routeWithBookingDetailsUIState2 = (RouteWithBookingDetailsUIState) routeDetailsStopsListUIStateFactory$headerDetails$2.L$2;
            specialFeaturesTagListUIState = (SpecialFeaturesTagListUIState) routeDetailsStopsListUIStateFactory$headerDetails$2.L$1;
            specialFeaturesTagListUIState4 = (SpecialFeaturesTagListUIState) routeDetailsStopsListUIStateFactory$headerDetails$2.L$0;
            ResultKt.b(objC);
        }
        routeUserDestinationStopUIState = (RouteUserDestinationStopUIState) objC;
        routeWithBookingDetailsUIState = routeWithBookingDetailsUIState2;
        specialFeaturesTagListUIState3 = specialFeaturesTagListUIState4;
        if (specialFeaturesTagListUIState3 != null) {
            f = ChaloThemeHelper.a().e;
        } else {
            f = ChaloThemeHelper.a().f1916a;
        }
        return new RouteHeaderDetailsUIState(specialFeaturesTagListUIState, routeWithBookingDetailsUIState, routeUserDestinationStopUIState, new RouteHeaderDetailsUISpecs(f));
        RouteNameAndSchemeDetailsUIState routeNameAndSchemeDetailsUIState3 = (RouteNameAndSchemeDetailsUIState) objC;
        t11 t11Var3 = new t11(function2, 17);
        s01 s01Var = new s01(function2, 12);
        routeDetailsStopsListUIStateFactory$headerDetails$2.L$0 = str6;
        routeDetailsStopsListUIStateFactory$headerDetails$2.L$1 = function2;
        routeDetailsStopsListUIStateFactory$headerDetails$2.L$2 = specialFeaturesTagListUIState2;
        routeDetailsStopsListUIStateFactory$headerDetails$2.L$3 = specialFeaturesTagListUIState;
        routeDetailsStopsListUIStateFactory$headerDetails$2.L$4 = routeNameAndSchemeDetailsUIState3;
        routeDetailsStopsListUIStateFactory$headerDetails$2.Z$0 = z2;
        routeDetailsStopsListUIStateFactory$headerDetails$2.label = 2;
        Object objB = b(list3, t11Var3, s01Var, routeDetailsStopsListUIStateFactory$headerDetails$2);
        if (objB != obj2) {
            str7 = str6;
            function3 = function2;
            specialFeaturesTagListUIState3 = specialFeaturesTagListUIState2;
            obj = objB;
            routeNameAndSchemeDetailsUIState = routeNameAndSchemeDetailsUIState3;
            z3 = z2;
            routeWithBookingDetailsUIState = new RouteWithBookingDetailsUIState(routeNameAndSchemeDetailsUIState, (RouteDetailsOptionsUIState) obj);
            if (z3) {
                t11 t11Var4 = new t11(function3, 18);
                routeDetailsStopsListUIStateFactory$headerDetails$2.L$0 = specialFeaturesTagListUIState3;
                routeDetailsStopsListUIStateFactory$headerDetails$2.L$1 = specialFeaturesTagListUIState;
                routeDetailsStopsListUIStateFactory$headerDetails$2.L$2 = routeWithBookingDetailsUIState;
                routeDetailsStopsListUIStateFactory$headerDetails$2.L$3 = null;
                routeDetailsStopsListUIStateFactory$headerDetails$2.L$4 = null;
                routeDetailsStopsListUIStateFactory$headerDetails$2.label = 3;
                objC = g(str7, t11Var4, routeDetailsStopsListUIStateFactory$headerDetails$2);
                if (objC != obj2) {
                    specialFeaturesTagListUIState4 = specialFeaturesTagListUIState3;
                    routeWithBookingDetailsUIState2 = routeWithBookingDetailsUIState;
                    routeUserDestinationStopUIState = (RouteUserDestinationStopUIState) objC;
                    routeWithBookingDetailsUIState = routeWithBookingDetailsUIState2;
                    specialFeaturesTagListUIState3 = specialFeaturesTagListUIState4;
                }
            }
            if (specialFeaturesTagListUIState3 != null) {
                f = ChaloThemeHelper.a().e;
            } else {
                f = ChaloThemeHelper.a().f1916a;
            }
            return new RouteHeaderDetailsUIState(specialFeaturesTagListUIState, routeWithBookingDetailsUIState, routeUserDestinationStopUIState, new RouteHeaderDetailsUISpecs(f));
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x008e  */
    /* JADX WARN: Code duplicated, block: B:19:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:21:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:23:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00e4 -> B:38:0x00e9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(java.util.List r15, defpackage.t11 r16, defpackage.s01 r17, kotlin.coroutines.jvm.internal.ContinuationImpl r18) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteDetailsStopsListUIStateFactory.b(java.util.List, t11, s01, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:39:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:41:0x0102  */
    /* JADX WARN: Code duplicated, block: B:53:0x012c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0143  */
    /* JADX WARN: Code duplicated, block: B:61:0x0176  */
    /* JADX WARN: Code duplicated, block: B:62:0x017d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e0, code lost:
    
        if (r2 == r4) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r28, java.lang.String r29, java.lang.String r30, app.chalo.providers.RouteNamingSchemeType r31, defpackage.t11 r32, kotlin.coroutines.jvm.internal.ContinuationImpl r33) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteDetailsStopsListUIStateFactory.c(java.lang.String, java.lang.String, java.lang.String, app.chalo.providers.RouteNamingSchemeType, t11, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r30v4, types: [app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.StopsListBusIconUIState] */
    /* JADX WARN: Type inference failed for: r6v5, types: [app.chalo.uistate.text.TextUIState$ChaloTextUIState] */
    public final Object d(int i, RouteDetailsStopUiModel routeDetailsStopUiModel, boolean z, boolean z2, RouteAvailabilityBannerDetails routeAvailabilityBannerDetails, boolean z3, boolean z4, List list, boolean z5, boolean z6, boolean z7, Map map, NativeInlineAdSlot nativeInlineAdSlot, Function1 function1, boolean z8, boolean z9, boolean z10, boolean z11, String str, ContinuationImpl continuationImpl) throws Throwable {
        RouteDetailsStopsListUIStateFactory$singleStopItem$1 routeDetailsStopsListUIStateFactory$singleStopItem$1;
        RouteDetailsStopsListUIStateFactory routeDetailsStopsListUIStateFactory;
        String str2;
        int i2;
        RouteDetailsStopUiModel routeDetailsStopUiModel2;
        boolean z12;
        boolean z13;
        Function1 function2;
        boolean z14;
        boolean z15;
        boolean z16;
        Object obj;
        boolean z17;
        DividerUIState dividerUIState;
        if (continuationImpl instanceof RouteDetailsStopsListUIStateFactory$singleStopItem$1) {
            routeDetailsStopsListUIStateFactory$singleStopItem$1 = (RouteDetailsStopsListUIStateFactory$singleStopItem$1) continuationImpl;
            int i3 = routeDetailsStopsListUIStateFactory$singleStopItem$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                routeDetailsStopsListUIStateFactory$singleStopItem$1.label = i3 - Integer.MIN_VALUE;
                routeDetailsStopsListUIStateFactory = this;
            } else {
                routeDetailsStopsListUIStateFactory = this;
                routeDetailsStopsListUIStateFactory$singleStopItem$1 = new RouteDetailsStopsListUIStateFactory$singleStopItem$1(routeDetailsStopsListUIStateFactory, continuationImpl);
            }
        } else {
            routeDetailsStopsListUIStateFactory = this;
            routeDetailsStopsListUIStateFactory$singleStopItem$1 = new RouteDetailsStopsListUIStateFactory$singleStopItem$1(routeDetailsStopsListUIStateFactory, continuationImpl);
        }
        RouteDetailsStopsListUIStateFactory$singleStopItem$1 routeDetailsStopsListUIStateFactory$singleStopItem$2 = routeDetailsStopsListUIStateFactory$singleStopItem$1;
        Object obj2 = routeDetailsStopsListUIStateFactory$singleStopItem$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = routeDetailsStopsListUIStateFactory$singleStopItem$2.label;
        if (i4 == 0) {
            ResultKt.b(obj2);
            routeDetailsStopsListUIStateFactory$singleStopItem$2.L$0 = routeDetailsStopUiModel;
            routeDetailsStopsListUIStateFactory$singleStopItem$2.L$1 = function1;
            str2 = str;
            routeDetailsStopsListUIStateFactory$singleStopItem$2.L$2 = str2;
            routeDetailsStopsListUIStateFactory$singleStopItem$2.I$0 = i;
            routeDetailsStopsListUIStateFactory$singleStopItem$2.Z$0 = z;
            routeDetailsStopsListUIStateFactory$singleStopItem$2.Z$1 = z2;
            routeDetailsStopsListUIStateFactory$singleStopItem$2.Z$2 = z8;
            routeDetailsStopsListUIStateFactory$singleStopItem$2.Z$3 = z9;
            routeDetailsStopsListUIStateFactory$singleStopItem$2.Z$4 = z10;
            routeDetailsStopsListUIStateFactory$singleStopItem$2.Z$5 = z11;
            routeDetailsStopsListUIStateFactory$singleStopItem$2.label = 1;
            Object objF = routeDetailsStopsListUIStateFactory.f(routeDetailsStopUiModel, z, routeAvailabilityBannerDetails, z3, z4, list, z5, z6, z7, map, nativeInlineAdSlot, function1, routeDetailsStopsListUIStateFactory$singleStopItem$2);
            if (objF == coroutineSingletons) {
                return coroutineSingletons;
            }
            i2 = i;
            routeDetailsStopUiModel2 = routeDetailsStopUiModel;
            z12 = z;
            z13 = z2;
            function2 = function1;
            z14 = z8;
            z15 = z10;
            z16 = z11;
            obj = objF;
            z17 = z9;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z16 = routeDetailsStopsListUIStateFactory$singleStopItem$2.Z$5;
            z15 = routeDetailsStopsListUIStateFactory$singleStopItem$2.Z$4;
            z17 = routeDetailsStopsListUIStateFactory$singleStopItem$2.Z$3;
            z14 = routeDetailsStopsListUIStateFactory$singleStopItem$2.Z$2;
            z13 = routeDetailsStopsListUIStateFactory$singleStopItem$2.Z$1;
            z12 = routeDetailsStopsListUIStateFactory$singleStopItem$2.Z$0;
            i2 = routeDetailsStopsListUIStateFactory$singleStopItem$2.I$0;
            String str3 = (String) routeDetailsStopsListUIStateFactory$singleStopItem$2.L$2;
            function2 = (Function1) routeDetailsStopsListUIStateFactory$singleStopItem$2.L$1;
            routeDetailsStopUiModel2 = (RouteDetailsStopUiModel) routeDetailsStopsListUIStateFactory$singleStopItem$2.L$0;
            ResultKt.b(obj2);
            obj = obj2;
            str2 = str3;
        }
        StopNameAndEtaUIState stopNameAndEtaUIState = (StopNameAndEtaUIState) obj;
        boolean z18 = routeDetailsStopUiModel2.d;
        boolean z19 = routeDetailsStopUiModel2.e;
        ChaloColorToken.Black black = ChaloColorToken.Black.f9759a;
        ChaloColorToken chaloColorToken = z18 ? black : ChaloColorToken.Transparent.f9864a;
        ChaloDimens chaloDimensA = ChaloThemeHelper.a();
        float f = z16 ? chaloDimensA.g : chaloDimensA.f1916a;
        ChaloDimens chaloDimensA2 = ChaloThemeHelper.a();
        Object iconWithBusNumber = null;
        String str4 = str2;
        FromStopAndBusIconUISpecs fromStopAndBusIconUISpecs = new FromStopAndBusIconUISpecs(new ChaloPadding(z12 ? chaloDimensA2.h : chaloDimensA2.f1916a, f, 0.0f, 0.0f, 12), !z16 ? Float.valueOf(ChaloThemeHelper.a().k) : null);
        DividerUIState dividerUIState2 = !z12 ? new DividerUIState(ChaloThemeHelper.a().c, black, DividerOrientation.Vertical) : null;
        ShapedContentUIState shapedContentUIStateA = ShapedContentUIStateFactory.a(ChaloThemeHelper.a().g, ChaloThemeHelper.a().c, chaloColorToken, black);
        if (z13) {
            dividerUIState = null;
        } else {
            dividerUIState = new DividerUIState(ChaloThemeHelper.a().c, ChaloColorTokenKt.a(z17 ? 0.4f : 1.0f, black), DividerOrientation.Vertical);
        }
        if (z19 && !z14 && !z16) {
            iconWithBusNumber = new StopsListBusIconUIState.OnlyIcon(new ImageUIState(z15 ? IconType.LIVE_BUS_LIST_DELAYED : IconType.ROUTE_LIST_LIVE_DIRECTION, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().l), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246));
        } else if (!z13 && z19 && !z14 && z16) {
            iconWithBusNumber = new StopsListBusIconUIState.IconWithBusNumber(new ImageUIState(IconType.LIVE_BUS, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254), str4 != null ? new TextUIState.ChaloTextUIState(str4, UITextStyle.TitleLarge, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184) : null, z15 ? ChaloColorToken.DisabledBusGreyColor.f9788a : ChaloColorToken.ChaloBlueEta.f9777a);
        }
        FromStopAndBusIconUIState fromStopAndBusIconUIState = new FromStopAndBusIconUIState(dividerUIState2, dividerUIState, shapedContentUIStateA, iconWithBusNumber, fromStopAndBusIconUISpecs, z16);
        UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1A = UiEventHandler.Companion.a(new u10(function2, i2, routeDetailsStopUiModel2, 5));
        boolean z20 = routeDetailsStopUiModel2.f;
        return new SingleStopItemUIState(stopNameAndEtaUIState, fromStopAndBusIconUIState, uiEventHandler$Companion$fromLambda$1A, new SingleStopItemUISpec(z20 ? 0.4f : 1.0f, z20 || routeDetailsStopUiModel2.d));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:27:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:31:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:34:0x0106  */
    /* JADX WARN: Code duplicated, block: B:36:0x010a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0174 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x0175  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0175 -> B:41:0x018e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object e(java.util.List r29, boolean r30, app.chalo.livetracking.routedetails.data.model.app.RouteAvailabilityBannerDetails r31, boolean r32, boolean r33, boolean r34, boolean r35, boolean r36, java.util.Map r37, boolean r38, kotlin.jvm.functions.Function1 r39, kotlin.coroutines.jvm.internal.ContinuationImpl r40) {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteDetailsStopsListUIStateFactory.e(java.util.List, boolean, app.chalo.livetracking.routedetails.data.model.app.RouteAvailabilityBannerDetails, boolean, boolean, boolean, boolean, boolean, java.util.Map, boolean, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:58:0x047e  */
    /* JADX WARN: Code duplicated, block: B:60:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:61:0x04be  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x030a -> B:35:0x0319). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0382 -> B:36:0x032c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object f(app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsStopUiModel r38, boolean r39, app.chalo.livetracking.routedetails.data.model.app.RouteAvailabilityBannerDetails r40, boolean r41, boolean r42, java.util.List r43, boolean r44, boolean r45, boolean r46, java.util.Map r47, app.chalo.ads.NativeInlineAdSlot r48, kotlin.jvm.functions.Function1 r49, kotlin.coroutines.jvm.internal.ContinuationImpl r50) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteDetailsStopsListUIStateFactory.f(app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsStopUiModel, boolean, app.chalo.livetracking.routedetails.data.model.app.RouteAvailabilityBannerDetails, boolean, boolean, java.util.List, boolean, boolean, boolean, java.util.Map, app.chalo.ads.NativeInlineAdSlot, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object g(String str, t11 t11Var, ContinuationImpl continuationImpl) {
        RouteDetailsStopsListUIStateFactory$userDestinationStop$1 routeDetailsStopsListUIStateFactory$userDestinationStop$1;
        Object obj;
        StyledTextDataUIState[] styledTextDataUIStateArr;
        Function0 function0;
        int i;
        String str2;
        StyledTextDataUIState[] styledTextDataUIStateArr2;
        Function0 function1;
        TextUIState textUIState;
        if (continuationImpl instanceof RouteDetailsStopsListUIStateFactory$userDestinationStop$1) {
            routeDetailsStopsListUIStateFactory$userDestinationStop$1 = (RouteDetailsStopsListUIStateFactory$userDestinationStop$1) continuationImpl;
            int i2 = routeDetailsStopsListUIStateFactory$userDestinationStop$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                routeDetailsStopsListUIStateFactory$userDestinationStop$1.label = i2 - Integer.MIN_VALUE;
            } else {
                routeDetailsStopsListUIStateFactory$userDestinationStop$1 = new RouteDetailsStopsListUIStateFactory$userDestinationStop$1(this, continuationImpl);
            }
        } else {
            routeDetailsStopsListUIStateFactory$userDestinationStop$1 = new RouteDetailsStopsListUIStateFactory$userDestinationStop$1(this, continuationImpl);
        }
        Object obj2 = routeDetailsStopsListUIStateFactory$userDestinationStop$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = routeDetailsStopsListUIStateFactory$userDestinationStop$1.label;
        StringProvider stringProvider = this.f4921a;
        if (i3 == 0) {
            ResultKt.b(obj2);
            StyledTextDataUIState[] styledTextDataUIStateArr3 = new StyledTextDataUIState[3];
            routeDetailsStopsListUIStateFactory$userDestinationStop$1.L$0 = str;
            routeDetailsStopsListUIStateFactory$userDestinationStop$1.L$1 = t11Var;
            routeDetailsStopsListUIStateFactory$userDestinationStop$1.L$2 = styledTextDataUIStateArr3;
            routeDetailsStopsListUIStateFactory$userDestinationStop$1.L$3 = styledTextDataUIStateArr3;
            routeDetailsStopsListUIStateFactory$userDestinationStop$1.I$0 = 0;
            routeDetailsStopsListUIStateFactory$userDestinationStop$1.label = 1;
            Object objB = stringProvider.b(StringEnum.ROUTE_DETAILS_CURRENT_DESTINATION, new Object[0], routeDetailsStopsListUIStateFactory$userDestinationStop$1);
            if (objB != coroutineSingletons) {
                obj = objB;
                styledTextDataUIStateArr = styledTextDataUIStateArr3;
                function0 = t11Var;
                i = 0;
                str2 = str;
                styledTextDataUIStateArr2 = styledTextDataUIStateArr;
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            int i4 = routeDetailsStopsListUIStateFactory$userDestinationStop$1.I$0;
            StyledTextDataUIState[] styledTextDataUIStateArr4 = (StyledTextDataUIState[]) routeDetailsStopsListUIStateFactory$userDestinationStop$1.L$3;
            StyledTextDataUIState[] styledTextDataUIStateArr5 = (StyledTextDataUIState[]) routeDetailsStopsListUIStateFactory$userDestinationStop$1.L$2;
            Function0 function2 = (Function0) routeDetailsStopsListUIStateFactory$userDestinationStop$1.L$1;
            String str3 = (String) routeDetailsStopsListUIStateFactory$userDestinationStop$1.L$0;
            ResultKt.b(obj2);
            styledTextDataUIStateArr = styledTextDataUIStateArr5;
            styledTextDataUIStateArr2 = styledTextDataUIStateArr4;
            i = i4;
            obj = obj2;
            function0 = function2;
            str2 = str3;
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            textUIState = (TextUIState) routeDetailsStopsListUIStateFactory$userDestinationStop$1.L$1;
            function1 = (Function0) routeDetailsStopsListUIStateFactory$userDestinationStop$1.L$0;
            ResultKt.b(obj2);
        }
        return new RouteUserDestinationStopUIState(textUIState, new TextUIState.ChaloTextUIState((String) obj2, UITextStyle.BodyMedium, ChaloColorToken.OrangePrimary.f9835a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, UiEventHandler.Companion.a(function1), (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, "PL_Change", 3832));
        styledTextDataUIStateArr2[i] = new StyledTextDataUIState((String) obj, null, null, UITextStyle.BodyMedium, null, null, null, 1014);
        styledTextDataUIStateArr[1] = new StyledTextDataUIState(" ", null, null, null, null, null, null, AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED);
        styledTextDataUIStateArr[2] = new StyledTextDataUIState(str2, null, null, UITextStyle.HeadlineSmall, null, null, null, 1014);
        TextUIState.StyledTextUIState styledTextUIState = new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr), null, null, 30);
        routeDetailsStopsListUIStateFactory$userDestinationStop$1.L$0 = function0;
        routeDetailsStopsListUIStateFactory$userDestinationStop$1.L$1 = styledTextUIState;
        routeDetailsStopsListUIStateFactory$userDestinationStop$1.L$2 = null;
        routeDetailsStopsListUIStateFactory$userDestinationStop$1.L$3 = null;
        routeDetailsStopsListUIStateFactory$userDestinationStop$1.label = 2;
        Object objB2 = stringProvider.b(StringEnum.ROUTE_DETAILS_CHANGE_DESTINATION, new Object[0], routeDetailsStopsListUIStateFactory$userDestinationStop$1);
        if (objB2 != coroutineSingletons) {
            function1 = function0;
            obj2 = objB2;
            textUIState = styledTextUIState;
            return new RouteUserDestinationStopUIState(textUIState, new TextUIState.ChaloTextUIState((String) obj2, UITextStyle.BodyMedium, ChaloColorToken.OrangePrimary.f9835a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, UiEventHandler.Companion.a(function1), (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, "PL_Change", 3832));
        }
        return coroutineSingletons;
    }
}

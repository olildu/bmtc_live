package app.chalo.livetracking.stoptripplannerresult.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.citydata.data.model.app.SeatAvailabilityLevel;
import app.chalo.citydata.data.model.app.TimeTableStatus;
import app.chalo.citydata.data.model.app.response.NearbyStopToLocationAppModel;
import app.chalo.compose.components.ChaloRouteTagsPalette;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.livetracking.search.uistate.NearbyStopItemSpec;
import app.chalo.livetracking.search.uistate.NearestStopItemUIState;
import app.chalo.livetracking.stoptripplannerresult.StopBasedTripPlannerResultsBottomSheetType;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerLocationType;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerResultsDataState;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerResultsectionType;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerStopEditTarget;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerTabType;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegFareInfoAppResponseModel;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegLiveBusNumberAvailability;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerResultAppResponseModelKt;
import app.chalo.livetracking.tripplanner.domain.ItineraryEtaInfo;
import app.chalo.livetracking.tripplanner.domain.ItineraryLiveInfoResult;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.recent.model.app.RecentPlaceAppModel;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.bottomsheet.BottomSheetEventHandler;
import app.chalo.uistate.bottomsheet.BottomSheetRequestHandler;
import app.chalo.uistate.bottomsheet.BottomSheetUiSpec;
import app.chalo.uistate.bottomsheet.BottomSheetUiState;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.button.ButtonUIStateFactory;
import app.chalo.uistate.color.ColorGradiantUiState;
import app.chalo.uistate.dialog.DialogUIStateFactory;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.noneditablesearch.NonEditableSearchFieldUiState;
import app.chalo.uistate.text.AlertTextWithIconSpec;
import app.chalo.uistate.text.AlertTextWithIconUiState;
import app.chalo.uistate.text.SpecialFeaturesTagListUIState;
import app.chalo.uistate.text.SpecialFeaturesTagTextUIState;
import app.chalo.uistate.text.StyledTextDataUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.TitleSubtitleUiState;
import app.chalo.uistate.text.TypographyToUiTextStyle;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.uistate.textwithleftandtrailingrighticon.TextWithLeftAndRightIconUIState;
import app.chalo.uistate.toolbar.ToolbarBaseActionUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import app.chalo.utils.DistanceUtils;
import app.chalo.utils.timeutil.TimeUtilsContract;
import defpackage.da1;
import defpackage.ia;
import defpackage.kv;
import defpackage.mb1;
import defpackage.o01;
import defpackage.pb1;
import defpackage.vo1;
import defpackage.w31;
import defpackage.wt0;
import defpackage.xs;
import defpackage.z40;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/StopTripPlannerResultUiStateFactory;", "", "Companion", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StopTripPlannerResultUiStateFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringProvider f4619a;
    public final TimeUtilsContract b;
    public final CurrencyFeature c;
    public ToolbarUIState d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/StopTripPlannerResultUiStateFactory$Companion;", "", "", "NEAREST_STOPS_LIMIT", "I", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4620a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;
        public static final /* synthetic */ int[] d;
        public static final /* synthetic */ int[] e;
        public static final /* synthetic */ int[] f;

        static {
            int[] iArr = new int[StopTripPlannerStopEditTarget.values().length];
            try {
                iArr[StopTripPlannerStopEditTarget.FROM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StopTripPlannerStopEditTarget.TO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StopTripPlannerStopEditTarget.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f4620a = iArr;
            int[] iArr2 = new int[StopTripPlannerTabType.values().length];
            try {
                iArr2[StopTripPlannerTabType.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[StopTripPlannerTabType.CONNECTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            b = iArr2;
            int[] iArr3 = new int[StopTripPlannerResultsectionType.values().length];
            try {
                iArr3[StopTripPlannerResultsectionType.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[StopTripPlannerResultsectionType.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[StopTripPlannerResultsectionType.RESULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            c = iArr3;
            int[] iArr4 = new int[SeatAvailabilityLevel.values().length];
            try {
                iArr4[SeatAvailabilityLevel.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[SeatAvailabilityLevel.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[SeatAvailabilityLevel.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[SeatAvailabilityLevel.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            d = iArr4;
            int[] iArr5 = new int[TimeTableStatus.values().length];
            try {
                iArr5[TimeTableStatus.INVALID.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr5[TimeTableStatus.VALID.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr5[TimeTableStatus.VALID_WITH_DISCLAIMER.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr5[TimeTableStatus.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            e = iArr5;
            int[] iArr6 = new int[RouteNamingSchemeType.values().length];
            try {
                iArr6[RouteNamingSchemeType.VIA.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr6[RouteNamingSchemeType.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            f = iArr6;
        }
    }

    public StopTripPlannerResultUiStateFactory(StringProvider stringProvider, TimeUtilsContract timeUtilsContract, CurrencyFeature currencyFeature) {
        this.f4619a = stringProvider;
        this.b = timeUtilsContract;
        this.c = currencyFeature;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:64:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:65:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:69:0x01f0 A[PHI: r3 r6 r7 r8 r11 r12 r13
      0x01f0: PHI (r3v47 java.lang.Object) = (r3v46 java.lang.Object), (r3v1 java.lang.Object) binds: [B:67:0x01ea, B:15:0x0080] A[DONT_GENERATE, DONT_INLINE]
      0x01f0: PHI (r6v16 kotlin.jvm.functions.Function1) = (r6v15 kotlin.jvm.functions.Function1), (r6v18 kotlin.jvm.functions.Function1) binds: [B:67:0x01ea, B:15:0x0080] A[DONT_GENERATE, DONT_INLINE]
      0x01f0: PHI (r7v28 app.chalo.livetracking.stoptripplannerresult.uistate.StopTripPlannerResultUiStateFactory$getTripPlannerResultScreenState$1) = 
      (r7v26 app.chalo.livetracking.stoptripplannerresult.uistate.StopTripPlannerResultUiStateFactory$getTripPlannerResultScreenState$1)
      (r7v31 app.chalo.livetracking.stoptripplannerresult.uistate.StopTripPlannerResultUiStateFactory$getTripPlannerResultScreenState$1)
     binds: [B:67:0x01ea, B:15:0x0080] A[DONT_GENERATE, DONT_INLINE]
      0x01f0: PHI (r8v15 app.chalo.livetracking.stoptripplannerresult.StopTripPlannerResultsDataState) = 
      (r8v13 app.chalo.livetracking.stoptripplannerresult.StopTripPlannerResultsDataState)
      (r8v16 app.chalo.livetracking.stoptripplannerresult.StopTripPlannerResultsDataState)
     binds: [B:67:0x01ea, B:15:0x0080] A[DONT_GENERATE, DONT_INLINE]
      0x01f0: PHI (r11v15 java.util.Iterator) = (r11v13 java.util.Iterator), (r11v16 java.util.Iterator) binds: [B:67:0x01ea, B:15:0x0080] A[DONT_GENERATE, DONT_INLINE]
      0x01f0: PHI (r12v13 java.util.Collection) = (r12v11 java.util.Collection), (r12v14 java.util.Collection) binds: [B:67:0x01ea, B:15:0x0080] A[DONT_GENERATE, DONT_INLINE]
      0x01f0: PHI (r13v9 java.util.List) = (r13v8 java.util.List), (r13v10 java.util.List) binds: [B:67:0x01ea, B:15:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x01ea -> B:69:0x01f0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object A(app.chalo.livetracking.stoptripplannerresult.StopTripPlannerResultsDataState r35, kotlin.jvm.functions.Function1 r36, kotlin.coroutines.jvm.internal.ContinuationImpl r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.stoptripplannerresult.uistate.StopTripPlannerResultUiStateFactory.A(app.chalo.livetracking.stoptripplannerresult.StopTripPlannerResultsDataState, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x013a  */
    /* JADX WARN: Code duplicated, block: B:33:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:35:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:36:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:39:0x0212  */
    /* JADX WARN: Code duplicated, block: B:40:0x0214  */
    /* JADX WARN: Code duplicated, block: B:45:0x0233  */
    /* JADX WARN: Code duplicated, block: B:49:0x024c  */
    /* JADX WARN: Code duplicated, block: B:53:0x026d  */
    /* JADX WARN: Code duplicated, block: B:56:0x027a  */
    /* JADX WARN: Code duplicated, block: B:59:0x028e  */
    /* JADX WARN: Code duplicated, block: B:62:0x029b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object B(StopTripPlannerResultsDataState stopTripPlannerResultsDataState, Function1 function1, ContinuationImpl continuationImpl) throws Throwable {
        StopTripPlannerResultUiStateFactory$getUiState$1 stopTripPlannerResultUiStateFactory$getUiState$1;
        ToolbarUIState toolbarUIState;
        StopTripPlannerResultsDataState stopTripPlannerResultsDataState2;
        Function1 function2;
        Object obj;
        TextUIState.ChaloTextUIState chaloTextUIState;
        UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1A;
        Object objB;
        TextUIState textUIState;
        UiEventHandler uiEventHandler;
        StopTripPlannerTabType stopTripPlannerTabType;
        ArrayList arrayList;
        TabsUiState tabsUiState;
        Object objT;
        StopTripPlannerResultsDataState stopTripPlannerResultsDataState3;
        ToolbarUIState toolbarUIState2;
        ChaloColorToken chaloColorToken;
        boolean z;
        TripPlannerOriginDestinationSearchbarUiState tripPlannerOriginDestinationSearchbarUiState;
        Object objA;
        TripPlannerOriginDestinationSearchbarUiState tripPlannerOriginDestinationSearchbarUiState2;
        StopTripPlannerResultsDataState stopTripPlannerResultsDataState4;
        Function1 function3;
        TripPlannerResultScreenState tripPlannerResultScreenState;
        Object objL;
        TripPlannerResultScreenState tripPlannerResultScreenState2;
        TabsUiState tabsUiState2;
        TripPlannerOriginDestinationSearchbarUiState tripPlannerOriginDestinationSearchbarUiState3;
        StopBasedTripPlannerResultBottomSheetUiStateType stopBasedTripPlannerResultBottomSheetUiStateType;
        StopBasedTripPlannerResultBottomSheetUiStateType stopBasedTripPlannerResultBottomSheetUiStateType2;
        LoadingDialogUIState loadingDialogUIState;
        ToolbarUIState toolbarUIState3;
        TabsUiState tabsUiState3;
        Object objN;
        StopBasedTripPlannerResultBottomSheetUiStateType stopBasedTripPlannerResultBottomSheetUiStateType3;
        ToolbarUIState toolbarUIState4;
        TabsUiState tabsUiState4;
        if (continuationImpl instanceof StopTripPlannerResultUiStateFactory$getUiState$1) {
            stopTripPlannerResultUiStateFactory$getUiState$1 = (StopTripPlannerResultUiStateFactory$getUiState$1) continuationImpl;
            int i = stopTripPlannerResultUiStateFactory$getUiState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopTripPlannerResultUiStateFactory$getUiState$1.label = i - Integer.MIN_VALUE;
            } else {
                stopTripPlannerResultUiStateFactory$getUiState$1 = new StopTripPlannerResultUiStateFactory$getUiState$1(this, continuationImpl);
            }
        } else {
            stopTripPlannerResultUiStateFactory$getUiState$1 = new StopTripPlannerResultUiStateFactory$getUiState$1(this, continuationImpl);
        }
        Object obj2 = stopTripPlannerResultUiStateFactory$getUiState$1.result;
        Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = stopTripPlannerResultUiStateFactory$getUiState$1.label;
        StringProvider stringProvider = this.f4619a;
        ChaloColorToken.AlmostBlackColor almostBlackColor = ChaloColorToken.AlmostBlackColor.f9756a;
        switch (i2) {
            case 0:
                ResultKt.b(obj2);
                ToolbarUIState toolbarUIState5 = this.d;
                if (toolbarUIState5 == null) {
                    stopTripPlannerResultUiStateFactory$getUiState$1.L$0 = stopTripPlannerResultsDataState;
                    stopTripPlannerResultUiStateFactory$getUiState$1.L$1 = function1;
                    stopTripPlannerResultUiStateFactory$getUiState$1.label = 1;
                    Object objB2 = stringProvider.b(StringEnum.BUSES_FOR_YOU, new Object[0], stopTripPlannerResultUiStateFactory$getUiState$1);
                    if (objB2 != obj3) {
                        obj = objB2;
                        stopTripPlannerResultsDataState2 = stopTripPlannerResultsDataState;
                        function2 = function1;
                        chaloTextUIState = new TextUIState.ChaloTextUIState((String) obj, UITextStyle.DisplaySmall, almostBlackColor, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
                        uiEventHandler$Companion$fromLambda$1A = UiEventHandler.Companion.a(new pb1(function2, 18));
                        stopTripPlannerResultUiStateFactory$getUiState$1.L$0 = stopTripPlannerResultsDataState2;
                        stopTripPlannerResultUiStateFactory$getUiState$1.L$1 = function2;
                        stopTripPlannerResultUiStateFactory$getUiState$1.L$2 = chaloTextUIState;
                        stopTripPlannerResultUiStateFactory$getUiState$1.L$3 = uiEventHandler$Companion$fromLambda$1A;
                        stopTripPlannerResultUiStateFactory$getUiState$1.label = 2;
                        objB = stringProvider.b(StringEnum.REPORT_ISSUE_HOOK, new Object[0], stopTripPlannerResultUiStateFactory$getUiState$1);
                        if (objB != obj3) {
                            textUIState = chaloTextUIState;
                            uiEventHandler = uiEventHandler$Companion$fromLambda$1A;
                            TextUIState.ChaloTextUIState chaloTextUIState2 = new TextUIState.ChaloTextUIState((String) objB, TypographyToUiTextStyle.caption.getTextStyle(), almostBlackColor, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                            UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1A2 = UiEventHandler.Companion.a(new pb1(function2, 19));
                            BorderUISpec borderUISpec = new BorderUISpec(ChaloThemeHelper.a().b, ChaloColorToken.LightGray.f9814a, UIShape.c);
                            float f = ChaloThemeHelper.a().f;
                            toolbarUIState = new ToolbarUIState(null, textUIState, null, uiEventHandler, CollectionsKt.R(new ToolbarBaseActionUIState.IconAndTextUIState(null, chaloTextUIState2, uiEventHandler$Companion$fromLambda$1A2, borderUISpec, new ChaloPadding(f, f, f, f), 24)), 0.0f, null, null, 229);
                            this.d = toolbarUIState;
                            List list = stopTripPlannerResultsDataState2.j;
                            stopTripPlannerTabType = stopTripPlannerResultsDataState2.k;
                            List<StopTripPlannerTabType> list2 = list;
                            arrayList = new ArrayList(CollectionsKt.v(list2, 10));
                            for (StopTripPlannerTabType stopTripPlannerTabType2 : list2) {
                                if (stopTripPlannerTabType2 == stopTripPlannerTabType) {
                                    chaloColorToken = ChaloColorToken.Orange2.f9830a;
                                } else {
                                    chaloColorToken = almostBlackColor;
                                }
                                TabItemSpecs tabItemSpecs = new TabItemSpecs(chaloColorToken, 3);
                                TextUIState.ChaloTextUIState chaloTextUIState3 = new TextUIState.ChaloTextUIState(stopTripPlannerTabType2.getTabName(), TypographyToUiTextStyle.h5.getTextStyle(), chaloColorToken, 0, UITextAlign.Center, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8088);
                                UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1A3 = UiEventHandler.Companion.a(new da1(12, function2, stopTripPlannerTabType2));
                                if (stopTripPlannerTabType2 == stopTripPlannerTabType) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                arrayList.add(new TabItemUiState(tabItemSpecs, chaloTextUIState3, uiEventHandler$Companion$fromLambda$1A3, z));
                            }
                            tabsUiState = new TabsUiState(arrayList);
                            stopTripPlannerResultUiStateFactory$getUiState$1.L$0 = stopTripPlannerResultsDataState2;
                            stopTripPlannerResultUiStateFactory$getUiState$1.L$1 = function2;
                            stopTripPlannerResultUiStateFactory$getUiState$1.L$2 = toolbarUIState;
                            stopTripPlannerResultUiStateFactory$getUiState$1.L$3 = tabsUiState;
                            stopTripPlannerResultUiStateFactory$getUiState$1.label = 3;
                            objT = t(stopTripPlannerResultsDataState2, function2, stopTripPlannerResultUiStateFactory$getUiState$1);
                            if (objT != obj3) {
                                stopTripPlannerResultsDataState3 = stopTripPlannerResultsDataState2;
                                obj2 = objT;
                                toolbarUIState2 = toolbarUIState;
                                tripPlannerOriginDestinationSearchbarUiState = (TripPlannerOriginDestinationSearchbarUiState) obj2;
                                stopTripPlannerResultUiStateFactory$getUiState$1.L$0 = stopTripPlannerResultsDataState3;
                                stopTripPlannerResultUiStateFactory$getUiState$1.L$1 = function2;
                                stopTripPlannerResultUiStateFactory$getUiState$1.L$2 = toolbarUIState2;
                                stopTripPlannerResultUiStateFactory$getUiState$1.L$3 = tabsUiState;
                                stopTripPlannerResultUiStateFactory$getUiState$1.L$4 = tripPlannerOriginDestinationSearchbarUiState;
                                stopTripPlannerResultUiStateFactory$getUiState$1.label = 4;
                                objA = A(stopTripPlannerResultsDataState3, function2, stopTripPlannerResultUiStateFactory$getUiState$1);
                                if (objA != obj3) {
                                    Function1 function4 = function2;
                                    tripPlannerOriginDestinationSearchbarUiState2 = tripPlannerOriginDestinationSearchbarUiState;
                                    obj2 = objA;
                                    stopTripPlannerResultsDataState4 = stopTripPlannerResultsDataState3;
                                    function3 = function4;
                                    tripPlannerResultScreenState = (TripPlannerResultScreenState) obj2;
                                    StopTripPlannerStopEditTarget stopTripPlannerStopEditTarget = stopTripPlannerResultsDataState4.n;
                                    StopBasedTripPlannerResultsBottomSheetType stopBasedTripPlannerResultsBottomSheetType = stopTripPlannerResultsDataState4.l;
                                    stopTripPlannerResultUiStateFactory$getUiState$1.L$0 = stopTripPlannerResultsDataState4;
                                    stopTripPlannerResultUiStateFactory$getUiState$1.L$1 = toolbarUIState2;
                                    stopTripPlannerResultUiStateFactory$getUiState$1.L$2 = tabsUiState;
                                    stopTripPlannerResultUiStateFactory$getUiState$1.L$3 = tripPlannerOriginDestinationSearchbarUiState2;
                                    stopTripPlannerResultUiStateFactory$getUiState$1.L$4 = tripPlannerResultScreenState;
                                    stopTripPlannerResultUiStateFactory$getUiState$1.label = 5;
                                    objL = l(stopTripPlannerStopEditTarget, stopBasedTripPlannerResultsBottomSheetType, function3, stopTripPlannerResultUiStateFactory$getUiState$1);
                                    if (objL != obj3) {
                                        TripPlannerOriginDestinationSearchbarUiState tripPlannerOriginDestinationSearchbarUiState4 = tripPlannerOriginDestinationSearchbarUiState2;
                                        tripPlannerResultScreenState2 = tripPlannerResultScreenState;
                                        obj2 = objL;
                                        tabsUiState2 = tabsUiState;
                                        tripPlannerOriginDestinationSearchbarUiState3 = tripPlannerOriginDestinationSearchbarUiState4;
                                        stopBasedTripPlannerResultBottomSheetUiStateType = (StopBasedTripPlannerResultBottomSheetUiStateType) obj2;
                                        if (stopTripPlannerResultsDataState4.m) {
                                            stopTripPlannerResultUiStateFactory$getUiState$1.L$0 = toolbarUIState2;
                                            stopTripPlannerResultUiStateFactory$getUiState$1.L$1 = tabsUiState2;
                                            stopTripPlannerResultUiStateFactory$getUiState$1.L$2 = tripPlannerOriginDestinationSearchbarUiState3;
                                            stopTripPlannerResultUiStateFactory$getUiState$1.L$3 = tripPlannerResultScreenState2;
                                            stopTripPlannerResultUiStateFactory$getUiState$1.L$4 = stopBasedTripPlannerResultBottomSheetUiStateType;
                                            stopTripPlannerResultUiStateFactory$getUiState$1.label = 6;
                                            objN = n(stopTripPlannerResultUiStateFactory$getUiState$1);
                                            if (objN != obj3) {
                                                stopBasedTripPlannerResultBottomSheetUiStateType3 = stopBasedTripPlannerResultBottomSheetUiStateType;
                                                obj2 = objN;
                                                toolbarUIState4 = toolbarUIState2;
                                                tabsUiState4 = tabsUiState2;
                                                loadingDialogUIState = (LoadingDialogUIState) obj2;
                                                toolbarUIState3 = toolbarUIState4;
                                                stopBasedTripPlannerResultBottomSheetUiStateType2 = stopBasedTripPlannerResultBottomSheetUiStateType3;
                                                tabsUiState3 = tabsUiState4;
                                            }
                                        } else {
                                            stopBasedTripPlannerResultBottomSheetUiStateType2 = stopBasedTripPlannerResultBottomSheetUiStateType;
                                            loadingDialogUIState = null;
                                            toolbarUIState3 = toolbarUIState2;
                                            tabsUiState3 = tabsUiState2;
                                        }
                                        return new StopBasedTripPlannerUiState(toolbarUIState3, tabsUiState3, tripPlannerOriginDestinationSearchbarUiState3, tripPlannerResultScreenState2, stopBasedTripPlannerResultBottomSheetUiStateType2, loadingDialogUIState);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    toolbarUIState = toolbarUIState5;
                    stopTripPlannerResultsDataState2 = stopTripPlannerResultsDataState;
                    function2 = function1;
                    List list3 = stopTripPlannerResultsDataState2.j;
                    stopTripPlannerTabType = stopTripPlannerResultsDataState2.k;
                    List<StopTripPlannerTabType> list4 = list3;
                    arrayList = new ArrayList(CollectionsKt.v(list4, 10));
                    while (r6.hasNext()) {
                        if (stopTripPlannerTabType2 == stopTripPlannerTabType) {
                            chaloColorToken = ChaloColorToken.Orange2.f9830a;
                        } else {
                            chaloColorToken = almostBlackColor;
                        }
                        TabItemSpecs tabItemSpecs2 = new TabItemSpecs(chaloColorToken, 3);
                        TextUIState.ChaloTextUIState chaloTextUIState4 = new TextUIState.ChaloTextUIState(stopTripPlannerTabType2.getTabName(), TypographyToUiTextStyle.h5.getTextStyle(), chaloColorToken, 0, UITextAlign.Center, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8088);
                        UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1A4 = UiEventHandler.Companion.a(new da1(12, function2, stopTripPlannerTabType2));
                        if (stopTripPlannerTabType2 == stopTripPlannerTabType) {
                            z = true;
                        } else {
                            z = false;
                        }
                        arrayList.add(new TabItemUiState(tabItemSpecs2, chaloTextUIState4, uiEventHandler$Companion$fromLambda$1A4, z));
                    }
                    tabsUiState = new TabsUiState(arrayList);
                    stopTripPlannerResultUiStateFactory$getUiState$1.L$0 = stopTripPlannerResultsDataState2;
                    stopTripPlannerResultUiStateFactory$getUiState$1.L$1 = function2;
                    stopTripPlannerResultUiStateFactory$getUiState$1.L$2 = toolbarUIState;
                    stopTripPlannerResultUiStateFactory$getUiState$1.L$3 = tabsUiState;
                    stopTripPlannerResultUiStateFactory$getUiState$1.label = 3;
                    objT = t(stopTripPlannerResultsDataState2, function2, stopTripPlannerResultUiStateFactory$getUiState$1);
                    if (objT != obj3) {
                        stopTripPlannerResultsDataState3 = stopTripPlannerResultsDataState2;
                        obj2 = objT;
                        toolbarUIState2 = toolbarUIState;
                        tripPlannerOriginDestinationSearchbarUiState = (TripPlannerOriginDestinationSearchbarUiState) obj2;
                        stopTripPlannerResultUiStateFactory$getUiState$1.L$0 = stopTripPlannerResultsDataState3;
                        stopTripPlannerResultUiStateFactory$getUiState$1.L$1 = function2;
                        stopTripPlannerResultUiStateFactory$getUiState$1.L$2 = toolbarUIState2;
                        stopTripPlannerResultUiStateFactory$getUiState$1.L$3 = tabsUiState;
                        stopTripPlannerResultUiStateFactory$getUiState$1.L$4 = tripPlannerOriginDestinationSearchbarUiState;
                        stopTripPlannerResultUiStateFactory$getUiState$1.label = 4;
                        objA = A(stopTripPlannerResultsDataState3, function2, stopTripPlannerResultUiStateFactory$getUiState$1);
                        if (objA != obj3) {
                            Function1 function5 = function2;
                            tripPlannerOriginDestinationSearchbarUiState2 = tripPlannerOriginDestinationSearchbarUiState;
                            obj2 = objA;
                            stopTripPlannerResultsDataState4 = stopTripPlannerResultsDataState3;
                            function3 = function5;
                            tripPlannerResultScreenState = (TripPlannerResultScreenState) obj2;
                            StopTripPlannerStopEditTarget stopTripPlannerStopEditTarget2 = stopTripPlannerResultsDataState4.n;
                            StopBasedTripPlannerResultsBottomSheetType stopBasedTripPlannerResultsBottomSheetType2 = stopTripPlannerResultsDataState4.l;
                            stopTripPlannerResultUiStateFactory$getUiState$1.L$0 = stopTripPlannerResultsDataState4;
                            stopTripPlannerResultUiStateFactory$getUiState$1.L$1 = toolbarUIState2;
                            stopTripPlannerResultUiStateFactory$getUiState$1.L$2 = tabsUiState;
                            stopTripPlannerResultUiStateFactory$getUiState$1.L$3 = tripPlannerOriginDestinationSearchbarUiState2;
                            stopTripPlannerResultUiStateFactory$getUiState$1.L$4 = tripPlannerResultScreenState;
                            stopTripPlannerResultUiStateFactory$getUiState$1.label = 5;
                            objL = l(stopTripPlannerStopEditTarget2, stopBasedTripPlannerResultsBottomSheetType2, function3, stopTripPlannerResultUiStateFactory$getUiState$1);
                            if (objL != obj3) {
                                TripPlannerOriginDestinationSearchbarUiState tripPlannerOriginDestinationSearchbarUiState5 = tripPlannerOriginDestinationSearchbarUiState2;
                                tripPlannerResultScreenState2 = tripPlannerResultScreenState;
                                obj2 = objL;
                                tabsUiState2 = tabsUiState;
                                tripPlannerOriginDestinationSearchbarUiState3 = tripPlannerOriginDestinationSearchbarUiState5;
                                stopBasedTripPlannerResultBottomSheetUiStateType = (StopBasedTripPlannerResultBottomSheetUiStateType) obj2;
                                if (stopTripPlannerResultsDataState4.m) {
                                    stopTripPlannerResultUiStateFactory$getUiState$1.L$0 = toolbarUIState2;
                                    stopTripPlannerResultUiStateFactory$getUiState$1.L$1 = tabsUiState2;
                                    stopTripPlannerResultUiStateFactory$getUiState$1.L$2 = tripPlannerOriginDestinationSearchbarUiState3;
                                    stopTripPlannerResultUiStateFactory$getUiState$1.L$3 = tripPlannerResultScreenState2;
                                    stopTripPlannerResultUiStateFactory$getUiState$1.L$4 = stopBasedTripPlannerResultBottomSheetUiStateType;
                                    stopTripPlannerResultUiStateFactory$getUiState$1.label = 6;
                                    objN = n(stopTripPlannerResultUiStateFactory$getUiState$1);
                                    if (objN != obj3) {
                                        stopBasedTripPlannerResultBottomSheetUiStateType3 = stopBasedTripPlannerResultBottomSheetUiStateType;
                                        obj2 = objN;
                                        toolbarUIState4 = toolbarUIState2;
                                        tabsUiState4 = tabsUiState2;
                                        loadingDialogUIState = (LoadingDialogUIState) obj2;
                                        toolbarUIState3 = toolbarUIState4;
                                        stopBasedTripPlannerResultBottomSheetUiStateType2 = stopBasedTripPlannerResultBottomSheetUiStateType3;
                                        tabsUiState3 = tabsUiState4;
                                    }
                                } else {
                                    stopBasedTripPlannerResultBottomSheetUiStateType2 = stopBasedTripPlannerResultBottomSheetUiStateType;
                                    loadingDialogUIState = null;
                                    toolbarUIState3 = toolbarUIState2;
                                    tabsUiState3 = tabsUiState2;
                                }
                                return new StopBasedTripPlannerUiState(toolbarUIState3, tabsUiState3, tripPlannerOriginDestinationSearchbarUiState3, tripPlannerResultScreenState2, stopBasedTripPlannerResultBottomSheetUiStateType2, loadingDialogUIState);
                            }
                        }
                    }
                }
                return obj3;
            case 1:
                function2 = (Function1) stopTripPlannerResultUiStateFactory$getUiState$1.L$1;
                StopTripPlannerResultsDataState stopTripPlannerResultsDataState5 = (StopTripPlannerResultsDataState) stopTripPlannerResultUiStateFactory$getUiState$1.L$0;
                ResultKt.b(obj2);
                obj = obj2;
                stopTripPlannerResultsDataState2 = stopTripPlannerResultsDataState5;
                chaloTextUIState = new TextUIState.ChaloTextUIState((String) obj, UITextStyle.DisplaySmall, almostBlackColor, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
                uiEventHandler$Companion$fromLambda$1A = UiEventHandler.Companion.a(new pb1(function2, 18));
                stopTripPlannerResultUiStateFactory$getUiState$1.L$0 = stopTripPlannerResultsDataState2;
                stopTripPlannerResultUiStateFactory$getUiState$1.L$1 = function2;
                stopTripPlannerResultUiStateFactory$getUiState$1.L$2 = chaloTextUIState;
                stopTripPlannerResultUiStateFactory$getUiState$1.L$3 = uiEventHandler$Companion$fromLambda$1A;
                stopTripPlannerResultUiStateFactory$getUiState$1.label = 2;
                objB = stringProvider.b(StringEnum.REPORT_ISSUE_HOOK, new Object[0], stopTripPlannerResultUiStateFactory$getUiState$1);
                if (objB != obj3) {
                    textUIState = chaloTextUIState;
                    uiEventHandler = uiEventHandler$Companion$fromLambda$1A;
                    TextUIState.ChaloTextUIState chaloTextUIState5 = new TextUIState.ChaloTextUIState((String) objB, TypographyToUiTextStyle.caption.getTextStyle(), almostBlackColor, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                    UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1A5 = UiEventHandler.Companion.a(new pb1(function2, 19));
                    BorderUISpec borderUISpec2 = new BorderUISpec(ChaloThemeHelper.a().b, ChaloColorToken.LightGray.f9814a, UIShape.c);
                    float f2 = ChaloThemeHelper.a().f;
                    toolbarUIState = new ToolbarUIState(null, textUIState, null, uiEventHandler, CollectionsKt.R(new ToolbarBaseActionUIState.IconAndTextUIState(null, chaloTextUIState5, uiEventHandler$Companion$fromLambda$1A5, borderUISpec2, new ChaloPadding(f2, f2, f2, f2), 24)), 0.0f, null, null, 229);
                    this.d = toolbarUIState;
                    List list5 = stopTripPlannerResultsDataState2.j;
                    stopTripPlannerTabType = stopTripPlannerResultsDataState2.k;
                    List<StopTripPlannerTabType> list6 = list5;
                    arrayList = new ArrayList(CollectionsKt.v(list6, 10));
                    while (r6.hasNext()) {
                        if (stopTripPlannerTabType2 == stopTripPlannerTabType) {
                            chaloColorToken = ChaloColorToken.Orange2.f9830a;
                        } else {
                            chaloColorToken = almostBlackColor;
                        }
                        TabItemSpecs tabItemSpecs3 = new TabItemSpecs(chaloColorToken, 3);
                        TextUIState.ChaloTextUIState chaloTextUIState6 = new TextUIState.ChaloTextUIState(stopTripPlannerTabType2.getTabName(), TypographyToUiTextStyle.h5.getTextStyle(), chaloColorToken, 0, UITextAlign.Center, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8088);
                        UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1A6 = UiEventHandler.Companion.a(new da1(12, function2, stopTripPlannerTabType2));
                        if (stopTripPlannerTabType2 == stopTripPlannerTabType) {
                            z = true;
                        } else {
                            z = false;
                        }
                        arrayList.add(new TabItemUiState(tabItemSpecs3, chaloTextUIState6, uiEventHandler$Companion$fromLambda$1A6, z));
                    }
                    tabsUiState = new TabsUiState(arrayList);
                    stopTripPlannerResultUiStateFactory$getUiState$1.L$0 = stopTripPlannerResultsDataState2;
                    stopTripPlannerResultUiStateFactory$getUiState$1.L$1 = function2;
                    stopTripPlannerResultUiStateFactory$getUiState$1.L$2 = toolbarUIState;
                    stopTripPlannerResultUiStateFactory$getUiState$1.L$3 = tabsUiState;
                    stopTripPlannerResultUiStateFactory$getUiState$1.label = 3;
                    objT = t(stopTripPlannerResultsDataState2, function2, stopTripPlannerResultUiStateFactory$getUiState$1);
                    if (objT != obj3) {
                        stopTripPlannerResultsDataState3 = stopTripPlannerResultsDataState2;
                        obj2 = objT;
                        toolbarUIState2 = toolbarUIState;
                        tripPlannerOriginDestinationSearchbarUiState = (TripPlannerOriginDestinationSearchbarUiState) obj2;
                        stopTripPlannerResultUiStateFactory$getUiState$1.L$0 = stopTripPlannerResultsDataState3;
                        stopTripPlannerResultUiStateFactory$getUiState$1.L$1 = function2;
                        stopTripPlannerResultUiStateFactory$getUiState$1.L$2 = toolbarUIState2;
                        stopTripPlannerResultUiStateFactory$getUiState$1.L$3 = tabsUiState;
                        stopTripPlannerResultUiStateFactory$getUiState$1.L$4 = tripPlannerOriginDestinationSearchbarUiState;
                        stopTripPlannerResultUiStateFactory$getUiState$1.label = 4;
                        objA = A(stopTripPlannerResultsDataState3, function2, stopTripPlannerResultUiStateFactory$getUiState$1);
                        if (objA != obj3) {
                            Function1 function6 = function2;
                            tripPlannerOriginDestinationSearchbarUiState2 = tripPlannerOriginDestinationSearchbarUiState;
                            obj2 = objA;
                            stopTripPlannerResultsDataState4 = stopTripPlannerResultsDataState3;
                            function3 = function6;
                            tripPlannerResultScreenState = (TripPlannerResultScreenState) obj2;
                            StopTripPlannerStopEditTarget stopTripPlannerStopEditTarget3 = stopTripPlannerResultsDataState4.n;
                            StopBasedTripPlannerResultsBottomSheetType stopBasedTripPlannerResultsBottomSheetType3 = stopTripPlannerResultsDataState4.l;
                            stopTripPlannerResultUiStateFactory$getUiState$1.L$0 = stopTripPlannerResultsDataState4;
                            stopTripPlannerResultUiStateFactory$getUiState$1.L$1 = toolbarUIState2;
                            stopTripPlannerResultUiStateFactory$getUiState$1.L$2 = tabsUiState;
                            stopTripPlannerResultUiStateFactory$getUiState$1.L$3 = tripPlannerOriginDestinationSearchbarUiState2;
                            stopTripPlannerResultUiStateFactory$getUiState$1.L$4 = tripPlannerResultScreenState;
                            stopTripPlannerResultUiStateFactory$getUiState$1.label = 5;
                            objL = l(stopTripPlannerStopEditTarget3, stopBasedTripPlannerResultsBottomSheetType3, function3, stopTripPlannerResultUiStateFactory$getUiState$1);
                            if (objL != obj3) {
                                TripPlannerOriginDestinationSearchbarUiState tripPlannerOriginDestinationSearchbarUiState6 = tripPlannerOriginDestinationSearchbarUiState2;
                                tripPlannerResultScreenState2 = tripPlannerResultScreenState;
                                obj2 = objL;
                                tabsUiState2 = tabsUiState;
                                tripPlannerOriginDestinationSearchbarUiState3 = tripPlannerOriginDestinationSearchbarUiState6;
                                stopBasedTripPlannerResultBottomSheetUiStateType = (StopBasedTripPlannerResultBottomSheetUiStateType) obj2;
                                if (stopTripPlannerResultsDataState4.m) {
                                    stopTripPlannerResultUiStateFactory$getUiState$1.L$0 = toolbarUIState2;
                                    stopTripPlannerResultUiStateFactory$getUiState$1.L$1 = tabsUiState2;
                                    stopTripPlannerResultUiStateFactory$getUiState$1.L$2 = tripPlannerOriginDestinationSearchbarUiState3;
                                    stopTripPlannerResultUiStateFactory$getUiState$1.L$3 = tripPlannerResultScreenState2;
                                    stopTripPlannerResultUiStateFactory$getUiState$1.L$4 = stopBasedTripPlannerResultBottomSheetUiStateType;
                                    stopTripPlannerResultUiStateFactory$getUiState$1.label = 6;
                                    objN = n(stopTripPlannerResultUiStateFactory$getUiState$1);
                                    if (objN != obj3) {
                                        stopBasedTripPlannerResultBottomSheetUiStateType3 = stopBasedTripPlannerResultBottomSheetUiStateType;
                                        obj2 = objN;
                                        toolbarUIState4 = toolbarUIState2;
                                        tabsUiState4 = tabsUiState2;
                                        loadingDialogUIState = (LoadingDialogUIState) obj2;
                                        toolbarUIState3 = toolbarUIState4;
                                        stopBasedTripPlannerResultBottomSheetUiStateType2 = stopBasedTripPlannerResultBottomSheetUiStateType3;
                                        tabsUiState3 = tabsUiState4;
                                    }
                                } else {
                                    stopBasedTripPlannerResultBottomSheetUiStateType2 = stopBasedTripPlannerResultBottomSheetUiStateType;
                                    loadingDialogUIState = null;
                                    toolbarUIState3 = toolbarUIState2;
                                    tabsUiState3 = tabsUiState2;
                                }
                                return new StopBasedTripPlannerUiState(toolbarUIState3, tabsUiState3, tripPlannerOriginDestinationSearchbarUiState3, tripPlannerResultScreenState2, stopBasedTripPlannerResultBottomSheetUiStateType2, loadingDialogUIState);
                            }
                        }
                    }
                }
                return obj3;
            case 2:
                UiEventHandler uiEventHandler2 = (UiEventHandler) stopTripPlannerResultUiStateFactory$getUiState$1.L$3;
                TextUIState textUIState2 = (TextUIState) stopTripPlannerResultUiStateFactory$getUiState$1.L$2;
                Function1 function7 = (Function1) stopTripPlannerResultUiStateFactory$getUiState$1.L$1;
                StopTripPlannerResultsDataState stopTripPlannerResultsDataState6 = (StopTripPlannerResultsDataState) stopTripPlannerResultUiStateFactory$getUiState$1.L$0;
                ResultKt.b(obj2);
                uiEventHandler = uiEventHandler2;
                textUIState = textUIState2;
                function2 = function7;
                objB = obj2;
                stopTripPlannerResultsDataState2 = stopTripPlannerResultsDataState6;
                TextUIState.ChaloTextUIState chaloTextUIState7 = new TextUIState.ChaloTextUIState((String) objB, TypographyToUiTextStyle.caption.getTextStyle(), almostBlackColor, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1A7 = UiEventHandler.Companion.a(new pb1(function2, 19));
                BorderUISpec borderUISpec3 = new BorderUISpec(ChaloThemeHelper.a().b, ChaloColorToken.LightGray.f9814a, UIShape.c);
                float f3 = ChaloThemeHelper.a().f;
                toolbarUIState = new ToolbarUIState(null, textUIState, null, uiEventHandler, CollectionsKt.R(new ToolbarBaseActionUIState.IconAndTextUIState(null, chaloTextUIState7, uiEventHandler$Companion$fromLambda$1A7, borderUISpec3, new ChaloPadding(f3, f3, f3, f3), 24)), 0.0f, null, null, 229);
                this.d = toolbarUIState;
                List list7 = stopTripPlannerResultsDataState2.j;
                stopTripPlannerTabType = stopTripPlannerResultsDataState2.k;
                List<StopTripPlannerTabType> list8 = list7;
                arrayList = new ArrayList(CollectionsKt.v(list8, 10));
                while (r6.hasNext()) {
                    if (stopTripPlannerTabType2 == stopTripPlannerTabType) {
                        chaloColorToken = ChaloColorToken.Orange2.f9830a;
                    } else {
                        chaloColorToken = almostBlackColor;
                    }
                    TabItemSpecs tabItemSpecs4 = new TabItemSpecs(chaloColorToken, 3);
                    TextUIState.ChaloTextUIState chaloTextUIState8 = new TextUIState.ChaloTextUIState(stopTripPlannerTabType2.getTabName(), TypographyToUiTextStyle.h5.getTextStyle(), chaloColorToken, 0, UITextAlign.Center, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8088);
                    UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1A8 = UiEventHandler.Companion.a(new da1(12, function2, stopTripPlannerTabType2));
                    if (stopTripPlannerTabType2 == stopTripPlannerTabType) {
                        z = true;
                    } else {
                        z = false;
                    }
                    arrayList.add(new TabItemUiState(tabItemSpecs4, chaloTextUIState8, uiEventHandler$Companion$fromLambda$1A8, z));
                }
                tabsUiState = new TabsUiState(arrayList);
                stopTripPlannerResultUiStateFactory$getUiState$1.L$0 = stopTripPlannerResultsDataState2;
                stopTripPlannerResultUiStateFactory$getUiState$1.L$1 = function2;
                stopTripPlannerResultUiStateFactory$getUiState$1.L$2 = toolbarUIState;
                stopTripPlannerResultUiStateFactory$getUiState$1.L$3 = tabsUiState;
                stopTripPlannerResultUiStateFactory$getUiState$1.label = 3;
                objT = t(stopTripPlannerResultsDataState2, function2, stopTripPlannerResultUiStateFactory$getUiState$1);
                if (objT != obj3) {
                    stopTripPlannerResultsDataState3 = stopTripPlannerResultsDataState2;
                    obj2 = objT;
                    toolbarUIState2 = toolbarUIState;
                    tripPlannerOriginDestinationSearchbarUiState = (TripPlannerOriginDestinationSearchbarUiState) obj2;
                    stopTripPlannerResultUiStateFactory$getUiState$1.L$0 = stopTripPlannerResultsDataState3;
                    stopTripPlannerResultUiStateFactory$getUiState$1.L$1 = function2;
                    stopTripPlannerResultUiStateFactory$getUiState$1.L$2 = toolbarUIState2;
                    stopTripPlannerResultUiStateFactory$getUiState$1.L$3 = tabsUiState;
                    stopTripPlannerResultUiStateFactory$getUiState$1.L$4 = tripPlannerOriginDestinationSearchbarUiState;
                    stopTripPlannerResultUiStateFactory$getUiState$1.label = 4;
                    objA = A(stopTripPlannerResultsDataState3, function2, stopTripPlannerResultUiStateFactory$getUiState$1);
                    if (objA != obj3) {
                        Function1 function8 = function2;
                        tripPlannerOriginDestinationSearchbarUiState2 = tripPlannerOriginDestinationSearchbarUiState;
                        obj2 = objA;
                        stopTripPlannerResultsDataState4 = stopTripPlannerResultsDataState3;
                        function3 = function8;
                        tripPlannerResultScreenState = (TripPlannerResultScreenState) obj2;
                        StopTripPlannerStopEditTarget stopTripPlannerStopEditTarget4 = stopTripPlannerResultsDataState4.n;
                        StopBasedTripPlannerResultsBottomSheetType stopBasedTripPlannerResultsBottomSheetType4 = stopTripPlannerResultsDataState4.l;
                        stopTripPlannerResultUiStateFactory$getUiState$1.L$0 = stopTripPlannerResultsDataState4;
                        stopTripPlannerResultUiStateFactory$getUiState$1.L$1 = toolbarUIState2;
                        stopTripPlannerResultUiStateFactory$getUiState$1.L$2 = tabsUiState;
                        stopTripPlannerResultUiStateFactory$getUiState$1.L$3 = tripPlannerOriginDestinationSearchbarUiState2;
                        stopTripPlannerResultUiStateFactory$getUiState$1.L$4 = tripPlannerResultScreenState;
                        stopTripPlannerResultUiStateFactory$getUiState$1.label = 5;
                        objL = l(stopTripPlannerStopEditTarget4, stopBasedTripPlannerResultsBottomSheetType4, function3, stopTripPlannerResultUiStateFactory$getUiState$1);
                        if (objL != obj3) {
                            TripPlannerOriginDestinationSearchbarUiState tripPlannerOriginDestinationSearchbarUiState7 = tripPlannerOriginDestinationSearchbarUiState2;
                            tripPlannerResultScreenState2 = tripPlannerResultScreenState;
                            obj2 = objL;
                            tabsUiState2 = tabsUiState;
                            tripPlannerOriginDestinationSearchbarUiState3 = tripPlannerOriginDestinationSearchbarUiState7;
                            stopBasedTripPlannerResultBottomSheetUiStateType = (StopBasedTripPlannerResultBottomSheetUiStateType) obj2;
                            if (stopTripPlannerResultsDataState4.m) {
                                stopTripPlannerResultUiStateFactory$getUiState$1.L$0 = toolbarUIState2;
                                stopTripPlannerResultUiStateFactory$getUiState$1.L$1 = tabsUiState2;
                                stopTripPlannerResultUiStateFactory$getUiState$1.L$2 = tripPlannerOriginDestinationSearchbarUiState3;
                                stopTripPlannerResultUiStateFactory$getUiState$1.L$3 = tripPlannerResultScreenState2;
                                stopTripPlannerResultUiStateFactory$getUiState$1.L$4 = stopBasedTripPlannerResultBottomSheetUiStateType;
                                stopTripPlannerResultUiStateFactory$getUiState$1.label = 6;
                                objN = n(stopTripPlannerResultUiStateFactory$getUiState$1);
                                if (objN != obj3) {
                                    stopBasedTripPlannerResultBottomSheetUiStateType3 = stopBasedTripPlannerResultBottomSheetUiStateType;
                                    obj2 = objN;
                                    toolbarUIState4 = toolbarUIState2;
                                    tabsUiState4 = tabsUiState2;
                                    loadingDialogUIState = (LoadingDialogUIState) obj2;
                                    toolbarUIState3 = toolbarUIState4;
                                    stopBasedTripPlannerResultBottomSheetUiStateType2 = stopBasedTripPlannerResultBottomSheetUiStateType3;
                                    tabsUiState3 = tabsUiState4;
                                }
                            } else {
                                stopBasedTripPlannerResultBottomSheetUiStateType2 = stopBasedTripPlannerResultBottomSheetUiStateType;
                                loadingDialogUIState = null;
                                toolbarUIState3 = toolbarUIState2;
                                tabsUiState3 = tabsUiState2;
                            }
                            return new StopBasedTripPlannerUiState(toolbarUIState3, tabsUiState3, tripPlannerOriginDestinationSearchbarUiState3, tripPlannerResultScreenState2, stopBasedTripPlannerResultBottomSheetUiStateType2, loadingDialogUIState);
                        }
                    }
                }
                return obj3;
            case 3:
                TabsUiState tabsUiState5 = (TabsUiState) stopTripPlannerResultUiStateFactory$getUiState$1.L$3;
                ToolbarUIState toolbarUIState6 = (ToolbarUIState) stopTripPlannerResultUiStateFactory$getUiState$1.L$2;
                Function1 function9 = (Function1) stopTripPlannerResultUiStateFactory$getUiState$1.L$1;
                stopTripPlannerResultsDataState3 = (StopTripPlannerResultsDataState) stopTripPlannerResultUiStateFactory$getUiState$1.L$0;
                ResultKt.b(obj2);
                tabsUiState = tabsUiState5;
                function2 = function9;
                toolbarUIState2 = toolbarUIState6;
                tripPlannerOriginDestinationSearchbarUiState = (TripPlannerOriginDestinationSearchbarUiState) obj2;
                stopTripPlannerResultUiStateFactory$getUiState$1.L$0 = stopTripPlannerResultsDataState3;
                stopTripPlannerResultUiStateFactory$getUiState$1.L$1 = function2;
                stopTripPlannerResultUiStateFactory$getUiState$1.L$2 = toolbarUIState2;
                stopTripPlannerResultUiStateFactory$getUiState$1.L$3 = tabsUiState;
                stopTripPlannerResultUiStateFactory$getUiState$1.L$4 = tripPlannerOriginDestinationSearchbarUiState;
                stopTripPlannerResultUiStateFactory$getUiState$1.label = 4;
                objA = A(stopTripPlannerResultsDataState3, function2, stopTripPlannerResultUiStateFactory$getUiState$1);
                if (objA != obj3) {
                    Function1 function10 = function2;
                    tripPlannerOriginDestinationSearchbarUiState2 = tripPlannerOriginDestinationSearchbarUiState;
                    obj2 = objA;
                    stopTripPlannerResultsDataState4 = stopTripPlannerResultsDataState3;
                    function3 = function10;
                    tripPlannerResultScreenState = (TripPlannerResultScreenState) obj2;
                    StopTripPlannerStopEditTarget stopTripPlannerStopEditTarget5 = stopTripPlannerResultsDataState4.n;
                    StopBasedTripPlannerResultsBottomSheetType stopBasedTripPlannerResultsBottomSheetType5 = stopTripPlannerResultsDataState4.l;
                    stopTripPlannerResultUiStateFactory$getUiState$1.L$0 = stopTripPlannerResultsDataState4;
                    stopTripPlannerResultUiStateFactory$getUiState$1.L$1 = toolbarUIState2;
                    stopTripPlannerResultUiStateFactory$getUiState$1.L$2 = tabsUiState;
                    stopTripPlannerResultUiStateFactory$getUiState$1.L$3 = tripPlannerOriginDestinationSearchbarUiState2;
                    stopTripPlannerResultUiStateFactory$getUiState$1.L$4 = tripPlannerResultScreenState;
                    stopTripPlannerResultUiStateFactory$getUiState$1.label = 5;
                    objL = l(stopTripPlannerStopEditTarget5, stopBasedTripPlannerResultsBottomSheetType5, function3, stopTripPlannerResultUiStateFactory$getUiState$1);
                    if (objL != obj3) {
                        TripPlannerOriginDestinationSearchbarUiState tripPlannerOriginDestinationSearchbarUiState8 = tripPlannerOriginDestinationSearchbarUiState2;
                        tripPlannerResultScreenState2 = tripPlannerResultScreenState;
                        obj2 = objL;
                        tabsUiState2 = tabsUiState;
                        tripPlannerOriginDestinationSearchbarUiState3 = tripPlannerOriginDestinationSearchbarUiState8;
                        stopBasedTripPlannerResultBottomSheetUiStateType = (StopBasedTripPlannerResultBottomSheetUiStateType) obj2;
                        if (stopTripPlannerResultsDataState4.m) {
                            stopTripPlannerResultUiStateFactory$getUiState$1.L$0 = toolbarUIState2;
                            stopTripPlannerResultUiStateFactory$getUiState$1.L$1 = tabsUiState2;
                            stopTripPlannerResultUiStateFactory$getUiState$1.L$2 = tripPlannerOriginDestinationSearchbarUiState3;
                            stopTripPlannerResultUiStateFactory$getUiState$1.L$3 = tripPlannerResultScreenState2;
                            stopTripPlannerResultUiStateFactory$getUiState$1.L$4 = stopBasedTripPlannerResultBottomSheetUiStateType;
                            stopTripPlannerResultUiStateFactory$getUiState$1.label = 6;
                            objN = n(stopTripPlannerResultUiStateFactory$getUiState$1);
                            if (objN != obj3) {
                                stopBasedTripPlannerResultBottomSheetUiStateType3 = stopBasedTripPlannerResultBottomSheetUiStateType;
                                obj2 = objN;
                                toolbarUIState4 = toolbarUIState2;
                                tabsUiState4 = tabsUiState2;
                                loadingDialogUIState = (LoadingDialogUIState) obj2;
                                toolbarUIState3 = toolbarUIState4;
                                stopBasedTripPlannerResultBottomSheetUiStateType2 = stopBasedTripPlannerResultBottomSheetUiStateType3;
                                tabsUiState3 = tabsUiState4;
                            }
                        } else {
                            stopBasedTripPlannerResultBottomSheetUiStateType2 = stopBasedTripPlannerResultBottomSheetUiStateType;
                            loadingDialogUIState = null;
                            toolbarUIState3 = toolbarUIState2;
                            tabsUiState3 = tabsUiState2;
                        }
                        return new StopBasedTripPlannerUiState(toolbarUIState3, tabsUiState3, tripPlannerOriginDestinationSearchbarUiState3, tripPlannerResultScreenState2, stopBasedTripPlannerResultBottomSheetUiStateType2, loadingDialogUIState);
                    }
                }
                return obj3;
            case 4:
                tripPlannerOriginDestinationSearchbarUiState2 = (TripPlannerOriginDestinationSearchbarUiState) stopTripPlannerResultUiStateFactory$getUiState$1.L$4;
                tabsUiState = (TabsUiState) stopTripPlannerResultUiStateFactory$getUiState$1.L$3;
                toolbarUIState2 = (ToolbarUIState) stopTripPlannerResultUiStateFactory$getUiState$1.L$2;
                function3 = (Function1) stopTripPlannerResultUiStateFactory$getUiState$1.L$1;
                stopTripPlannerResultsDataState4 = (StopTripPlannerResultsDataState) stopTripPlannerResultUiStateFactory$getUiState$1.L$0;
                ResultKt.b(obj2);
                tripPlannerResultScreenState = (TripPlannerResultScreenState) obj2;
                StopTripPlannerStopEditTarget stopTripPlannerStopEditTarget6 = stopTripPlannerResultsDataState4.n;
                StopBasedTripPlannerResultsBottomSheetType stopBasedTripPlannerResultsBottomSheetType6 = stopTripPlannerResultsDataState4.l;
                stopTripPlannerResultUiStateFactory$getUiState$1.L$0 = stopTripPlannerResultsDataState4;
                stopTripPlannerResultUiStateFactory$getUiState$1.L$1 = toolbarUIState2;
                stopTripPlannerResultUiStateFactory$getUiState$1.L$2 = tabsUiState;
                stopTripPlannerResultUiStateFactory$getUiState$1.L$3 = tripPlannerOriginDestinationSearchbarUiState2;
                stopTripPlannerResultUiStateFactory$getUiState$1.L$4 = tripPlannerResultScreenState;
                stopTripPlannerResultUiStateFactory$getUiState$1.label = 5;
                objL = l(stopTripPlannerStopEditTarget6, stopBasedTripPlannerResultsBottomSheetType6, function3, stopTripPlannerResultUiStateFactory$getUiState$1);
                if (objL != obj3) {
                    TripPlannerOriginDestinationSearchbarUiState tripPlannerOriginDestinationSearchbarUiState9 = tripPlannerOriginDestinationSearchbarUiState2;
                    tripPlannerResultScreenState2 = tripPlannerResultScreenState;
                    obj2 = objL;
                    tabsUiState2 = tabsUiState;
                    tripPlannerOriginDestinationSearchbarUiState3 = tripPlannerOriginDestinationSearchbarUiState9;
                    stopBasedTripPlannerResultBottomSheetUiStateType = (StopBasedTripPlannerResultBottomSheetUiStateType) obj2;
                    if (stopTripPlannerResultsDataState4.m) {
                        stopTripPlannerResultUiStateFactory$getUiState$1.L$0 = toolbarUIState2;
                        stopTripPlannerResultUiStateFactory$getUiState$1.L$1 = tabsUiState2;
                        stopTripPlannerResultUiStateFactory$getUiState$1.L$2 = tripPlannerOriginDestinationSearchbarUiState3;
                        stopTripPlannerResultUiStateFactory$getUiState$1.L$3 = tripPlannerResultScreenState2;
                        stopTripPlannerResultUiStateFactory$getUiState$1.L$4 = stopBasedTripPlannerResultBottomSheetUiStateType;
                        stopTripPlannerResultUiStateFactory$getUiState$1.label = 6;
                        objN = n(stopTripPlannerResultUiStateFactory$getUiState$1);
                        if (objN != obj3) {
                            stopBasedTripPlannerResultBottomSheetUiStateType3 = stopBasedTripPlannerResultBottomSheetUiStateType;
                            obj2 = objN;
                            toolbarUIState4 = toolbarUIState2;
                            tabsUiState4 = tabsUiState2;
                            loadingDialogUIState = (LoadingDialogUIState) obj2;
                            toolbarUIState3 = toolbarUIState4;
                            stopBasedTripPlannerResultBottomSheetUiStateType2 = stopBasedTripPlannerResultBottomSheetUiStateType3;
                            tabsUiState3 = tabsUiState4;
                        }
                    } else {
                        stopBasedTripPlannerResultBottomSheetUiStateType2 = stopBasedTripPlannerResultBottomSheetUiStateType;
                        loadingDialogUIState = null;
                        toolbarUIState3 = toolbarUIState2;
                        tabsUiState3 = tabsUiState2;
                    }
                    return new StopBasedTripPlannerUiState(toolbarUIState3, tabsUiState3, tripPlannerOriginDestinationSearchbarUiState3, tripPlannerResultScreenState2, stopBasedTripPlannerResultBottomSheetUiStateType2, loadingDialogUIState);
                }
                return obj3;
            case 5:
                tripPlannerResultScreenState2 = (TripPlannerResultScreenState) stopTripPlannerResultUiStateFactory$getUiState$1.L$4;
                tripPlannerOriginDestinationSearchbarUiState3 = (TripPlannerOriginDestinationSearchbarUiState) stopTripPlannerResultUiStateFactory$getUiState$1.L$3;
                TabsUiState tabsUiState6 = (TabsUiState) stopTripPlannerResultUiStateFactory$getUiState$1.L$2;
                ToolbarUIState toolbarUIState7 = (ToolbarUIState) stopTripPlannerResultUiStateFactory$getUiState$1.L$1;
                stopTripPlannerResultsDataState4 = (StopTripPlannerResultsDataState) stopTripPlannerResultUiStateFactory$getUiState$1.L$0;
                ResultKt.b(obj2);
                tabsUiState2 = tabsUiState6;
                toolbarUIState2 = toolbarUIState7;
                stopBasedTripPlannerResultBottomSheetUiStateType = (StopBasedTripPlannerResultBottomSheetUiStateType) obj2;
                if (stopTripPlannerResultsDataState4.m) {
                    stopTripPlannerResultUiStateFactory$getUiState$1.L$0 = toolbarUIState2;
                    stopTripPlannerResultUiStateFactory$getUiState$1.L$1 = tabsUiState2;
                    stopTripPlannerResultUiStateFactory$getUiState$1.L$2 = tripPlannerOriginDestinationSearchbarUiState3;
                    stopTripPlannerResultUiStateFactory$getUiState$1.L$3 = tripPlannerResultScreenState2;
                    stopTripPlannerResultUiStateFactory$getUiState$1.L$4 = stopBasedTripPlannerResultBottomSheetUiStateType;
                    stopTripPlannerResultUiStateFactory$getUiState$1.label = 6;
                    objN = n(stopTripPlannerResultUiStateFactory$getUiState$1);
                    if (objN != obj3) {
                        stopBasedTripPlannerResultBottomSheetUiStateType3 = stopBasedTripPlannerResultBottomSheetUiStateType;
                        obj2 = objN;
                        toolbarUIState4 = toolbarUIState2;
                        tabsUiState4 = tabsUiState2;
                        loadingDialogUIState = (LoadingDialogUIState) obj2;
                        toolbarUIState3 = toolbarUIState4;
                        stopBasedTripPlannerResultBottomSheetUiStateType2 = stopBasedTripPlannerResultBottomSheetUiStateType3;
                        tabsUiState3 = tabsUiState4;
                    }
                    return obj3;
                }
                stopBasedTripPlannerResultBottomSheetUiStateType2 = stopBasedTripPlannerResultBottomSheetUiStateType;
                loadingDialogUIState = null;
                toolbarUIState3 = toolbarUIState2;
                tabsUiState3 = tabsUiState2;
                return new StopBasedTripPlannerUiState(toolbarUIState3, tabsUiState3, tripPlannerOriginDestinationSearchbarUiState3, tripPlannerResultScreenState2, stopBasedTripPlannerResultBottomSheetUiStateType2, loadingDialogUIState);
            case 6:
                stopBasedTripPlannerResultBottomSheetUiStateType3 = (StopBasedTripPlannerResultBottomSheetUiStateType) stopTripPlannerResultUiStateFactory$getUiState$1.L$4;
                tripPlannerResultScreenState2 = (TripPlannerResultScreenState) stopTripPlannerResultUiStateFactory$getUiState$1.L$3;
                tripPlannerOriginDestinationSearchbarUiState3 = (TripPlannerOriginDestinationSearchbarUiState) stopTripPlannerResultUiStateFactory$getUiState$1.L$2;
                tabsUiState4 = (TabsUiState) stopTripPlannerResultUiStateFactory$getUiState$1.L$1;
                toolbarUIState4 = (ToolbarUIState) stopTripPlannerResultUiStateFactory$getUiState$1.L$0;
                ResultKt.b(obj2);
                loadingDialogUIState = (LoadingDialogUIState) obj2;
                toolbarUIState3 = toolbarUIState4;
                stopBasedTripPlannerResultBottomSheetUiStateType2 = stopBasedTripPlannerResultBottomSheetUiStateType3;
                tabsUiState3 = tabsUiState4;
                return new StopBasedTripPlannerUiState(toolbarUIState3, tabsUiState3, tripPlannerOriginDestinationSearchbarUiState3, tripPlannerResultScreenState2, stopBasedTripPlannerResultBottomSheetUiStateType2, loadingDialogUIState);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:45:0x00db  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
    
        if (r2 == r4) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008c, code lost:
    
        if (r2 == r4) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00aa, code lost:
    
        if (r2 == r4) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C(app.chalo.livetracking.stoptripplannerresult.StopTripPlannerTabType r23, kotlin.coroutines.jvm.internal.ContinuationImpl r24) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.stoptripplannerresult.uistate.StopTripPlannerResultUiStateFactory.C(app.chalo.livetracking.stoptripplannerresult.StopTripPlannerTabType, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:33:0x0126  */
    /* JADX WARN: Code duplicated, block: B:36:0x0139  */
    /* JADX WARN: Code duplicated, block: B:38:0x013c  */
    /* JADX WARN: Code duplicated, block: B:41:0x015a  */
    /* JADX WARN: Code duplicated, block: B:43:0x017e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0184  */
    /* JADX WARN: Code duplicated, block: B:47:0x018a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0190  */
    /* JADX WARN: Code duplicated, block: B:51:0x0196  */
    /* JADX WARN: Code duplicated, block: B:54:0x01b8 A[LOOP:1: B:52:0x01b2->B:54:0x01b8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:59:0x01df  */
    /* JADX WARN: Code duplicated, block: B:61:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:63:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:68:0x021d  */
    /* JADX WARN: Code duplicated, block: B:71:0x023c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0248  */
    /* JADX WARN: Code duplicated, block: B:76:0x024f  */
    /* JADX WARN: Code duplicated, block: B:77:0x0273  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x027a  */
    /* JADX WARN: Code duplicated, block: B:83:0x028c  */
    /* JADX WARN: Code duplicated, block: B:85:0x0298  */
    /* JADX WARN: Code duplicated, block: B:89:0x02b5 A[LOOP:0: B:87:0x02af->B:89:0x02b5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:95:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:61:0x01eb, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:63:0x01fc, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [app.chalo.livetracking.stoptripplannerresult.uistate.BusNumberContainerUIState] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v23, types: [app.chalo.uistate.text.TextUIState$ChaloTextUIState] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r31v2 */
    /* JADX WARN: Type inference failed for: r31v4 */
    /* JADX WARN: Type inference failed for: r31v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r31v6 */
    /* JADX WARN: Type inference failed for: r44v0, types: [app.chalo.livetracking.stoptripplannerresult.uistate.StopTripPlannerResultUiStateFactory] */
    public final Object a(boolean z, boolean z2, TripPlannerLegAppModel.Bus bus, Function1 function1, ContinuationImpl continuationImpl) {
        StopTripPlannerResultUiStateFactory$createBusInfoCard$1 stopTripPlannerResultUiStateFactory$createBusInfoCard$1;
        Function1 function2;
        boolean z3;
        boolean z4;
        String str;
        TripPlannerLegAppModel.Bus bus2;
        boolean z5;
        String str2;
        Function1 function3;
        StringProvider stringProvider;
        int i;
        TextUIState.ChaloTextUIState chaloTextUIState;
        int i2;
        StringProvider stringProvider2;
        String str3;
        UIShape uIShape;
        ?? r31;
        TripPlannerLegAppModel.Bus bus3;
        Function1 function4;
        ArrayList arrayList;
        Iterator it;
        int size;
        String str4;
        int i3;
        int i4;
        Object obj;
        int i5;
        String str5;
        String str6;
        int i6;
        Object objB;
        Function1 function5;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        Object objB2;
        TripPlannerLegAppModel.Bus bus4;
        Function1 function6;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        Object chaloTextUIState4;
        TripPlannerLegLiveBusNumberAvailability tripPlannerLegLiveBusNumberAvailabilityI;
        ?? r1;
        TextUIState.ChaloTextUIState chaloTextUIState5;
        Object objM;
        Object obj2;
        TripPlannerLegAppModel.Bus bus5;
        ?? r2;
        ArrayList arrayList2;
        Iterator it2;
        TripPlannerLegAppModel.Bus bus6 = bus;
        if (continuationImpl instanceof StopTripPlannerResultUiStateFactory$createBusInfoCard$1) {
            stopTripPlannerResultUiStateFactory$createBusInfoCard$1 = (StopTripPlannerResultUiStateFactory$createBusInfoCard$1) continuationImpl;
            int i7 = stopTripPlannerResultUiStateFactory$createBusInfoCard$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                stopTripPlannerResultUiStateFactory$createBusInfoCard$1.label = i7 - Integer.MIN_VALUE;
            } else {
                stopTripPlannerResultUiStateFactory$createBusInfoCard$1 = new StopTripPlannerResultUiStateFactory$createBusInfoCard$1(this, continuationImpl);
            }
        } else {
            stopTripPlannerResultUiStateFactory$createBusInfoCard$1 = new StopTripPlannerResultUiStateFactory$createBusInfoCard$1(this, continuationImpl);
        }
        Object objB3 = stopTripPlannerResultUiStateFactory$createBusInfoCard$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = stopTripPlannerResultUiStateFactory$createBusInfoCard$1.label;
        ChaloColorToken.AlmostBlackColor almostBlackColor = ChaloColorToken.AlmostBlackColor.f9756a;
        StringProvider stringProvider3 = this.f4619a;
        if (i8 != 0) {
            if (i8 == 1) {
                boolean z6 = stopTripPlannerResultUiStateFactory$createBusInfoCard$1.Z$1;
                z4 = stopTripPlannerResultUiStateFactory$createBusInfoCard$1.Z$0;
                function2 = (Function1) stopTripPlannerResultUiStateFactory$createBusInfoCard$1.L$1;
                TripPlannerLegAppModel.Bus bus7 = (TripPlannerLegAppModel.Bus) stopTripPlannerResultUiStateFactory$createBusInfoCard$1.L$0;
                ResultKt.b(objB3);
                z3 = z6;
                bus6 = bus7;
            } else {
                if (i8 == 2) {
                    z5 = stopTripPlannerResultUiStateFactory$createBusInfoCard$1.Z$1;
                    z4 = stopTripPlannerResultUiStateFactory$createBusInfoCard$1.Z$0;
                    chaloTextUIState2 = (TextUIState.ChaloTextUIState) stopTripPlannerResultUiStateFactory$createBusInfoCard$1.L$2;
                    function5 = (Function1) stopTripPlannerResultUiStateFactory$createBusInfoCard$1.L$1;
                    bus3 = (TripPlannerLegAppModel.Bus) stopTripPlannerResultUiStateFactory$createBusInfoCard$1.L$0;
                    ResultKt.b(objB3);
                    uIShape = null;
                    function4 = function5;
                    r31 = (String) objB3;
                    chaloTextUIState = chaloTextUIState2;
                    if (r31 != 0) {
                        chaloTextUIState4 = new TextUIState.ChaloTextUIState((String) r31, TypographyToUiTextStyle.overline.getTextStyle(), ChaloColorToken.ShadyGray.f9851a, 3, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, UITextOverflow.Ellipsis, (UIFontStyle) null, (String) null, 7152);
                    } else {
                        chaloTextUIState4 = uIShape;
                    }
                    tripPlannerLegLiveBusNumberAvailabilityI = TripPlannerResultAppResponseModelKt.i(bus3);
                    if (z4) {
                        stopTripPlannerResultUiStateFactory$createBusInfoCard$1.L$0 = bus3;
                        stopTripPlannerResultUiStateFactory$createBusInfoCard$1.L$1 = chaloTextUIState;
                        stopTripPlannerResultUiStateFactory$createBusInfoCard$1.L$2 = chaloTextUIState4;
                        stopTripPlannerResultUiStateFactory$createBusInfoCard$1.label = 4;
                        objM = m(z5, tripPlannerLegLiveBusNumberAvailabilityI, function4, stopTripPlannerResultUiStateFactory$createBusInfoCard$1);
                        if (objM != coroutineSingletons) {
                            Object obj3 = chaloTextUIState4;
                            objB3 = objM;
                            obj2 = obj3;
                            bus5 = bus3;
                            chaloTextUIState5 = chaloTextUIState;
                        }
                        return coroutineSingletons;
                    }
                    r1 = uIShape;
                    chaloTextUIState5 = chaloTextUIState;
                    r2 = chaloTextUIState4;
                    List list = bus3.z;
                    arrayList2 = new ArrayList(CollectionsKt.v(list, 10));
                    for (it2 = list.iterator(); it2.hasNext(); it2 = it2) {
                        String str7 = (String) it2.next();
                        arrayList2.add(new SpecialFeaturesTagTextUIState(new TextUIState.ChaloTextUIState(str7, TypographyToUiTextStyle.overline.getTextStyle(), almostBlackColor, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), ChaloRouteTagsPalette.a(str7), uIShape, 12));
                    }
                    return new BusInfoCardUiState(chaloTextUIState5, new SpecialFeaturesTagListUIState(arrayList2), r2, r1);
                }
                if (i8 == 3) {
                    z5 = stopTripPlannerResultUiStateFactory$createBusInfoCard$1.Z$1;
                    z4 = stopTripPlannerResultUiStateFactory$createBusInfoCard$1.Z$0;
                    chaloTextUIState3 = (TextUIState.ChaloTextUIState) stopTripPlannerResultUiStateFactory$createBusInfoCard$1.L$2;
                    function6 = (Function1) stopTripPlannerResultUiStateFactory$createBusInfoCard$1.L$1;
                    bus4 = (TripPlannerLegAppModel.Bus) stopTripPlannerResultUiStateFactory$createBusInfoCard$1.L$0;
                    ResultKt.b(objB3);
                    str2 = ": ";
                    function4 = function6;
                    bus3 = bus4;
                    r31 = objB3 + str2 + bus4.u.b;
                    uIShape = null;
                    chaloTextUIState = chaloTextUIState3;
                    if (r31 != 0) {
                        chaloTextUIState4 = new TextUIState.ChaloTextUIState((String) r31, TypographyToUiTextStyle.overline.getTextStyle(), ChaloColorToken.ShadyGray.f9851a, 3, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, UITextOverflow.Ellipsis, (UIFontStyle) null, (String) null, 7152);
                    } else {
                        chaloTextUIState4 = uIShape;
                    }
                    tripPlannerLegLiveBusNumberAvailabilityI = TripPlannerResultAppResponseModelKt.i(bus3);
                    if (z4) {
                        stopTripPlannerResultUiStateFactory$createBusInfoCard$1.L$0 = bus3;
                        stopTripPlannerResultUiStateFactory$createBusInfoCard$1.L$1 = chaloTextUIState;
                        stopTripPlannerResultUiStateFactory$createBusInfoCard$1.L$2 = chaloTextUIState4;
                        stopTripPlannerResultUiStateFactory$createBusInfoCard$1.label = 4;
                        objM = m(z5, tripPlannerLegLiveBusNumberAvailabilityI, function4, stopTripPlannerResultUiStateFactory$createBusInfoCard$1);
                        if (objM != coroutineSingletons) {
                            Object obj4 = chaloTextUIState4;
                            objB3 = objM;
                            obj2 = obj4;
                            bus5 = bus3;
                            chaloTextUIState5 = chaloTextUIState;
                        }
                        return coroutineSingletons;
                    }
                    r1 = uIShape;
                    chaloTextUIState5 = chaloTextUIState;
                    r2 = chaloTextUIState4;
                    List list2 = bus3.z;
                    arrayList2 = new ArrayList(CollectionsKt.v(list2, 10));
                    while (it2.hasNext()) {
                        String str8 = (String) it2.next();
                        arrayList2.add(new SpecialFeaturesTagTextUIState(new TextUIState.ChaloTextUIState(str8, TypographyToUiTextStyle.overline.getTextStyle(), almostBlackColor, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), ChaloRouteTagsPalette.a(str8), uIShape, 12));
                    }
                    return new BusInfoCardUiState(chaloTextUIState5, new SpecialFeaturesTagListUIState(arrayList2), r2, r1);
                }
                if (i8 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                TextUIState.ChaloTextUIState chaloTextUIState6 = (TextUIState.ChaloTextUIState) stopTripPlannerResultUiStateFactory$createBusInfoCard$1.L$2;
                chaloTextUIState5 = (TextUIState.ChaloTextUIState) stopTripPlannerResultUiStateFactory$createBusInfoCard$1.L$1;
                bus5 = (TripPlannerLegAppModel.Bus) stopTripPlannerResultUiStateFactory$createBusInfoCard$1.L$0;
                ResultKt.b(objB3);
                uIShape = null;
                obj2 = chaloTextUIState6;
            }
            BusNumberContainerUIState busNumberContainerUIState = (BusNumberContainerUIState) objB3;
            r2 = obj2;
            bus3 = bus5;
            r1 = busNumberContainerUIState;
            List list3 = bus3.z;
            arrayList2 = new ArrayList(CollectionsKt.v(list3, 10));
            while (it2.hasNext()) {
                String str9 = (String) it2.next();
                arrayList2.add(new SpecialFeaturesTagTextUIState(new TextUIState.ChaloTextUIState(str9, TypographyToUiTextStyle.overline.getTextStyle(), almostBlackColor, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), ChaloRouteTagsPalette.a(str9), uIShape, 12));
            }
            return new BusInfoCardUiState(chaloTextUIState5, new SpecialFeaturesTagListUIState(arrayList2), r2, r1);
        }
        ResultKt.b(objB3);
        int i9 = WhenMappings.f[bus6.C.ordinal()];
        if (i9 == 1) {
            stopTripPlannerResultUiStateFactory$createBusInfoCard$1.L$0 = bus6;
            function2 = function1;
            stopTripPlannerResultUiStateFactory$createBusInfoCard$1.L$1 = function2;
            stopTripPlannerResultUiStateFactory$createBusInfoCard$1.Z$0 = z;
            z3 = z2;
            stopTripPlannerResultUiStateFactory$createBusInfoCard$1.Z$1 = z3;
            stopTripPlannerResultUiStateFactory$createBusInfoCard$1.label = 1;
            objB3 = stringProvider3.b(StringEnum.BUS_TOWARDS, new Object[0], stopTripPlannerResultUiStateFactory$createBusInfoCard$1);
            if (objB3 != coroutineSingletons) {
                z4 = z;
            }
        } else {
            if (i9 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            z4 = z;
            function2 = function1;
            str = bus6.q;
            bus2 = bus6;
            z5 = z2;
            if (str != null) {
                str2 = ": ";
                stringProvider = stringProvider3;
                function3 = function2;
                i = 1;
                chaloTextUIState = new TextUIState.ChaloTextUIState(str, TypographyToUiTextStyle.h6.getTextStyle(), almostBlackColor, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
            } else {
                str2 = ": ";
                function3 = function2;
                stringProvider = stringProvider3;
                i = 1;
                chaloTextUIState = null;
            }
            i2 = WhenMappings.f[bus2.C.ordinal()];
            if (i2 == i) {
                stringProvider2 = stringProvider;
                str3 = bus2.D;
                if (str3 != null) {
                    if (StringsKt.F(str3)) {
                        str4 = null;
                    } else {
                        List listU = StringsKt.U(str3, new String[]{","}, 6);
                        arrayList = new ArrayList(CollectionsKt.v(listU, 10));
                        it = listU.iterator();
                        while (it.hasNext()) {
                            arrayList.add(StringsKt.u0((String) it.next()).toString());
                        }
                        size = arrayList.size();
                        str4 = "";
                        i3 = 0;
                        i4 = 0;
                        while (i4 < size) {
                            obj = arrayList.get(i4);
                            i4++;
                            i5 = i3 + 1;
                            if (i3 >= 0) {
                                CollectionsKt.z0();
                                throw null;
                            }
                            str5 = (String) obj;
                            int i10 = i;
                            if (i3 == arrayList.size() - 1) {
                                str6 = ((Object) str4) + str5;
                            } else {
                                str6 = ((Object) str4) + str5 + ", ";
                            }
                            str4 = str6;
                            i3 = i5;
                            i = i10;
                        }
                    }
                    i6 = i;
                    uIShape = null;
                    if (str4 != null) {
                        StringEnum stringEnum = StringEnum.VIA_;
                        Object[] objArr = new Object[i6];
                        objArr[0] = str4;
                        stopTripPlannerResultUiStateFactory$createBusInfoCard$1.L$0 = bus2;
                        stopTripPlannerResultUiStateFactory$createBusInfoCard$1.L$1 = function3;
                        stopTripPlannerResultUiStateFactory$createBusInfoCard$1.L$2 = chaloTextUIState;
                        stopTripPlannerResultUiStateFactory$createBusInfoCard$1.Z$0 = z4;
                        stopTripPlannerResultUiStateFactory$createBusInfoCard$1.Z$1 = z5;
                        stopTripPlannerResultUiStateFactory$createBusInfoCard$1.label = 2;
                        objB = stringProvider2.b(stringEnum, objArr, stopTripPlannerResultUiStateFactory$createBusInfoCard$1);
                        if (objB == coroutineSingletons) {
                            bus3 = bus2;
                            function5 = function3;
                            objB3 = objB;
                            chaloTextUIState2 = chaloTextUIState;
                            function4 = function5;
                            r31 = (String) objB3;
                            chaloTextUIState = chaloTextUIState2;
                        }
                    }
                    if (r31 != 0) {
                        chaloTextUIState4 = new TextUIState.ChaloTextUIState((String) r31, TypographyToUiTextStyle.overline.getTextStyle(), ChaloColorToken.ShadyGray.f9851a, 3, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, UITextOverflow.Ellipsis, (UIFontStyle) null, (String) null, 7152);
                    } else {
                        chaloTextUIState4 = uIShape;
                    }
                    tripPlannerLegLiveBusNumberAvailabilityI = TripPlannerResultAppResponseModelKt.i(bus3);
                    if (z4) {
                        stopTripPlannerResultUiStateFactory$createBusInfoCard$1.L$0 = bus3;
                        stopTripPlannerResultUiStateFactory$createBusInfoCard$1.L$1 = chaloTextUIState;
                        stopTripPlannerResultUiStateFactory$createBusInfoCard$1.L$2 = chaloTextUIState4;
                        stopTripPlannerResultUiStateFactory$createBusInfoCard$1.label = 4;
                        objM = m(z5, tripPlannerLegLiveBusNumberAvailabilityI, function4, stopTripPlannerResultUiStateFactory$createBusInfoCard$1);
                        if (objM != coroutineSingletons) {
                            Object obj5 = chaloTextUIState4;
                            objB3 = objM;
                            obj2 = obj5;
                            bus5 = bus3;
                            chaloTextUIState5 = chaloTextUIState;
                            BusNumberContainerUIState busNumberContainerUIState2 = (BusNumberContainerUIState) objB3;
                            r2 = obj2;
                            bus3 = bus5;
                            r1 = busNumberContainerUIState2;
                        }
                    } else {
                        r1 = uIShape;
                        chaloTextUIState5 = chaloTextUIState;
                        r2 = chaloTextUIState4;
                    }
                    List list4 = bus3.z;
                    arrayList2 = new ArrayList(CollectionsKt.v(list4, 10));
                    while (it2.hasNext()) {
                        String str10 = (String) it2.next();
                        arrayList2.add(new SpecialFeaturesTagTextUIState(new TextUIState.ChaloTextUIState(str10, TypographyToUiTextStyle.overline.getTextStyle(), almostBlackColor, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), ChaloRouteTagsPalette.a(str10), uIShape, 12));
                    }
                    return new BusInfoCardUiState(chaloTextUIState5, new SpecialFeaturesTagListUIState(arrayList2), r2, r1);
                }
                uIShape = null;
                r31 = uIShape;
                bus3 = bus2;
                function4 = function3;
                if (r31 != 0) {
                    chaloTextUIState4 = new TextUIState.ChaloTextUIState((String) r31, TypographyToUiTextStyle.overline.getTextStyle(), ChaloColorToken.ShadyGray.f9851a, 3, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, UITextOverflow.Ellipsis, (UIFontStyle) null, (String) null, 7152);
                } else {
                    chaloTextUIState4 = uIShape;
                }
                tripPlannerLegLiveBusNumberAvailabilityI = TripPlannerResultAppResponseModelKt.i(bus3);
                if (z4) {
                    stopTripPlannerResultUiStateFactory$createBusInfoCard$1.L$0 = bus3;
                    stopTripPlannerResultUiStateFactory$createBusInfoCard$1.L$1 = chaloTextUIState;
                    stopTripPlannerResultUiStateFactory$createBusInfoCard$1.L$2 = chaloTextUIState4;
                    stopTripPlannerResultUiStateFactory$createBusInfoCard$1.label = 4;
                    objM = m(z5, tripPlannerLegLiveBusNumberAvailabilityI, function4, stopTripPlannerResultUiStateFactory$createBusInfoCard$1);
                    if (objM != coroutineSingletons) {
                        Object obj6 = chaloTextUIState4;
                        objB3 = objM;
                        obj2 = obj6;
                        bus5 = bus3;
                        chaloTextUIState5 = chaloTextUIState;
                        BusNumberContainerUIState busNumberContainerUIState3 = (BusNumberContainerUIState) objB3;
                        r2 = obj2;
                        bus3 = bus5;
                        r1 = busNumberContainerUIState3;
                    }
                } else {
                    r1 = uIShape;
                    chaloTextUIState5 = chaloTextUIState;
                    r2 = chaloTextUIState4;
                }
                List list5 = bus3.z;
                arrayList2 = new ArrayList(CollectionsKt.v(list5, 10));
                while (it2.hasNext()) {
                    String str11 = (String) it2.next();
                    arrayList2.add(new SpecialFeaturesTagTextUIState(new TextUIState.ChaloTextUIState(str11, TypographyToUiTextStyle.overline.getTextStyle(), almostBlackColor, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), ChaloRouteTagsPalette.a(str11), uIShape, 12));
                }
                return new BusInfoCardUiState(chaloTextUIState5, new SpecialFeaturesTagListUIState(arrayList2), r2, r1);
            }
            if (i2 == 2) {
                throw new NoWhenBranchMatchedException();
            }
            stopTripPlannerResultUiStateFactory$createBusInfoCard$1.L$0 = bus2;
            stopTripPlannerResultUiStateFactory$createBusInfoCard$1.L$1 = function3;
            stopTripPlannerResultUiStateFactory$createBusInfoCard$1.L$2 = chaloTextUIState;
            stopTripPlannerResultUiStateFactory$createBusInfoCard$1.Z$0 = z4;
            stopTripPlannerResultUiStateFactory$createBusInfoCard$1.Z$1 = z5;
            stopTripPlannerResultUiStateFactory$createBusInfoCard$1.label = 3;
            objB2 = stringProvider.b(StringEnum.BUS_TOWARDS, new Object[0], stopTripPlannerResultUiStateFactory$createBusInfoCard$1);
            if (objB2 == coroutineSingletons) {
                bus4 = bus2;
                function6 = function3;
                chaloTextUIState3 = chaloTextUIState;
                objB3 = objB2;
                function4 = function6;
                bus3 = bus4;
                r31 = objB3 + str2 + bus4.u.b;
                uIShape = null;
                chaloTextUIState = chaloTextUIState3;
                if (r31 != 0) {
                    chaloTextUIState4 = new TextUIState.ChaloTextUIState((String) r31, TypographyToUiTextStyle.overline.getTextStyle(), ChaloColorToken.ShadyGray.f9851a, 3, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, UITextOverflow.Ellipsis, (UIFontStyle) null, (String) null, 7152);
                } else {
                    chaloTextUIState4 = uIShape;
                }
                tripPlannerLegLiveBusNumberAvailabilityI = TripPlannerResultAppResponseModelKt.i(bus3);
                if (z4) {
                    stopTripPlannerResultUiStateFactory$createBusInfoCard$1.L$0 = bus3;
                    stopTripPlannerResultUiStateFactory$createBusInfoCard$1.L$1 = chaloTextUIState;
                    stopTripPlannerResultUiStateFactory$createBusInfoCard$1.L$2 = chaloTextUIState4;
                    stopTripPlannerResultUiStateFactory$createBusInfoCard$1.label = 4;
                    objM = m(z5, tripPlannerLegLiveBusNumberAvailabilityI, function4, stopTripPlannerResultUiStateFactory$createBusInfoCard$1);
                    if (objM != coroutineSingletons) {
                        Object obj7 = chaloTextUIState4;
                        objB3 = objM;
                        obj2 = obj7;
                        bus5 = bus3;
                        chaloTextUIState5 = chaloTextUIState;
                        BusNumberContainerUIState busNumberContainerUIState4 = (BusNumberContainerUIState) objB3;
                        r2 = obj2;
                        bus3 = bus5;
                        r1 = busNumberContainerUIState4;
                    }
                } else {
                    r1 = uIShape;
                    chaloTextUIState5 = chaloTextUIState;
                    r2 = chaloTextUIState4;
                }
                List list6 = bus3.z;
                arrayList2 = new ArrayList(CollectionsKt.v(list6, 10));
                while (it2.hasNext()) {
                    String str12 = (String) it2.next();
                    arrayList2.add(new SpecialFeaturesTagTextUIState(new TextUIState.ChaloTextUIState(str12, TypographyToUiTextStyle.overline.getTextStyle(), almostBlackColor, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), ChaloRouteTagsPalette.a(str12), uIShape, 12));
                }
                return new BusInfoCardUiState(chaloTextUIState5, new SpecialFeaturesTagListUIState(arrayList2), r2, r1);
            }
        }
        return coroutineSingletons;
        str = objB3 + ": " + bus6.u.b;
        bus2 = bus6;
        z5 = z3;
        if (str != null) {
            str2 = ": ";
            stringProvider = stringProvider3;
            function3 = function2;
            i = 1;
            chaloTextUIState = new TextUIState.ChaloTextUIState(str, TypographyToUiTextStyle.h6.getTextStyle(), almostBlackColor, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
        } else {
            str2 = ": ";
            function3 = function2;
            stringProvider = stringProvider3;
            i = 1;
            chaloTextUIState = null;
        }
        i2 = WhenMappings.f[bus2.C.ordinal()];
        if (i2 == i) {
            if (i2 == 2) {
                throw new NoWhenBranchMatchedException();
            }
            stopTripPlannerResultUiStateFactory$createBusInfoCard$1.L$0 = bus2;
            stopTripPlannerResultUiStateFactory$createBusInfoCard$1.L$1 = function3;
            stopTripPlannerResultUiStateFactory$createBusInfoCard$1.L$2 = chaloTextUIState;
            stopTripPlannerResultUiStateFactory$createBusInfoCard$1.Z$0 = z4;
            stopTripPlannerResultUiStateFactory$createBusInfoCard$1.Z$1 = z5;
            stopTripPlannerResultUiStateFactory$createBusInfoCard$1.label = 3;
            objB2 = stringProvider.b(StringEnum.BUS_TOWARDS, new Object[0], stopTripPlannerResultUiStateFactory$createBusInfoCard$1);
            if (objB2 == coroutineSingletons) {
                bus4 = bus2;
                function6 = function3;
                chaloTextUIState3 = chaloTextUIState;
                objB3 = objB2;
                function4 = function6;
                bus3 = bus4;
                r31 = objB3 + str2 + bus4.u.b;
                uIShape = null;
                chaloTextUIState = chaloTextUIState3;
                if (r31 != 0) {
                    chaloTextUIState4 = new TextUIState.ChaloTextUIState((String) r31, TypographyToUiTextStyle.overline.getTextStyle(), ChaloColorToken.ShadyGray.f9851a, 3, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, UITextOverflow.Ellipsis, (UIFontStyle) null, (String) null, 7152);
                } else {
                    chaloTextUIState4 = uIShape;
                }
                tripPlannerLegLiveBusNumberAvailabilityI = TripPlannerResultAppResponseModelKt.i(bus3);
                if (z4) {
                    stopTripPlannerResultUiStateFactory$createBusInfoCard$1.L$0 = bus3;
                    stopTripPlannerResultUiStateFactory$createBusInfoCard$1.L$1 = chaloTextUIState;
                    stopTripPlannerResultUiStateFactory$createBusInfoCard$1.L$2 = chaloTextUIState4;
                    stopTripPlannerResultUiStateFactory$createBusInfoCard$1.label = 4;
                    objM = m(z5, tripPlannerLegLiveBusNumberAvailabilityI, function4, stopTripPlannerResultUiStateFactory$createBusInfoCard$1);
                    if (objM != coroutineSingletons) {
                        Object obj8 = chaloTextUIState4;
                        objB3 = objM;
                        obj2 = obj8;
                        bus5 = bus3;
                        chaloTextUIState5 = chaloTextUIState;
                        BusNumberContainerUIState busNumberContainerUIState5 = (BusNumberContainerUIState) objB3;
                        r2 = obj2;
                        bus3 = bus5;
                        r1 = busNumberContainerUIState5;
                    }
                } else {
                    r1 = uIShape;
                    chaloTextUIState5 = chaloTextUIState;
                    r2 = chaloTextUIState4;
                }
                List list7 = bus3.z;
                arrayList2 = new ArrayList(CollectionsKt.v(list7, 10));
                while (it2.hasNext()) {
                    String str13 = (String) it2.next();
                    arrayList2.add(new SpecialFeaturesTagTextUIState(new TextUIState.ChaloTextUIState(str13, TypographyToUiTextStyle.overline.getTextStyle(), almostBlackColor, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), ChaloRouteTagsPalette.a(str13), uIShape, 12));
                }
                return new BusInfoCardUiState(chaloTextUIState5, new SpecialFeaturesTagListUIState(arrayList2), r2, r1);
            }
            return coroutineSingletons;
        }
        stringProvider2 = stringProvider;
        str3 = bus2.D;
        if (str3 != null) {
            if (StringsKt.F(str3)) {
                str4 = null;
            } else {
                List listU2 = StringsKt.U(str3, new String[]{","}, 6);
                arrayList = new ArrayList(CollectionsKt.v(listU2, 10));
                it = listU2.iterator();
                while (it.hasNext()) {
                    arrayList.add(StringsKt.u0((String) it.next()).toString());
                }
                size = arrayList.size();
                str4 = "";
                i3 = 0;
                i4 = 0;
                while (i4 < size) {
                    obj = arrayList.get(i4);
                    i4++;
                    i5 = i3 + 1;
                    if (i3 >= 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    str5 = (String) obj;
                    int i11 = i;
                    if (i3 == arrayList.size() - 1) {
                        str6 = ((Object) str4) + str5;
                    } else {
                        str6 = ((Object) str4) + str5 + ", ";
                    }
                    str4 = str6;
                    i3 = i5;
                    i = i11;
                }
            }
            i6 = i;
            uIShape = null;
            if (str4 != null) {
                StringEnum stringEnum2 = StringEnum.VIA_;
                Object[] objArr2 = new Object[i6];
                objArr2[0] = str4;
                stopTripPlannerResultUiStateFactory$createBusInfoCard$1.L$0 = bus2;
                stopTripPlannerResultUiStateFactory$createBusInfoCard$1.L$1 = function3;
                stopTripPlannerResultUiStateFactory$createBusInfoCard$1.L$2 = chaloTextUIState;
                stopTripPlannerResultUiStateFactory$createBusInfoCard$1.Z$0 = z4;
                stopTripPlannerResultUiStateFactory$createBusInfoCard$1.Z$1 = z5;
                stopTripPlannerResultUiStateFactory$createBusInfoCard$1.label = 2;
                objB = stringProvider2.b(stringEnum2, objArr2, stopTripPlannerResultUiStateFactory$createBusInfoCard$1);
                if (objB == coroutineSingletons) {
                    bus3 = bus2;
                    function5 = function3;
                    objB3 = objB;
                    chaloTextUIState2 = chaloTextUIState;
                    function4 = function5;
                    r31 = (String) objB3;
                    chaloTextUIState = chaloTextUIState2;
                }
                return coroutineSingletons;
            }
            if (r31 != 0) {
                chaloTextUIState4 = new TextUIState.ChaloTextUIState((String) r31, TypographyToUiTextStyle.overline.getTextStyle(), ChaloColorToken.ShadyGray.f9851a, 3, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, UITextOverflow.Ellipsis, (UIFontStyle) null, (String) null, 7152);
            } else {
                chaloTextUIState4 = uIShape;
            }
            tripPlannerLegLiveBusNumberAvailabilityI = TripPlannerResultAppResponseModelKt.i(bus3);
            if (z4) {
                stopTripPlannerResultUiStateFactory$createBusInfoCard$1.L$0 = bus3;
                stopTripPlannerResultUiStateFactory$createBusInfoCard$1.L$1 = chaloTextUIState;
                stopTripPlannerResultUiStateFactory$createBusInfoCard$1.L$2 = chaloTextUIState4;
                stopTripPlannerResultUiStateFactory$createBusInfoCard$1.label = 4;
                objM = m(z5, tripPlannerLegLiveBusNumberAvailabilityI, function4, stopTripPlannerResultUiStateFactory$createBusInfoCard$1);
                if (objM != coroutineSingletons) {
                    Object obj9 = chaloTextUIState4;
                    objB3 = objM;
                    obj2 = obj9;
                    bus5 = bus3;
                    chaloTextUIState5 = chaloTextUIState;
                    BusNumberContainerUIState busNumberContainerUIState6 = (BusNumberContainerUIState) objB3;
                    r2 = obj2;
                    bus3 = bus5;
                    r1 = busNumberContainerUIState6;
                }
                return coroutineSingletons;
            }
            r1 = uIShape;
            chaloTextUIState5 = chaloTextUIState;
            r2 = chaloTextUIState4;
            List list8 = bus3.z;
            arrayList2 = new ArrayList(CollectionsKt.v(list8, 10));
            while (it2.hasNext()) {
                String str14 = (String) it2.next();
                arrayList2.add(new SpecialFeaturesTagTextUIState(new TextUIState.ChaloTextUIState(str14, TypographyToUiTextStyle.overline.getTextStyle(), almostBlackColor, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), ChaloRouteTagsPalette.a(str14), uIShape, 12));
            }
            return new BusInfoCardUiState(chaloTextUIState5, new SpecialFeaturesTagListUIState(arrayList2), r2, r1);
        }
        uIShape = null;
        r31 = uIShape;
        bus3 = bus2;
        function4 = function3;
        if (r31 != 0) {
            chaloTextUIState4 = new TextUIState.ChaloTextUIState((String) r31, TypographyToUiTextStyle.overline.getTextStyle(), ChaloColorToken.ShadyGray.f9851a, 3, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, UITextOverflow.Ellipsis, (UIFontStyle) null, (String) null, 7152);
        } else {
            chaloTextUIState4 = uIShape;
        }
        tripPlannerLegLiveBusNumberAvailabilityI = TripPlannerResultAppResponseModelKt.i(bus3);
        if (z4) {
            stopTripPlannerResultUiStateFactory$createBusInfoCard$1.L$0 = bus3;
            stopTripPlannerResultUiStateFactory$createBusInfoCard$1.L$1 = chaloTextUIState;
            stopTripPlannerResultUiStateFactory$createBusInfoCard$1.L$2 = chaloTextUIState4;
            stopTripPlannerResultUiStateFactory$createBusInfoCard$1.label = 4;
            objM = m(z5, tripPlannerLegLiveBusNumberAvailabilityI, function4, stopTripPlannerResultUiStateFactory$createBusInfoCard$1);
            if (objM != coroutineSingletons) {
                Object obj10 = chaloTextUIState4;
                objB3 = objM;
                obj2 = obj10;
                bus5 = bus3;
                chaloTextUIState5 = chaloTextUIState;
                BusNumberContainerUIState busNumberContainerUIState7 = (BusNumberContainerUIState) objB3;
                r2 = obj2;
                bus3 = bus5;
                r1 = busNumberContainerUIState7;
            }
            return coroutineSingletons;
        }
        r1 = uIShape;
        chaloTextUIState5 = chaloTextUIState;
        r2 = chaloTextUIState4;
        List list9 = bus3.z;
        arrayList2 = new ArrayList(CollectionsKt.v(list9, 10));
        while (it2.hasNext()) {
            String str15 = (String) it2.next();
            arrayList2.add(new SpecialFeaturesTagTextUIState(new TextUIState.ChaloTextUIState(str15, TypographyToUiTextStyle.overline.getTextStyle(), almostBlackColor, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), ChaloRouteTagsPalette.a(str15), uIShape, 12));
        }
        return new BusInfoCardUiState(chaloTextUIState5, new SpecialFeaturesTagListUIState(arrayList2), r2, r1);
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0120  */
    /* JADX WARN: Code duplicated, block: B:68:0x0126  */
    /* JADX WARN: Code duplicated, block: B:70:0x012a  */
    /* JADX WARN: Code duplicated, block: B:71:0x0141 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0143  */
    /* JADX WARN: Code duplicated, block: B:73:0x015a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x015c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0173  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final Object b(boolean z, TripPlannerLegAppModel.Bus bus, ItineraryLiveInfoResult itineraryLiveInfoResult, ContinuationImpl continuationImpl) {
        StopTripPlannerResultUiStateFactory$createEtaAndFareInfoCard$1 stopTripPlannerResultUiStateFactory$createEtaAndFareInfoCard$1;
        int i;
        TripPlannerLegAppModel.Bus bus2;
        int i2;
        ItineraryLiveInfoResult itineraryLiveInfoResult2;
        int i3;
        ItineraryEtaInfo itineraryEtaInfo;
        ItineraryEtaInfo itineraryEtaInfo2;
        ItineraryEtaInfo itineraryEtaInfo3;
        LiveEtaInfoUiState liveEtaInfoUiState;
        int i4;
        int i5;
        LiveEtaInfoUiState liveEtaInfoUiState2;
        boolean z2;
        ChaloColorToken.SectionDividerColor sectionDividerColor;
        EtaAndFareInfoSpecs etaAndFareInfoSpecs;
        boolean z3 = z;
        if (continuationImpl instanceof StopTripPlannerResultUiStateFactory$createEtaAndFareInfoCard$1) {
            stopTripPlannerResultUiStateFactory$createEtaAndFareInfoCard$1 = (StopTripPlannerResultUiStateFactory$createEtaAndFareInfoCard$1) continuationImpl;
            int i6 = stopTripPlannerResultUiStateFactory$createEtaAndFareInfoCard$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                stopTripPlannerResultUiStateFactory$createEtaAndFareInfoCard$1.label = i6 - Integer.MIN_VALUE;
            } else {
                stopTripPlannerResultUiStateFactory$createEtaAndFareInfoCard$1 = new StopTripPlannerResultUiStateFactory$createEtaAndFareInfoCard$1(this, continuationImpl);
            }
        } else {
            stopTripPlannerResultUiStateFactory$createEtaAndFareInfoCard$1 = new StopTripPlannerResultUiStateFactory$createEtaAndFareInfoCard$1(this, continuationImpl);
        }
        Object obj = stopTripPlannerResultUiStateFactory$createEtaAndFareInfoCard$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = stopTripPlannerResultUiStateFactory$createEtaAndFareInfoCard$1.label;
        if (i7 == 0) {
            ResultKt.b(obj);
            int i8 = ((itineraryLiveInfoResult == null || (itineraryEtaInfo3 = itineraryLiveInfoResult.b) == null) ? null : itineraryEtaInfo3.e) != null ? 1 : 0;
            i = (itineraryLiveInfoResult == null || (itineraryEtaInfo2 = itineraryLiveInfoResult.b) == null || !itineraryEtaInfo2.d) ? 0 : 1;
            Long l = (itineraryLiveInfoResult == null || (itineraryEtaInfo = itineraryLiveInfoResult.b) == null) ? null : new Long(itineraryEtaInfo.f4698a);
            if (l != null && l.longValue() == -1) {
                l = null;
            }
            int i9 = l != null ? 1 : 0;
            stopTripPlannerResultUiStateFactory$createEtaAndFareInfoCard$1.L$0 = bus;
            stopTripPlannerResultUiStateFactory$createEtaAndFareInfoCard$1.L$1 = itineraryLiveInfoResult;
            stopTripPlannerResultUiStateFactory$createEtaAndFareInfoCard$1.Z$0 = z3;
            stopTripPlannerResultUiStateFactory$createEtaAndFareInfoCard$1.I$0 = i8;
            stopTripPlannerResultUiStateFactory$createEtaAndFareInfoCard$1.I$1 = i;
            stopTripPlannerResultUiStateFactory$createEtaAndFareInfoCard$1.I$2 = i9;
            if (z3) {
                stopTripPlannerResultUiStateFactory$createEtaAndFareInfoCard$1.label = 1;
                Object objH = h(bus, itineraryLiveInfoResult, stopTripPlannerResultUiStateFactory$createEtaAndFareInfoCard$1);
                if (objH != obj2) {
                    bus2 = bus;
                    i2 = i9;
                    itineraryLiveInfoResult2 = itineraryLiveInfoResult;
                    i3 = i8;
                    obj = objH;
                    liveEtaInfoUiState = (LiveEtaInfoUiState) obj;
                }
            } else {
                stopTripPlannerResultUiStateFactory$createEtaAndFareInfoCard$1.label = 2;
                Object objX = x(bus, stopTripPlannerResultUiStateFactory$createEtaAndFareInfoCard$1);
                if (objX != obj2) {
                    bus2 = bus;
                    i2 = i9;
                    itineraryLiveInfoResult2 = itineraryLiveInfoResult;
                    i3 = i8;
                    obj = objX;
                    liveEtaInfoUiState = (LiveEtaInfoUiState) obj;
                }
            }
            return obj2;
        }
        if (i7 == 1) {
            int i10 = stopTripPlannerResultUiStateFactory$createEtaAndFareInfoCard$1.I$2;
            int i11 = stopTripPlannerResultUiStateFactory$createEtaAndFareInfoCard$1.I$1;
            i3 = stopTripPlannerResultUiStateFactory$createEtaAndFareInfoCard$1.I$0;
            boolean z4 = stopTripPlannerResultUiStateFactory$createEtaAndFareInfoCard$1.Z$0;
            itineraryLiveInfoResult2 = (ItineraryLiveInfoResult) stopTripPlannerResultUiStateFactory$createEtaAndFareInfoCard$1.L$1;
            bus2 = (TripPlannerLegAppModel.Bus) stopTripPlannerResultUiStateFactory$createEtaAndFareInfoCard$1.L$0;
            ResultKt.b(obj);
            i2 = i10;
            z3 = z4;
            i = i11;
            liveEtaInfoUiState = (LiveEtaInfoUiState) obj;
        } else if (i7 == 2) {
            int i12 = stopTripPlannerResultUiStateFactory$createEtaAndFareInfoCard$1.I$2;
            int i13 = stopTripPlannerResultUiStateFactory$createEtaAndFareInfoCard$1.I$1;
            i3 = stopTripPlannerResultUiStateFactory$createEtaAndFareInfoCard$1.I$0;
            boolean z5 = stopTripPlannerResultUiStateFactory$createEtaAndFareInfoCard$1.Z$0;
            itineraryLiveInfoResult2 = (ItineraryLiveInfoResult) stopTripPlannerResultUiStateFactory$createEtaAndFareInfoCard$1.L$1;
            bus2 = (TripPlannerLegAppModel.Bus) stopTripPlannerResultUiStateFactory$createEtaAndFareInfoCard$1.L$0;
            ResultKt.b(obj);
            i2 = i12;
            z3 = z5;
            i = i13;
            liveEtaInfoUiState = (LiveEtaInfoUiState) obj;
        } else {
            if (i7 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i4 = stopTripPlannerResultUiStateFactory$createEtaAndFareInfoCard$1.I$2;
            i5 = stopTripPlannerResultUiStateFactory$createEtaAndFareInfoCard$1.I$1;
            i3 = stopTripPlannerResultUiStateFactory$createEtaAndFareInfoCard$1.I$0;
            z2 = stopTripPlannerResultUiStateFactory$createEtaAndFareInfoCard$1.Z$0;
            liveEtaInfoUiState2 = (LiveEtaInfoUiState) stopTripPlannerResultUiStateFactory$createEtaAndFareInfoCard$1.L$0;
            ResultKt.b(obj);
        }
        FareAndTravelTimeInfoUiState fareAndTravelTimeInfoUiState = (FareAndTravelTimeInfoUiState) obj;
        if (z2) {
            sectionDividerColor = ChaloColorToken.SectionDividerColor.f9849a;
            if (i3 != 0) {
                etaAndFareInfoSpecs = new EtaAndFareInfoSpecs(new ColorGradiantUiState.Linear(CollectionsKt.S(ChaloColorToken.Linen.f9822a, sectionDividerColor)), 3);
            } else if (i5 != 0) {
                etaAndFareInfoSpecs = new EtaAndFareInfoSpecs(new ColorGradiantUiState.Linear(CollectionsKt.S(ChaloColorToken.PaleRed.f9838a, sectionDividerColor)), 3);
            } else if (i4 != 0) {
                etaAndFareInfoSpecs = new EtaAndFareInfoSpecs(new ColorGradiantUiState.Linear(CollectionsKt.S(ChaloColorToken.LightBlue.f9813a, sectionDividerColor)), 3);
            } else {
                etaAndFareInfoSpecs = new EtaAndFareInfoSpecs(null, 7);
            }
        } else {
            etaAndFareInfoSpecs = new EtaAndFareInfoSpecs(null, 7);
        }
        return new EtaAndFareInfoCardUiState(etaAndFareInfoSpecs, liveEtaInfoUiState2, fareAndTravelTimeInfoUiState);
        int i14 = i;
        boolean z6 = z3;
        i4 = i2;
        i5 = i14;
        stopTripPlannerResultUiStateFactory$createEtaAndFareInfoCard$1.L$0 = liveEtaInfoUiState;
        stopTripPlannerResultUiStateFactory$createEtaAndFareInfoCard$1.L$1 = null;
        stopTripPlannerResultUiStateFactory$createEtaAndFareInfoCard$1.Z$0 = z6;
        stopTripPlannerResultUiStateFactory$createEtaAndFareInfoCard$1.I$0 = i3;
        stopTripPlannerResultUiStateFactory$createEtaAndFareInfoCard$1.I$1 = i5;
        stopTripPlannerResultUiStateFactory$createEtaAndFareInfoCard$1.I$2 = i4;
        stopTripPlannerResultUiStateFactory$createEtaAndFareInfoCard$1.label = 3;
        Object objC = c(bus2, itineraryLiveInfoResult2, stopTripPlannerResultUiStateFactory$createEtaAndFareInfoCard$1);
        if (objC != obj2) {
            liveEtaInfoUiState2 = liveEtaInfoUiState;
            obj = objC;
            z2 = z6;
            FareAndTravelTimeInfoUiState fareAndTravelTimeInfoUiState2 = (FareAndTravelTimeInfoUiState) obj;
            if (z2) {
                etaAndFareInfoSpecs = new EtaAndFareInfoSpecs(null, 7);
            } else {
                sectionDividerColor = ChaloColorToken.SectionDividerColor.f9849a;
                if (i3 != 0) {
                    etaAndFareInfoSpecs = new EtaAndFareInfoSpecs(new ColorGradiantUiState.Linear(CollectionsKt.S(ChaloColorToken.Linen.f9822a, sectionDividerColor)), 3);
                } else if (i5 != 0) {
                    etaAndFareInfoSpecs = new EtaAndFareInfoSpecs(new ColorGradiantUiState.Linear(CollectionsKt.S(ChaloColorToken.PaleRed.f9838a, sectionDividerColor)), 3);
                } else if (i4 != 0) {
                    etaAndFareInfoSpecs = new EtaAndFareInfoSpecs(new ColorGradiantUiState.Linear(CollectionsKt.S(ChaloColorToken.LightBlue.f9813a, sectionDividerColor)), 3);
                } else {
                    etaAndFareInfoSpecs = new EtaAndFareInfoSpecs(null, 7);
                }
            }
            return new EtaAndFareInfoCardUiState(etaAndFareInfoSpecs, liveEtaInfoUiState2, fareAndTravelTimeInfoUiState2);
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object c(TripPlannerLegAppModel.Bus bus, ItineraryLiveInfoResult itineraryLiveInfoResult, ContinuationImpl continuationImpl) {
        StopTripPlannerResultUiStateFactory$createFareAndTravelTimeInfo$1 stopTripPlannerResultUiStateFactory$createFareAndTravelTimeInfo$1;
        String strW;
        Double d;
        ItineraryEtaInfo itineraryEtaInfo;
        if (continuationImpl instanceof StopTripPlannerResultUiStateFactory$createFareAndTravelTimeInfo$1) {
            stopTripPlannerResultUiStateFactory$createFareAndTravelTimeInfo$1 = (StopTripPlannerResultUiStateFactory$createFareAndTravelTimeInfo$1) continuationImpl;
            int i = stopTripPlannerResultUiStateFactory$createFareAndTravelTimeInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopTripPlannerResultUiStateFactory$createFareAndTravelTimeInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                stopTripPlannerResultUiStateFactory$createFareAndTravelTimeInfo$1 = new StopTripPlannerResultUiStateFactory$createFareAndTravelTimeInfo$1(this, continuationImpl);
            }
        } else {
            stopTripPlannerResultUiStateFactory$createFareAndTravelTimeInfo$1 = new StopTripPlannerResultUiStateFactory$createFareAndTravelTimeInfo$1(this, continuationImpl);
        }
        Object objB = stopTripPlannerResultUiStateFactory$createFareAndTravelTimeInfo$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = stopTripPlannerResultUiStateFactory$createFareAndTravelTimeInfo$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            String str = null;
            if (itineraryLiveInfoResult != null && (itineraryEtaInfo = itineraryLiveInfoResult.b) != null && itineraryEtaInfo.f4698a == -1) {
                return null;
            }
            Double d2 = bus.l;
            long jDoubleValue = (long) ((d2 != null ? d2.doubleValue() : 0.0d) * ((double) 1000));
            TripPlannerLegFareInfoAppResponseModel tripPlannerLegFareInfoAppResponseModel = bus.B;
            if (tripPlannerLegFareInfoAppResponseModel != null && (d = tripPlannerLegFareInfoAppResponseModel.b) != null) {
                double dDoubleValue = d.doubleValue();
                str = this.c.d() + ((int) dDoubleValue);
            }
            strW = this.b.w(jDoubleValue);
            if (str != null) {
                strW = vo1.n(strW, " | ", str);
            }
            stopTripPlannerResultUiStateFactory$createFareAndTravelTimeInfo$1.L$0 = strW;
            stopTripPlannerResultUiStateFactory$createFareAndTravelTimeInfo$1.label = 1;
            objB = this.f4619a.b(StringEnum.TOTAL_RIDE_TIME_AND_FARE, new Object[0], stopTripPlannerResultUiStateFactory$createFareAndTravelTimeInfo$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            strW = (String) stopTripPlannerResultUiStateFactory$createFareAndTravelTimeInfo$1.L$0;
            ResultKt.b(objB);
        }
        return new FareAndTravelTimeInfoUiState(new TextUIState.ChaloTextUIState((String) objB, TypographyToUiTextStyle.overline.getTextStyle(), ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(strW, TypographyToUiTextStyle.h6.getTextStyle(), ChaloColorToken.AlmostBlackColor.f9756a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x019c  */
    /* JADX WARN: Code duplicated, block: B:33:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:35:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:39:0x0209  */
    /* JADX WARN: Code duplicated, block: B:43:0x022b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0239 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:57:0x0273  */
    /* JADX WARN: Code duplicated, block: B:58:0x0275  */
    /* JADX WARN: Code duplicated, block: B:62:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object d(StopTripPlannerTabType stopTripPlannerTabType, Pair pair, Pair pair2, TripPlannerLegAppModel.Bus bus, ItineraryLiveInfoResult itineraryLiveInfoResult, boolean z, Integer num, ia iaVar, kv kvVar, wt0 wt0Var, ContinuationImpl continuationImpl) {
        StopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1 stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1;
        Pair pair3;
        ItineraryLiveInfoResult itineraryLiveInfoResult2;
        Integer num2;
        Function0 function0;
        TripPlannerLegAppModel.Bus bus2;
        boolean z2;
        Function0 function1;
        StopTripPlannerTabType stopTripPlannerTabType2;
        Function1 function2;
        Pair pair4;
        LegCardHeaderUiState legCardHeaderUiState;
        Object objF;
        Function1 function3;
        Function0 function4;
        StepCardUIState stepCardUIState;
        Object objJ;
        TripPlannerLegAppModel.Bus bus3;
        Pair pair5;
        Pair pair6;
        StopTripPlannerTabType stopTripPlannerTabType3;
        Function1 function5;
        Function0 function6;
        LegCardHeaderUiState legCardHeaderUiState2;
        Object objI;
        StopTripPlannerResultUiStateFactory stopTripPlannerResultUiStateFactory;
        StopTripPlannerTabType stopTripPlannerTabType4;
        TripPlannerLegAppModel.Bus bus4;
        StopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1 stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2;
        ItineraryLiveInfoResult itineraryLiveInfoResult3;
        Function0 function7;
        RouteDetailsUiState routeDetailsUiState;
        Object objB;
        StepCardUIState stepCardUIState2;
        RouteDetailsUiState routeDetailsUiState2;
        StopTripPlannerTabType stopTripPlannerTabType5;
        TripPlannerLegAppModel.Bus bus5;
        ItineraryLiveInfoResult itineraryLiveInfoResult4;
        Function0 function8;
        Function1 function9;
        LegCardHeaderUiState legCardHeaderUiState3;
        EtaAndFareInfoCardUiState etaAndFareInfoCardUiState;
        StepCardUIState stepCardUIState3;
        RouteDetailsUiState routeDetailsUiState3;
        EtaAndFareInfoCardUiState etaAndFareInfoCardUiState2;
        AlertTextWithIconUiState alertTextWithIconUiState;
        ItineraryEtaInfo itineraryEtaInfo;
        EtaAndFareInfoCardUiState etaAndFareInfoCardUiState3;
        TripPlannerLegAppModel.Bus bus6;
        StopTripPlannerTabType stopTripPlannerTabType6;
        boolean z3;
        Object objA;
        RouteDetailsUiState routeDetailsUiState4;
        StepCardUIState stepCardUIState4;
        Function0 function10;
        if (continuationImpl instanceof StopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1) {
            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1 = (StopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1) continuationImpl;
            int i = stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.label = i - Integer.MIN_VALUE;
            } else {
                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1 = new StopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1(this, continuationImpl);
            }
        } else {
            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1 = new StopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1(this, continuationImpl);
        }
        Object obj = stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.label) {
            case 0:
                ResultKt.b(obj);
                int i2 = WhenMappings.b[stopTripPlannerTabType.ordinal()];
                if (i2 == 1) {
                    pair3 = pair;
                    itineraryLiveInfoResult2 = itineraryLiveInfoResult;
                    num2 = num;
                    function0 = iaVar;
                    bus2 = bus;
                    z2 = z;
                    function1 = kvVar;
                    stopTripPlannerTabType2 = stopTripPlannerTabType;
                    function2 = wt0Var;
                    pair4 = pair2;
                    legCardHeaderUiState = null;
                    if (num2 != null) {
                        int iIntValue = num2.intValue();
                        stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$0 = stopTripPlannerTabType2;
                        stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$1 = pair3;
                        stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$2 = pair4;
                        stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$3 = bus2;
                        stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$4 = itineraryLiveInfoResult2;
                        stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$5 = function1;
                        stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$6 = function2;
                        stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$7 = legCardHeaderUiState;
                        stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$8 = null;
                        stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.Z$0 = z2;
                        stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.label = 2;
                        objJ = j(iIntValue, function0, stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1);
                        if (objJ != coroutineSingletons) {
                            bus3 = bus2;
                            pair5 = pair4;
                            pair6 = pair3;
                            stopTripPlannerTabType3 = stopTripPlannerTabType2;
                            function5 = function2;
                            obj = objJ;
                            function6 = function1;
                            legCardHeaderUiState2 = legCardHeaderUiState;
                            legCardHeaderUiState = legCardHeaderUiState2;
                            stepCardUIState = (StepCardUIState) obj;
                            function4 = function6;
                            stopTripPlannerTabType2 = stopTripPlannerTabType3;
                            function3 = function5;
                            pair4 = pair5;
                            pair3 = pair6;
                            bus2 = bus3;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$0 = stopTripPlannerTabType2;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$1 = bus2;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$2 = itineraryLiveInfoResult2;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$3 = function4;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$4 = function3;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$5 = legCardHeaderUiState;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$6 = stepCardUIState;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$7 = null;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$8 = null;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.Z$0 = z2;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.label = 3;
                            StopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1 stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$3 = stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1;
                            StopTripPlannerTabType stopTripPlannerTabType7 = stopTripPlannerTabType2;
                            TripPlannerLegAppModel.Bus bus7 = bus2;
                            objI = i(stopTripPlannerTabType7, pair3, pair4, bus7, stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$3);
                            stopTripPlannerResultUiStateFactory = this;
                            stopTripPlannerTabType4 = stopTripPlannerTabType7;
                            bus4 = bus7;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2 = stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$3;
                            if (objI != coroutineSingletons) {
                                itineraryLiveInfoResult3 = itineraryLiveInfoResult2;
                                function7 = function4;
                                obj = objI;
                                routeDetailsUiState = (RouteDetailsUiState) obj;
                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$0 = stopTripPlannerTabType4;
                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$1 = bus4;
                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$2 = itineraryLiveInfoResult3;
                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$3 = function7;
                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$4 = function3;
                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$5 = legCardHeaderUiState;
                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$6 = stepCardUIState;
                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$7 = routeDetailsUiState;
                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.Z$0 = z2;
                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.label = 4;
                                objB = stopTripPlannerResultUiStateFactory.b(z2, bus4, itineraryLiveInfoResult3, stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2);
                                if (objB != coroutineSingletons) {
                                    obj = objB;
                                    stepCardUIState2 = stepCardUIState;
                                    routeDetailsUiState2 = routeDetailsUiState;
                                    stopTripPlannerTabType5 = stopTripPlannerTabType4;
                                    bus5 = bus4;
                                    itineraryLiveInfoResult4 = itineraryLiveInfoResult3;
                                    function8 = function7;
                                    function9 = function3;
                                    legCardHeaderUiState3 = legCardHeaderUiState;
                                    etaAndFareInfoCardUiState = (EtaAndFareInfoCardUiState) obj;
                                    if (z2) {
                                    }
                                    stepCardUIState3 = stepCardUIState2;
                                    routeDetailsUiState3 = routeDetailsUiState2;
                                    etaAndFareInfoCardUiState2 = etaAndFareInfoCardUiState;
                                    alertTextWithIconUiState = null;
                                    if (stopTripPlannerTabType5 == StopTripPlannerTabType.DIRECT) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$0 = function8;
                                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$1 = legCardHeaderUiState3;
                                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$2 = stepCardUIState3;
                                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$3 = routeDetailsUiState3;
                                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$4 = etaAndFareInfoCardUiState2;
                                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$5 = alertTextWithIconUiState;
                                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$6 = null;
                                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$7 = null;
                                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$8 = null;
                                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.label = 6;
                                    objA = stopTripPlannerResultUiStateFactory.a(true, z3, bus5, function9, stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2);
                                    if (objA != coroutineSingletons) {
                                        routeDetailsUiState4 = routeDetailsUiState3;
                                        stepCardUIState4 = stepCardUIState3;
                                        obj = objA;
                                        function10 = function8;
                                        return new ItineraryLegItemUiState(legCardHeaderUiState3, routeDetailsUiState4, alertTextWithIconUiState, etaAndFareInfoCardUiState2, (BusInfoCardUiState) obj, stepCardUIState4, UiEventHandler.Companion.a(function10));
                                    }
                                }
                            }
                        }
                    } else {
                        function3 = function2;
                        function4 = function1;
                        stepCardUIState = null;
                        stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$0 = stopTripPlannerTabType2;
                        stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$1 = bus2;
                        stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$2 = itineraryLiveInfoResult2;
                        stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$3 = function4;
                        stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$4 = function3;
                        stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$5 = legCardHeaderUiState;
                        stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$6 = stepCardUIState;
                        stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$7 = null;
                        stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$8 = null;
                        stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.Z$0 = z2;
                        stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.label = 3;
                        StopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1 stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$4 = stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1;
                        StopTripPlannerTabType stopTripPlannerTabType8 = stopTripPlannerTabType2;
                        TripPlannerLegAppModel.Bus bus8 = bus2;
                        objI = i(stopTripPlannerTabType8, pair3, pair4, bus8, stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$4);
                        stopTripPlannerResultUiStateFactory = this;
                        stopTripPlannerTabType4 = stopTripPlannerTabType8;
                        bus4 = bus8;
                        stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2 = stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$4;
                        if (objI != coroutineSingletons) {
                            itineraryLiveInfoResult3 = itineraryLiveInfoResult2;
                            function7 = function4;
                            obj = objI;
                            routeDetailsUiState = (RouteDetailsUiState) obj;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$0 = stopTripPlannerTabType4;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$1 = bus4;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$2 = itineraryLiveInfoResult3;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$3 = function7;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$4 = function3;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$5 = legCardHeaderUiState;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$6 = stepCardUIState;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$7 = routeDetailsUiState;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.Z$0 = z2;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.label = 4;
                            objB = stopTripPlannerResultUiStateFactory.b(z2, bus4, itineraryLiveInfoResult3, stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2);
                            if (objB != coroutineSingletons) {
                                obj = objB;
                                stepCardUIState2 = stepCardUIState;
                                routeDetailsUiState2 = routeDetailsUiState;
                                stopTripPlannerTabType5 = stopTripPlannerTabType4;
                                bus5 = bus4;
                                itineraryLiveInfoResult4 = itineraryLiveInfoResult3;
                                function8 = function7;
                                function9 = function3;
                                legCardHeaderUiState3 = legCardHeaderUiState;
                                etaAndFareInfoCardUiState = (EtaAndFareInfoCardUiState) obj;
                                if (z2) {
                                }
                                stepCardUIState3 = stepCardUIState2;
                                routeDetailsUiState3 = routeDetailsUiState2;
                                etaAndFareInfoCardUiState2 = etaAndFareInfoCardUiState;
                                alertTextWithIconUiState = null;
                                if (stopTripPlannerTabType5 == StopTripPlannerTabType.DIRECT) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$0 = function8;
                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$1 = legCardHeaderUiState3;
                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$2 = stepCardUIState3;
                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$3 = routeDetailsUiState3;
                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$4 = etaAndFareInfoCardUiState2;
                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$5 = alertTextWithIconUiState;
                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$6 = null;
                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$7 = null;
                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$8 = null;
                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.label = 6;
                                objA = stopTripPlannerResultUiStateFactory.a(true, z3, bus5, function9, stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2);
                                if (objA != coroutineSingletons) {
                                    routeDetailsUiState4 = routeDetailsUiState3;
                                    stepCardUIState4 = stepCardUIState3;
                                    obj = objA;
                                    function10 = function8;
                                    return new ItineraryLegItemUiState(legCardHeaderUiState3, routeDetailsUiState4, alertTextWithIconUiState, etaAndFareInfoCardUiState2, (BusInfoCardUiState) obj, stepCardUIState4, UiEventHandler.Companion.a(function10));
                                }
                            }
                        }
                    }
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$0 = stopTripPlannerTabType;
                    pair3 = pair;
                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$1 = pair3;
                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$2 = pair2;
                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$3 = bus;
                    itineraryLiveInfoResult2 = itineraryLiveInfoResult;
                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$4 = itineraryLiveInfoResult2;
                    num2 = num;
                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$5 = num2;
                    function0 = iaVar;
                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$6 = function0;
                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$7 = kvVar;
                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$8 = wt0Var;
                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.Z$0 = z;
                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.label = 1;
                    objF = f(bus, z, stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1);
                    if (objF != coroutineSingletons) {
                        bus2 = bus;
                        z2 = z;
                        function1 = kvVar;
                        stopTripPlannerTabType2 = stopTripPlannerTabType;
                        function2 = wt0Var;
                        pair4 = pair2;
                        legCardHeaderUiState = (LegCardHeaderUiState) objF;
                        if (num2 != null) {
                            int iIntValue2 = num2.intValue();
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$0 = stopTripPlannerTabType2;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$1 = pair3;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$2 = pair4;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$3 = bus2;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$4 = itineraryLiveInfoResult2;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$5 = function1;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$6 = function2;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$7 = legCardHeaderUiState;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$8 = null;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.Z$0 = z2;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.label = 2;
                            objJ = j(iIntValue2, function0, stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1);
                            if (objJ != coroutineSingletons) {
                                bus3 = bus2;
                                pair5 = pair4;
                                pair6 = pair3;
                                stopTripPlannerTabType3 = stopTripPlannerTabType2;
                                function5 = function2;
                                obj = objJ;
                                function6 = function1;
                                legCardHeaderUiState2 = legCardHeaderUiState;
                                legCardHeaderUiState = legCardHeaderUiState2;
                                stepCardUIState = (StepCardUIState) obj;
                                function4 = function6;
                                stopTripPlannerTabType2 = stopTripPlannerTabType3;
                                function3 = function5;
                                pair4 = pair5;
                                pair3 = pair6;
                                bus2 = bus3;
                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$0 = stopTripPlannerTabType2;
                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$1 = bus2;
                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$2 = itineraryLiveInfoResult2;
                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$3 = function4;
                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$4 = function3;
                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$5 = legCardHeaderUiState;
                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$6 = stepCardUIState;
                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$7 = null;
                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$8 = null;
                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.Z$0 = z2;
                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.label = 3;
                                StopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1 stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$5 = stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1;
                                StopTripPlannerTabType stopTripPlannerTabType9 = stopTripPlannerTabType2;
                                TripPlannerLegAppModel.Bus bus9 = bus2;
                                objI = i(stopTripPlannerTabType9, pair3, pair4, bus9, stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$5);
                                stopTripPlannerResultUiStateFactory = this;
                                stopTripPlannerTabType4 = stopTripPlannerTabType9;
                                bus4 = bus9;
                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2 = stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$5;
                                if (objI != coroutineSingletons) {
                                    itineraryLiveInfoResult3 = itineraryLiveInfoResult2;
                                    function7 = function4;
                                    obj = objI;
                                    routeDetailsUiState = (RouteDetailsUiState) obj;
                                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$0 = stopTripPlannerTabType4;
                                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$1 = bus4;
                                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$2 = itineraryLiveInfoResult3;
                                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$3 = function7;
                                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$4 = function3;
                                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$5 = legCardHeaderUiState;
                                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$6 = stepCardUIState;
                                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$7 = routeDetailsUiState;
                                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.Z$0 = z2;
                                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.label = 4;
                                    objB = stopTripPlannerResultUiStateFactory.b(z2, bus4, itineraryLiveInfoResult3, stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2);
                                    if (objB != coroutineSingletons) {
                                        obj = objB;
                                        stepCardUIState2 = stepCardUIState;
                                        routeDetailsUiState2 = routeDetailsUiState;
                                        stopTripPlannerTabType5 = stopTripPlannerTabType4;
                                        bus5 = bus4;
                                        itineraryLiveInfoResult4 = itineraryLiveInfoResult3;
                                        function8 = function7;
                                        function9 = function3;
                                        legCardHeaderUiState3 = legCardHeaderUiState;
                                        etaAndFareInfoCardUiState = (EtaAndFareInfoCardUiState) obj;
                                        if (z2 || itineraryLiveInfoResult4 == null || (itineraryEtaInfo = itineraryLiveInfoResult4.b) == null) {
                                            stepCardUIState3 = stepCardUIState2;
                                            routeDetailsUiState3 = routeDetailsUiState2;
                                            etaAndFareInfoCardUiState2 = etaAndFareInfoCardUiState;
                                            alertTextWithIconUiState = null;
                                            if (stopTripPlannerTabType5 == StopTripPlannerTabType.DIRECT) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$0 = function8;
                                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$1 = legCardHeaderUiState3;
                                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$2 = stepCardUIState3;
                                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$3 = routeDetailsUiState3;
                                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$4 = etaAndFareInfoCardUiState2;
                                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$5 = alertTextWithIconUiState;
                                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$6 = null;
                                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$7 = null;
                                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$8 = null;
                                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.label = 6;
                                            objA = stopTripPlannerResultUiStateFactory.a(true, z3, bus5, function9, stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2);
                                            if (objA != coroutineSingletons) {
                                                routeDetailsUiState4 = routeDetailsUiState3;
                                                stepCardUIState4 = stepCardUIState3;
                                                obj = objA;
                                                function10 = function8;
                                                return new ItineraryLegItemUiState(legCardHeaderUiState3, routeDetailsUiState4, alertTextWithIconUiState, etaAndFareInfoCardUiState2, (BusInfoCardUiState) obj, stepCardUIState4, UiEventHandler.Companion.a(function10));
                                            }
                                        } else {
                                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$0 = stopTripPlannerTabType5;
                                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$1 = bus5;
                                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$2 = itineraryLiveInfoResult4;
                                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$3 = function8;
                                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$4 = function9;
                                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$5 = legCardHeaderUiState3;
                                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$6 = stepCardUIState2;
                                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$7 = routeDetailsUiState2;
                                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$8 = etaAndFareInfoCardUiState;
                                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.label = 5;
                                            Object objG = stopTripPlannerResultUiStateFactory.g(itineraryEtaInfo, stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2);
                                            if (objG != coroutineSingletons) {
                                                obj = objG;
                                                etaAndFareInfoCardUiState3 = etaAndFareInfoCardUiState;
                                                bus6 = bus5;
                                                stopTripPlannerTabType6 = stopTripPlannerTabType5;
                                                AlertTextWithIconUiState alertTextWithIconUiState2 = (AlertTextWithIconUiState) obj;
                                                stepCardUIState3 = stepCardUIState2;
                                                routeDetailsUiState3 = routeDetailsUiState2;
                                                etaAndFareInfoCardUiState2 = etaAndFareInfoCardUiState3;
                                                alertTextWithIconUiState = alertTextWithIconUiState2;
                                                stopTripPlannerTabType5 = stopTripPlannerTabType6;
                                                bus5 = bus6;
                                                if (stopTripPlannerTabType5 == StopTripPlannerTabType.DIRECT) {
                                                    z3 = true;
                                                } else {
                                                    z3 = false;
                                                }
                                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$0 = function8;
                                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$1 = legCardHeaderUiState3;
                                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$2 = stepCardUIState3;
                                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$3 = routeDetailsUiState3;
                                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$4 = etaAndFareInfoCardUiState2;
                                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$5 = alertTextWithIconUiState;
                                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$6 = null;
                                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$7 = null;
                                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$8 = null;
                                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.label = 6;
                                                objA = stopTripPlannerResultUiStateFactory.a(true, z3, bus5, function9, stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2);
                                                if (objA != coroutineSingletons) {
                                                    routeDetailsUiState4 = routeDetailsUiState3;
                                                    stepCardUIState4 = stepCardUIState3;
                                                    obj = objA;
                                                    function10 = function8;
                                                    return new ItineraryLegItemUiState(legCardHeaderUiState3, routeDetailsUiState4, alertTextWithIconUiState, etaAndFareInfoCardUiState2, (BusInfoCardUiState) obj, stepCardUIState4, UiEventHandler.Companion.a(function10));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            function3 = function2;
                            function4 = function1;
                            stepCardUIState = null;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$0 = stopTripPlannerTabType2;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$1 = bus2;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$2 = itineraryLiveInfoResult2;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$3 = function4;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$4 = function3;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$5 = legCardHeaderUiState;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$6 = stepCardUIState;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$7 = null;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$8 = null;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.Z$0 = z2;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.label = 3;
                            StopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1 stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$6 = stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1;
                            StopTripPlannerTabType stopTripPlannerTabType10 = stopTripPlannerTabType2;
                            TripPlannerLegAppModel.Bus bus10 = bus2;
                            objI = i(stopTripPlannerTabType10, pair3, pair4, bus10, stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$6);
                            stopTripPlannerResultUiStateFactory = this;
                            stopTripPlannerTabType4 = stopTripPlannerTabType10;
                            bus4 = bus10;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2 = stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$6;
                            if (objI != coroutineSingletons) {
                                itineraryLiveInfoResult3 = itineraryLiveInfoResult2;
                                function7 = function4;
                                obj = objI;
                                routeDetailsUiState = (RouteDetailsUiState) obj;
                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$0 = stopTripPlannerTabType4;
                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$1 = bus4;
                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$2 = itineraryLiveInfoResult3;
                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$3 = function7;
                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$4 = function3;
                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$5 = legCardHeaderUiState;
                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$6 = stepCardUIState;
                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$7 = routeDetailsUiState;
                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.Z$0 = z2;
                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.label = 4;
                                objB = stopTripPlannerResultUiStateFactory.b(z2, bus4, itineraryLiveInfoResult3, stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2);
                                if (objB != coroutineSingletons) {
                                    obj = objB;
                                    stepCardUIState2 = stepCardUIState;
                                    routeDetailsUiState2 = routeDetailsUiState;
                                    stopTripPlannerTabType5 = stopTripPlannerTabType4;
                                    bus5 = bus4;
                                    itineraryLiveInfoResult4 = itineraryLiveInfoResult3;
                                    function8 = function7;
                                    function9 = function3;
                                    legCardHeaderUiState3 = legCardHeaderUiState;
                                    etaAndFareInfoCardUiState = (EtaAndFareInfoCardUiState) obj;
                                    if (z2) {
                                    }
                                    stepCardUIState3 = stepCardUIState2;
                                    routeDetailsUiState3 = routeDetailsUiState2;
                                    etaAndFareInfoCardUiState2 = etaAndFareInfoCardUiState;
                                    alertTextWithIconUiState = null;
                                    if (stopTripPlannerTabType5 == StopTripPlannerTabType.DIRECT) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$0 = function8;
                                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$1 = legCardHeaderUiState3;
                                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$2 = stepCardUIState3;
                                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$3 = routeDetailsUiState3;
                                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$4 = etaAndFareInfoCardUiState2;
                                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$5 = alertTextWithIconUiState;
                                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$6 = null;
                                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$7 = null;
                                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$8 = null;
                                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.label = 6;
                                    objA = stopTripPlannerResultUiStateFactory.a(true, z3, bus5, function9, stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2);
                                    if (objA != coroutineSingletons) {
                                        routeDetailsUiState4 = routeDetailsUiState3;
                                        stepCardUIState4 = stepCardUIState3;
                                        obj = objA;
                                        function10 = function8;
                                        return new ItineraryLegItemUiState(legCardHeaderUiState3, routeDetailsUiState4, alertTextWithIconUiState, etaAndFareInfoCardUiState2, (BusInfoCardUiState) obj, stepCardUIState4, UiEventHandler.Companion.a(function10));
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                z2 = stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.Z$0;
                Function1 function11 = (Function1) stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$8;
                Function0 function12 = (Function0) stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$7;
                Function0 function13 = (Function0) stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$6;
                num2 = (Integer) stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$5;
                ItineraryLiveInfoResult itineraryLiveInfoResult5 = (ItineraryLiveInfoResult) stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$4;
                bus2 = (TripPlannerLegAppModel.Bus) stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$3;
                pair4 = (Pair) stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$2;
                Pair pair7 = (Pair) stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$1;
                stopTripPlannerTabType2 = (StopTripPlannerTabType) stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$0;
                ResultKt.b(obj);
                function2 = function11;
                function1 = function12;
                pair3 = pair7;
                objF = obj;
                function0 = function13;
                itineraryLiveInfoResult2 = itineraryLiveInfoResult5;
                legCardHeaderUiState = (LegCardHeaderUiState) objF;
                if (num2 != null) {
                    int iIntValue3 = num2.intValue();
                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$0 = stopTripPlannerTabType2;
                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$1 = pair3;
                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$2 = pair4;
                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$3 = bus2;
                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$4 = itineraryLiveInfoResult2;
                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$5 = function1;
                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$6 = function2;
                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$7 = legCardHeaderUiState;
                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$8 = null;
                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.Z$0 = z2;
                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.label = 2;
                    objJ = j(iIntValue3, function0, stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1);
                    if (objJ != coroutineSingletons) {
                        bus3 = bus2;
                        pair5 = pair4;
                        pair6 = pair3;
                        stopTripPlannerTabType3 = stopTripPlannerTabType2;
                        function5 = function2;
                        obj = objJ;
                        function6 = function1;
                        legCardHeaderUiState2 = legCardHeaderUiState;
                        legCardHeaderUiState = legCardHeaderUiState2;
                        stepCardUIState = (StepCardUIState) obj;
                        function4 = function6;
                        stopTripPlannerTabType2 = stopTripPlannerTabType3;
                        function3 = function5;
                        pair4 = pair5;
                        pair3 = pair6;
                        bus2 = bus3;
                        stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$0 = stopTripPlannerTabType2;
                        stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$1 = bus2;
                        stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$2 = itineraryLiveInfoResult2;
                        stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$3 = function4;
                        stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$4 = function3;
                        stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$5 = legCardHeaderUiState;
                        stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$6 = stepCardUIState;
                        stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$7 = null;
                        stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$8 = null;
                        stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.Z$0 = z2;
                        stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.label = 3;
                        StopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1 stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$7 = stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1;
                        StopTripPlannerTabType stopTripPlannerTabType11 = stopTripPlannerTabType2;
                        TripPlannerLegAppModel.Bus bus11 = bus2;
                        objI = i(stopTripPlannerTabType11, pair3, pair4, bus11, stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$7);
                        stopTripPlannerResultUiStateFactory = this;
                        stopTripPlannerTabType4 = stopTripPlannerTabType11;
                        bus4 = bus11;
                        stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2 = stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$7;
                        if (objI != coroutineSingletons) {
                            itineraryLiveInfoResult3 = itineraryLiveInfoResult2;
                            function7 = function4;
                            obj = objI;
                            routeDetailsUiState = (RouteDetailsUiState) obj;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$0 = stopTripPlannerTabType4;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$1 = bus4;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$2 = itineraryLiveInfoResult3;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$3 = function7;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$4 = function3;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$5 = legCardHeaderUiState;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$6 = stepCardUIState;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$7 = routeDetailsUiState;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.Z$0 = z2;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.label = 4;
                            objB = stopTripPlannerResultUiStateFactory.b(z2, bus4, itineraryLiveInfoResult3, stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2);
                            if (objB != coroutineSingletons) {
                                obj = objB;
                                stepCardUIState2 = stepCardUIState;
                                routeDetailsUiState2 = routeDetailsUiState;
                                stopTripPlannerTabType5 = stopTripPlannerTabType4;
                                bus5 = bus4;
                                itineraryLiveInfoResult4 = itineraryLiveInfoResult3;
                                function8 = function7;
                                function9 = function3;
                                legCardHeaderUiState3 = legCardHeaderUiState;
                                etaAndFareInfoCardUiState = (EtaAndFareInfoCardUiState) obj;
                                if (z2) {
                                }
                                stepCardUIState3 = stepCardUIState2;
                                routeDetailsUiState3 = routeDetailsUiState2;
                                etaAndFareInfoCardUiState2 = etaAndFareInfoCardUiState;
                                alertTextWithIconUiState = null;
                                if (stopTripPlannerTabType5 == StopTripPlannerTabType.DIRECT) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$0 = function8;
                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$1 = legCardHeaderUiState3;
                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$2 = stepCardUIState3;
                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$3 = routeDetailsUiState3;
                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$4 = etaAndFareInfoCardUiState2;
                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$5 = alertTextWithIconUiState;
                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$6 = null;
                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$7 = null;
                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$8 = null;
                                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.label = 6;
                                objA = stopTripPlannerResultUiStateFactory.a(true, z3, bus5, function9, stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2);
                                if (objA != coroutineSingletons) {
                                    routeDetailsUiState4 = routeDetailsUiState3;
                                    stepCardUIState4 = stepCardUIState3;
                                    obj = objA;
                                    function10 = function8;
                                    return new ItineraryLegItemUiState(legCardHeaderUiState3, routeDetailsUiState4, alertTextWithIconUiState, etaAndFareInfoCardUiState2, (BusInfoCardUiState) obj, stepCardUIState4, UiEventHandler.Companion.a(function10));
                                }
                            }
                        }
                    }
                } else {
                    function3 = function2;
                    function4 = function1;
                    stepCardUIState = null;
                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$0 = stopTripPlannerTabType2;
                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$1 = bus2;
                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$2 = itineraryLiveInfoResult2;
                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$3 = function4;
                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$4 = function3;
                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$5 = legCardHeaderUiState;
                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$6 = stepCardUIState;
                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$7 = null;
                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$8 = null;
                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.Z$0 = z2;
                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.label = 3;
                    StopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1 stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$8 = stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1;
                    StopTripPlannerTabType stopTripPlannerTabType12 = stopTripPlannerTabType2;
                    TripPlannerLegAppModel.Bus bus12 = bus2;
                    objI = i(stopTripPlannerTabType12, pair3, pair4, bus12, stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$8);
                    stopTripPlannerResultUiStateFactory = this;
                    stopTripPlannerTabType4 = stopTripPlannerTabType12;
                    bus4 = bus12;
                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2 = stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$8;
                    if (objI != coroutineSingletons) {
                        itineraryLiveInfoResult3 = itineraryLiveInfoResult2;
                        function7 = function4;
                        obj = objI;
                        routeDetailsUiState = (RouteDetailsUiState) obj;
                        stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$0 = stopTripPlannerTabType4;
                        stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$1 = bus4;
                        stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$2 = itineraryLiveInfoResult3;
                        stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$3 = function7;
                        stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$4 = function3;
                        stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$5 = legCardHeaderUiState;
                        stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$6 = stepCardUIState;
                        stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$7 = routeDetailsUiState;
                        stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.Z$0 = z2;
                        stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.label = 4;
                        objB = stopTripPlannerResultUiStateFactory.b(z2, bus4, itineraryLiveInfoResult3, stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2);
                        if (objB != coroutineSingletons) {
                            obj = objB;
                            stepCardUIState2 = stepCardUIState;
                            routeDetailsUiState2 = routeDetailsUiState;
                            stopTripPlannerTabType5 = stopTripPlannerTabType4;
                            bus5 = bus4;
                            itineraryLiveInfoResult4 = itineraryLiveInfoResult3;
                            function8 = function7;
                            function9 = function3;
                            legCardHeaderUiState3 = legCardHeaderUiState;
                            etaAndFareInfoCardUiState = (EtaAndFareInfoCardUiState) obj;
                            if (z2) {
                            }
                            stepCardUIState3 = stepCardUIState2;
                            routeDetailsUiState3 = routeDetailsUiState2;
                            etaAndFareInfoCardUiState2 = etaAndFareInfoCardUiState;
                            alertTextWithIconUiState = null;
                            if (stopTripPlannerTabType5 == StopTripPlannerTabType.DIRECT) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$0 = function8;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$1 = legCardHeaderUiState3;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$2 = stepCardUIState3;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$3 = routeDetailsUiState3;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$4 = etaAndFareInfoCardUiState2;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$5 = alertTextWithIconUiState;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$6 = null;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$7 = null;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$8 = null;
                            stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.label = 6;
                            objA = stopTripPlannerResultUiStateFactory.a(true, z3, bus5, function9, stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2);
                            if (objA != coroutineSingletons) {
                                routeDetailsUiState4 = routeDetailsUiState3;
                                stepCardUIState4 = stepCardUIState3;
                                obj = objA;
                                function10 = function8;
                                return new ItineraryLegItemUiState(legCardHeaderUiState3, routeDetailsUiState4, alertTextWithIconUiState, etaAndFareInfoCardUiState2, (BusInfoCardUiState) obj, stepCardUIState4, UiEventHandler.Companion.a(function10));
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 2:
                z2 = stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.Z$0;
                legCardHeaderUiState2 = (LegCardHeaderUiState) stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$7;
                function5 = (Function1) stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$6;
                function6 = (Function0) stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$5;
                itineraryLiveInfoResult2 = (ItineraryLiveInfoResult) stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$4;
                bus3 = (TripPlannerLegAppModel.Bus) stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$3;
                pair5 = (Pair) stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$2;
                pair6 = (Pair) stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$1;
                stopTripPlannerTabType3 = (StopTripPlannerTabType) stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$0;
                ResultKt.b(obj);
                legCardHeaderUiState = legCardHeaderUiState2;
                stepCardUIState = (StepCardUIState) obj;
                function4 = function6;
                stopTripPlannerTabType2 = stopTripPlannerTabType3;
                function3 = function5;
                pair4 = pair5;
                pair3 = pair6;
                bus2 = bus3;
                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$0 = stopTripPlannerTabType2;
                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$1 = bus2;
                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$2 = itineraryLiveInfoResult2;
                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$3 = function4;
                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$4 = function3;
                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$5 = legCardHeaderUiState;
                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$6 = stepCardUIState;
                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$7 = null;
                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$8 = null;
                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.Z$0 = z2;
                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.label = 3;
                StopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1 stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$9 = stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1;
                StopTripPlannerTabType stopTripPlannerTabType13 = stopTripPlannerTabType2;
                TripPlannerLegAppModel.Bus bus13 = bus2;
                objI = i(stopTripPlannerTabType13, pair3, pair4, bus13, stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$9);
                stopTripPlannerResultUiStateFactory = this;
                stopTripPlannerTabType4 = stopTripPlannerTabType13;
                bus4 = bus13;
                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2 = stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$9;
                if (objI != coroutineSingletons) {
                    itineraryLiveInfoResult3 = itineraryLiveInfoResult2;
                    function7 = function4;
                    obj = objI;
                    routeDetailsUiState = (RouteDetailsUiState) obj;
                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$0 = stopTripPlannerTabType4;
                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$1 = bus4;
                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$2 = itineraryLiveInfoResult3;
                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$3 = function7;
                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$4 = function3;
                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$5 = legCardHeaderUiState;
                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$6 = stepCardUIState;
                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$7 = routeDetailsUiState;
                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.Z$0 = z2;
                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.label = 4;
                    objB = stopTripPlannerResultUiStateFactory.b(z2, bus4, itineraryLiveInfoResult3, stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2);
                    if (objB != coroutineSingletons) {
                        obj = objB;
                        stepCardUIState2 = stepCardUIState;
                        routeDetailsUiState2 = routeDetailsUiState;
                        stopTripPlannerTabType5 = stopTripPlannerTabType4;
                        bus5 = bus4;
                        itineraryLiveInfoResult4 = itineraryLiveInfoResult3;
                        function8 = function7;
                        function9 = function3;
                        legCardHeaderUiState3 = legCardHeaderUiState;
                        etaAndFareInfoCardUiState = (EtaAndFareInfoCardUiState) obj;
                        if (z2) {
                        }
                        stepCardUIState3 = stepCardUIState2;
                        routeDetailsUiState3 = routeDetailsUiState2;
                        etaAndFareInfoCardUiState2 = etaAndFareInfoCardUiState;
                        alertTextWithIconUiState = null;
                        if (stopTripPlannerTabType5 == StopTripPlannerTabType.DIRECT) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$0 = function8;
                        stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$1 = legCardHeaderUiState3;
                        stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$2 = stepCardUIState3;
                        stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$3 = routeDetailsUiState3;
                        stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$4 = etaAndFareInfoCardUiState2;
                        stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$5 = alertTextWithIconUiState;
                        stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$6 = null;
                        stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$7 = null;
                        stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$8 = null;
                        stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.label = 6;
                        objA = stopTripPlannerResultUiStateFactory.a(true, z3, bus5, function9, stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2);
                        if (objA != coroutineSingletons) {
                            routeDetailsUiState4 = routeDetailsUiState3;
                            stepCardUIState4 = stepCardUIState3;
                            obj = objA;
                            function10 = function8;
                            return new ItineraryLegItemUiState(legCardHeaderUiState3, routeDetailsUiState4, alertTextWithIconUiState, etaAndFareInfoCardUiState2, (BusInfoCardUiState) obj, stepCardUIState4, UiEventHandler.Companion.a(function10));
                        }
                    }
                }
                return coroutineSingletons;
            case 3:
                z2 = stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.Z$0;
                stepCardUIState = (StepCardUIState) stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$6;
                LegCardHeaderUiState legCardHeaderUiState4 = (LegCardHeaderUiState) stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$5;
                function3 = (Function1) stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$4;
                function7 = (Function0) stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$3;
                itineraryLiveInfoResult3 = (ItineraryLiveInfoResult) stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$2;
                bus4 = (TripPlannerLegAppModel.Bus) stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$1;
                stopTripPlannerTabType4 = (StopTripPlannerTabType) stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$0;
                ResultKt.b(obj);
                legCardHeaderUiState = legCardHeaderUiState4;
                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2 = stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1;
                stopTripPlannerResultUiStateFactory = this;
                routeDetailsUiState = (RouteDetailsUiState) obj;
                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$0 = stopTripPlannerTabType4;
                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$1 = bus4;
                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$2 = itineraryLiveInfoResult3;
                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$3 = function7;
                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$4 = function3;
                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$5 = legCardHeaderUiState;
                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$6 = stepCardUIState;
                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$7 = routeDetailsUiState;
                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.Z$0 = z2;
                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.label = 4;
                objB = stopTripPlannerResultUiStateFactory.b(z2, bus4, itineraryLiveInfoResult3, stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2);
                if (objB != coroutineSingletons) {
                    obj = objB;
                    stepCardUIState2 = stepCardUIState;
                    routeDetailsUiState2 = routeDetailsUiState;
                    stopTripPlannerTabType5 = stopTripPlannerTabType4;
                    bus5 = bus4;
                    itineraryLiveInfoResult4 = itineraryLiveInfoResult3;
                    function8 = function7;
                    function9 = function3;
                    legCardHeaderUiState3 = legCardHeaderUiState;
                    etaAndFareInfoCardUiState = (EtaAndFareInfoCardUiState) obj;
                    if (z2) {
                    }
                    stepCardUIState3 = stepCardUIState2;
                    routeDetailsUiState3 = routeDetailsUiState2;
                    etaAndFareInfoCardUiState2 = etaAndFareInfoCardUiState;
                    alertTextWithIconUiState = null;
                    if (stopTripPlannerTabType5 == StopTripPlannerTabType.DIRECT) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$0 = function8;
                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$1 = legCardHeaderUiState3;
                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$2 = stepCardUIState3;
                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$3 = routeDetailsUiState3;
                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$4 = etaAndFareInfoCardUiState2;
                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$5 = alertTextWithIconUiState;
                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$6 = null;
                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$7 = null;
                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$8 = null;
                    stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.label = 6;
                    objA = stopTripPlannerResultUiStateFactory.a(true, z3, bus5, function9, stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2);
                    if (objA != coroutineSingletons) {
                        routeDetailsUiState4 = routeDetailsUiState3;
                        stepCardUIState4 = stepCardUIState3;
                        obj = objA;
                        function10 = function8;
                        return new ItineraryLegItemUiState(legCardHeaderUiState3, routeDetailsUiState4, alertTextWithIconUiState, etaAndFareInfoCardUiState2, (BusInfoCardUiState) obj, stepCardUIState4, UiEventHandler.Companion.a(function10));
                    }
                }
                return coroutineSingletons;
            case 4:
                z2 = stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.Z$0;
                routeDetailsUiState2 = (RouteDetailsUiState) stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$7;
                StepCardUIState stepCardUIState5 = (StepCardUIState) stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$6;
                legCardHeaderUiState3 = (LegCardHeaderUiState) stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$5;
                function9 = (Function1) stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$4;
                function8 = (Function0) stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$3;
                itineraryLiveInfoResult4 = (ItineraryLiveInfoResult) stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$2;
                bus5 = (TripPlannerLegAppModel.Bus) stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$1;
                stopTripPlannerTabType5 = (StopTripPlannerTabType) stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$0;
                ResultKt.b(obj);
                StopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1 stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$10 = stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1;
                stopTripPlannerResultUiStateFactory = this;
                stepCardUIState2 = stepCardUIState5;
                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2 = stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$10;
                etaAndFareInfoCardUiState = (EtaAndFareInfoCardUiState) obj;
                if (z2) {
                }
                stepCardUIState3 = stepCardUIState2;
                routeDetailsUiState3 = routeDetailsUiState2;
                etaAndFareInfoCardUiState2 = etaAndFareInfoCardUiState;
                alertTextWithIconUiState = null;
                if (stopTripPlannerTabType5 == StopTripPlannerTabType.DIRECT) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$0 = function8;
                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$1 = legCardHeaderUiState3;
                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$2 = stepCardUIState3;
                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$3 = routeDetailsUiState3;
                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$4 = etaAndFareInfoCardUiState2;
                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$5 = alertTextWithIconUiState;
                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$6 = null;
                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$7 = null;
                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$8 = null;
                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.label = 6;
                objA = stopTripPlannerResultUiStateFactory.a(true, z3, bus5, function9, stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2);
                if (objA != coroutineSingletons) {
                    routeDetailsUiState4 = routeDetailsUiState3;
                    stepCardUIState4 = stepCardUIState3;
                    obj = objA;
                    function10 = function8;
                    return new ItineraryLegItemUiState(legCardHeaderUiState3, routeDetailsUiState4, alertTextWithIconUiState, etaAndFareInfoCardUiState2, (BusInfoCardUiState) obj, stepCardUIState4, UiEventHandler.Companion.a(function10));
                }
                return coroutineSingletons;
            case 5:
                etaAndFareInfoCardUiState3 = (EtaAndFareInfoCardUiState) stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$8;
                routeDetailsUiState2 = (RouteDetailsUiState) stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$7;
                StepCardUIState stepCardUIState6 = (StepCardUIState) stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$6;
                legCardHeaderUiState3 = (LegCardHeaderUiState) stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$5;
                function9 = (Function1) stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$4;
                function8 = (Function0) stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$3;
                bus6 = (TripPlannerLegAppModel.Bus) stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$1;
                stopTripPlannerTabType6 = (StopTripPlannerTabType) stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$0;
                ResultKt.b(obj);
                StopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1 stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$11 = stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1;
                stopTripPlannerResultUiStateFactory = this;
                stepCardUIState2 = stepCardUIState6;
                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2 = stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$11;
                AlertTextWithIconUiState alertTextWithIconUiState3 = (AlertTextWithIconUiState) obj;
                stepCardUIState3 = stepCardUIState2;
                routeDetailsUiState3 = routeDetailsUiState2;
                etaAndFareInfoCardUiState2 = etaAndFareInfoCardUiState3;
                alertTextWithIconUiState = alertTextWithIconUiState3;
                stopTripPlannerTabType5 = stopTripPlannerTabType6;
                bus5 = bus6;
                if (stopTripPlannerTabType5 == StopTripPlannerTabType.DIRECT) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$0 = function8;
                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$1 = legCardHeaderUiState3;
                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$2 = stepCardUIState3;
                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$3 = routeDetailsUiState3;
                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$4 = etaAndFareInfoCardUiState2;
                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$5 = alertTextWithIconUiState;
                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$6 = null;
                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$7 = null;
                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.L$8 = null;
                stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2.label = 6;
                objA = stopTripPlannerResultUiStateFactory.a(true, z3, bus5, function9, stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$2);
                if (objA != coroutineSingletons) {
                    routeDetailsUiState4 = routeDetailsUiState3;
                    stepCardUIState4 = stepCardUIState3;
                    obj = objA;
                    function10 = function8;
                    return new ItineraryLegItemUiState(legCardHeaderUiState3, routeDetailsUiState4, alertTextWithIconUiState, etaAndFareInfoCardUiState2, (BusInfoCardUiState) obj, stepCardUIState4, UiEventHandler.Companion.a(function10));
                }
                return coroutineSingletons;
            case 6:
                alertTextWithIconUiState = (AlertTextWithIconUiState) stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$5;
                etaAndFareInfoCardUiState2 = (EtaAndFareInfoCardUiState) stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$4;
                routeDetailsUiState4 = (RouteDetailsUiState) stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$3;
                stepCardUIState4 = (StepCardUIState) stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$2;
                legCardHeaderUiState3 = (LegCardHeaderUiState) stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$1;
                function10 = (Function0) stopTripPlannerResultUiStateFactory$createItineraryLegItemUiState$1.L$0;
                ResultKt.b(obj);
                return new ItineraryLegItemUiState(legCardHeaderUiState3, routeDetailsUiState4, alertTextWithIconUiState, etaAndFareInfoCardUiState2, (BusInfoCardUiState) obj, stepCardUIState4, UiEventHandler.Companion.a(function10));
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:218:0x01ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x01be  */
    /* JADX WARN: Code duplicated, block: B:66:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:72:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:73:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [app.chalo.livetracking.stoptripplannerresult.uistate.StopTripPlannerResultUiStateFactory] */
    /* JADX WARN: Type inference failed for: r0v100 */
    /* JADX WARN: Type inference failed for: r0v101 */
    /* JADX WARN: Type inference failed for: r0v102 */
    /* JADX WARN: Type inference failed for: r0v103 */
    /* JADX WARN: Type inference failed for: r0v104 */
    /* JADX WARN: Type inference failed for: r0v105 */
    /* JADX WARN: Type inference failed for: r0v106 */
    /* JADX WARN: Type inference failed for: r0v55, types: [app.chalo.livetracking.stoptripplannerresult.uistate.StopTripPlannerResultUiStateFactory] */
    /* JADX WARN: Type inference failed for: r0v99 */
    /* JADX WARN: Type inference failed for: r34v2, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v27, types: [app.chalo.livetracking.stoptripplannerresult.uistate.ItineraryCardCtaUIState] */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r6v7, types: [kotlin.Pair] */
    /* JADX WARN: Type inference failed for: r7v7, types: [kotlin.Pair] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:192:0x0420 -> B:193:0x0433). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x018c -> B:194:0x044a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object e(app.chalo.livetracking.stoptripplannerresult.StopTripPlannerLocationType r33, app.chalo.livetracking.stoptripplannerresult.StopTripPlannerLocationType r34, app.chalo.livetracking.stoptripplannerresult.StopTripPlannerTabType r35, app.chalo.livetracking.stoptripplannerresult.StopTripPlannerItineraryInfoHolder r36, app.chalo.livetracking.tripplanner.domain.ItineraryLiveInfoResult r37, kotlin.jvm.functions.Function1 r38, kotlin.coroutines.jvm.internal.ContinuationImpl r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.stoptripplannerresult.uistate.StopTripPlannerResultUiStateFactory.e(app.chalo.livetracking.stoptripplannerresult.StopTripPlannerLocationType, app.chalo.livetracking.stoptripplannerresult.StopTripPlannerLocationType, app.chalo.livetracking.stoptripplannerresult.StopTripPlannerTabType, app.chalo.livetracking.stoptripplannerresult.StopTripPlannerItineraryInfoHolder, app.chalo.livetracking.tripplanner.domain.ItineraryLiveInfoResult, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object f(TripPlannerLegAppModel.Bus bus, boolean z, ContinuationImpl continuationImpl) {
        StopTripPlannerResultUiStateFactory$createLegCardHeader$1 stopTripPlannerResultUiStateFactory$createLegCardHeader$1;
        ImageUIState imageUIState;
        String str;
        if (continuationImpl instanceof StopTripPlannerResultUiStateFactory$createLegCardHeader$1) {
            stopTripPlannerResultUiStateFactory$createLegCardHeader$1 = (StopTripPlannerResultUiStateFactory$createLegCardHeader$1) continuationImpl;
            int i = stopTripPlannerResultUiStateFactory$createLegCardHeader$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopTripPlannerResultUiStateFactory$createLegCardHeader$1.label = i - Integer.MIN_VALUE;
            } else {
                stopTripPlannerResultUiStateFactory$createLegCardHeader$1 = new StopTripPlannerResultUiStateFactory$createLegCardHeader$1(this, continuationImpl);
            }
        } else {
            stopTripPlannerResultUiStateFactory$createLegCardHeader$1 = new StopTripPlannerResultUiStateFactory$createLegCardHeader$1(this, continuationImpl);
        }
        Object objB = stopTripPlannerResultUiStateFactory$createLegCardHeader$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = stopTripPlannerResultUiStateFactory$createLegCardHeader$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            ImageUIState imageUIState2 = xs.z(bus) ? new ImageUIState(IconType.BUS_TRIP_PLANNER, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254) : new ImageUIState(IconType.BUS_TRIP_PLANNER, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254);
            StringProvider stringProvider = this.f4619a;
            if (z) {
                stopTripPlannerResultUiStateFactory$createLegCardHeader$1.L$0 = imageUIState2;
                stopTripPlannerResultUiStateFactory$createLegCardHeader$1.label = 1;
                objB = stringProvider.b(StringEnum.TAKE_FIRST_BUS, new Object[0], stopTripPlannerResultUiStateFactory$createLegCardHeader$1);
                if (objB != coroutineSingletons) {
                    imageUIState = imageUIState2;
                    str = (String) objB;
                }
            } else {
                if (z) {
                    throw new NoWhenBranchMatchedException();
                }
                stopTripPlannerResultUiStateFactory$createLegCardHeader$1.L$0 = imageUIState2;
                stopTripPlannerResultUiStateFactory$createLegCardHeader$1.label = 2;
                objB = stringProvider.b(StringEnum.CHANGE_BUS, new Object[0], stopTripPlannerResultUiStateFactory$createLegCardHeader$1);
                if (objB != coroutineSingletons) {
                    imageUIState = imageUIState2;
                    str = (String) objB;
                }
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            imageUIState = (ImageUIState) stopTripPlannerResultUiStateFactory$createLegCardHeader$1.L$0;
            ResultKt.b(objB);
            str = (String) objB;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            imageUIState = (ImageUIState) stopTripPlannerResultUiStateFactory$createLegCardHeader$1.L$0;
            ResultKt.b(objB);
            str = (String) objB;
        }
        return new LegCardHeaderUiState(imageUIState, new TextUIState.ChaloTextUIState(str, TypographyToUiTextStyle.h5.getTextStyle(), ChaloColorToken.Black.f9759a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object g(ItineraryEtaInfo itineraryEtaInfo, ContinuationImpl continuationImpl) {
        StopTripPlannerResultUiStateFactory$createLiveEtaDisclaimer$1 stopTripPlannerResultUiStateFactory$createLiveEtaDisclaimer$1;
        AlertTextWithIconSpec alertTextWithIconSpec;
        ImageUIState imageUIState;
        AlertTextWithIconSpec alertTextWithIconSpec2;
        ImageUIState imageUIState2;
        if (continuationImpl instanceof StopTripPlannerResultUiStateFactory$createLiveEtaDisclaimer$1) {
            stopTripPlannerResultUiStateFactory$createLiveEtaDisclaimer$1 = (StopTripPlannerResultUiStateFactory$createLiveEtaDisclaimer$1) continuationImpl;
            int i = stopTripPlannerResultUiStateFactory$createLiveEtaDisclaimer$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopTripPlannerResultUiStateFactory$createLiveEtaDisclaimer$1.label = i - Integer.MIN_VALUE;
            } else {
                stopTripPlannerResultUiStateFactory$createLiveEtaDisclaimer$1 = new StopTripPlannerResultUiStateFactory$createLiveEtaDisclaimer$1(this, continuationImpl);
            }
        } else {
            stopTripPlannerResultUiStateFactory$createLiveEtaDisclaimer$1 = new StopTripPlannerResultUiStateFactory$createLiveEtaDisclaimer$1(this, continuationImpl);
        }
        Object objB = stopTripPlannerResultUiStateFactory$createLiveEtaDisclaimer$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = stopTripPlannerResultUiStateFactory$createLiveEtaDisclaimer$1.label;
        ChaloColorToken.ShadyGray shadyGray = ChaloColorToken.ShadyGray.f9851a;
        if (i2 != 0) {
            if (i2 == 1) {
                imageUIState2 = (ImageUIState) stopTripPlannerResultUiStateFactory$createLiveEtaDisclaimer$1.L$1;
                alertTextWithIconSpec2 = (AlertTextWithIconSpec) stopTripPlannerResultUiStateFactory$createLiveEtaDisclaimer$1.L$0;
                ResultKt.b(objB);
                return new AlertTextWithIconUiState(alertTextWithIconSpec2, imageUIState2, new TextUIState.ChaloTextUIState((String) objB, TypographyToUiTextStyle.overline.getTextStyle(), shadyGray, 1, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, UITextOverflow.Ellipsis, (UIFontStyle) null, (String) null, 7152));
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            imageUIState = (ImageUIState) stopTripPlannerResultUiStateFactory$createLiveEtaDisclaimer$1.L$1;
            alertTextWithIconSpec = (AlertTextWithIconSpec) stopTripPlannerResultUiStateFactory$createLiveEtaDisclaimer$1.L$0;
            ResultKt.b(objB);
            return new AlertTextWithIconUiState(alertTextWithIconSpec, imageUIState, new TextUIState.ChaloTextUIState((String) objB, TypographyToUiTextStyle.overline.getTextStyle(), shadyGray, 1, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, UITextOverflow.Ellipsis, (UIFontStyle) null, (String) null, 7152));
        }
        ResultKt.b(objB);
        boolean z = itineraryEtaInfo.d;
        Long l = itineraryEtaInfo.e;
        StringProvider stringProvider = this.f4619a;
        if (z) {
            AlertTextWithIconSpec alertTextWithIconSpec3 = new AlertTextWithIconSpec(ChaloThemeHelper.a().d, 11);
            ImageUIState imageUIState3 = new ImageUIState(IconType.IC_INFO, (String) null, ChaloColorToken.DarkRed.f9786a, (ImageUISize) null, (UIContentScale) null, 180.0f, (UiEventHandler) null, 186);
            stopTripPlannerResultUiStateFactory$createLiveEtaDisclaimer$1.L$0 = alertTextWithIconSpec3;
            stopTripPlannerResultUiStateFactory$createLiveEtaDisclaimer$1.L$1 = imageUIState3;
            stopTripPlannerResultUiStateFactory$createLiveEtaDisclaimer$1.label = 1;
            objB = stringProvider.b(StringEnum.HALTED, new Object[0], stopTripPlannerResultUiStateFactory$createLiveEtaDisclaimer$1);
            if (objB != coroutineSingletons) {
                alertTextWithIconSpec2 = alertTextWithIconSpec3;
                imageUIState2 = imageUIState3;
                return new AlertTextWithIconUiState(alertTextWithIconSpec2, imageUIState2, new TextUIState.ChaloTextUIState((String) objB, TypographyToUiTextStyle.overline.getTextStyle(), shadyGray, 1, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, UITextOverflow.Ellipsis, (UIFontStyle) null, (String) null, 7152));
            }
        } else {
            if (l == null) {
                return null;
            }
            AlertTextWithIconSpec alertTextWithIconSpec4 = new AlertTextWithIconSpec(ChaloThemeHelper.a().d, 11);
            ImageUIState imageUIState4 = new ImageUIState(IconType.ALERT_ICON_ORANGE, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254);
            StringEnum stringEnum = StringEnum.LAST_UPDATED;
            Object[] objArr = {String.valueOf(l.longValue())};
            stopTripPlannerResultUiStateFactory$createLiveEtaDisclaimer$1.L$0 = alertTextWithIconSpec4;
            stopTripPlannerResultUiStateFactory$createLiveEtaDisclaimer$1.L$1 = imageUIState4;
            stopTripPlannerResultUiStateFactory$createLiveEtaDisclaimer$1.label = 2;
            Object objB2 = stringProvider.b(stringEnum, objArr, stopTripPlannerResultUiStateFactory$createLiveEtaDisclaimer$1);
            if (objB2 != coroutineSingletons) {
                alertTextWithIconSpec = alertTextWithIconSpec4;
                objB = objB2;
                imageUIState = imageUIState4;
                return new AlertTextWithIconUiState(alertTextWithIconSpec, imageUIState, new TextUIState.ChaloTextUIState((String) objB, TypographyToUiTextStyle.overline.getTextStyle(), shadyGray, 1, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, UITextOverflow.Ellipsis, (UIFontStyle) null, (String) null, 7152));
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Failed to calculate best type for var: r5v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v4 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v4 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v6 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v4 ??, new type: char
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public final java.lang.Object h(app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel.Bus r26, app.chalo.livetracking.tripplanner.domain.ItineraryLiveInfoResult r27, kotlin.coroutines.jvm.internal.ContinuationImpl r28) {
        /*
            Method dump skipped, instruction units count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.stoptripplannerresult.uistate.StopTripPlannerResultUiStateFactory.h(app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel$Bus, app.chalo.livetracking.tripplanner.domain.ItineraryLiveInfoResult, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0168  */
    /* JADX WARN: Code duplicated, block: B:29:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:31:0x0210  */
    /* JADX WARN: Code duplicated, block: B:34:0x0216 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object i(StopTripPlannerTabType stopTripPlannerTabType, Pair pair, Pair pair2, TripPlannerLegAppModel.Bus bus, ContinuationImpl continuationImpl) {
        StopTripPlannerResultUiStateFactory$createRouteDetails$1 stopTripPlannerResultUiStateFactory$createRouteDetails$1;
        String str;
        StringProvider stringProvider;
        String str2;
        int i;
        StopTripPlannerTabType stopTripPlannerTabType2;
        Pair pair3;
        TripPlannerLegAppModel.Bus bus2;
        TextUIState.StyledTextUIState styledTextUIState;
        Object objB;
        StyledTextDataUIState[] styledTextDataUIStateArr;
        StyledTextDataUIState[] styledTextDataUIStateArr2;
        TripPlannerLegAppModel.Bus bus3;
        int i2;
        Pair pair4;
        Object obj;
        TextUIState.StyledTextUIState styledTextUIState2;
        StyledTextDataUIState[] styledTextDataUIStateArr3;
        int i3;
        Object objB2;
        StopTripPlannerTabType stopTripPlannerTabType3;
        StyledTextDataUIState[] styledTextDataUIStateArr4;
        StyledTextDataUIState[] styledTextDataUIStateArr5;
        Pair pair5;
        TripPlannerLegAppModel.Bus bus4;
        if (continuationImpl instanceof StopTripPlannerResultUiStateFactory$createRouteDetails$1) {
            stopTripPlannerResultUiStateFactory$createRouteDetails$1 = (StopTripPlannerResultUiStateFactory$createRouteDetails$1) continuationImpl;
            int i4 = stopTripPlannerResultUiStateFactory$createRouteDetails$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                stopTripPlannerResultUiStateFactory$createRouteDetails$1.label = i4 - Integer.MIN_VALUE;
            } else {
                stopTripPlannerResultUiStateFactory$createRouteDetails$1 = new StopTripPlannerResultUiStateFactory$createRouteDetails$1(this, continuationImpl);
            }
        } else {
            stopTripPlannerResultUiStateFactory$createRouteDetails$1 = new StopTripPlannerResultUiStateFactory$createRouteDetails$1(this, continuationImpl);
        }
        Object obj2 = stopTripPlannerResultUiStateFactory$createRouteDetails$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = stopTripPlannerResultUiStateFactory$createRouteDetails$1.label;
        ChaloColorToken.ShadyGray shadyGray = ChaloColorToken.ShadyGray.f9851a;
        StringProvider stringProvider2 = this.f4619a;
        ChaloColorToken.Black black = ChaloColorToken.Black.f9759a;
        if (i5 != 0) {
            if (i5 == 1) {
                int i6 = stopTripPlannerResultUiStateFactory$createRouteDetails$1.I$0;
                StyledTextDataUIState[] styledTextDataUIStateArr6 = (StyledTextDataUIState[]) stopTripPlannerResultUiStateFactory$createRouteDetails$1.L$5;
                StyledTextDataUIState[] styledTextDataUIStateArr7 = (StyledTextDataUIState[]) stopTripPlannerResultUiStateFactory$createRouteDetails$1.L$4;
                pair4 = (Pair) stopTripPlannerResultUiStateFactory$createRouteDetails$1.L$3;
                TripPlannerLegAppModel.Bus bus5 = (TripPlannerLegAppModel.Bus) stopTripPlannerResultUiStateFactory$createRouteDetails$1.L$2;
                pair3 = (Pair) stopTripPlannerResultUiStateFactory$createRouteDetails$1.L$1;
                StopTripPlannerTabType stopTripPlannerTabType4 = (StopTripPlannerTabType) stopTripPlannerResultUiStateFactory$createRouteDetails$1.L$0;
                ResultKt.b(obj2);
                i2 = i6;
                styledTextDataUIStateArr = styledTextDataUIStateArr6;
                styledTextDataUIStateArr2 = styledTextDataUIStateArr7;
                stopTripPlannerTabType2 = stopTripPlannerTabType4;
                bus3 = bus5;
                i = 0;
                objB = obj2;
                str2 = " ";
            } else {
                if (i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i3 = stopTripPlannerResultUiStateFactory$createRouteDetails$1.I$0;
                styledTextDataUIStateArr4 = (StyledTextDataUIState[]) stopTripPlannerResultUiStateFactory$createRouteDetails$1.L$5;
                styledTextDataUIStateArr5 = (StyledTextDataUIState[]) stopTripPlannerResultUiStateFactory$createRouteDetails$1.L$4;
                pair5 = (Pair) stopTripPlannerResultUiStateFactory$createRouteDetails$1.L$3;
                styledTextUIState = (TextUIState.StyledTextUIState) stopTripPlannerResultUiStateFactory$createRouteDetails$1.L$2;
                TripPlannerLegAppModel.Bus bus6 = (TripPlannerLegAppModel.Bus) stopTripPlannerResultUiStateFactory$createRouteDetails$1.L$1;
                stopTripPlannerTabType3 = (StopTripPlannerTabType) stopTripPlannerResultUiStateFactory$createRouteDetails$1.L$0;
                ResultKt.b(obj2);
                objB2 = obj2;
                str = "toLowerCase(...)";
                str2 = " ";
                bus4 = bus6;
            }
            TextUIState.StyledTextUIState styledTextUIState3 = styledTextUIState;
            int i7 = i3;
            String lowerCase = ((String) objB2).toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, str);
            styledTextDataUIStateArr4[i7] = new StyledTextDataUIState(str2 + lowerCase + str2 + pair5.e(), shadyGray, null, TypographyToUiTextStyle.overline.getTextStyle(), null, null, null, 1012);
            obj = null;
            styledTextUIState2 = new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr5), null, UITextOverflow.Ellipsis, 18);
            stopTripPlannerTabType2 = stopTripPlannerTabType3;
            styledTextUIState = styledTextUIState3;
            bus2 = bus4;
            if (stopTripPlannerTabType2 != StopTripPlannerTabType.DIRECT && styledTextUIState == null && styledTextUIState2 == null) {
                return obj;
            }
            String str3 = bus2.s.b;
            TypographyToUiTextStyle typographyToUiTextStyle = TypographyToUiTextStyle.caption;
            UITextStyle textStyle = typographyToUiTextStyle.getTextStyle();
            UITextOverflow uITextOverflow = UITextOverflow.Ellipsis;
            return new RouteDetailsUiState(new StopInfoUiState(new TextUIState.ChaloTextUIState(str3, textStyle, (ChaloColorToken) null, 1, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, uITextOverflow, (UIFontStyle) null, (String) null, 7156), styledTextUIState), new StopInfoUiState(new TextUIState.ChaloTextUIState(bus2.t.b, typographyToUiTextStyle.getTextStyle(), (ChaloColorToken) null, 1, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, uITextOverflow, (UIFontStyle) null, (String) null, 7156), styledTextUIState2));
        }
        ResultKt.b(obj2);
        if (pair == null) {
            str = "toLowerCase(...)";
            stringProvider = stringProvider2;
            str2 = " ";
            black = black;
            i = 0;
            stopTripPlannerTabType2 = stopTripPlannerTabType;
            pair3 = pair2;
            bus2 = bus;
            styledTextUIState = null;
            if (pair3 != null) {
                styledTextDataUIStateArr3 = new StyledTextDataUIState[2];
                int i8 = i;
                styledTextDataUIStateArr3[i8] = new StyledTextDataUIState(DistanceUtils.a(((Number) pair3.d()).doubleValue() / 1000.0d), black, UIFontWeight.SemiBold, TypographyToUiTextStyle.overline.getTextStyle(), null, null, null, 1008);
                stopTripPlannerResultUiStateFactory$createRouteDetails$1.L$0 = stopTripPlannerTabType2;
                stopTripPlannerResultUiStateFactory$createRouteDetails$1.L$1 = bus2;
                stopTripPlannerResultUiStateFactory$createRouteDetails$1.L$2 = styledTextUIState;
                stopTripPlannerResultUiStateFactory$createRouteDetails$1.L$3 = pair3;
                stopTripPlannerResultUiStateFactory$createRouteDetails$1.L$4 = styledTextDataUIStateArr3;
                stopTripPlannerResultUiStateFactory$createRouteDetails$1.L$5 = styledTextDataUIStateArr3;
                i3 = 1;
                stopTripPlannerResultUiStateFactory$createRouteDetails$1.I$0 = 1;
                stopTripPlannerResultUiStateFactory$createRouteDetails$1.label = 2;
                objB2 = stringProvider.b(StringEnum.FROM, new Object[i8], stopTripPlannerResultUiStateFactory$createRouteDetails$1);
                if (objB2 != coroutineSingletons) {
                    stopTripPlannerTabType3 = stopTripPlannerTabType2;
                    styledTextDataUIStateArr4 = styledTextDataUIStateArr3;
                    styledTextDataUIStateArr5 = styledTextDataUIStateArr4;
                    pair5 = pair3;
                    bus4 = bus2;
                    TextUIState.StyledTextUIState styledTextUIState4 = styledTextUIState;
                    int i9 = i3;
                    String lowerCase2 = ((String) objB2).toLowerCase(Locale.ROOT);
                    Intrinsics.h(lowerCase2, str);
                    styledTextDataUIStateArr4[i9] = new StyledTextDataUIState(str2 + lowerCase2 + str2 + pair5.e(), shadyGray, null, TypographyToUiTextStyle.overline.getTextStyle(), null, null, null, 1012);
                    obj = null;
                    styledTextUIState2 = new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr5), null, UITextOverflow.Ellipsis, 18);
                    stopTripPlannerTabType2 = stopTripPlannerTabType3;
                    styledTextUIState = styledTextUIState4;
                    bus2 = bus4;
                }
            } else {
                obj = null;
                styledTextUIState2 = null;
            }
            if (stopTripPlannerTabType2 != StopTripPlannerTabType.DIRECT) {
            }
            String str4 = bus2.s.b;
            TypographyToUiTextStyle typographyToUiTextStyle2 = TypographyToUiTextStyle.caption;
            UITextStyle textStyle2 = typographyToUiTextStyle2.getTextStyle();
            UITextOverflow uITextOverflow2 = UITextOverflow.Ellipsis;
            return new RouteDetailsUiState(new StopInfoUiState(new TextUIState.ChaloTextUIState(str4, textStyle2, (ChaloColorToken) null, 1, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, uITextOverflow2, (UIFontStyle) null, (String) null, 7156), styledTextUIState), new StopInfoUiState(new TextUIState.ChaloTextUIState(bus2.t.b, typographyToUiTextStyle2.getTextStyle(), (ChaloColorToken) null, 1, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, uITextOverflow2, (UIFontStyle) null, (String) null, 7156), styledTextUIState2));
        }
        StyledTextDataUIState[] styledTextDataUIStateArr8 = new StyledTextDataUIState[2];
        str2 = " ";
        i = 0;
        styledTextDataUIStateArr8[0] = new StyledTextDataUIState(DistanceUtils.a(((Number) pair.d()).doubleValue() / 1000.0d), black, UIFontWeight.SemiBold, TypographyToUiTextStyle.overline.getTextStyle(), null, null, null, 1008);
        stopTripPlannerResultUiStateFactory$createRouteDetails$1.L$0 = stopTripPlannerTabType;
        stopTripPlannerResultUiStateFactory$createRouteDetails$1.L$1 = pair2;
        stopTripPlannerResultUiStateFactory$createRouteDetails$1.L$2 = bus;
        stopTripPlannerResultUiStateFactory$createRouteDetails$1.L$3 = pair;
        stopTripPlannerResultUiStateFactory$createRouteDetails$1.L$4 = styledTextDataUIStateArr8;
        stopTripPlannerResultUiStateFactory$createRouteDetails$1.L$5 = styledTextDataUIStateArr8;
        stopTripPlannerResultUiStateFactory$createRouteDetails$1.I$0 = 1;
        stopTripPlannerResultUiStateFactory$createRouteDetails$1.label = 1;
        objB = stringProvider2.b(StringEnum.FROM, new Object[0], stopTripPlannerResultUiStateFactory$createRouteDetails$1);
        if (objB != coroutineSingletons) {
            styledTextDataUIStateArr = styledTextDataUIStateArr8;
            styledTextDataUIStateArr2 = styledTextDataUIStateArr;
            pair3 = pair2;
            bus3 = bus;
            i2 = 1;
            pair4 = pair;
            stopTripPlannerTabType2 = stopTripPlannerTabType;
        }
        return coroutineSingletons;
        String lowerCase3 = ((String) objB).toLowerCase(Locale.ROOT);
        Intrinsics.h(lowerCase3, "toLowerCase(...)");
        str = "toLowerCase(...)";
        stringProvider = stringProvider2;
        styledTextDataUIStateArr[i2] = new StyledTextDataUIState(str2 + lowerCase3 + str2 + pair4.e(), shadyGray, null, TypographyToUiTextStyle.overline.getTextStyle(), null, null, null, 1012);
        styledTextUIState = new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr2), null, UITextOverflow.Ellipsis, 18);
        bus2 = bus3;
        if (pair3 != null) {
            styledTextDataUIStateArr3 = new StyledTextDataUIState[2];
            int i10 = i;
            styledTextDataUIStateArr3[i10] = new StyledTextDataUIState(DistanceUtils.a(((Number) pair3.d()).doubleValue() / 1000.0d), black, UIFontWeight.SemiBold, TypographyToUiTextStyle.overline.getTextStyle(), null, null, null, 1008);
            stopTripPlannerResultUiStateFactory$createRouteDetails$1.L$0 = stopTripPlannerTabType2;
            stopTripPlannerResultUiStateFactory$createRouteDetails$1.L$1 = bus2;
            stopTripPlannerResultUiStateFactory$createRouteDetails$1.L$2 = styledTextUIState;
            stopTripPlannerResultUiStateFactory$createRouteDetails$1.L$3 = pair3;
            stopTripPlannerResultUiStateFactory$createRouteDetails$1.L$4 = styledTextDataUIStateArr3;
            stopTripPlannerResultUiStateFactory$createRouteDetails$1.L$5 = styledTextDataUIStateArr3;
            i3 = 1;
            stopTripPlannerResultUiStateFactory$createRouteDetails$1.I$0 = 1;
            stopTripPlannerResultUiStateFactory$createRouteDetails$1.label = 2;
            objB2 = stringProvider.b(StringEnum.FROM, new Object[i10], stopTripPlannerResultUiStateFactory$createRouteDetails$1);
            if (objB2 != coroutineSingletons) {
                stopTripPlannerTabType3 = stopTripPlannerTabType2;
                styledTextDataUIStateArr4 = styledTextDataUIStateArr3;
                styledTextDataUIStateArr5 = styledTextDataUIStateArr4;
                pair5 = pair3;
                bus4 = bus2;
                TextUIState.StyledTextUIState styledTextUIState5 = styledTextUIState;
                int i11 = i3;
                String lowerCase4 = ((String) objB2).toLowerCase(Locale.ROOT);
                Intrinsics.h(lowerCase4, str);
                styledTextDataUIStateArr4[i11] = new StyledTextDataUIState(str2 + lowerCase4 + str2 + pair5.e(), shadyGray, null, TypographyToUiTextStyle.overline.getTextStyle(), null, null, null, 1012);
                obj = null;
                styledTextUIState2 = new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr5), null, UITextOverflow.Ellipsis, 18);
                stopTripPlannerTabType2 = stopTripPlannerTabType3;
                styledTextUIState = styledTextUIState5;
                bus2 = bus4;
            }
            return coroutineSingletons;
        }
        obj = null;
        styledTextUIState2 = null;
        if (stopTripPlannerTabType2 != StopTripPlannerTabType.DIRECT) {
        }
        String str5 = bus2.s.b;
        TypographyToUiTextStyle typographyToUiTextStyle3 = TypographyToUiTextStyle.caption;
        UITextStyle textStyle3 = typographyToUiTextStyle3.getTextStyle();
        UITextOverflow uITextOverflow3 = UITextOverflow.Ellipsis;
        return new RouteDetailsUiState(new StopInfoUiState(new TextUIState.ChaloTextUIState(str5, textStyle3, (ChaloColorToken) null, 1, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, uITextOverflow3, (UIFontStyle) null, (String) null, 7156), styledTextUIState), new StopInfoUiState(new TextUIState.ChaloTextUIState(bus2.t.b, typographyToUiTextStyle3.getTextStyle(), (ChaloColorToken) null, 1, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, uITextOverflow3, (UIFontStyle) null, (String) null, 7156), styledTextUIState2));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object j(int i, Function0 function0, ContinuationImpl continuationImpl) {
        StopTripPlannerResultUiStateFactory$createStepCard$1 stopTripPlannerResultUiStateFactory$createStepCard$1;
        Function0 function1;
        if (continuationImpl instanceof StopTripPlannerResultUiStateFactory$createStepCard$1) {
            stopTripPlannerResultUiStateFactory$createStepCard$1 = (StopTripPlannerResultUiStateFactory$createStepCard$1) continuationImpl;
            int i2 = stopTripPlannerResultUiStateFactory$createStepCard$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stopTripPlannerResultUiStateFactory$createStepCard$1.label = i2 - Integer.MIN_VALUE;
            } else {
                stopTripPlannerResultUiStateFactory$createStepCard$1 = new StopTripPlannerResultUiStateFactory$createStepCard$1(this, continuationImpl);
            }
        } else {
            stopTripPlannerResultUiStateFactory$createStepCard$1 = new StopTripPlannerResultUiStateFactory$createStepCard$1(this, continuationImpl);
        }
        Object objB = stopTripPlannerResultUiStateFactory$createStepCard$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = stopTripPlannerResultUiStateFactory$createStepCard$1.label;
        if (i3 == 0) {
            ResultKt.b(objB);
            StringEnum stringEnum = StringEnum.STEP_X;
            Object[] objArr = {new Integer(i)};
            stopTripPlannerResultUiStateFactory$createStepCard$1.L$0 = function0;
            stopTripPlannerResultUiStateFactory$createStepCard$1.label = 1;
            objB = this.f4619a.b(stringEnum, objArr, stopTripPlannerResultUiStateFactory$createStepCard$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            function1 = function0;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function1 = (Function0) stopTripPlannerResultUiStateFactory$createStepCard$1.L$0;
            ResultKt.b(objB);
        }
        return new StepCardUIState(new TextWithLeftAndRightIconUIState(null, new TextUIState.ChaloTextUIState((String) objB, TypographyToUiTextStyle.h5.getTextStyle(), ChaloColorToken.Orange2.f9830a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new ImageUIState(IconType.IC_ORANGE_ARROW_RIGHT, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, WebSocketProtocol.PAYLOAD_SHORT), 0.0f, null, 25), UiEventHandler.Companion.a(new o01(function1, 29)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f7, code lost:
    
        if (r2 == r4) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x011a, code lost:
    
        if (r2 == r4) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(app.chalo.livetracking.tripplanner.data.models.app.TripPlannerItineraryAppResponseModel r17, kotlin.coroutines.jvm.internal.ContinuationImpl r18) {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.stoptripplannerresult.uistate.StopTripPlannerResultUiStateFactory.k(app.chalo.livetracking.tripplanner.data.models.app.TripPlannerItineraryAppResponseModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a3, code lost:
    
        if (r13 == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b8, code lost:
    
        if (r13 == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cf, code lost:
    
        if (r13 == r1) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(app.chalo.livetracking.stoptripplannerresult.StopTripPlannerStopEditTarget r10, app.chalo.livetracking.stoptripplannerresult.StopBasedTripPlannerResultsBottomSheetType r11, kotlin.jvm.functions.Function1 r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.stoptripplannerresult.uistate.StopTripPlannerResultUiStateFactory.l(app.chalo.livetracking.stoptripplannerresult.StopTripPlannerStopEditTarget, app.chalo.livetracking.stoptripplannerresult.StopBasedTripPlannerResultsBottomSheetType, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x015c  */
    /* JADX WARN: Code duplicated, block: B:40:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:44:0x027e  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object m(boolean z, TripPlannerLegLiveBusNumberAvailability tripPlannerLegLiveBusNumberAvailability, Function1 function1, ContinuationImpl continuationImpl) {
        StopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1 stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1;
        StyledTextDataUIState[] styledTextDataUIStateArr;
        Object objB;
        int i;
        StyledTextDataUIState[] styledTextDataUIStateArr2;
        StringProvider stringProvider;
        int i2;
        Function1 function2;
        TextUIState.ChaloTextUIState chaloTextUIState;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        BusInfoCtaSpecs busInfoCtaSpecs;
        ImageUIState imageUIState;
        Object objB2;
        Function1 function3;
        BusInfoCtaSpecs busInfoCtaSpecs2;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        ImageUIState imageUIState2;
        TextUIState.ChaloTextUIState chaloTextUIState4;
        TextUIState.ChaloTextUIState chaloTextUIState5;
        TextUIState.ChaloTextUIState chaloTextUIState6;
        BusInfoCtaSpecs busInfoCtaSpecs3;
        ImageUIState imageUIState3;
        ChaloColorToken.Orange2 orange2;
        Object objB3;
        TextUIState.ChaloTextUIState chaloTextUIState7;
        ImageUIState imageUIState4;
        BusInfoCtaSpecs busInfoCtaSpecs4;
        Function1 function4;
        TripPlannerLegLiveBusNumberAvailability tripPlannerLegLiveBusNumberAvailability2 = tripPlannerLegLiveBusNumberAvailability;
        Function1 function5 = function1;
        if (continuationImpl instanceof StopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1) {
            stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1 = (StopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1) continuationImpl;
            int i3 = stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.label = i3 - Integer.MIN_VALUE;
            } else {
                stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1 = new StopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1(this, continuationImpl);
            }
        } else {
            stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1 = new StopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1(this, continuationImpl);
        }
        Object objB4 = stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.label;
        ChaloColorToken.White white = ChaloColorToken.White.f9870a;
        ChaloColorToken.Orange2 orange3 = ChaloColorToken.Orange2.f9830a;
        ChaloColorToken.AlmostBlackColor almostBlackColor = ChaloColorToken.AlmostBlackColor.f9756a;
        ChaloColorToken.ShadyGray shadyGray = ChaloColorToken.ShadyGray.f9851a;
        StringProvider stringProvider2 = this.f4619a;
        switch (i4) {
            case 0:
                ResultKt.b(objB4);
                TripPlannerLegLiveBusNumberAvailability.NotAvailable notAvailable = TripPlannerLegLiveBusNumberAvailability.NotAvailable.f4677a;
                if (z) {
                    if (tripPlannerLegLiveBusNumberAvailability2 instanceof TripPlannerLegLiveBusNumberAvailability.Available) {
                        stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.L$0 = tripPlannerLegLiveBusNumberAvailability2;
                        stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.L$1 = function5;
                        stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.label = 1;
                        objB4 = stringProvider2.b(StringEnum.BUS_NUMBER, new Object[0], stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1);
                        if (objB4 != coroutineSingletons) {
                            String str = objB4 + ":";
                            TypographyToUiTextStyle typographyToUiTextStyle = TypographyToUiTextStyle.overline;
                            chaloTextUIState = new TextUIState.ChaloTextUIState(str, typographyToUiTextStyle.getTextStyle(), shadyGray, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                            chaloTextUIState2 = new TextUIState.ChaloTextUIState(((TripPlannerLegLiveBusNumberAvailability.Available) tripPlannerLegLiveBusNumberAvailability2).f4676a, typographyToUiTextStyle.getTextStyle(), almostBlackColor, 1, (UITextAlign) null, UIFontWeight.SemiBold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, UITextOverflow.Ellipsis, (UIFontStyle) null, (String) null, 7088);
                            busInfoCtaSpecs = new BusInfoCtaSpecs(7, null, orange3);
                            imageUIState = new ImageUIState(IconType.IC_LOCATION_PIN, (String) null, white, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 250);
                            stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.L$0 = function5;
                            stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.L$1 = chaloTextUIState;
                            stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.L$2 = chaloTextUIState2;
                            stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.L$3 = busInfoCtaSpecs;
                            stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.L$4 = imageUIState;
                            stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.label = 2;
                            objB2 = stringProvider2.b(StringEnum.TRACK_BUS, new Object[0], stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1);
                            if (objB2 != coroutineSingletons) {
                                function3 = function5;
                                busInfoCtaSpecs2 = busInfoCtaSpecs;
                                objB4 = objB2;
                                chaloTextUIState3 = chaloTextUIState2;
                                imageUIState2 = imageUIState;
                                return new BusNumberContainerUIState.BusNumberAndCtaUiState(chaloTextUIState, chaloTextUIState3, new BusInfoCtaUiState(busInfoCtaSpecs2, new TextWithLeftAndRightIconUIState(imageUIState2, new TextUIState.ChaloTextUIState((String) objB4, TypographyToUiTextStyle.h6.getTextStyle(), white, 0, (UITextAlign) null, UIFontWeight.SemiBold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), null, ChaloThemeHelper.a().e, null, 20), UiEventHandler.Companion.a(new pb1(function3, 6))));
                            }
                        }
                    } else {
                        stringProvider = stringProvider2;
                        i2 = 0;
                        if (!Intrinsics.d(tripPlannerLegLiveBusNumberAvailability2, notAvailable)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.L$0 = function5;
                        stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.label = 3;
                        objB4 = stringProvider.b(StringEnum.BUS_NUMBER, new Object[0], stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1);
                        if (objB4 != coroutineSingletons) {
                            function2 = function5;
                            chaloTextUIState4 = new TextUIState.ChaloTextUIState((String) objB4, TypographyToUiTextStyle.overline.getTextStyle(), shadyGray, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                            stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.L$0 = function2;
                            stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.L$1 = chaloTextUIState4;
                            stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.label = 4;
                            objB4 = stringProvider.b(StringEnum.BUS_DETAILS_UNAVAILABLE, new Object[i2], stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1);
                            if (objB4 != coroutineSingletons) {
                                chaloTextUIState5 = chaloTextUIState4;
                                chaloTextUIState6 = new TextUIState.ChaloTextUIState((String) objB4, TypographyToUiTextStyle.overline.getTextStyle(), almostBlackColor, 1, (UITextAlign) null, UIFontWeight.SemiBold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, UITextOverflow.Ellipsis, (UIFontStyle) null, (String) null, 7088);
                                busInfoCtaSpecs3 = new BusInfoCtaSpecs(3, new BorderUISpec(ChaloThemeHelper.a().b, ChaloColorToken.LightGray.f9814a, UIShape.c), white);
                                orange2 = orange3;
                                imageUIState3 = new ImageUIState(IconType.IC_CALENDAR_MONTH, (String) null, orange2, new ImageUISize(Dp.m7276boximpl(ChaloThemeHelper.a().h), Dp.m7276boximpl(ChaloThemeHelper.a().h)), (UIContentScale) null, 0.0f, (UiEventHandler) null, 242);
                                stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.L$0 = function2;
                                stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.L$1 = chaloTextUIState5;
                                stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.L$2 = chaloTextUIState6;
                                stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.L$3 = busInfoCtaSpecs3;
                                stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.L$4 = imageUIState3;
                                stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.label = 5;
                                objB3 = stringProvider.b(StringEnum.VIEW_DETAILS_SMALL, new Object[i2], stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1);
                                if (objB3 != coroutineSingletons) {
                                    chaloTextUIState7 = chaloTextUIState6;
                                    imageUIState4 = imageUIState3;
                                    objB4 = objB3;
                                    busInfoCtaSpecs4 = busInfoCtaSpecs3;
                                    function4 = function2;
                                    return new BusNumberContainerUIState.BusNumberAndCtaUiState(chaloTextUIState5, chaloTextUIState7, new BusInfoCtaUiState(busInfoCtaSpecs4, new TextWithLeftAndRightIconUIState(imageUIState4, new TextUIState.ChaloTextUIState((String) objB4, TypographyToUiTextStyle.h6.getTextStyle(), orange2, 0, (UITextAlign) null, UIFontWeight.SemiBold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), null, ChaloThemeHelper.a().e, null, 20), UiEventHandler.Companion.a(new pb1(function4, 7))));
                                }
                            }
                        }
                    }
                } else {
                    if (Intrinsics.d(tripPlannerLegLiveBusNumberAvailability2, notAvailable)) {
                        return null;
                    }
                    if (!(tripPlannerLegLiveBusNumberAvailability2 instanceof TripPlannerLegLiveBusNumberAvailability.Available)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    styledTextDataUIStateArr = new StyledTextDataUIState[2];
                    stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.L$0 = tripPlannerLegLiveBusNumberAvailability2;
                    stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.L$1 = styledTextDataUIStateArr;
                    stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.L$2 = styledTextDataUIStateArr;
                    stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.I$0 = 0;
                    stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.label = 6;
                    objB = stringProvider2.b(StringEnum.BUS_NUMBER, new Object[0], stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1);
                    if (objB != coroutineSingletons) {
                        i = 0;
                        styledTextDataUIStateArr2 = styledTextDataUIStateArr;
                        String str2 = objB + ":";
                        TypographyToUiTextStyle typographyToUiTextStyle2 = TypographyToUiTextStyle.overline;
                        styledTextDataUIStateArr[i] = new StyledTextDataUIState(str2, shadyGray, null, typographyToUiTextStyle2.getTextStyle(), null, null, null, 1012);
                        styledTextDataUIStateArr2[1] = new StyledTextDataUIState(vo1.m(" ", ((TripPlannerLegLiveBusNumberAvailability.Available) tripPlannerLegLiveBusNumberAvailability2).f4676a), almostBlackColor, UIFontWeight.SemiBold, typographyToUiTextStyle2.getTextStyle(), null, null, null, 1008);
                        return new BusNumberContainerUIState.WithoutCta(new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr2), null, null, 30));
                    }
                }
                return coroutineSingletons;
            case 1:
                Function1 function6 = (Function1) stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.L$1;
                TripPlannerLegLiveBusNumberAvailability tripPlannerLegLiveBusNumberAvailability3 = (TripPlannerLegLiveBusNumberAvailability) stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.L$0;
                ResultKt.b(objB4);
                function5 = function6;
                tripPlannerLegLiveBusNumberAvailability2 = tripPlannerLegLiveBusNumberAvailability3;
                String str3 = objB4 + ":";
                TypographyToUiTextStyle typographyToUiTextStyle3 = TypographyToUiTextStyle.overline;
                chaloTextUIState = new TextUIState.ChaloTextUIState(str3, typographyToUiTextStyle3.getTextStyle(), shadyGray, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                chaloTextUIState2 = new TextUIState.ChaloTextUIState(((TripPlannerLegLiveBusNumberAvailability.Available) tripPlannerLegLiveBusNumberAvailability2).f4676a, typographyToUiTextStyle3.getTextStyle(), almostBlackColor, 1, (UITextAlign) null, UIFontWeight.SemiBold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, UITextOverflow.Ellipsis, (UIFontStyle) null, (String) null, 7088);
                busInfoCtaSpecs = new BusInfoCtaSpecs(7, null, orange3);
                imageUIState = new ImageUIState(IconType.IC_LOCATION_PIN, (String) null, white, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 250);
                stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.L$0 = function5;
                stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.L$1 = chaloTextUIState;
                stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.L$2 = chaloTextUIState2;
                stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.L$3 = busInfoCtaSpecs;
                stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.L$4 = imageUIState;
                stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.label = 2;
                objB2 = stringProvider2.b(StringEnum.TRACK_BUS, new Object[0], stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1);
                if (objB2 != coroutineSingletons) {
                    function3 = function5;
                    busInfoCtaSpecs2 = busInfoCtaSpecs;
                    objB4 = objB2;
                    chaloTextUIState3 = chaloTextUIState2;
                    imageUIState2 = imageUIState;
                    return new BusNumberContainerUIState.BusNumberAndCtaUiState(chaloTextUIState, chaloTextUIState3, new BusInfoCtaUiState(busInfoCtaSpecs2, new TextWithLeftAndRightIconUIState(imageUIState2, new TextUIState.ChaloTextUIState((String) objB4, TypographyToUiTextStyle.h6.getTextStyle(), white, 0, (UITextAlign) null, UIFontWeight.SemiBold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), null, ChaloThemeHelper.a().e, null, 20), UiEventHandler.Companion.a(new pb1(function3, 6))));
                }
                return coroutineSingletons;
            case 2:
                imageUIState2 = (ImageUIState) stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.L$4;
                busInfoCtaSpecs2 = (BusInfoCtaSpecs) stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.L$3;
                chaloTextUIState3 = (TextUIState.ChaloTextUIState) stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.L$2;
                chaloTextUIState = (TextUIState.ChaloTextUIState) stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.L$1;
                function3 = (Function1) stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.L$0;
                ResultKt.b(objB4);
                return new BusNumberContainerUIState.BusNumberAndCtaUiState(chaloTextUIState, chaloTextUIState3, new BusInfoCtaUiState(busInfoCtaSpecs2, new TextWithLeftAndRightIconUIState(imageUIState2, new TextUIState.ChaloTextUIState((String) objB4, TypographyToUiTextStyle.h6.getTextStyle(), white, 0, (UITextAlign) null, UIFontWeight.SemiBold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), null, ChaloThemeHelper.a().e, null, 20), UiEventHandler.Companion.a(new pb1(function3, 6))));
            case 3:
                function2 = (Function1) stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.L$0;
                ResultKt.b(objB4);
                stringProvider = stringProvider2;
                i2 = 0;
                chaloTextUIState4 = new TextUIState.ChaloTextUIState((String) objB4, TypographyToUiTextStyle.overline.getTextStyle(), shadyGray, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.L$0 = function2;
                stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.L$1 = chaloTextUIState4;
                stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.label = 4;
                objB4 = stringProvider.b(StringEnum.BUS_DETAILS_UNAVAILABLE, new Object[i2], stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1);
                if (objB4 != coroutineSingletons) {
                    chaloTextUIState5 = chaloTextUIState4;
                    chaloTextUIState6 = new TextUIState.ChaloTextUIState((String) objB4, TypographyToUiTextStyle.overline.getTextStyle(), almostBlackColor, 1, (UITextAlign) null, UIFontWeight.SemiBold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, UITextOverflow.Ellipsis, (UIFontStyle) null, (String) null, 7088);
                    busInfoCtaSpecs3 = new BusInfoCtaSpecs(3, new BorderUISpec(ChaloThemeHelper.a().b, ChaloColorToken.LightGray.f9814a, UIShape.c), white);
                    orange2 = orange3;
                    imageUIState3 = new ImageUIState(IconType.IC_CALENDAR_MONTH, (String) null, orange2, new ImageUISize(Dp.m7276boximpl(ChaloThemeHelper.a().h), Dp.m7276boximpl(ChaloThemeHelper.a().h)), (UIContentScale) null, 0.0f, (UiEventHandler) null, 242);
                    stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.L$0 = function2;
                    stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.L$1 = chaloTextUIState5;
                    stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.L$2 = chaloTextUIState6;
                    stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.L$3 = busInfoCtaSpecs3;
                    stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.L$4 = imageUIState3;
                    stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.label = 5;
                    objB3 = stringProvider.b(StringEnum.VIEW_DETAILS_SMALL, new Object[i2], stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1);
                    if (objB3 != coroutineSingletons) {
                        chaloTextUIState7 = chaloTextUIState6;
                        imageUIState4 = imageUIState3;
                        objB4 = objB3;
                        busInfoCtaSpecs4 = busInfoCtaSpecs3;
                        function4 = function2;
                        return new BusNumberContainerUIState.BusNumberAndCtaUiState(chaloTextUIState5, chaloTextUIState7, new BusInfoCtaUiState(busInfoCtaSpecs4, new TextWithLeftAndRightIconUIState(imageUIState4, new TextUIState.ChaloTextUIState((String) objB4, TypographyToUiTextStyle.h6.getTextStyle(), orange2, 0, (UITextAlign) null, UIFontWeight.SemiBold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), null, ChaloThemeHelper.a().e, null, 20), UiEventHandler.Companion.a(new pb1(function4, 7))));
                    }
                }
                return coroutineSingletons;
            case 4:
                TextUIState.ChaloTextUIState chaloTextUIState8 = (TextUIState.ChaloTextUIState) stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.L$1;
                Function1 function7 = (Function1) stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.L$0;
                ResultKt.b(objB4);
                chaloTextUIState5 = chaloTextUIState8;
                function2 = function7;
                stringProvider = stringProvider2;
                i2 = 0;
                chaloTextUIState6 = new TextUIState.ChaloTextUIState((String) objB4, TypographyToUiTextStyle.overline.getTextStyle(), almostBlackColor, 1, (UITextAlign) null, UIFontWeight.SemiBold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, UITextOverflow.Ellipsis, (UIFontStyle) null, (String) null, 7088);
                busInfoCtaSpecs3 = new BusInfoCtaSpecs(3, new BorderUISpec(ChaloThemeHelper.a().b, ChaloColorToken.LightGray.f9814a, UIShape.c), white);
                orange2 = orange3;
                imageUIState3 = new ImageUIState(IconType.IC_CALENDAR_MONTH, (String) null, orange2, new ImageUISize(Dp.m7276boximpl(ChaloThemeHelper.a().h), Dp.m7276boximpl(ChaloThemeHelper.a().h)), (UIContentScale) null, 0.0f, (UiEventHandler) null, 242);
                stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.L$0 = function2;
                stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.L$1 = chaloTextUIState5;
                stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.L$2 = chaloTextUIState6;
                stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.L$3 = busInfoCtaSpecs3;
                stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.L$4 = imageUIState3;
                stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.label = 5;
                objB3 = stringProvider.b(StringEnum.VIEW_DETAILS_SMALL, new Object[i2], stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1);
                if (objB3 != coroutineSingletons) {
                    chaloTextUIState7 = chaloTextUIState6;
                    imageUIState4 = imageUIState3;
                    objB4 = objB3;
                    busInfoCtaSpecs4 = busInfoCtaSpecs3;
                    function4 = function2;
                    return new BusNumberContainerUIState.BusNumberAndCtaUiState(chaloTextUIState5, chaloTextUIState7, new BusInfoCtaUiState(busInfoCtaSpecs4, new TextWithLeftAndRightIconUIState(imageUIState4, new TextUIState.ChaloTextUIState((String) objB4, TypographyToUiTextStyle.h6.getTextStyle(), orange2, 0, (UITextAlign) null, UIFontWeight.SemiBold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), null, ChaloThemeHelper.a().e, null, 20), UiEventHandler.Companion.a(new pb1(function4, 7))));
                }
                return coroutineSingletons;
            case 5:
                ImageUIState imageUIState5 = (ImageUIState) stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.L$4;
                busInfoCtaSpecs4 = (BusInfoCtaSpecs) stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.L$3;
                chaloTextUIState7 = (TextUIState.ChaloTextUIState) stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.L$2;
                chaloTextUIState5 = (TextUIState.ChaloTextUIState) stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.L$1;
                function4 = (Function1) stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.L$0;
                ResultKt.b(objB4);
                imageUIState4 = imageUIState5;
                orange2 = orange3;
                return new BusNumberContainerUIState.BusNumberAndCtaUiState(chaloTextUIState5, chaloTextUIState7, new BusInfoCtaUiState(busInfoCtaSpecs4, new TextWithLeftAndRightIconUIState(imageUIState4, new TextUIState.ChaloTextUIState((String) objB4, TypographyToUiTextStyle.h6.getTextStyle(), orange2, 0, (UITextAlign) null, UIFontWeight.SemiBold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), null, ChaloThemeHelper.a().e, null, 20), UiEventHandler.Companion.a(new pb1(function4, 7))));
            case 6:
                i = stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.I$0;
                StyledTextDataUIState[] styledTextDataUIStateArr3 = (StyledTextDataUIState[]) stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.L$2;
                styledTextDataUIStateArr2 = (StyledTextDataUIState[]) stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.L$1;
                TripPlannerLegLiveBusNumberAvailability tripPlannerLegLiveBusNumberAvailability4 = (TripPlannerLegLiveBusNumberAvailability) stopTripPlannerResultUiStateFactory$getBusNumberContainerUIState$1.L$0;
                ResultKt.b(objB4);
                styledTextDataUIStateArr = styledTextDataUIStateArr3;
                tripPlannerLegLiveBusNumberAvailability2 = tripPlannerLegLiveBusNumberAvailability4;
                objB = objB4;
                String str4 = objB + ":";
                TypographyToUiTextStyle typographyToUiTextStyle4 = TypographyToUiTextStyle.overline;
                styledTextDataUIStateArr[i] = new StyledTextDataUIState(str4, shadyGray, null, typographyToUiTextStyle4.getTextStyle(), null, null, null, 1012);
                styledTextDataUIStateArr2[1] = new StyledTextDataUIState(vo1.m(" ", ((TripPlannerLegLiveBusNumberAvailability.Available) tripPlannerLegLiveBusNumberAvailability2).f4676a), almostBlackColor, UIFontWeight.SemiBold, typographyToUiTextStyle4.getTextStyle(), null, null, null, 1008);
                return new BusNumberContainerUIState.WithoutCta(new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr2), null, null, 30));
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(ContinuationImpl continuationImpl) {
        StopTripPlannerResultUiStateFactory$getLoadingDialogUIState$1 stopTripPlannerResultUiStateFactory$getLoadingDialogUIState$1;
        DialogUIStateFactory dialogUIStateFactory;
        if (continuationImpl instanceof StopTripPlannerResultUiStateFactory$getLoadingDialogUIState$1) {
            stopTripPlannerResultUiStateFactory$getLoadingDialogUIState$1 = (StopTripPlannerResultUiStateFactory$getLoadingDialogUIState$1) continuationImpl;
            int i = stopTripPlannerResultUiStateFactory$getLoadingDialogUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopTripPlannerResultUiStateFactory$getLoadingDialogUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                stopTripPlannerResultUiStateFactory$getLoadingDialogUIState$1 = new StopTripPlannerResultUiStateFactory$getLoadingDialogUIState$1(this, continuationImpl);
            }
        } else {
            stopTripPlannerResultUiStateFactory$getLoadingDialogUIState$1 = new StopTripPlannerResultUiStateFactory$getLoadingDialogUIState$1(this, continuationImpl);
        }
        Object objB = stopTripPlannerResultUiStateFactory$getLoadingDialogUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = stopTripPlannerResultUiStateFactory$getLoadingDialogUIState$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            DialogUIStateFactory dialogUIStateFactory2 = DialogUIStateFactory.f9989a;
            stopTripPlannerResultUiStateFactory$getLoadingDialogUIState$1.L$0 = dialogUIStateFactory2;
            stopTripPlannerResultUiStateFactory$getLoadingDialogUIState$1.label = 1;
            objB = this.f4619a.b(StringEnum.LOADING, new Object[0], stopTripPlannerResultUiStateFactory$getLoadingDialogUIState$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            dialogUIStateFactory = dialogUIStateFactory2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dialogUIStateFactory = (DialogUIStateFactory) stopTripPlannerResultUiStateFactory$getLoadingDialogUIState$1.L$0;
            ResultKt.b(objB);
        }
        dialogUIStateFactory.getClass();
        return DialogUIStateFactory.a((String) objB);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0098  */
    /* JADX WARN: Code duplicated, block: B:21:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:25:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00dd -> B:26:0x00ea). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object o(java.util.List r23, app.chalo.livetracking.stoptripplannerresult.StopTripPlannerLocationType r24, app.chalo.livetracking.stoptripplannerresult.StopTripPlannerLocationType r25, app.chalo.livetracking.stoptripplannerresult.StopTripPlannerTabType r26, java.util.Map r27, kotlin.jvm.functions.Function1 r28, boolean r29, kotlin.coroutines.jvm.internal.ContinuationImpl r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.stoptripplannerresult.uistate.StopTripPlannerResultUiStateFactory.o(java.util.List, app.chalo.livetracking.stoptripplannerresult.StopTripPlannerLocationType, app.chalo.livetracking.stoptripplannerresult.StopTripPlannerLocationType, app.chalo.livetracking.stoptripplannerresult.StopTripPlannerTabType, java.util.Map, kotlin.jvm.functions.Function1, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:45:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:49:0x020b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0253  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x012d, code lost:
    
        if (r3 == r5) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0161, code lost:
    
        if (r3 == r5) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(app.chalo.livetracking.stoptripplannerresult.StopTripPlannerStopEditTarget r31, app.chalo.recent.model.app.RecentPlaceAppModel r32, kotlin.jvm.functions.Function1 r33, kotlin.coroutines.jvm.internal.ContinuationImpl r34) {
        /*
            Method dump skipped, instruction units count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.stoptripplannerresult.uistate.StopTripPlannerResultUiStateFactory.p(app.chalo.livetracking.stoptripplannerresult.StopTripPlannerStopEditTarget, app.chalo.recent.model.app.RecentPlaceAppModel, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object q(NearbyStopToLocationAppModel nearbyStopToLocationAppModel, RecentPlaceAppModel recentPlaceAppModel, w31 w31Var, ContinuationImpl continuationImpl) {
        StopTripPlannerResultUiStateFactory$getNearestStopItemUIState$1 stopTripPlannerResultUiStateFactory$getNearestStopItemUIState$1;
        ImageUIState imageUIState;
        TextUIState.ChaloTextUIState chaloTextUIState;
        StyledTextDataUIState[] styledTextDataUIStateArr;
        StyledTextDataUIState[] styledTextDataUIStateArr2;
        RecentPlaceAppModel recentPlaceAppModel2;
        Function0 function0;
        if (continuationImpl instanceof StopTripPlannerResultUiStateFactory$getNearestStopItemUIState$1) {
            stopTripPlannerResultUiStateFactory$getNearestStopItemUIState$1 = (StopTripPlannerResultUiStateFactory$getNearestStopItemUIState$1) continuationImpl;
            int i = stopTripPlannerResultUiStateFactory$getNearestStopItemUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopTripPlannerResultUiStateFactory$getNearestStopItemUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                stopTripPlannerResultUiStateFactory$getNearestStopItemUIState$1 = new StopTripPlannerResultUiStateFactory$getNearestStopItemUIState$1(this, continuationImpl);
            }
        } else {
            stopTripPlannerResultUiStateFactory$getNearestStopItemUIState$1 = new StopTripPlannerResultUiStateFactory$getNearestStopItemUIState$1(this, continuationImpl);
        }
        Object obj = stopTripPlannerResultUiStateFactory$getNearestStopItemUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = stopTripPlannerResultUiStateFactory$getNearestStopItemUIState$1.label;
        int i3 = 1;
        if (i2 == 0) {
            ResultKt.b(obj);
            String strA = DistanceUtils.a(nearbyStopToLocationAppModel.g / 1000.0d);
            imageUIState = new ImageUIState(IconType.BUS_SEARCH, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254);
            String str = nearbyStopToLocationAppModel.f;
            UITextStyle uITextStyle = UITextStyle.BodyLarge;
            UITextOverflow uITextOverflow = UITextOverflow.Ellipsis;
            ChaloColorToken.Black black = ChaloColorToken.Black.f9759a;
            TextUIState.ChaloTextUIState chaloTextUIState2 = new TextUIState.ChaloTextUIState(str, uITextStyle, black, 1, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, uITextOverflow, (UIFontStyle) null, (String) null, 7152);
            StyledTextDataUIState[] styledTextDataUIStateArr3 = new StyledTextDataUIState[2];
            styledTextDataUIStateArr3[0] = new StyledTextDataUIState(strA, black, null, UITextStyle.TitleLarge, null, null, null, 1012);
            stopTripPlannerResultUiStateFactory$getNearestStopItemUIState$1.L$0 = recentPlaceAppModel;
            stopTripPlannerResultUiStateFactory$getNearestStopItemUIState$1.L$1 = w31Var;
            stopTripPlannerResultUiStateFactory$getNearestStopItemUIState$1.L$2 = styledTextDataUIStateArr3;
            stopTripPlannerResultUiStateFactory$getNearestStopItemUIState$1.L$3 = imageUIState;
            stopTripPlannerResultUiStateFactory$getNearestStopItemUIState$1.L$4 = chaloTextUIState2;
            stopTripPlannerResultUiStateFactory$getNearestStopItemUIState$1.L$5 = styledTextDataUIStateArr3;
            stopTripPlannerResultUiStateFactory$getNearestStopItemUIState$1.I$0 = 1;
            stopTripPlannerResultUiStateFactory$getNearestStopItemUIState$1.label = 1;
            Object objB = this.f4619a.b(StringEnum.FROM, new Object[0], stopTripPlannerResultUiStateFactory$getNearestStopItemUIState$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            chaloTextUIState = chaloTextUIState2;
            styledTextDataUIStateArr = styledTextDataUIStateArr3;
            styledTextDataUIStateArr2 = styledTextDataUIStateArr;
            obj = objB;
            recentPlaceAppModel2 = recentPlaceAppModel;
            function0 = w31Var;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = stopTripPlannerResultUiStateFactory$getNearestStopItemUIState$1.I$0;
            styledTextDataUIStateArr = (StyledTextDataUIState[]) stopTripPlannerResultUiStateFactory$getNearestStopItemUIState$1.L$5;
            TextUIState.ChaloTextUIState chaloTextUIState3 = (TextUIState.ChaloTextUIState) stopTripPlannerResultUiStateFactory$getNearestStopItemUIState$1.L$4;
            imageUIState = (ImageUIState) stopTripPlannerResultUiStateFactory$getNearestStopItemUIState$1.L$3;
            styledTextDataUIStateArr2 = (StyledTextDataUIState[]) stopTripPlannerResultUiStateFactory$getNearestStopItemUIState$1.L$2;
            function0 = (Function0) stopTripPlannerResultUiStateFactory$getNearestStopItemUIState$1.L$1;
            recentPlaceAppModel2 = (RecentPlaceAppModel) stopTripPlannerResultUiStateFactory$getNearestStopItemUIState$1.L$0;
            ResultKt.b(obj);
            chaloTextUIState = chaloTextUIState3;
        }
        ImageUIState imageUIState2 = imageUIState;
        String lowerCase = ((String) obj).toLowerCase(Locale.ROOT);
        Intrinsics.h(lowerCase, "toLowerCase(...)");
        styledTextDataUIStateArr[i3] = new StyledTextDataUIState(z40.g(" ", lowerCase, " ", recentPlaceAppModel2.g), ChaloColorToken.ShadyGray.f9851a, null, UITextStyle.BodySmall, null, null, null, 1012);
        return new NearestStopItemUIState(imageUIState2, chaloTextUIState, new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr2), null, UITextOverflow.Ellipsis, 18), new ImageUIState(IconType.IC_ORANGE_ARROW_RIGHT, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254), new DividerUIState(0.0f, null, null, 7), UiEventHandler.Companion.a(new o01(function0, 27)));
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0188  */
    /* JADX WARN: Code duplicated, block: B:44:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x01ae -> B:45:0x01b1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object r(app.chalo.livetracking.stoptripplannerresult.StopTripPlannerStopEditTarget r29, app.chalo.livetracking.stoptripplannerresult.StopBasedTripPlannerResultsBottomSheetType.NearestStops r30, kotlin.jvm.functions.Function1 r31, kotlin.coroutines.jvm.internal.ContinuationImpl r32) {
        /*
            Method dump skipped, instruction units count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.stoptripplannerresult.uistate.StopTripPlannerResultUiStateFactory.r(app.chalo.livetracking.stoptripplannerresult.StopTripPlannerStopEditTarget, app.chalo.livetracking.stoptripplannerresult.StopBasedTripPlannerResultsBottomSheetType$NearestStops, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0127  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object s(Function1 function1, ContinuationImpl continuationImpl) {
        StopTripPlannerResultUiStateFactory$getNoNearestStopsBottomSheetUIState$1 stopTripPlannerResultUiStateFactory$getNoNearestStopsBottomSheetUIState$1;
        ImageUIState imageUIState;
        Function1 function2;
        TextUIState.ChaloTextUIState chaloTextUIState;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        ImageUIState imageUIState2;
        NonEditableSearchFieldUiState.Companion companion;
        ImageUIState imageUIState3;
        Function1 function3;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        ImageUIState imageUIState4;
        NonEditableSearchFieldUiState.Companion companion2;
        if (continuationImpl instanceof StopTripPlannerResultUiStateFactory$getNoNearestStopsBottomSheetUIState$1) {
            stopTripPlannerResultUiStateFactory$getNoNearestStopsBottomSheetUIState$1 = (StopTripPlannerResultUiStateFactory$getNoNearestStopsBottomSheetUIState$1) continuationImpl;
            int i = stopTripPlannerResultUiStateFactory$getNoNearestStopsBottomSheetUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopTripPlannerResultUiStateFactory$getNoNearestStopsBottomSheetUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                stopTripPlannerResultUiStateFactory$getNoNearestStopsBottomSheetUIState$1 = new StopTripPlannerResultUiStateFactory$getNoNearestStopsBottomSheetUIState$1(this, continuationImpl);
            }
        } else {
            stopTripPlannerResultUiStateFactory$getNoNearestStopsBottomSheetUIState$1 = new StopTripPlannerResultUiStateFactory$getNoNearestStopsBottomSheetUIState$1(this, continuationImpl);
        }
        Object objB = stopTripPlannerResultUiStateFactory$getNoNearestStopsBottomSheetUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = stopTripPlannerResultUiStateFactory$getNoNearestStopsBottomSheetUIState$1.label;
        StringProvider stringProvider = this.f4619a;
        if (i2 == 0) {
            ResultKt.b(objB);
            ImageUIState imageUIState5 = new ImageUIState(IconType.IC_ERROR_IMAGE, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254);
            stopTripPlannerResultUiStateFactory$getNoNearestStopsBottomSheetUIState$1.L$0 = function1;
            stopTripPlannerResultUiStateFactory$getNoNearestStopsBottomSheetUIState$1.L$1 = imageUIState5;
            stopTripPlannerResultUiStateFactory$getNoNearestStopsBottomSheetUIState$1.label = 1;
            objB = stringProvider.b(StringEnum.NO_NEARBY_STOPS_TO_PLACE_AVAILABLE_TITLE, new Object[0], stopTripPlannerResultUiStateFactory$getNoNearestStopsBottomSheetUIState$1);
            if (objB != coroutineSingletons) {
                imageUIState = imageUIState5;
                function2 = function1;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            imageUIState = (ImageUIState) stopTripPlannerResultUiStateFactory$getNoNearestStopsBottomSheetUIState$1.L$1;
            function2 = (Function1) stopTripPlannerResultUiStateFactory$getNoNearestStopsBottomSheetUIState$1.L$0;
            ResultKt.b(objB);
        } else {
            if (i2 == 2) {
                TextUIState.ChaloTextUIState chaloTextUIState4 = (TextUIState.ChaloTextUIState) stopTripPlannerResultUiStateFactory$getNoNearestStopsBottomSheetUIState$1.L$2;
                ImageUIState imageUIState6 = (ImageUIState) stopTripPlannerResultUiStateFactory$getNoNearestStopsBottomSheetUIState$1.L$1;
                function2 = (Function1) stopTripPlannerResultUiStateFactory$getNoNearestStopsBottomSheetUIState$1.L$0;
                ResultKt.b(objB);
                chaloTextUIState = chaloTextUIState4;
                imageUIState = imageUIState6;
                chaloTextUIState2 = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodyMedium, ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                imageUIState2 = new ImageUIState(IconType.CLOSE_NEARBY, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new pb1(function2, 21)), WebSocketProtocol.PAYLOAD_SHORT);
                stopTripPlannerResultUiStateFactory$getNoNearestStopsBottomSheetUIState$1.L$0 = function2;
                stopTripPlannerResultUiStateFactory$getNoNearestStopsBottomSheetUIState$1.L$1 = imageUIState;
                stopTripPlannerResultUiStateFactory$getNoNearestStopsBottomSheetUIState$1.L$2 = chaloTextUIState;
                stopTripPlannerResultUiStateFactory$getNoNearestStopsBottomSheetUIState$1.L$3 = chaloTextUIState2;
                stopTripPlannerResultUiStateFactory$getNoNearestStopsBottomSheetUIState$1.L$4 = imageUIState2;
                companion = NonEditableSearchFieldUiState.e;
                stopTripPlannerResultUiStateFactory$getNoNearestStopsBottomSheetUIState$1.L$5 = companion;
                stopTripPlannerResultUiStateFactory$getNoNearestStopsBottomSheetUIState$1.label = 3;
                objB = stringProvider.b(StringEnum.SEARCH_ANY_STOP_OR_PLACE, new Object[0], stopTripPlannerResultUiStateFactory$getNoNearestStopsBottomSheetUIState$1);
                if (objB != coroutineSingletons) {
                    imageUIState3 = imageUIState;
                    function3 = function2;
                    chaloTextUIState3 = chaloTextUIState2;
                    imageUIState4 = imageUIState2;
                    companion2 = companion;
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            companion2 = (NonEditableSearchFieldUiState.Companion) stopTripPlannerResultUiStateFactory$getNoNearestStopsBottomSheetUIState$1.L$5;
            ImageUIState imageUIState7 = (ImageUIState) stopTripPlannerResultUiStateFactory$getNoNearestStopsBottomSheetUIState$1.L$4;
            TextUIState.ChaloTextUIState chaloTextUIState5 = (TextUIState.ChaloTextUIState) stopTripPlannerResultUiStateFactory$getNoNearestStopsBottomSheetUIState$1.L$3;
            chaloTextUIState = (TextUIState.ChaloTextUIState) stopTripPlannerResultUiStateFactory$getNoNearestStopsBottomSheetUIState$1.L$2;
            ImageUIState imageUIState8 = (ImageUIState) stopTripPlannerResultUiStateFactory$getNoNearestStopsBottomSheetUIState$1.L$1;
            function3 = (Function1) stopTripPlannerResultUiStateFactory$getNoNearestStopsBottomSheetUIState$1.L$0;
            ResultKt.b(objB);
            chaloTextUIState3 = chaloTextUIState5;
            imageUIState3 = imageUIState8;
            imageUIState4 = imageUIState7;
        }
        UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1A = UiEventHandler.Companion.a(new pb1(function3, 22));
        companion2.getClass();
        return new NoNearbyStopsBottomSheetUIState(imageUIState3, chaloTextUIState, chaloTextUIState3, imageUIState4, NonEditableSearchFieldUiState.Companion.a((String) objB, uiEventHandler$Companion$fromLambda$1A));
        TextUIState.ChaloTextUIState chaloTextUIState6 = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.DisplayMedium, ChaloColorToken.Black.f9759a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
        stopTripPlannerResultUiStateFactory$getNoNearestStopsBottomSheetUIState$1.L$0 = function2;
        stopTripPlannerResultUiStateFactory$getNoNearestStopsBottomSheetUIState$1.L$1 = imageUIState;
        stopTripPlannerResultUiStateFactory$getNoNearestStopsBottomSheetUIState$1.L$2 = chaloTextUIState6;
        stopTripPlannerResultUiStateFactory$getNoNearestStopsBottomSheetUIState$1.label = 2;
        objB = stringProvider.b(StringEnum.NO_NEARBY_STOPS_TO_PLACE_AVAILABLE_DESC, new Object[0], stopTripPlannerResultUiStateFactory$getNoNearestStopsBottomSheetUIState$1);
        if (objB != coroutineSingletons) {
            chaloTextUIState = chaloTextUIState6;
            chaloTextUIState2 = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodyMedium, ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
            imageUIState2 = new ImageUIState(IconType.CLOSE_NEARBY, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new pb1(function2, 21)), WebSocketProtocol.PAYLOAD_SHORT);
            stopTripPlannerResultUiStateFactory$getNoNearestStopsBottomSheetUIState$1.L$0 = function2;
            stopTripPlannerResultUiStateFactory$getNoNearestStopsBottomSheetUIState$1.L$1 = imageUIState;
            stopTripPlannerResultUiStateFactory$getNoNearestStopsBottomSheetUIState$1.L$2 = chaloTextUIState;
            stopTripPlannerResultUiStateFactory$getNoNearestStopsBottomSheetUIState$1.L$3 = chaloTextUIState2;
            stopTripPlannerResultUiStateFactory$getNoNearestStopsBottomSheetUIState$1.L$4 = imageUIState2;
            companion = NonEditableSearchFieldUiState.e;
            stopTripPlannerResultUiStateFactory$getNoNearestStopsBottomSheetUIState$1.L$5 = companion;
            stopTripPlannerResultUiStateFactory$getNoNearestStopsBottomSheetUIState$1.label = 3;
            objB = stringProvider.b(StringEnum.SEARCH_ANY_STOP_OR_PLACE, new Object[0], stopTripPlannerResultUiStateFactory$getNoNearestStopsBottomSheetUIState$1);
            if (objB != coroutineSingletons) {
                imageUIState3 = imageUIState;
                function3 = function2;
                chaloTextUIState3 = chaloTextUIState2;
                imageUIState4 = imageUIState2;
                companion2 = companion;
                UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1A2 = UiEventHandler.Companion.a(new pb1(function3, 22));
                companion2.getClass();
                return new NoNearbyStopsBottomSheetUIState(imageUIState3, chaloTextUIState, chaloTextUIState3, imageUIState4, NonEditableSearchFieldUiState.Companion.a((String) objB, uiEventHandler$Companion$fromLambda$1A2));
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object t(StopTripPlannerResultsDataState stopTripPlannerResultsDataState, Function1 function1, ContinuationImpl continuationImpl) {
        StopTripPlannerResultUiStateFactory$getOriginDestinationSearchbar$1 stopTripPlannerResultUiStateFactory$getOriginDestinationSearchbar$1;
        SearchStopItemUiState searchStopItemUiState;
        if (continuationImpl instanceof StopTripPlannerResultUiStateFactory$getOriginDestinationSearchbar$1) {
            stopTripPlannerResultUiStateFactory$getOriginDestinationSearchbar$1 = (StopTripPlannerResultUiStateFactory$getOriginDestinationSearchbar$1) continuationImpl;
            int i = stopTripPlannerResultUiStateFactory$getOriginDestinationSearchbar$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopTripPlannerResultUiStateFactory$getOriginDestinationSearchbar$1.label = i - Integer.MIN_VALUE;
            } else {
                stopTripPlannerResultUiStateFactory$getOriginDestinationSearchbar$1 = new StopTripPlannerResultUiStateFactory$getOriginDestinationSearchbar$1(this, continuationImpl);
            }
        } else {
            stopTripPlannerResultUiStateFactory$getOriginDestinationSearchbar$1 = new StopTripPlannerResultUiStateFactory$getOriginDestinationSearchbar$1(this, continuationImpl);
        }
        Object objV = stopTripPlannerResultUiStateFactory$getOriginDestinationSearchbar$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = stopTripPlannerResultUiStateFactory$getOriginDestinationSearchbar$1.label;
        if (i2 == 0) {
            ResultKt.b(objV);
            StopTripPlannerLocationType stopTripPlannerLocationType = stopTripPlannerResultsDataState.c;
            Function0 pb1Var = new pb1(function1, 8);
            stopTripPlannerResultUiStateFactory$getOriginDestinationSearchbar$1.L$0 = stopTripPlannerResultsDataState;
            stopTripPlannerResultUiStateFactory$getOriginDestinationSearchbar$1.L$1 = function1;
            stopTripPlannerResultUiStateFactory$getOriginDestinationSearchbar$1.label = 1;
            objV = v(stopTripPlannerLocationType, pb1Var, stopTripPlannerResultUiStateFactory$getOriginDestinationSearchbar$1);
            if (objV != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            function1 = (Function1) stopTripPlannerResultUiStateFactory$getOriginDestinationSearchbar$1.L$1;
            stopTripPlannerResultsDataState = (StopTripPlannerResultsDataState) stopTripPlannerResultUiStateFactory$getOriginDestinationSearchbar$1.L$0;
            ResultKt.b(objV);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            searchStopItemUiState = (SearchStopItemUiState) stopTripPlannerResultUiStateFactory$getOriginDestinationSearchbar$1.L$1;
            function1 = (Function1) stopTripPlannerResultUiStateFactory$getOriginDestinationSearchbar$1.L$0;
            ResultKt.b(objV);
        }
        return new TripPlannerOriginDestinationSearchbarUiState(searchStopItemUiState, (SearchStopItemUiState) objV, new ImageUIState(IconType.PB_SWAP_ICON, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new pb1(function1, 10)), WebSocketProtocol.PAYLOAD_SHORT), 7);
        SearchStopItemUiState searchStopItemUiState2 = (SearchStopItemUiState) objV;
        StopTripPlannerLocationType stopTripPlannerLocationType2 = stopTripPlannerResultsDataState.d;
        Function0 pb1Var2 = new pb1(function1, 9);
        stopTripPlannerResultUiStateFactory$getOriginDestinationSearchbar$1.L$0 = function1;
        stopTripPlannerResultUiStateFactory$getOriginDestinationSearchbar$1.L$1 = searchStopItemUiState2;
        stopTripPlannerResultUiStateFactory$getOriginDestinationSearchbar$1.label = 2;
        Object objV2 = v(stopTripPlannerLocationType2, pb1Var2, stopTripPlannerResultUiStateFactory$getOriginDestinationSearchbar$1);
        if (objV2 != obj) {
            objV = objV2;
            searchStopItemUiState = searchStopItemUiState2;
            return new TripPlannerOriginDestinationSearchbarUiState(searchStopItemUiState, (SearchStopItemUiState) objV, new ImageUIState(IconType.PB_SWAP_ICON, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new pb1(function1, 10)), WebSocketProtocol.PAYLOAD_SHORT), 7);
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object u(Function1 function1, ContinuationImpl continuationImpl) {
        StopTripPlannerResultUiStateFactory$getRefreshNudgeUiState$1 stopTripPlannerResultUiStateFactory$getRefreshNudgeUiState$1;
        Function1 function2;
        if (continuationImpl instanceof StopTripPlannerResultUiStateFactory$getRefreshNudgeUiState$1) {
            stopTripPlannerResultUiStateFactory$getRefreshNudgeUiState$1 = (StopTripPlannerResultUiStateFactory$getRefreshNudgeUiState$1) continuationImpl;
            int i = stopTripPlannerResultUiStateFactory$getRefreshNudgeUiState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopTripPlannerResultUiStateFactory$getRefreshNudgeUiState$1.label = i - Integer.MIN_VALUE;
            } else {
                stopTripPlannerResultUiStateFactory$getRefreshNudgeUiState$1 = new StopTripPlannerResultUiStateFactory$getRefreshNudgeUiState$1(this, continuationImpl);
            }
        } else {
            stopTripPlannerResultUiStateFactory$getRefreshNudgeUiState$1 = new StopTripPlannerResultUiStateFactory$getRefreshNudgeUiState$1(this, continuationImpl);
        }
        Object objB = stopTripPlannerResultUiStateFactory$getRefreshNudgeUiState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = stopTripPlannerResultUiStateFactory$getRefreshNudgeUiState$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            stopTripPlannerResultUiStateFactory$getRefreshNudgeUiState$1.L$0 = function1;
            stopTripPlannerResultUiStateFactory$getRefreshNudgeUiState$1.label = 1;
            objB = this.f4619a.b(StringEnum.BUSES_LIVE_REFRESH, new Object[0], stopTripPlannerResultUiStateFactory$getRefreshNudgeUiState$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            function2 = function1;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function2 = (Function1) stopTripPlannerResultUiStateFactory$getRefreshNudgeUiState$1.L$0;
            ResultKt.b(objB);
        }
        UITextStyle uITextStyle = UITextStyle.BodyMedium;
        UIFontWeight uIFontWeight = UIFontWeight.SemiBold;
        ChaloColorToken.White white = ChaloColorToken.White.f9870a;
        TextUIState.ChaloTextUIState chaloTextUIState = new TextUIState.ChaloTextUIState((String) objB, uITextStyle, white, 0, (UITextAlign) null, uIFontWeight, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
        return new RefreshNudgeUiState(UiEventHandler.Companion.a(new pb1(function2, 14)), new ImageUIState(IconType.IC_RELOAD, (String) null, white, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 250), chaloTextUIState);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object v(StopTripPlannerLocationType stopTripPlannerLocationType, Function0 function0, ContinuationImpl continuationImpl) {
        StopTripPlannerResultUiStateFactory$getSearchStopItemUiState$1 stopTripPlannerResultUiStateFactory$getSearchStopItemUiState$1;
        Function0 function1;
        Object objB;
        Function0 function2;
        String str;
        StopTripPlannerLocationType stopTripPlannerLocationType2 = stopTripPlannerLocationType;
        if (continuationImpl instanceof StopTripPlannerResultUiStateFactory$getSearchStopItemUiState$1) {
            stopTripPlannerResultUiStateFactory$getSearchStopItemUiState$1 = (StopTripPlannerResultUiStateFactory$getSearchStopItemUiState$1) continuationImpl;
            int i = stopTripPlannerResultUiStateFactory$getSearchStopItemUiState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopTripPlannerResultUiStateFactory$getSearchStopItemUiState$1.label = i - Integer.MIN_VALUE;
            } else {
                stopTripPlannerResultUiStateFactory$getSearchStopItemUiState$1 = new StopTripPlannerResultUiStateFactory$getSearchStopItemUiState$1(this, continuationImpl);
            }
        } else {
            stopTripPlannerResultUiStateFactory$getSearchStopItemUiState$1 = new StopTripPlannerResultUiStateFactory$getSearchStopItemUiState$1(this, continuationImpl);
        }
        Object obj = stopTripPlannerResultUiStateFactory$getSearchStopItemUiState$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = stopTripPlannerResultUiStateFactory$getSearchStopItemUiState$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                Function0 function3 = (Function0) stopTripPlannerResultUiStateFactory$getSearchStopItemUiState$1.L$1;
                StopTripPlannerLocationType stopTripPlannerLocationType3 = (StopTripPlannerLocationType) stopTripPlannerResultUiStateFactory$getSearchStopItemUiState$1.L$0;
                ResultKt.b(obj);
                function1 = function3;
                stopTripPlannerLocationType2 = stopTripPlannerLocationType3;
                objB = obj;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str2 = (String) stopTripPlannerResultUiStateFactory$getSearchStopItemUiState$1.L$1;
                function2 = (Function0) stopTripPlannerResultUiStateFactory$getSearchStopItemUiState$1.L$0;
                ResultKt.b(obj);
                str = str2;
            }
            return new SearchStopItemUiState(new SearchStopItemSpecs(new ChaloPadding(ChaloThemeHelper.a().h, ChaloThemeHelper.a().g, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h), WebSocketProtocol.PAYLOAD_SHORT), new StopInfoUiState(new TextUIState.ChaloTextUIState(str, TypographyToUiTextStyle.body1.getTextStyle(), (ChaloColorToken) null, 1, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, UITextOverflow.Ellipsis, (UIFontStyle) null, (String) null, 7156), (TextUIState.StyledTextUIState) obj), null, UiEventHandler.Companion.a(new o01(function2, 26)));
        }
        ResultKt.b(obj);
        stopTripPlannerResultUiStateFactory$getSearchStopItemUiState$1.L$0 = stopTripPlannerLocationType2;
        function1 = function0;
        stopTripPlannerResultUiStateFactory$getSearchStopItemUiState$1.L$1 = function1;
        stopTripPlannerResultUiStateFactory$getSearchStopItemUiState$1.label = 1;
        if (stopTripPlannerLocationType2 instanceof StopTripPlannerLocationType.AllNearbyStopSelected) {
            objB = this.f4619a.b(StringEnum.ALL_NEARBY_STOPS, new Object[0], stopTripPlannerResultUiStateFactory$getSearchStopItemUiState$1);
        } else if (stopTripPlannerLocationType2 instanceof StopTripPlannerLocationType.NearestStopToPlaceSelected) {
            objB = ((StopTripPlannerLocationType.NearestStopToPlaceSelected) stopTripPlannerLocationType2).c.f;
        } else if (stopTripPlannerLocationType2 instanceof StopTripPlannerLocationType.Stop) {
            objB = ((StopTripPlannerLocationType.Stop) stopTripPlannerLocationType2).c.b;
        } else {
            if (!Intrinsics.d(stopTripPlannerLocationType2, StopTripPlannerLocationType.None.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            objB = "";
        }
        if (objB != obj2) {
        }
        return obj2;
        String str3 = (String) objB;
        stopTripPlannerResultUiStateFactory$getSearchStopItemUiState$1.L$0 = function1;
        stopTripPlannerResultUiStateFactory$getSearchStopItemUiState$1.L$1 = str3;
        stopTripPlannerResultUiStateFactory$getSearchStopItemUiState$1.label = 2;
        Object objY = y(stopTripPlannerLocationType2, UITextStyle.TitleLarge, UITextStyle.BodySmall, stopTripPlannerResultUiStateFactory$getSearchStopItemUiState$1);
        if (objY != obj2) {
            function2 = function1;
            str = str3;
            obj = objY;
            return new SearchStopItemUiState(new SearchStopItemSpecs(new ChaloPadding(ChaloThemeHelper.a().h, ChaloThemeHelper.a().g, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h), WebSocketProtocol.PAYLOAD_SHORT), new StopInfoUiState(new TextUIState.ChaloTextUIState(str, TypographyToUiTextStyle.body1.getTextStyle(), (ChaloColorToken) null, 1, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, UITextOverflow.Ellipsis, (UIFontStyle) null, (String) null, 7156), (TextUIState.StyledTextUIState) obj), null, UiEventHandler.Companion.a(new o01(function2, 26)));
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object w(da1 da1Var, ContinuationImpl continuationImpl) {
        StopTripPlannerResultUiStateFactory$getShowAllNearbyStopsItemUIState$1 stopTripPlannerResultUiStateFactory$getShowAllNearbyStopsItemUIState$1;
        NearbyStopItemSpec nearbyStopItemSpec;
        ImageUIState imageUIState;
        Function0 function0;
        ImageUIState imageUIState2;
        NearbyStopItemSpec nearbyStopItemSpec2;
        Function0 function1;
        TextUIState.ChaloTextUIState chaloTextUIState;
        if (continuationImpl instanceof StopTripPlannerResultUiStateFactory$getShowAllNearbyStopsItemUIState$1) {
            stopTripPlannerResultUiStateFactory$getShowAllNearbyStopsItemUIState$1 = (StopTripPlannerResultUiStateFactory$getShowAllNearbyStopsItemUIState$1) continuationImpl;
            int i = stopTripPlannerResultUiStateFactory$getShowAllNearbyStopsItemUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopTripPlannerResultUiStateFactory$getShowAllNearbyStopsItemUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                stopTripPlannerResultUiStateFactory$getShowAllNearbyStopsItemUIState$1 = new StopTripPlannerResultUiStateFactory$getShowAllNearbyStopsItemUIState$1(this, continuationImpl);
            }
        } else {
            stopTripPlannerResultUiStateFactory$getShowAllNearbyStopsItemUIState$1 = new StopTripPlannerResultUiStateFactory$getShowAllNearbyStopsItemUIState$1(this, continuationImpl);
        }
        Object objB = stopTripPlannerResultUiStateFactory$getShowAllNearbyStopsItemUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = stopTripPlannerResultUiStateFactory$getShowAllNearbyStopsItemUIState$1.label;
        StringProvider stringProvider = this.f4619a;
        if (i2 == 0) {
            ResultKt.b(objB);
            float f = ChaloThemeHelper.a().h;
            NearbyStopItemSpec nearbyStopItemSpec3 = new NearbyStopItemSpec(new ChaloPadding(f, f, f, f), WebSocketProtocol.PAYLOAD_SHORT);
            ImageUIState imageUIState3 = new ImageUIState(IconType.IC_FILTER_SHIFT, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254);
            stopTripPlannerResultUiStateFactory$getShowAllNearbyStopsItemUIState$1.L$0 = da1Var;
            stopTripPlannerResultUiStateFactory$getShowAllNearbyStopsItemUIState$1.L$1 = nearbyStopItemSpec3;
            stopTripPlannerResultUiStateFactory$getShowAllNearbyStopsItemUIState$1.L$2 = imageUIState3;
            stopTripPlannerResultUiStateFactory$getShowAllNearbyStopsItemUIState$1.label = 1;
            Object objB2 = stringProvider.b(StringEnum.SHOW_ALL_NEARBY_STOPS, new Object[0], stopTripPlannerResultUiStateFactory$getShowAllNearbyStopsItemUIState$1);
            if (objB2 != coroutineSingletons) {
                nearbyStopItemSpec = nearbyStopItemSpec3;
                objB = objB2;
                imageUIState = imageUIState3;
                function0 = da1Var;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            imageUIState = (ImageUIState) stopTripPlannerResultUiStateFactory$getShowAllNearbyStopsItemUIState$1.L$2;
            nearbyStopItemSpec = (NearbyStopItemSpec) stopTripPlannerResultUiStateFactory$getShowAllNearbyStopsItemUIState$1.L$1;
            function0 = (Function0) stopTripPlannerResultUiStateFactory$getShowAllNearbyStopsItemUIState$1.L$0;
            ResultKt.b(objB);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            TextUIState.ChaloTextUIState chaloTextUIState2 = (TextUIState.ChaloTextUIState) stopTripPlannerResultUiStateFactory$getShowAllNearbyStopsItemUIState$1.L$3;
            ImageUIState imageUIState4 = (ImageUIState) stopTripPlannerResultUiStateFactory$getShowAllNearbyStopsItemUIState$1.L$2;
            NearbyStopItemSpec nearbyStopItemSpec4 = (NearbyStopItemSpec) stopTripPlannerResultUiStateFactory$getShowAllNearbyStopsItemUIState$1.L$1;
            function1 = (Function0) stopTripPlannerResultUiStateFactory$getShowAllNearbyStopsItemUIState$1.L$0;
            ResultKt.b(objB);
            imageUIState2 = imageUIState4;
            nearbyStopItemSpec2 = nearbyStopItemSpec4;
            chaloTextUIState = chaloTextUIState2;
        }
        return new NearestStopItemUIState(nearbyStopItemSpec2, imageUIState2, chaloTextUIState, new TextUIState.StyledTextUIState(CollectionsKt.R(new StyledTextDataUIState((String) objB, ChaloColorToken.ShadyGray.f9851a, null, UITextStyle.BodySmall, null, null, null, 1012)), null, UITextOverflow.Ellipsis, 18), new ImageUIState(IconType.IC_ORANGE_ARROW_RIGHT, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254), null, UiEventHandler.Companion.a(new o01(function1, 28)));
        TextUIState.ChaloTextUIState chaloTextUIState3 = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodyLarge, ChaloColorToken.Black.f9759a, 1, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, UITextOverflow.Ellipsis, (UIFontStyle) null, (String) null, 7152);
        stopTripPlannerResultUiStateFactory$getShowAllNearbyStopsItemUIState$1.L$0 = function0;
        stopTripPlannerResultUiStateFactory$getShowAllNearbyStopsItemUIState$1.L$1 = nearbyStopItemSpec;
        stopTripPlannerResultUiStateFactory$getShowAllNearbyStopsItemUIState$1.L$2 = imageUIState;
        stopTripPlannerResultUiStateFactory$getShowAllNearbyStopsItemUIState$1.L$3 = chaloTextUIState3;
        stopTripPlannerResultUiStateFactory$getShowAllNearbyStopsItemUIState$1.label = 2;
        objB = stringProvider.b(StringEnum.SELECT_IF_YOU_DONT_HAVE_A_PREFERRED_STOP, new Object[0], stopTripPlannerResultUiStateFactory$getShowAllNearbyStopsItemUIState$1);
        if (objB != coroutineSingletons) {
            imageUIState2 = imageUIState;
            nearbyStopItemSpec2 = nearbyStopItemSpec;
            function1 = function0;
            chaloTextUIState = chaloTextUIState3;
            return new NearestStopItemUIState(nearbyStopItemSpec2, imageUIState2, chaloTextUIState, new TextUIState.StyledTextUIState(CollectionsKt.R(new StyledTextDataUIState((String) objB, ChaloColorToken.ShadyGray.f9851a, null, UITextStyle.BodySmall, null, null, null, 1012)), null, UITextOverflow.Ellipsis, 18), new ImageUIState(IconType.IC_ORANGE_ARROW_RIGHT, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254), null, UiEventHandler.Companion.a(new o01(function1, 28)));
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:41:0x0103  */
    /* JADX WARN: Code duplicated, block: B:43:0x010a  */
    /* JADX WARN: Code duplicated, block: B:46:0x011d  */
    /* JADX WARN: Code duplicated, block: B:48:0x013c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0140  */
    /* JADX WARN: Code duplicated, block: B:51:0x014d  */
    /* JADX WARN: Code duplicated, block: B:54:0x015b  */
    /* JADX WARN: Code duplicated, block: B:55:0x015d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object x(TripPlannerLegAppModel.Bus bus, ContinuationImpl continuationImpl) {
        StopTripPlannerResultUiStateFactory$getStaticTimeInfo$1 stopTripPlannerResultUiStateFactory$getStaticTimeInfo$1;
        TripPlannerLegAppModel.Bus bus2;
        String strX;
        String str;
        Integer num;
        String str2;
        String str3;
        TripPlannerLegAppModel.Bus bus3;
        String str4;
        Object objB;
        String str5;
        TripPlannerLegAppModel.Bus bus4;
        int i;
        if (continuationImpl instanceof StopTripPlannerResultUiStateFactory$getStaticTimeInfo$1) {
            stopTripPlannerResultUiStateFactory$getStaticTimeInfo$1 = (StopTripPlannerResultUiStateFactory$getStaticTimeInfo$1) continuationImpl;
            int i2 = stopTripPlannerResultUiStateFactory$getStaticTimeInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stopTripPlannerResultUiStateFactory$getStaticTimeInfo$1.label = i2 - Integer.MIN_VALUE;
            } else {
                stopTripPlannerResultUiStateFactory$getStaticTimeInfo$1 = new StopTripPlannerResultUiStateFactory$getStaticTimeInfo$1(this, continuationImpl);
            }
        } else {
            stopTripPlannerResultUiStateFactory$getStaticTimeInfo$1 = new StopTripPlannerResultUiStateFactory$getStaticTimeInfo$1(this, continuationImpl);
        }
        Object objB2 = stopTripPlannerResultUiStateFactory$getStaticTimeInfo$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = stopTripPlannerResultUiStateFactory$getStaticTimeInfo$1.label;
        TimeUtilsContract timeUtilsContract = this.b;
        StringProvider stringProvider = this.f4619a;
        if (i3 == 0) {
            ResultKt.b(objB2);
            bus2 = bus;
            stopTripPlannerResultUiStateFactory$getStaticTimeInfo$1.L$0 = bus2;
            stopTripPlannerResultUiStateFactory$getStaticTimeInfo$1.label = 1;
            objB2 = stringProvider.b(StringEnum.TIMING_NOT_AVAILABLE, new Object[0], stopTripPlannerResultUiStateFactory$getStaticTimeInfo$1);
            if (objB2 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3) {
                    strX = (String) stopTripPlannerResultUiStateFactory$getStaticTimeInfo$1.L$1;
                    TripPlannerLegAppModel.Bus bus5 = (TripPlannerLegAppModel.Bus) stopTripPlannerResultUiStateFactory$getStaticTimeInfo$1.L$0;
                    ResultKt.b(objB2);
                    bus2 = bus5;
                    str4 = (String) objB2;
                    StringEnum stringEnum = StringEnum.EVERY_X;
                    Object[] objArr = {timeUtilsContract.w(((long) bus2.w.intValue()) * ((long) 60) * ((long) 1000))};
                    stopTripPlannerResultUiStateFactory$getStaticTimeInfo$1.L$0 = bus2;
                    stopTripPlannerResultUiStateFactory$getStaticTimeInfo$1.L$1 = strX;
                    stopTripPlannerResultUiStateFactory$getStaticTimeInfo$1.L$2 = str4;
                    stopTripPlannerResultUiStateFactory$getStaticTimeInfo$1.label = 4;
                    objB = stringProvider.b(stringEnum, objArr, stopTripPlannerResultUiStateFactory$getStaticTimeInfo$1);
                    if (objB != coroutineSingletons) {
                        str5 = str4;
                        objB2 = objB;
                        bus4 = bus2;
                    }
                    return coroutineSingletons;
                }
                if (i3 != 4) {
                    if (i3 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str3 = (String) stopTripPlannerResultUiStateFactory$getStaticTimeInfo$1.L$1;
                    bus3 = (TripPlannerLegAppModel.Bus) stopTripPlannerResultUiStateFactory$getStaticTimeInfo$1.L$0;
                    ResultKt.b(objB2);
                    strX = vo1.n(timeUtilsContract.x(bus3.I.f4678a), " - ", timeUtilsContract.x(bus3.I.b));
                    str2 = (String) objB2;
                    bus2 = bus3;
                    i = WhenMappings.e[bus2.y.ordinal()];
                    if (i != 1) {
                        if (i == 2 && i != 3 && i != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str3 = strX;
                    }
                    return new LiveEtaInfoUiState(new TextUIState.ChaloTextUIState(str2, TypographyToUiTextStyle.overline.getTextStyle(), ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(str3, TypographyToUiTextStyle.h4.getTextStyle(), ChaloColorToken.AlmostBlackColor.f9756a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), null, new ImageUIState(IconType.IC_CALENDAR_MONTH, (String) null, ChaloColorToken.Black.f9759a, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 250), null, 1);
                }
                str5 = (String) stopTripPlannerResultUiStateFactory$getStaticTimeInfo$1.L$2;
                strX = (String) stopTripPlannerResultUiStateFactory$getStaticTimeInfo$1.L$1;
                bus4 = (TripPlannerLegAppModel.Bus) stopTripPlannerResultUiStateFactory$getStaticTimeInfo$1.L$0;
                ResultKt.b(objB2);
                bus2 = bus4;
                str2 = str5;
                str3 = strX;
                strX = (String) objB2;
                i = WhenMappings.e[bus2.y.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                    }
                    str3 = strX;
                }
                return new LiveEtaInfoUiState(new TextUIState.ChaloTextUIState(str2, TypographyToUiTextStyle.overline.getTextStyle(), ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(str3, TypographyToUiTextStyle.h4.getTextStyle(), ChaloColorToken.AlmostBlackColor.f9756a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), null, new ImageUIState(IconType.IC_CALENDAR_MONTH, (String) null, ChaloColorToken.Black.f9759a, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 250), null, 1);
            }
            strX = (String) stopTripPlannerResultUiStateFactory$getStaticTimeInfo$1.L$1;
            bus2 = (TripPlannerLegAppModel.Bus) stopTripPlannerResultUiStateFactory$getStaticTimeInfo$1.L$0;
            ResultKt.b(objB2);
            str = (String) objB2;
            if (bus2.v || bus2.w == null) {
                if (bus2.I != null) {
                    stopTripPlannerResultUiStateFactory$getStaticTimeInfo$1.L$0 = bus2;
                    stopTripPlannerResultUiStateFactory$getStaticTimeInfo$1.L$1 = strX;
                    stopTripPlannerResultUiStateFactory$getStaticTimeInfo$1.label = 5;
                    objB2 = stringProvider.b(StringEnum.NEXT_BUS_SCHEDULED_BETWEEN, new Object[0], stopTripPlannerResultUiStateFactory$getStaticTimeInfo$1);
                    if (objB2 != coroutineSingletons) {
                        str3 = strX;
                        bus3 = bus2;
                        strX = vo1.n(timeUtilsContract.x(bus3.I.f4678a), " - ", timeUtilsContract.x(bus3.I.b));
                        str2 = (String) objB2;
                        bus2 = bus3;
                    }
                } else {
                    num = bus2.E;
                    if (num != null) {
                        str2 = str;
                        str3 = strX;
                        strX = timeUtilsContract.x(num.intValue());
                    } else {
                        str2 = str;
                        str3 = strX;
                    }
                }
                i = WhenMappings.e[bus2.y.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                    }
                    str3 = strX;
                }
                return new LiveEtaInfoUiState(new TextUIState.ChaloTextUIState(str2, TypographyToUiTextStyle.overline.getTextStyle(), ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(str3, TypographyToUiTextStyle.h4.getTextStyle(), ChaloColorToken.AlmostBlackColor.f9756a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), null, new ImageUIState(IconType.IC_CALENDAR_MONTH, (String) null, ChaloColorToken.Black.f9759a, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 250), null, 1);
            }
            stopTripPlannerResultUiStateFactory$getStaticTimeInfo$1.L$0 = bus2;
            stopTripPlannerResultUiStateFactory$getStaticTimeInfo$1.L$1 = strX;
            stopTripPlannerResultUiStateFactory$getStaticTimeInfo$1.label = 3;
            objB2 = stringProvider.b(StringEnum.NEXT_BUS_SCHEDULED_IN, new Object[0], stopTripPlannerResultUiStateFactory$getStaticTimeInfo$1);
            if (objB2 != coroutineSingletons) {
                str4 = (String) objB2;
                StringEnum stringEnum2 = StringEnum.EVERY_X;
                Object[] objArr2 = {timeUtilsContract.w(((long) bus2.w.intValue()) * ((long) 60) * ((long) 1000))};
                stopTripPlannerResultUiStateFactory$getStaticTimeInfo$1.L$0 = bus2;
                stopTripPlannerResultUiStateFactory$getStaticTimeInfo$1.L$1 = strX;
                stopTripPlannerResultUiStateFactory$getStaticTimeInfo$1.L$2 = str4;
                stopTripPlannerResultUiStateFactory$getStaticTimeInfo$1.label = 4;
                objB = stringProvider.b(stringEnum2, objArr2, stopTripPlannerResultUiStateFactory$getStaticTimeInfo$1);
                if (objB != coroutineSingletons) {
                    str5 = str4;
                    objB2 = objB;
                    bus4 = bus2;
                    bus2 = bus4;
                    str2 = str5;
                    str3 = strX;
                    strX = (String) objB2;
                    i = WhenMappings.e[bus2.y.ordinal()];
                    if (i != 1) {
                        if (i == 2) {
                        }
                        str3 = strX;
                    }
                    return new LiveEtaInfoUiState(new TextUIState.ChaloTextUIState(str2, TypographyToUiTextStyle.overline.getTextStyle(), ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(str3, TypographyToUiTextStyle.h4.getTextStyle(), ChaloColorToken.AlmostBlackColor.f9756a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), null, new ImageUIState(IconType.IC_CALENDAR_MONTH, (String) null, ChaloColorToken.Black.f9759a, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 250), null, 1);
                }
            }
            return coroutineSingletons;
        }
        TripPlannerLegAppModel.Bus bus6 = (TripPlannerLegAppModel.Bus) stopTripPlannerResultUiStateFactory$getStaticTimeInfo$1.L$0;
        ResultKt.b(objB2);
        bus2 = bus6;
        String str6 = (String) objB2;
        stopTripPlannerResultUiStateFactory$getStaticTimeInfo$1.L$0 = bus2;
        stopTripPlannerResultUiStateFactory$getStaticTimeInfo$1.L$1 = str6;
        stopTripPlannerResultUiStateFactory$getStaticTimeInfo$1.label = 2;
        Object objB3 = stringProvider.b(StringEnum.NEXT_BUS_SCHEDULED_AT, new Object[0], stopTripPlannerResultUiStateFactory$getStaticTimeInfo$1);
        if (objB3 != coroutineSingletons) {
            strX = str6;
            objB2 = objB3;
            str = (String) objB2;
            if (bus2.v) {
                if (bus2.I != null) {
                    stopTripPlannerResultUiStateFactory$getStaticTimeInfo$1.L$0 = bus2;
                    stopTripPlannerResultUiStateFactory$getStaticTimeInfo$1.L$1 = strX;
                    stopTripPlannerResultUiStateFactory$getStaticTimeInfo$1.label = 5;
                    objB2 = stringProvider.b(StringEnum.NEXT_BUS_SCHEDULED_BETWEEN, new Object[0], stopTripPlannerResultUiStateFactory$getStaticTimeInfo$1);
                    if (objB2 != coroutineSingletons) {
                        str3 = strX;
                        bus3 = bus2;
                        strX = vo1.n(timeUtilsContract.x(bus3.I.f4678a), " - ", timeUtilsContract.x(bus3.I.b));
                        str2 = (String) objB2;
                        bus2 = bus3;
                    }
                } else {
                    num = bus2.E;
                    if (num != null) {
                        str2 = str;
                        str3 = strX;
                        strX = timeUtilsContract.x(num.intValue());
                    } else {
                        str2 = str;
                        str3 = strX;
                    }
                }
            } else if (bus2.I != null) {
                stopTripPlannerResultUiStateFactory$getStaticTimeInfo$1.L$0 = bus2;
                stopTripPlannerResultUiStateFactory$getStaticTimeInfo$1.L$1 = strX;
                stopTripPlannerResultUiStateFactory$getStaticTimeInfo$1.label = 5;
                objB2 = stringProvider.b(StringEnum.NEXT_BUS_SCHEDULED_BETWEEN, new Object[0], stopTripPlannerResultUiStateFactory$getStaticTimeInfo$1);
                if (objB2 != coroutineSingletons) {
                    str3 = strX;
                    bus3 = bus2;
                    strX = vo1.n(timeUtilsContract.x(bus3.I.f4678a), " - ", timeUtilsContract.x(bus3.I.b));
                    str2 = (String) objB2;
                    bus2 = bus3;
                }
            } else {
                num = bus2.E;
                if (num != null) {
                    str2 = str;
                    str3 = strX;
                    strX = timeUtilsContract.x(num.intValue());
                } else {
                    str2 = str;
                    str3 = strX;
                }
            }
            i = WhenMappings.e[bus2.y.ordinal()];
            if (i != 1) {
                if (i == 2) {
                }
                str3 = strX;
            }
            return new LiveEtaInfoUiState(new TextUIState.ChaloTextUIState(str2, TypographyToUiTextStyle.overline.getTextStyle(), ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(str3, TypographyToUiTextStyle.h4.getTextStyle(), ChaloColorToken.AlmostBlackColor.f9756a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), null, new ImageUIState(IconType.IC_CALENDAR_MONTH, (String) null, ChaloColorToken.Black.f9759a, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 250), null, 1);
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object y(StopTripPlannerLocationType stopTripPlannerLocationType, UITextStyle uITextStyle, UITextStyle uITextStyle2, ContinuationImpl continuationImpl) {
        StopTripPlannerResultUiStateFactory$getStopDescription$1 stopTripPlannerResultUiStateFactory$getStopDescription$1;
        StyledTextDataUIState[] styledTextDataUIStateArr;
        Object objB;
        int i;
        UITextStyle uITextStyle3;
        StyledTextDataUIState[] styledTextDataUIStateArr2;
        UITextStyle uITextStyle4;
        StopTripPlannerLocationType stopTripPlannerLocationType2 = stopTripPlannerLocationType;
        if (continuationImpl instanceof StopTripPlannerResultUiStateFactory$getStopDescription$1) {
            stopTripPlannerResultUiStateFactory$getStopDescription$1 = (StopTripPlannerResultUiStateFactory$getStopDescription$1) continuationImpl;
            int i2 = stopTripPlannerResultUiStateFactory$getStopDescription$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stopTripPlannerResultUiStateFactory$getStopDescription$1.label = i2 - Integer.MIN_VALUE;
            } else {
                stopTripPlannerResultUiStateFactory$getStopDescription$1 = new StopTripPlannerResultUiStateFactory$getStopDescription$1(this, continuationImpl);
            }
        } else {
            stopTripPlannerResultUiStateFactory$getStopDescription$1 = new StopTripPlannerResultUiStateFactory$getStopDescription$1(this, continuationImpl);
        }
        Object objB2 = stopTripPlannerResultUiStateFactory$getStopDescription$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = stopTripPlannerResultUiStateFactory$getStopDescription$1.label;
        ChaloColorToken.ShadyGray shadyGray = ChaloColorToken.ShadyGray.f9851a;
        if (i3 != 0) {
            if (i3 == 1) {
                UITextStyle uITextStyle5 = (UITextStyle) stopTripPlannerResultUiStateFactory$getStopDescription$1.L$1;
                StopTripPlannerLocationType stopTripPlannerLocationType3 = (StopTripPlannerLocationType) stopTripPlannerResultUiStateFactory$getStopDescription$1.L$0;
                ResultKt.b(objB2);
                uITextStyle4 = uITextStyle5;
                stopTripPlannerLocationType2 = stopTripPlannerLocationType3;
                String lowerCase = ((String) objB2).toLowerCase(Locale.ROOT);
                Intrinsics.h(lowerCase, "toLowerCase(...)");
                String strN = vo1.n(lowerCase, " ", ((StopTripPlannerLocationType.AllNearbyStopSelected) stopTripPlannerLocationType2).c.g);
                UITextOverflow uITextOverflow = UITextOverflow.Ellipsis;
                return new TextUIState.StyledTextUIState(CollectionsKt.R(new StyledTextDataUIState(strN, shadyGray, null, uITextStyle4, null, uITextOverflow, null, 756)), null, uITextOverflow, 18);
            }
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = stopTripPlannerResultUiStateFactory$getStopDescription$1.I$0;
            StyledTextDataUIState[] styledTextDataUIStateArr3 = (StyledTextDataUIState[]) stopTripPlannerResultUiStateFactory$getStopDescription$1.L$3;
            styledTextDataUIStateArr2 = (StyledTextDataUIState[]) stopTripPlannerResultUiStateFactory$getStopDescription$1.L$2;
            UITextStyle uITextStyle6 = (UITextStyle) stopTripPlannerResultUiStateFactory$getStopDescription$1.L$1;
            StopTripPlannerLocationType stopTripPlannerLocationType4 = (StopTripPlannerLocationType) stopTripPlannerResultUiStateFactory$getStopDescription$1.L$0;
            ResultKt.b(objB2);
            styledTextDataUIStateArr = styledTextDataUIStateArr3;
            stopTripPlannerLocationType2 = stopTripPlannerLocationType4;
            objB = objB2;
            uITextStyle3 = uITextStyle6;
            i = i4;
            String lowerCase2 = ((String) objB).toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase2, "toLowerCase(...)");
            String strG = z40.g(" ", lowerCase2, " ", ((StopTripPlannerLocationType.NearestStopToPlaceSelected) stopTripPlannerLocationType2).d.g);
            UITextOverflow uITextOverflow2 = UITextOverflow.Ellipsis;
            styledTextDataUIStateArr[i] = new StyledTextDataUIState(strG, shadyGray, null, uITextStyle3, null, uITextOverflow2, null, 756);
            return new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr2), null, uITextOverflow2, 18);
        }
        ResultKt.b(objB2);
        boolean z = stopTripPlannerLocationType2 instanceof StopTripPlannerLocationType.AllNearbyStopSelected;
        StringProvider stringProvider = this.f4619a;
        if (z) {
            stopTripPlannerResultUiStateFactory$getStopDescription$1.L$0 = stopTripPlannerLocationType2;
            stopTripPlannerResultUiStateFactory$getStopDescription$1.L$1 = uITextStyle2;
            stopTripPlannerResultUiStateFactory$getStopDescription$1.label = 1;
            objB2 = stringProvider.b(StringEnum.FROM, new Object[0], stopTripPlannerResultUiStateFactory$getStopDescription$1);
            if (objB2 != coroutineSingletons) {
                uITextStyle4 = uITextStyle2;
                String lowerCase3 = ((String) objB2).toLowerCase(Locale.ROOT);
                Intrinsics.h(lowerCase3, "toLowerCase(...)");
                String strN2 = vo1.n(lowerCase3, " ", ((StopTripPlannerLocationType.AllNearbyStopSelected) stopTripPlannerLocationType2).c.g);
                UITextOverflow uITextOverflow3 = UITextOverflow.Ellipsis;
                return new TextUIState.StyledTextUIState(CollectionsKt.R(new StyledTextDataUIState(strN2, shadyGray, null, uITextStyle4, null, uITextOverflow3, null, 756)), null, uITextOverflow3, 18);
            }
        } else {
            if (!(stopTripPlannerLocationType2 instanceof StopTripPlannerLocationType.NearestStopToPlaceSelected)) {
                if ((stopTripPlannerLocationType2 instanceof StopTripPlannerLocationType.Stop) || Intrinsics.d(stopTripPlannerLocationType2, StopTripPlannerLocationType.None.INSTANCE)) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            styledTextDataUIStateArr = new StyledTextDataUIState[2];
            styledTextDataUIStateArr[0] = new StyledTextDataUIState(DistanceUtils.a(((StopTripPlannerLocationType.NearestStopToPlaceSelected) stopTripPlannerLocationType2).c.g / 1000.0d), ChaloColorToken.Black.f9759a, UIFontWeight.SemiBold, uITextStyle, null, UITextOverflow.Ellipsis, null, 752);
            stopTripPlannerResultUiStateFactory$getStopDescription$1.L$0 = stopTripPlannerLocationType2;
            stopTripPlannerResultUiStateFactory$getStopDescription$1.L$1 = uITextStyle2;
            stopTripPlannerResultUiStateFactory$getStopDescription$1.L$2 = styledTextDataUIStateArr;
            stopTripPlannerResultUiStateFactory$getStopDescription$1.L$3 = styledTextDataUIStateArr;
            stopTripPlannerResultUiStateFactory$getStopDescription$1.I$0 = 1;
            stopTripPlannerResultUiStateFactory$getStopDescription$1.label = 2;
            objB = stringProvider.b(StringEnum.FROM, new Object[0], stopTripPlannerResultUiStateFactory$getStopDescription$1);
            if (objB != coroutineSingletons) {
                i = 1;
                uITextStyle3 = uITextStyle2;
                styledTextDataUIStateArr2 = styledTextDataUIStateArr;
                String lowerCase4 = ((String) objB).toLowerCase(Locale.ROOT);
                Intrinsics.h(lowerCase4, "toLowerCase(...)");
                String strG2 = z40.g(" ", lowerCase4, " ", ((StopTripPlannerLocationType.NearestStopToPlaceSelected) stopTripPlannerLocationType2).d.g);
                UITextOverflow uITextOverflow4 = UITextOverflow.Ellipsis;
                styledTextDataUIStateArr[i] = new StyledTextDataUIState(strG2, shadyGray, null, uITextStyle3, null, uITextOverflow4, null, 756);
                return new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr2), null, uITextOverflow4, 18);
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:39:0x01df  */
    /* JADX WARN: Code duplicated, block: B:43:0x023d  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object z(StopBasedTripPlannerResultsBottomSheetType.TrackingNotAvailableForLeg trackingNotAvailableForLeg, Function1 function1, ContinuationImpl continuationImpl) {
        StopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$1 stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$1;
        BottomSheetUiState bottomSheetUiState;
        TripPlannerLegAppModel.Bus bus;
        int i;
        StringProvider stringProvider;
        BottomSheetUiState bottomSheetUiState2;
        TripPlannerLegAppModel.Bus bus2;
        TextUIState.ChaloTextUIState chaloTextUIState;
        TitleSubtitleUiState titleSubtitleUiState;
        Function1 function2;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        BottomSheetUiState bottomSheetUiState3;
        TitleSubtitleUiState titleSubtitleUiState2;
        Function1 function3;
        BusInfoCardUiState busInfoCardUiState;
        Object objB;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        BusInfoCardUiState busInfoCardUiState2;
        BottomSheetUiState bottomSheetUiState4;
        ButtonUIStateFactory buttonUIStateFactory;
        TitleSubtitleUiState titleSubtitleUiState3;
        ButtonUIState buttonUIStateF;
        TitleSubtitleUiState titleSubtitleUiState4;
        BottomSheetUiState bottomSheetUiState5;
        TextUIState.ChaloTextUIState chaloTextUIState4;
        Function1 function4;
        Function1 function5 = function1;
        if (continuationImpl instanceof StopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$1) {
            stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$1 = (StopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$1) continuationImpl;
            int i2 = stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$1.label = i2 - Integer.MIN_VALUE;
            } else {
                stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$1 = new StopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$1(this, continuationImpl);
            }
        } else {
            stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$1 = new StopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$1(this, continuationImpl);
        }
        StopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$1 stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2 = stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$1;
        Object objB2 = stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.label;
        ButtonUIStateFactory buttonUIStateFactory2 = ButtonUIStateFactory.f9921a;
        ChaloColorToken.Black black = ChaloColorToken.Black.f9759a;
        StringProvider stringProvider2 = this.f4619a;
        if (i3 == 0) {
            ResultKt.b(objB2);
            bottomSheetUiState = new BottomSheetUiState(new BottomSheetUiSpec(UIShape.e, 14), new BottomSheetEventHandler(false, false, BottomSheetRequestHandler.Companion.a(new pb1(function5, 23)), 63));
            TripPlannerLegAppModel.Bus bus3 = trackingNotAvailableForLeg.b;
            stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$0 = function5;
            stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$1 = bottomSheetUiState;
            stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$2 = bus3;
            stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.label = 1;
            Object objB3 = stringProvider2.b(StringEnum.TRACKING_NOT_AVAILABLE, new Object[0], stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2);
            if (objB3 != obj) {
                bus = bus3;
                objB2 = objB3;
            }
            return obj;
        }
        if (i3 == 1) {
            TripPlannerLegAppModel.Bus bus4 = (TripPlannerLegAppModel.Bus) stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$2;
            bottomSheetUiState = (BottomSheetUiState) stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$1;
            Function1 function6 = (Function1) stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$0;
            ResultKt.b(objB2);
            bus = bus4;
            function5 = function6;
        } else {
            if (i3 == 2) {
                TextUIState.ChaloTextUIState chaloTextUIState5 = (TextUIState.ChaloTextUIState) stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$3;
                bus2 = (TripPlannerLegAppModel.Bus) stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$2;
                bottomSheetUiState2 = (BottomSheetUiState) stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$1;
                Function1 function7 = (Function1) stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$0;
                ResultKt.b(objB2);
                chaloTextUIState = chaloTextUIState5;
                function5 = function7;
                i = 0;
                stringProvider = stringProvider2;
                titleSubtitleUiState = new TitleSubtitleUiState(null, new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodySmall, ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(bus2.s.b, UITextStyle.BodyLarge, black, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), null, 9);
                Function1 mb1Var = new mb1(13);
                stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$0 = function5;
                stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$1 = bottomSheetUiState2;
                stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$2 = chaloTextUIState;
                stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$3 = titleSubtitleUiState;
                stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.label = 3;
                function2 = function5;
                objB2 = a(false, true, bus2, mb1Var, stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2);
                if (objB2 != obj) {
                    chaloTextUIState2 = chaloTextUIState;
                    bottomSheetUiState3 = bottomSheetUiState2;
                    titleSubtitleUiState2 = titleSubtitleUiState;
                    function3 = function2;
                    busInfoCardUiState = (BusInfoCardUiState) objB2;
                    stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$0 = function3;
                    stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$1 = bottomSheetUiState3;
                    stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$2 = chaloTextUIState2;
                    stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$3 = titleSubtitleUiState2;
                    stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$4 = busInfoCardUiState;
                    stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$5 = buttonUIStateFactory2;
                    stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.label = 4;
                    objB = stringProvider.b(StringEnum.GOT_IT, new Object[i], stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2);
                    if (objB != obj) {
                        objB2 = objB;
                        chaloTextUIState3 = chaloTextUIState2;
                        busInfoCardUiState2 = busInfoCardUiState;
                        bottomSheetUiState4 = bottomSheetUiState3;
                        buttonUIStateFactory = buttonUIStateFactory2;
                        titleSubtitleUiState3 = titleSubtitleUiState2;
                        buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory, new TextUIState.ChaloTextUIState((String) objB2, TypographyToUiTextStyle.h5.getTextStyle(), ChaloColorToken.White.f9870a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new pb1(function3, 24), null, false, 0.0f, 60);
                        stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$0 = function3;
                        stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$1 = bottomSheetUiState4;
                        stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$2 = chaloTextUIState3;
                        stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$3 = titleSubtitleUiState3;
                        stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$4 = busInfoCardUiState2;
                        stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$5 = buttonUIStateF;
                        stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$6 = buttonUIStateFactory2;
                        stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.label = 5;
                        objB2 = stringProvider.b(StringEnum.VIEW_ROUTE_MAP_AND_TIMETABLE, new Object[i], stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2);
                        if (objB2 != obj) {
                            BottomSheetUiState bottomSheetUiState6 = bottomSheetUiState4;
                            titleSubtitleUiState4 = titleSubtitleUiState3;
                            bottomSheetUiState5 = bottomSheetUiState6;
                            chaloTextUIState4 = chaloTextUIState3;
                            function4 = function3;
                        }
                    }
                }
                return obj;
            }
            if (i3 == 3) {
                titleSubtitleUiState2 = (TitleSubtitleUiState) stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$3;
                chaloTextUIState2 = (TextUIState.ChaloTextUIState) stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$2;
                bottomSheetUiState3 = (BottomSheetUiState) stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$1;
                function3 = (Function1) stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$0;
                ResultKt.b(objB2);
                i = 0;
                stringProvider = stringProvider2;
                busInfoCardUiState = (BusInfoCardUiState) objB2;
                stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$0 = function3;
                stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$1 = bottomSheetUiState3;
                stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$2 = chaloTextUIState2;
                stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$3 = titleSubtitleUiState2;
                stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$4 = busInfoCardUiState;
                stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$5 = buttonUIStateFactory2;
                stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.label = 4;
                objB = stringProvider.b(StringEnum.GOT_IT, new Object[i], stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2);
                if (objB != obj) {
                    objB2 = objB;
                    chaloTextUIState3 = chaloTextUIState2;
                    busInfoCardUiState2 = busInfoCardUiState;
                    bottomSheetUiState4 = bottomSheetUiState3;
                    buttonUIStateFactory = buttonUIStateFactory2;
                    titleSubtitleUiState3 = titleSubtitleUiState2;
                    buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory, new TextUIState.ChaloTextUIState((String) objB2, TypographyToUiTextStyle.h5.getTextStyle(), ChaloColorToken.White.f9870a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new pb1(function3, 24), null, false, 0.0f, 60);
                    stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$0 = function3;
                    stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$1 = bottomSheetUiState4;
                    stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$2 = chaloTextUIState3;
                    stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$3 = titleSubtitleUiState3;
                    stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$4 = busInfoCardUiState2;
                    stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$5 = buttonUIStateF;
                    stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$6 = buttonUIStateFactory2;
                    stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.label = 5;
                    objB2 = stringProvider.b(StringEnum.VIEW_ROUTE_MAP_AND_TIMETABLE, new Object[i], stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2);
                    if (objB2 != obj) {
                        BottomSheetUiState bottomSheetUiState7 = bottomSheetUiState4;
                        titleSubtitleUiState4 = titleSubtitleUiState3;
                        bottomSheetUiState5 = bottomSheetUiState7;
                        chaloTextUIState4 = chaloTextUIState3;
                        function4 = function3;
                    }
                }
                return obj;
            }
            if (i3 == 4) {
                ButtonUIStateFactory buttonUIStateFactory3 = (ButtonUIStateFactory) stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$5;
                busInfoCardUiState2 = (BusInfoCardUiState) stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$4;
                titleSubtitleUiState3 = (TitleSubtitleUiState) stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$3;
                TextUIState.ChaloTextUIState chaloTextUIState6 = (TextUIState.ChaloTextUIState) stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$2;
                BottomSheetUiState bottomSheetUiState8 = (BottomSheetUiState) stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$1;
                Function1 function8 = (Function1) stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$0;
                ResultKt.b(objB2);
                buttonUIStateFactory = buttonUIStateFactory3;
                chaloTextUIState3 = chaloTextUIState6;
                bottomSheetUiState4 = bottomSheetUiState8;
                function3 = function8;
                i = 0;
                stringProvider = stringProvider2;
                buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory, new TextUIState.ChaloTextUIState((String) objB2, TypographyToUiTextStyle.h5.getTextStyle(), ChaloColorToken.White.f9870a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new pb1(function3, 24), null, false, 0.0f, 60);
                stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$0 = function3;
                stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$1 = bottomSheetUiState4;
                stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$2 = chaloTextUIState3;
                stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$3 = titleSubtitleUiState3;
                stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$4 = busInfoCardUiState2;
                stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$5 = buttonUIStateF;
                stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$6 = buttonUIStateFactory2;
                stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.label = 5;
                objB2 = stringProvider.b(StringEnum.VIEW_ROUTE_MAP_AND_TIMETABLE, new Object[i], stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2);
                if (objB2 != obj) {
                    BottomSheetUiState bottomSheetUiState9 = bottomSheetUiState4;
                    titleSubtitleUiState4 = titleSubtitleUiState3;
                    bottomSheetUiState5 = bottomSheetUiState9;
                    chaloTextUIState4 = chaloTextUIState3;
                    function4 = function3;
                }
                return obj;
            }
            if (i3 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            buttonUIStateFactory2 = (ButtonUIStateFactory) stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$6;
            buttonUIStateF = (ButtonUIState) stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$5;
            busInfoCardUiState2 = (BusInfoCardUiState) stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$4;
            TitleSubtitleUiState titleSubtitleUiState5 = (TitleSubtitleUiState) stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$3;
            chaloTextUIState4 = (TextUIState.ChaloTextUIState) stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$2;
            BottomSheetUiState bottomSheetUiState10 = (BottomSheetUiState) stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$1;
            function4 = (Function1) stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$0;
            ResultKt.b(objB2);
            titleSubtitleUiState4 = titleSubtitleUiState5;
            bottomSheetUiState5 = bottomSheetUiState10;
        }
        return new LiveTrackingNotSupportedBottomSheet(bottomSheetUiState5, chaloTextUIState4, new ImageUIState(IconType.IC_CLOSE_ROUNDED, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new pb1(function4, 5)), WebSocketProtocol.PAYLOAD_SHORT), new ImageUIState(IconType.IC_BUS_STOP, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().k), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), titleSubtitleUiState4, busInfoCardUiState2, new LiveTrackingNotSupportedBottomSheetCtaContainer(buttonUIStateF, ButtonUIStateFactory.d(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objB2, TypographyToUiTextStyle.h5.getTextStyle(), black, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new pb1(function4, 4), null, false, 60)));
        i = 0;
        stringProvider = stringProvider2;
        TextUIState.ChaloTextUIState chaloTextUIState7 = new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.DisplayMedium, black, 0, (UITextAlign) null, UIFontWeight.Bold, new Integer(24), (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7992);
        stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$0 = function5;
        stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$1 = bottomSheetUiState;
        stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$2 = bus;
        stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$3 = chaloTextUIState7;
        stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.label = 2;
        objB2 = stringProvider.b(StringEnum.BOARDING_STOP, new Object[0], stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2);
        if (objB2 != obj) {
            bottomSheetUiState2 = bottomSheetUiState;
            bus2 = bus;
            chaloTextUIState = chaloTextUIState7;
            titleSubtitleUiState = new TitleSubtitleUiState(null, new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodySmall, ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(bus2.s.b, UITextStyle.BodyLarge, black, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), null, 9);
            Function1 mb1Var2 = new mb1(13);
            stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$0 = function5;
            stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$1 = bottomSheetUiState2;
            stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$2 = chaloTextUIState;
            stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$3 = titleSubtitleUiState;
            stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.label = 3;
            function2 = function5;
            objB2 = a(false, true, bus2, mb1Var2, stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2);
            if (objB2 != obj) {
                chaloTextUIState2 = chaloTextUIState;
                bottomSheetUiState3 = bottomSheetUiState2;
                titleSubtitleUiState2 = titleSubtitleUiState;
                function3 = function2;
                busInfoCardUiState = (BusInfoCardUiState) objB2;
                stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$0 = function3;
                stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$1 = bottomSheetUiState3;
                stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$2 = chaloTextUIState2;
                stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$3 = titleSubtitleUiState2;
                stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$4 = busInfoCardUiState;
                stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$5 = buttonUIStateFactory2;
                stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.label = 4;
                objB = stringProvider.b(StringEnum.GOT_IT, new Object[i], stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2);
                if (objB != obj) {
                    objB2 = objB;
                    chaloTextUIState3 = chaloTextUIState2;
                    busInfoCardUiState2 = busInfoCardUiState;
                    bottomSheetUiState4 = bottomSheetUiState3;
                    buttonUIStateFactory = buttonUIStateFactory2;
                    titleSubtitleUiState3 = titleSubtitleUiState2;
                    buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory, new TextUIState.ChaloTextUIState((String) objB2, TypographyToUiTextStyle.h5.getTextStyle(), ChaloColorToken.White.f9870a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new pb1(function3, 24), null, false, 0.0f, 60);
                    stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$0 = function3;
                    stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$1 = bottomSheetUiState4;
                    stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$2 = chaloTextUIState3;
                    stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$3 = titleSubtitleUiState3;
                    stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$4 = busInfoCardUiState2;
                    stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$5 = buttonUIStateF;
                    stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.L$6 = buttonUIStateFactory2;
                    stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2.label = 5;
                    objB2 = stringProvider.b(StringEnum.VIEW_ROUTE_MAP_AND_TIMETABLE, new Object[i], stopTripPlannerResultUiStateFactory$getTrackingNotAvailableForLegBottomSheetUIState$2);
                    if (objB2 != obj) {
                        BottomSheetUiState bottomSheetUiState11 = bottomSheetUiState4;
                        titleSubtitleUiState4 = titleSubtitleUiState3;
                        bottomSheetUiState5 = bottomSheetUiState11;
                        chaloTextUIState4 = chaloTextUIState3;
                        function4 = function3;
                        return new LiveTrackingNotSupportedBottomSheet(bottomSheetUiState5, chaloTextUIState4, new ImageUIState(IconType.IC_CLOSE_ROUNDED, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new pb1(function4, 5)), WebSocketProtocol.PAYLOAD_SHORT), new ImageUIState(IconType.IC_BUS_STOP, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().k), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), titleSubtitleUiState4, busInfoCardUiState2, new LiveTrackingNotSupportedBottomSheetCtaContainer(buttonUIStateF, ButtonUIStateFactory.d(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objB2, TypographyToUiTextStyle.h5.getTextStyle(), black, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new pb1(function4, 4), null, false, 60)));
                    }
                }
            }
        }
        return obj;
    }
}

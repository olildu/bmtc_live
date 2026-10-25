package app.chalo.premiumbus.ui.changestop;

import app.chalo.compose.components.chalomap.ChaloMapMarkerInfoWindowProvider;
import app.chalo.compose.components.chalomap.MapCameraViewState;
import app.chalo.compose.components.chalomap.PolylineUtils;
import app.chalo.compose.components.chalomap.iconprovider.ChaloMapMarkerIconProvider;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.livetracking.frameworklivetracking.domain.CheckLiveBusDelayedUseCase;
import app.chalo.premiumbus.data.models.app.EligibleStopAppModel;
import app.chalo.premiumbus.ui.slotselection.ODPairTagsUIState;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.components.map.ChaloMapUIEventHandler;
import app.chalo.uistate.components.map.ChaloMapUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.radiobutton.RadioButtonUIState;
import app.chalo.uistate.text.ChaloTextStyleHelper;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.utils.timeutil.TimeUtilsContract;
import defpackage.rt0;
import defpackage.w60;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/changestop/PremiumBusChangeStopUIStateFactory;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusChangeStopUIStateFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringProvider f7538a;
    public final PolylineUtils b;
    public final TimeUtilsContract c;
    public final ChaloMapMarkerInfoWindowProvider d;
    public final ChaloMapMarkerIconProvider e;
    public final CheckLiveBusDelayedUseCase f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7539a;

        static {
            int[] iArr = new int[ChangeStopFailureType.values().length];
            try {
                iArr[ChangeStopFailureType.GENERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChangeStopFailureType.LOAD_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChangeStopFailureType.STOP_CHANGE_WINDOW_PASSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ChangeStopFailureType.STOP_NOT_ELIGIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f7539a = iArr;
        }
    }

    public PremiumBusChangeStopUIStateFactory(StringProvider stringProvider, PolylineUtils polylineUtils, TimeUtilsContract timeUtilsContract, ChaloMapMarkerInfoWindowProvider chaloMapMarkerInfoWindowProvider, ChaloMapMarkerIconProvider chaloMapMarkerIconProvider, CheckLiveBusDelayedUseCase checkLiveBusDelayedUseCase) {
        this.f7538a = stringProvider;
        this.b = polylineUtils;
        this.c = timeUtilsContract;
        this.d = chaloMapMarkerInfoWindowProvider;
        this.e = chaloMapMarkerIconProvider;
        this.f = checkLiveBusDelayedUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:49:0x019d  */
    /* JADX WARN: Code duplicated, block: B:51:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0159 -> B:45:0x0161). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0172 -> B:46:0x016f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x019d -> B:50:0x019e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(app.chalo.premiumbus.ui.changestop.PremiumBusChangeStopDataState r27, kotlin.jvm.functions.Function1 r28, kotlin.coroutines.jvm.internal.ContinuationImpl r29) {
        /*
            Method dump skipped, instruction units count: 649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.ui.changestop.PremiumBusChangeStopUIStateFactory.a(app.chalo.premiumbus.ui.changestop.PremiumBusChangeStopDataState, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0263  */
    /* JADX WARN: Code duplicated, block: B:58:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x02db  */
    /* JADX WARN: Code duplicated, block: B:70:0x033a  */
    /* JADX WARN: Code duplicated, block: B:73:0x034b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0351  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0145, code lost:
    
        if (r2 == r4) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01d5, code lost:
    
        if (r3 == r4) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(app.chalo.premiumbus.ui.changestop.ChangeStopScreenState.Failure r32, kotlin.jvm.functions.Function1 r33, kotlin.coroutines.jvm.internal.ContinuationImpl r34) {
        /*
            Method dump skipped, instruction units count: 934
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.ui.changestop.PremiumBusChangeStopUIStateFactory.b(app.chalo.premiumbus.ui.changestop.ChangeStopScreenState$Failure, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(PremiumBusChangeStopDataState premiumBusChangeStopDataState, ContinuationImpl continuationImpl) {
        PremiumBusChangeStopUIStateFactory$createNoStopsAvailableUIState$1 premiumBusChangeStopUIStateFactory$createNoStopsAvailableUIState$1;
        ImageUIState imageUIState;
        ChaloTextStyleHelper chaloTextStyleHelper;
        if (continuationImpl instanceof PremiumBusChangeStopUIStateFactory$createNoStopsAvailableUIState$1) {
            premiumBusChangeStopUIStateFactory$createNoStopsAvailableUIState$1 = (PremiumBusChangeStopUIStateFactory$createNoStopsAvailableUIState$1) continuationImpl;
            int i = premiumBusChangeStopUIStateFactory$createNoStopsAvailableUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusChangeStopUIStateFactory$createNoStopsAvailableUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusChangeStopUIStateFactory$createNoStopsAvailableUIState$1 = new PremiumBusChangeStopUIStateFactory$createNoStopsAvailableUIState$1(this, continuationImpl);
            }
        } else {
            premiumBusChangeStopUIStateFactory$createNoStopsAvailableUIState$1 = new PremiumBusChangeStopUIStateFactory$createNoStopsAvailableUIState$1(this, continuationImpl);
        }
        Object objB = premiumBusChangeStopUIStateFactory$createNoStopsAvailableUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusChangeStopUIStateFactory$createNoStopsAvailableUIState$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            ImageUIState imageUIState2 = new ImageUIState(IconType.IC_WARNING_IMAGE, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254);
            premiumBusChangeStopUIStateFactory$createNoStopsAvailableUIState$1.L$0 = premiumBusChangeStopDataState;
            premiumBusChangeStopUIStateFactory$createNoStopsAvailableUIState$1.L$1 = imageUIState2;
            ChaloTextStyleHelper chaloTextStyleHelper2 = ChaloTextStyleHelper.f10078a;
            premiumBusChangeStopUIStateFactory$createNoStopsAvailableUIState$1.L$2 = chaloTextStyleHelper2;
            premiumBusChangeStopUIStateFactory$createNoStopsAvailableUIState$1.label = 1;
            objB = this.f7538a.b(StringEnum.NO_OTHER_STOPS_AVAILABLE, new Object[0], premiumBusChangeStopUIStateFactory$createNoStopsAvailableUIState$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            imageUIState = imageUIState2;
            chaloTextStyleHelper = chaloTextStyleHelper2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ChaloTextStyleHelper chaloTextStyleHelper3 = (ChaloTextStyleHelper) premiumBusChangeStopUIStateFactory$createNoStopsAvailableUIState$1.L$2;
            imageUIState = (ImageUIState) premiumBusChangeStopUIStateFactory$createNoStopsAvailableUIState$1.L$1;
            PremiumBusChangeStopDataState premiumBusChangeStopDataState2 = (PremiumBusChangeStopDataState) premiumBusChangeStopUIStateFactory$createNoStopsAvailableUIState$1.L$0;
            ResultKt.b(objB);
            chaloTextStyleHelper = chaloTextStyleHelper3;
            premiumBusChangeStopDataState = premiumBusChangeStopDataState2;
        }
        TextUIState.ChaloTextUIState chaloTextUIStateE = ChaloTextStyleHelper.e(chaloTextStyleHelper, (String) objB, ChaloColorToken.Black_87.f9768a, UITextAlign.Center, UIFontWeight.Bold, null, 100);
        EmptyList emptyList = EmptyList.f17557a;
        MapCameraViewState mapCameraViewState = premiumBusChangeStopDataState.n;
        ChaloMapUIEventHandler.f9960a.getClass();
        return new ChangeStopScreenContent.NoStopsAvailable(imageUIState, chaloTextUIStateE, new ChaloMapUIState(emptyList, false, mapCameraViewState, emptyList, null, null, (ChaloMapUIEventHandler) ChaloMapUIEventHandler.Companion.b.getValue(), 114));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x011b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0141  */
    /* JADX WARN: Code duplicated, block: B:33:0x015b  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object d(EligibleStopAppModel eligibleStopAppModel, PremiumBusChangeStopDataState premiumBusChangeStopDataState, Function1 function1, ContinuationImpl continuationImpl) {
        PremiumBusChangeStopUIStateFactory$createStopCardUIState$1 premiumBusChangeStopUIStateFactory$createStopCardUIState$1;
        PremiumBusChangeStopDataState premiumBusChangeStopDataState2;
        TextUIState.ChaloTextUIState chaloTextUIState;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        RadioButtonUIState radioButtonUIState;
        ODPairTagsUIState oDPairTagsUIState;
        EligibleStopAppModel eligibleStopAppModel2;
        ChaloTextStyleHelper chaloTextStyleHelper;
        Long l;
        TextUIState.ChaloTextUIState chaloTextUIStateC;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        ODPairTagsUIState oDPairTagsUIState2;
        TextUIState.ChaloTextUIState chaloTextUIState4;
        TextUIState.ChaloTextUIState chaloTextUIState5;
        ODPairTagsUIState oDPairTagsUIState3;
        TextUIState.ChaloTextUIState chaloTextUIState6;
        if (continuationImpl instanceof PremiumBusChangeStopUIStateFactory$createStopCardUIState$1) {
            premiumBusChangeStopUIStateFactory$createStopCardUIState$1 = (PremiumBusChangeStopUIStateFactory$createStopCardUIState$1) continuationImpl;
            int i = premiumBusChangeStopUIStateFactory$createStopCardUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusChangeStopUIStateFactory$createStopCardUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusChangeStopUIStateFactory$createStopCardUIState$1 = new PremiumBusChangeStopUIStateFactory$createStopCardUIState$1(this, continuationImpl);
            }
        } else {
            premiumBusChangeStopUIStateFactory$createStopCardUIState$1 = new PremiumBusChangeStopUIStateFactory$createStopCardUIState$1(this, continuationImpl);
        }
        Object objB = premiumBusChangeStopUIStateFactory$createStopCardUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusChangeStopUIStateFactory$createStopCardUIState$1.label;
        StringProvider stringProvider = this.f7538a;
        TimeUtilsContract timeUtilsContract = this.c;
        ChaloTextStyleHelper chaloTextStyleHelper2 = ChaloTextStyleHelper.f10078a;
        if (i2 != 0) {
            if (i2 == 1) {
                ChaloTextStyleHelper chaloTextStyleHelper3 = (ChaloTextStyleHelper) premiumBusChangeStopUIStateFactory$createStopCardUIState$1.L$5;
                radioButtonUIState = (RadioButtonUIState) premiumBusChangeStopUIStateFactory$createStopCardUIState$1.L$4;
                chaloTextUIState2 = (TextUIState.ChaloTextUIState) premiumBusChangeStopUIStateFactory$createStopCardUIState$1.L$3;
                chaloTextUIState = (TextUIState.ChaloTextUIState) premiumBusChangeStopUIStateFactory$createStopCardUIState$1.L$2;
                premiumBusChangeStopDataState2 = (PremiumBusChangeStopDataState) premiumBusChangeStopUIStateFactory$createStopCardUIState$1.L$1;
                eligibleStopAppModel2 = (EligibleStopAppModel) premiumBusChangeStopUIStateFactory$createStopCardUIState$1.L$0;
                ResultKt.b(objB);
                chaloTextStyleHelper = chaloTextStyleHelper3;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oDPairTagsUIState3 = (ODPairTagsUIState) premiumBusChangeStopUIStateFactory$createStopCardUIState$1.L$4;
                radioButtonUIState = (RadioButtonUIState) premiumBusChangeStopUIStateFactory$createStopCardUIState$1.L$3;
                chaloTextUIState5 = (TextUIState.ChaloTextUIState) premiumBusChangeStopUIStateFactory$createStopCardUIState$1.L$2;
                chaloTextUIState6 = (TextUIState.ChaloTextUIState) premiumBusChangeStopUIStateFactory$createStopCardUIState$1.L$1;
                chaloTextStyleHelper2 = (ChaloTextStyleHelper) premiumBusChangeStopUIStateFactory$createStopCardUIState$1.L$0;
                ResultKt.b(objB);
            }
            oDPairTagsUIState2 = oDPairTagsUIState3;
            chaloTextUIState3 = chaloTextUIState5;
            chaloTextUIState4 = chaloTextUIState6;
            chaloTextUIStateC = ChaloTextStyleHelper.c(chaloTextStyleHelper2, (String) objB, ChaloColorToken.ChaloBlueEta.f9777a, null, null, null, null, 124);
            return new PbStopInfoCardUIState(chaloTextUIState4, chaloTextUIState3, radioButtonUIState, oDPairTagsUIState2, chaloTextUIStateC);
        }
        ResultKt.b(objB);
        String str = eligibleStopAppModel.b;
        String str2 = eligibleStopAppModel.f7080a;
        TextUIState.ChaloTextUIState chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper2, str, ChaloColorToken.Black.f9759a, 0, null, UIFontWeight.SemiBold, null, null, 108);
        TextUIState.ChaloTextUIState chaloTextUIStateB2 = ChaloTextStyleHelper.b(chaloTextStyleHelper2, timeUtilsContract.e(eligibleStopAppModel.c), ChaloColorToken.ShadyGray.f9851a, 0, null, null, null, null, 124);
        RadioButtonUIState radioButtonUIState2 = new RadioButtonUIState(Intrinsics.d(str2, premiumBusChangeStopDataState.g), UiEventHandler.Companion.a(new rt0(function1, eligibleStopAppModel, 0)), 60);
        if (!Intrinsics.d(str2, premiumBusChangeStopDataState.b)) {
            premiumBusChangeStopDataState2 = premiumBusChangeStopDataState;
            chaloTextUIState = chaloTextUIStateB;
            chaloTextUIState2 = chaloTextUIStateB2;
            radioButtonUIState = radioButtonUIState2;
            oDPairTagsUIState = null;
            eligibleStopAppModel2 = eligibleStopAppModel;
            l = (Long) premiumBusChangeStopDataState2.h.get(eligibleStopAppModel2.f7080a);
            if (l != null) {
                String strO = timeUtilsContract.O(l.longValue());
                premiumBusChangeStopUIStateFactory$createStopCardUIState$1.L$0 = chaloTextStyleHelper2;
                premiumBusChangeStopUIStateFactory$createStopCardUIState$1.L$1 = chaloTextUIState;
                premiumBusChangeStopUIStateFactory$createStopCardUIState$1.L$2 = chaloTextUIState2;
                premiumBusChangeStopUIStateFactory$createStopCardUIState$1.L$3 = radioButtonUIState;
                premiumBusChangeStopUIStateFactory$createStopCardUIState$1.L$4 = oDPairTagsUIState;
                premiumBusChangeStopUIStateFactory$createStopCardUIState$1.L$5 = null;
                premiumBusChangeStopUIStateFactory$createStopCardUIState$1.label = 2;
                objB = stringProvider.b(StringEnum.IN_X, new Object[]{strO}, premiumBusChangeStopUIStateFactory$createStopCardUIState$1);
                if (objB != coroutineSingletons) {
                    chaloTextUIState5 = chaloTextUIState2;
                    oDPairTagsUIState3 = oDPairTagsUIState;
                    chaloTextUIState6 = chaloTextUIState;
                    oDPairTagsUIState2 = oDPairTagsUIState3;
                    chaloTextUIState3 = chaloTextUIState5;
                    chaloTextUIState4 = chaloTextUIState6;
                    chaloTextUIStateC = ChaloTextStyleHelper.c(chaloTextStyleHelper2, (String) objB, ChaloColorToken.ChaloBlueEta.f9777a, null, null, null, null, 124);
                }
            } else {
                chaloTextUIStateC = null;
                chaloTextUIState3 = chaloTextUIState2;
                oDPairTagsUIState2 = oDPairTagsUIState;
                chaloTextUIState4 = chaloTextUIState;
            }
            return new PbStopInfoCardUIState(chaloTextUIState4, chaloTextUIState3, radioButtonUIState, oDPairTagsUIState2, chaloTextUIStateC);
        }
        premiumBusChangeStopUIStateFactory$createStopCardUIState$1.L$0 = eligibleStopAppModel;
        premiumBusChangeStopUIStateFactory$createStopCardUIState$1.L$1 = premiumBusChangeStopDataState;
        premiumBusChangeStopUIStateFactory$createStopCardUIState$1.L$2 = chaloTextUIStateB;
        premiumBusChangeStopUIStateFactory$createStopCardUIState$1.L$3 = chaloTextUIStateB2;
        premiumBusChangeStopUIStateFactory$createStopCardUIState$1.L$4 = radioButtonUIState2;
        premiumBusChangeStopUIStateFactory$createStopCardUIState$1.L$5 = chaloTextStyleHelper2;
        premiumBusChangeStopUIStateFactory$createStopCardUIState$1.label = 1;
        objB = stringProvider.b(StringEnum.CURRENT_PICKUP, new Object[0], premiumBusChangeStopUIStateFactory$createStopCardUIState$1);
        if (objB != coroutineSingletons) {
            premiumBusChangeStopDataState2 = premiumBusChangeStopDataState;
            chaloTextUIState = chaloTextUIStateB;
            chaloTextStyleHelper = chaloTextStyleHelper2;
            chaloTextUIState2 = chaloTextUIStateB2;
            radioButtonUIState = radioButtonUIState2;
            eligibleStopAppModel2 = eligibleStopAppModel;
        }
        return coroutineSingletons;
        oDPairTagsUIState = new ODPairTagsUIState(ChaloTextStyleHelper.c(chaloTextStyleHelper, (String) objB, ChaloColorToken.Green.f9799a, null, null, null, null, 124));
        l = (Long) premiumBusChangeStopDataState2.h.get(eligibleStopAppModel2.f7080a);
        if (l != null) {
            String strO2 = timeUtilsContract.O(l.longValue());
            premiumBusChangeStopUIStateFactory$createStopCardUIState$1.L$0 = chaloTextStyleHelper2;
            premiumBusChangeStopUIStateFactory$createStopCardUIState$1.L$1 = chaloTextUIState;
            premiumBusChangeStopUIStateFactory$createStopCardUIState$1.L$2 = chaloTextUIState2;
            premiumBusChangeStopUIStateFactory$createStopCardUIState$1.L$3 = radioButtonUIState;
            premiumBusChangeStopUIStateFactory$createStopCardUIState$1.L$4 = oDPairTagsUIState;
            premiumBusChangeStopUIStateFactory$createStopCardUIState$1.L$5 = null;
            premiumBusChangeStopUIStateFactory$createStopCardUIState$1.label = 2;
            objB = stringProvider.b(StringEnum.IN_X, new Object[]{strO2}, premiumBusChangeStopUIStateFactory$createStopCardUIState$1);
            if (objB != coroutineSingletons) {
                chaloTextUIState5 = chaloTextUIState2;
                oDPairTagsUIState3 = oDPairTagsUIState;
                chaloTextUIState6 = chaloTextUIState;
                oDPairTagsUIState2 = oDPairTagsUIState3;
                chaloTextUIState3 = chaloTextUIState5;
                chaloTextUIState4 = chaloTextUIState6;
                chaloTextUIStateC = ChaloTextStyleHelper.c(chaloTextStyleHelper2, (String) objB, ChaloColorToken.ChaloBlueEta.f9777a, null, null, null, null, 124);
            }
            return coroutineSingletons;
        }
        chaloTextUIStateC = null;
        chaloTextUIState3 = chaloTextUIState2;
        oDPairTagsUIState2 = oDPairTagsUIState;
        chaloTextUIState4 = chaloTextUIState;
        return new PbStopInfoCardUIState(chaloTextUIState4, chaloTextUIState3, radioButtonUIState, oDPairTagsUIState2, chaloTextUIStateC);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object e(String str, String str2, String str3, Function1 function1, ContinuationImpl continuationImpl) {
        PremiumBusChangeStopUIStateFactory$createStopInfoWindow$1 premiumBusChangeStopUIStateFactory$createStopInfoWindow$1;
        Object obj;
        TextUIState.ChaloTextUIState chaloTextUIState;
        ImageUIState imageUIState;
        String str4;
        Function1 function2;
        ChaloMapMarkerInfoWindowProvider chaloMapMarkerInfoWindowProvider;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        if (continuationImpl instanceof PremiumBusChangeStopUIStateFactory$createStopInfoWindow$1) {
            premiumBusChangeStopUIStateFactory$createStopInfoWindow$1 = (PremiumBusChangeStopUIStateFactory$createStopInfoWindow$1) continuationImpl;
            int i = premiumBusChangeStopUIStateFactory$createStopInfoWindow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusChangeStopUIStateFactory$createStopInfoWindow$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusChangeStopUIStateFactory$createStopInfoWindow$1 = new PremiumBusChangeStopUIStateFactory$createStopInfoWindow$1(this, continuationImpl);
            }
        } else {
            premiumBusChangeStopUIStateFactory$createStopInfoWindow$1 = new PremiumBusChangeStopUIStateFactory$createStopInfoWindow$1(this, continuationImpl);
        }
        Object obj2 = premiumBusChangeStopUIStateFactory$createStopInfoWindow$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusChangeStopUIStateFactory$createStopInfoWindow$1.label;
        ChaloColorToken.OrangePrimary orangePrimary = ChaloColorToken.OrangePrimary.f9835a;
        if (i2 == 0) {
            ResultKt.b(obj2);
            TextUIState.ChaloTextUIState chaloTextUIState3 = str != null ? new TextUIState.ChaloTextUIState(str, UITextStyle.BodySmall, ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184) : null;
            TextUIState.ChaloTextUIState chaloTextUIState4 = new TextUIState.ChaloTextUIState(str3, UITextStyle.BodyMedium, ChaloColorToken.AlmostBlackColor.f9756a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
            ImageUIState imageUIState2 = new ImageUIState(IconType.IC_STOP_DIRECTIONS, (String) null, orangePrimary, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 242);
            premiumBusChangeStopUIStateFactory$createStopInfoWindow$1.L$0 = str2;
            premiumBusChangeStopUIStateFactory$createStopInfoWindow$1.L$1 = function1;
            ChaloMapMarkerInfoWindowProvider chaloMapMarkerInfoWindowProvider2 = this.d;
            premiumBusChangeStopUIStateFactory$createStopInfoWindow$1.L$2 = chaloMapMarkerInfoWindowProvider2;
            premiumBusChangeStopUIStateFactory$createStopInfoWindow$1.L$3 = chaloTextUIState3;
            premiumBusChangeStopUIStateFactory$createStopInfoWindow$1.L$4 = chaloTextUIState4;
            premiumBusChangeStopUIStateFactory$createStopInfoWindow$1.L$5 = imageUIState2;
            premiumBusChangeStopUIStateFactory$createStopInfoWindow$1.label = 1;
            Object objB = this.f7538a.b(StringEnum.DIRECTIONS, new Object[0], premiumBusChangeStopUIStateFactory$createStopInfoWindow$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = objB;
            chaloTextUIState = chaloTextUIState4;
            imageUIState = imageUIState2;
            str4 = str2;
            function2 = function1;
            chaloMapMarkerInfoWindowProvider = chaloMapMarkerInfoWindowProvider2;
            chaloTextUIState2 = chaloTextUIState3;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ImageUIState imageUIState3 = (ImageUIState) premiumBusChangeStopUIStateFactory$createStopInfoWindow$1.L$5;
            TextUIState.ChaloTextUIState chaloTextUIState5 = (TextUIState.ChaloTextUIState) premiumBusChangeStopUIStateFactory$createStopInfoWindow$1.L$4;
            TextUIState.ChaloTextUIState chaloTextUIState6 = (TextUIState.ChaloTextUIState) premiumBusChangeStopUIStateFactory$createStopInfoWindow$1.L$3;
            chaloMapMarkerInfoWindowProvider = (ChaloMapMarkerInfoWindowProvider) premiumBusChangeStopUIStateFactory$createStopInfoWindow$1.L$2;
            Function1 function3 = (Function1) premiumBusChangeStopUIStateFactory$createStopInfoWindow$1.L$1;
            str4 = (String) premiumBusChangeStopUIStateFactory$createStopInfoWindow$1.L$0;
            ResultKt.b(obj2);
            chaloTextUIState = chaloTextUIState5;
            chaloTextUIState2 = chaloTextUIState6;
            imageUIState = imageUIState3;
            obj = obj2;
            function2 = function3;
        }
        return chaloMapMarkerInfoWindowProvider.a(new ChangeStopMapMarkerUIState.ChangeStopStopMarkerInfoWindowUIState(chaloTextUIState2, chaloTextUIState, imageUIState, new TextUIState.ChaloTextUIState((String) obj, UITextStyle.TitleLarge, orangePrimary, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), UiEventHandler.Companion.a(new w60(7, str4, function2))));
    }

    /* JADX WARN: Code duplicated, block: B:38:0x019b  */
    /* JADX WARN: Code duplicated, block: B:41:0x01be  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x01be -> B:42:0x01c0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object f(app.chalo.premiumbus.ui.changestop.PremiumBusChangeStopDataState r27, kotlin.jvm.functions.Function1 r28, app.chalo.premiumbus.ui.changestop.ChangeStopScreenState r29, kotlin.coroutines.jvm.internal.ContinuationImpl r30) {
        /*
            Method dump skipped, instruction units count: 676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.ui.changestop.PremiumBusChangeStopUIStateFactory.f(app.chalo.premiumbus.ui.changestop.PremiumBusChangeStopDataState, kotlin.jvm.functions.Function1, app.chalo.premiumbus.ui.changestop.ChangeStopScreenState, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0087, code lost:
    
        if (r3 == r5) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ee, code lost:
    
        if (r3 == r5) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x010d, code lost:
    
        if (r3 == r5) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011a, code lost:
    
        if (r3 == r5) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(app.chalo.premiumbus.ui.changestop.PremiumBusChangeStopDataState r26, kotlin.jvm.functions.Function1 r27, kotlin.coroutines.jvm.internal.ContinuationImpl r28) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.ui.changestop.PremiumBusChangeStopUIStateFactory.g(app.chalo.premiumbus.ui.changestop.PremiumBusChangeStopDataState, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}

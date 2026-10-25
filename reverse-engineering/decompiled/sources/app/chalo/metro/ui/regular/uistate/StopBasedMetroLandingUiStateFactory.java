package app.chalo.metro.ui.regular.uistate;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.metro.ui.landing.uistate.MetroTicketBenefitUiState;
import app.chalo.metro.ui.landing.uistate.MetroTicketBenefitsContainerSpec;
import app.chalo.metro.ui.landing.uistate.MetroTicketBenefitsContainerUiState;
import app.chalo.metro.ui.regular.MetroPassengerTypeDataModel;
import app.chalo.metro.ui.regular.StopBasedMetroLandingScreenBottomSheetType;
import app.chalo.metro.ui.regular.StopBasedMetroLandingScreenDataState;
import app.chalo.metro.ui.regular.StopBasedMetroLandingScreenViewIntent;
import app.chalo.metro.ui.uistate.ProductBannerSpec;
import app.chalo.metro.ui.uistate.ProductBannerUIState;
import app.chalo.models.productbooking.productcapability.OperationalHoursAppModel;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.recent.model.app.RecentStopBasedTripAppModel;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.bottomsheet.BottomSheetEventHandler;
import app.chalo.uistate.bottomsheet.BottomSheetRequestHandler;
import app.chalo.uistate.bottomsheet.BottomSheetUiSpec;
import app.chalo.uistate.bottomsheet.BottomSheetUiState;
import app.chalo.uistate.button.ButtonUIStateFactory;
import app.chalo.uistate.components.ChaloRecentlySearchedCardSpec;
import app.chalo.uistate.components.ChaloRecentlySearchedCardUiState;
import app.chalo.uistate.components.FromToStopIconUIState;
import app.chalo.uistate.components.RecentlySearchedContainerSpec;
import app.chalo.uistate.components.RecentlySearchedContainerUiState;
import app.chalo.uistate.components.StopSelectionUIState;
import app.chalo.uistate.dialog.DialogUIStateFactory;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.divider.DividerOrientation;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.fromto.StopBasedMetroFromToSelectionContainerUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.passengercounter.PassengerCounterSpec;
import app.chalo.uistate.passengercounter.PassengerCounterUiState;
import app.chalo.uistate.text.ChaloTextStyleHelper;
import app.chalo.uistate.text.StyledTextDataUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.uistate.toolbar.ToolbarUIState;
import app.chalo.uistate.toolbar.ToolbarUiSpecs;
import app.chalo.utils.timeutil.TimeUtilsContract;
import defpackage.fa1;
import defpackage.ri0;
import defpackage.vo1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/regular/uistate/StopBasedMetroLandingUiStateFactory;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StopBasedMetroLandingUiStateFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringProvider f5554a;
    public final TimeUtilsContract b;
    public TextUIState.StyledTextUIState c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5555a;

        static {
            int[] iArr = new int[StopBasedMetroLandingScreenBottomSheetType.values().length];
            try {
                iArr[StopBasedMetroLandingScreenBottomSheetType.PassengerSelection.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StopBasedMetroLandingScreenBottomSheetType.None.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f5555a = iArr;
        }
    }

    public StopBasedMetroLandingUiStateFactory(StringProvider stringProvider, TimeUtilsContract timeUtilsContract) {
        this.f5554a = stringProvider;
        this.b = timeUtilsContract;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0184  */
    /* JADX WARN: Code duplicated, block: B:36:0x0202  */
    /* JADX WARN: Code duplicated, block: B:40:0x0269  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(ContinuationImpl continuationImpl) {
        StopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1 stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1;
        ProductBannerSpec productBannerSpec;
        ImageUIState imageUIState;
        TextUIState.ChaloTextUIState chaloTextUIState;
        StringProvider stringProvider;
        ProductBannerUIState productBannerUIState;
        MetroTicketBenefitUiState[] metroTicketBenefitUiStateArr;
        ImageUIState imageUIState2;
        Object objB;
        int i;
        ProductBannerUIState productBannerUIState2;
        MetroTicketBenefitUiState[] metroTicketBenefitUiStateArr2;
        ProductBannerUIState productBannerUIState3;
        ImageUIState imageUIState3;
        int i2;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        MetroTicketBenefitUiState[] metroTicketBenefitUiStateArr3;
        ImageUIState imageUIState4;
        ImageUIState imageUIState5;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        MetroTicketBenefitUiState[] metroTicketBenefitUiStateArr4;
        MetroTicketBenefitUiState[] metroTicketBenefitUiStateArr5;
        ProductBannerUIState productBannerUIState4;
        int i3;
        if (continuationImpl instanceof StopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1) {
            stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1 = (StopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1) continuationImpl;
            int i4 = stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.label = i4 - Integer.MIN_VALUE;
            } else {
                stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1 = new StopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1(this, continuationImpl);
            }
        } else {
            stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1 = new StopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1(this, continuationImpl);
        }
        Object objB2 = stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.label;
        ChaloColorToken.AlmostBlackColor almostBlackColor = ChaloColorToken.AlmostBlackColor.f9756a;
        StringProvider stringProvider2 = this.f5554a;
        if (i5 == 0) {
            ResultKt.b(objB2);
            stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.label = 1;
            objB2 = stringProvider2.b(StringEnum.WHY_QR_TICKETS, new Object[0], stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1);
            if (objB2 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i5 == 1) {
            ResultKt.b(objB2);
        } else {
            if (i5 == 2) {
                imageUIState = (ImageUIState) stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$2;
                productBannerSpec = (ProductBannerSpec) stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$1;
                chaloTextUIState = (TextUIState.ChaloTextUIState) stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$0;
                ResultKt.b(objB2);
                stringProvider = stringProvider2;
                productBannerUIState = new ProductBannerUIState(productBannerSpec, new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodyMedium, almostBlackColor, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), imageUIState);
                metroTicketBenefitUiStateArr = new MetroTicketBenefitUiState[3];
                imageUIState2 = new ImageUIState(IconType.IC_ADD_TO_HOME, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().B), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$0 = chaloTextUIState;
                stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$1 = productBannerUIState;
                stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$2 = metroTicketBenefitUiStateArr;
                stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$3 = metroTicketBenefitUiStateArr;
                stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$4 = imageUIState2;
                stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.I$0 = 0;
                stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.label = 3;
                objB = stringProvider.b(StringEnum.PAY_FAST_DIGITALLY, new Object[0], stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1);
                if (objB != coroutineSingletons) {
                    i = 0;
                    productBannerUIState2 = productBannerUIState;
                    metroTicketBenefitUiStateArr2 = metroTicketBenefitUiStateArr;
                    productBannerUIState3 = productBannerUIState2;
                    metroTicketBenefitUiStateArr[i] = new MetroTicketBenefitUiState(imageUIState2, new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodyMedium, almostBlackColor, 2, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8144), new DividerUIState(0.0f, null, DividerOrientation.Vertical, 3));
                    imageUIState3 = new ImageUIState(IconType.RECHARGE_CHALO_PAY_WALLET_ICON, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().B), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                    stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$0 = chaloTextUIState;
                    stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$1 = productBannerUIState3;
                    stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$2 = metroTicketBenefitUiStateArr2;
                    stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$3 = metroTicketBenefitUiStateArr2;
                    stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$4 = imageUIState3;
                    stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.I$0 = 1;
                    stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.label = 4;
                    objB2 = stringProvider.b(StringEnum.NO_WAITING_IN_LINE, new Object[0], stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1);
                    if (objB2 != coroutineSingletons) {
                        i2 = 1;
                        chaloTextUIState2 = chaloTextUIState;
                        metroTicketBenefitUiStateArr3 = metroTicketBenefitUiStateArr2;
                        metroTicketBenefitUiStateArr3[i2] = new MetroTicketBenefitUiState(imageUIState3, new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodyMedium, almostBlackColor, 2, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8144), new DividerUIState(0.0f, null, DividerOrientation.Vertical, 3));
                        imageUIState4 = new ImageUIState(IconType.IC_QUICK_VALIDATION, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().B), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                        stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$0 = chaloTextUIState2;
                        stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$1 = productBannerUIState3;
                        stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$2 = metroTicketBenefitUiStateArr2;
                        stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$3 = metroTicketBenefitUiStateArr2;
                        stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$4 = imageUIState4;
                        stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.I$0 = 2;
                        stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.label = 5;
                        objB2 = stringProvider.b(StringEnum.QUICK_VALIDATION, new Object[0], stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1);
                        if (objB2 != coroutineSingletons) {
                            imageUIState5 = imageUIState4;
                            chaloTextUIState3 = chaloTextUIState2;
                            metroTicketBenefitUiStateArr4 = metroTicketBenefitUiStateArr2;
                            metroTicketBenefitUiStateArr5 = metroTicketBenefitUiStateArr4;
                            productBannerUIState4 = productBannerUIState3;
                            i3 = 2;
                        }
                    }
                }
                return coroutineSingletons;
            }
            if (i5 == 3) {
                int i6 = stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.I$0;
                imageUIState2 = (ImageUIState) stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$4;
                MetroTicketBenefitUiState[] metroTicketBenefitUiStateArr6 = (MetroTicketBenefitUiState[]) stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$3;
                MetroTicketBenefitUiState[] metroTicketBenefitUiStateArr7 = (MetroTicketBenefitUiState[]) stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$2;
                ProductBannerUIState productBannerUIState5 = (ProductBannerUIState) stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$1;
                chaloTextUIState = (TextUIState.ChaloTextUIState) stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$0;
                ResultKt.b(objB2);
                i = i6;
                metroTicketBenefitUiStateArr = metroTicketBenefitUiStateArr6;
                stringProvider = stringProvider2;
                objB = objB2;
                productBannerUIState2 = productBannerUIState5;
                metroTicketBenefitUiStateArr2 = metroTicketBenefitUiStateArr7;
                productBannerUIState3 = productBannerUIState2;
                metroTicketBenefitUiStateArr[i] = new MetroTicketBenefitUiState(imageUIState2, new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodyMedium, almostBlackColor, 2, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8144), new DividerUIState(0.0f, null, DividerOrientation.Vertical, 3));
                imageUIState3 = new ImageUIState(IconType.RECHARGE_CHALO_PAY_WALLET_ICON, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().B), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$0 = chaloTextUIState;
                stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$1 = productBannerUIState3;
                stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$2 = metroTicketBenefitUiStateArr2;
                stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$3 = metroTicketBenefitUiStateArr2;
                stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$4 = imageUIState3;
                stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.I$0 = 1;
                stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.label = 4;
                objB2 = stringProvider.b(StringEnum.NO_WAITING_IN_LINE, new Object[0], stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1);
                if (objB2 != coroutineSingletons) {
                    i2 = 1;
                    chaloTextUIState2 = chaloTextUIState;
                    metroTicketBenefitUiStateArr3 = metroTicketBenefitUiStateArr2;
                    metroTicketBenefitUiStateArr3[i2] = new MetroTicketBenefitUiState(imageUIState3, new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodyMedium, almostBlackColor, 2, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8144), new DividerUIState(0.0f, null, DividerOrientation.Vertical, 3));
                    imageUIState4 = new ImageUIState(IconType.IC_QUICK_VALIDATION, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().B), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                    stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$0 = chaloTextUIState2;
                    stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$1 = productBannerUIState3;
                    stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$2 = metroTicketBenefitUiStateArr2;
                    stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$3 = metroTicketBenefitUiStateArr2;
                    stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$4 = imageUIState4;
                    stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.I$0 = 2;
                    stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.label = 5;
                    objB2 = stringProvider.b(StringEnum.QUICK_VALIDATION, new Object[0], stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1);
                    if (objB2 != coroutineSingletons) {
                        imageUIState5 = imageUIState4;
                        chaloTextUIState3 = chaloTextUIState2;
                        metroTicketBenefitUiStateArr4 = metroTicketBenefitUiStateArr2;
                        metroTicketBenefitUiStateArr5 = metroTicketBenefitUiStateArr4;
                        productBannerUIState4 = productBannerUIState3;
                        i3 = 2;
                    }
                }
                return coroutineSingletons;
            }
            if (i5 == 4) {
                i2 = stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.I$0;
                imageUIState3 = (ImageUIState) stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$4;
                MetroTicketBenefitUiState[] metroTicketBenefitUiStateArr8 = (MetroTicketBenefitUiState[]) stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$3;
                MetroTicketBenefitUiState[] metroTicketBenefitUiStateArr9 = (MetroTicketBenefitUiState[]) stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$2;
                ProductBannerUIState productBannerUIState6 = (ProductBannerUIState) stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$1;
                chaloTextUIState2 = (TextUIState.ChaloTextUIState) stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$0;
                ResultKt.b(objB2);
                productBannerUIState3 = productBannerUIState6;
                metroTicketBenefitUiStateArr3 = metroTicketBenefitUiStateArr8;
                stringProvider = stringProvider2;
                metroTicketBenefitUiStateArr2 = metroTicketBenefitUiStateArr9;
                metroTicketBenefitUiStateArr3[i2] = new MetroTicketBenefitUiState(imageUIState3, new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodyMedium, almostBlackColor, 2, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8144), new DividerUIState(0.0f, null, DividerOrientation.Vertical, 3));
                imageUIState4 = new ImageUIState(IconType.IC_QUICK_VALIDATION, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().B), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$0 = chaloTextUIState2;
                stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$1 = productBannerUIState3;
                stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$2 = metroTicketBenefitUiStateArr2;
                stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$3 = metroTicketBenefitUiStateArr2;
                stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$4 = imageUIState4;
                stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.I$0 = 2;
                stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.label = 5;
                objB2 = stringProvider.b(StringEnum.QUICK_VALIDATION, new Object[0], stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1);
                if (objB2 != coroutineSingletons) {
                    imageUIState5 = imageUIState4;
                    chaloTextUIState3 = chaloTextUIState2;
                    metroTicketBenefitUiStateArr4 = metroTicketBenefitUiStateArr2;
                    metroTicketBenefitUiStateArr5 = metroTicketBenefitUiStateArr4;
                    productBannerUIState4 = productBannerUIState3;
                    i3 = 2;
                }
                return coroutineSingletons;
            }
            if (i5 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.I$0;
            imageUIState5 = (ImageUIState) stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$4;
            metroTicketBenefitUiStateArr4 = (MetroTicketBenefitUiState[]) stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$3;
            metroTicketBenefitUiStateArr5 = (MetroTicketBenefitUiState[]) stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$2;
            productBannerUIState4 = (ProductBannerUIState) stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$1;
            chaloTextUIState3 = (TextUIState.ChaloTextUIState) stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$0;
            ResultKt.b(objB2);
        }
        metroTicketBenefitUiStateArr4[i3] = new MetroTicketBenefitUiState(imageUIState5, new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodyMedium, almostBlackColor, 2, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8144), new DividerUIState(0.0f, null, DividerOrientation.Vertical, 3));
        return new MetroTicketBenefitsContainerUiState(new MetroTicketBenefitsContainerSpec(), chaloTextUIState3, CollectionsKt.S(metroTicketBenefitUiStateArr5), productBannerUIState4);
        TextUIState.ChaloTextUIState chaloTextUIState4 = new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodyMedium, ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
        productBannerSpec = new ProductBannerSpec();
        imageUIState = new ImageUIState(IconType.IC_CHECK_ICON, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().i), UIContentScale.Fit, 0.0f, (UiEventHandler) null, 230);
        stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$0 = chaloTextUIState4;
        stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$1 = productBannerSpec;
        stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$2 = imageUIState;
        stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.label = 2;
        Object objB3 = stringProvider2.b(StringEnum.TRUSTED_BY_10M_PLUS_INDIANS, new Object[0], stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1);
        if (objB3 != coroutineSingletons) {
            chaloTextUIState = chaloTextUIState4;
            objB2 = objB3;
            stringProvider = stringProvider2;
            productBannerUIState = new ProductBannerUIState(productBannerSpec, new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodyMedium, almostBlackColor, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), imageUIState);
            metroTicketBenefitUiStateArr = new MetroTicketBenefitUiState[3];
            imageUIState2 = new ImageUIState(IconType.IC_ADD_TO_HOME, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().B), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
            stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$0 = chaloTextUIState;
            stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$1 = productBannerUIState;
            stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$2 = metroTicketBenefitUiStateArr;
            stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$3 = metroTicketBenefitUiStateArr;
            stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$4 = imageUIState2;
            stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.I$0 = 0;
            stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.label = 3;
            objB = stringProvider.b(StringEnum.PAY_FAST_DIGITALLY, new Object[0], stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1);
            if (objB != coroutineSingletons) {
                i = 0;
                productBannerUIState2 = productBannerUIState;
                metroTicketBenefitUiStateArr2 = metroTicketBenefitUiStateArr;
                productBannerUIState3 = productBannerUIState2;
                metroTicketBenefitUiStateArr[i] = new MetroTicketBenefitUiState(imageUIState2, new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodyMedium, almostBlackColor, 2, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8144), new DividerUIState(0.0f, null, DividerOrientation.Vertical, 3));
                imageUIState3 = new ImageUIState(IconType.RECHARGE_CHALO_PAY_WALLET_ICON, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().B), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$0 = chaloTextUIState;
                stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$1 = productBannerUIState3;
                stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$2 = metroTicketBenefitUiStateArr2;
                stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$3 = metroTicketBenefitUiStateArr2;
                stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$4 = imageUIState3;
                stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.I$0 = 1;
                stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.label = 4;
                objB2 = stringProvider.b(StringEnum.NO_WAITING_IN_LINE, new Object[0], stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1);
                if (objB2 != coroutineSingletons) {
                    i2 = 1;
                    chaloTextUIState2 = chaloTextUIState;
                    metroTicketBenefitUiStateArr3 = metroTicketBenefitUiStateArr2;
                    metroTicketBenefitUiStateArr3[i2] = new MetroTicketBenefitUiState(imageUIState3, new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodyMedium, almostBlackColor, 2, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8144), new DividerUIState(0.0f, null, DividerOrientation.Vertical, 3));
                    imageUIState4 = new ImageUIState(IconType.IC_QUICK_VALIDATION, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().B), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                    stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$0 = chaloTextUIState2;
                    stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$1 = productBannerUIState3;
                    stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$2 = metroTicketBenefitUiStateArr2;
                    stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$3 = metroTicketBenefitUiStateArr2;
                    stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.L$4 = imageUIState4;
                    stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.I$0 = 2;
                    stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1.label = 5;
                    objB2 = stringProvider.b(StringEnum.QUICK_VALIDATION, new Object[0], stopBasedMetroLandingUiStateFactory$getBenefitContainerUIState$1);
                    if (objB2 != coroutineSingletons) {
                        imageUIState5 = imageUIState4;
                        chaloTextUIState3 = chaloTextUIState2;
                        metroTicketBenefitUiStateArr4 = metroTicketBenefitUiStateArr2;
                        metroTicketBenefitUiStateArr5 = metroTicketBenefitUiStateArr4;
                        productBannerUIState4 = productBannerUIState3;
                        i3 = 2;
                        metroTicketBenefitUiStateArr4[i3] = new MetroTicketBenefitUiState(imageUIState5, new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodyMedium, almostBlackColor, 2, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8144), new DividerUIState(0.0f, null, DividerOrientation.Vertical, 3));
                        return new MetroTicketBenefitsContainerUiState(new MetroTicketBenefitsContainerSpec(), chaloTextUIState3, CollectionsKt.S(metroTicketBenefitUiStateArr5), productBannerUIState4);
                    }
                }
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(StopBasedMetroLandingScreenDataState stopBasedMetroLandingScreenDataState, Function1 function1, ContinuationImpl continuationImpl) {
        StopBasedMetroLandingUiStateFactory$getBottomSheetUiState$1 stopBasedMetroLandingUiStateFactory$getBottomSheetUiState$1;
        BottomSheetUiState bottomSheetUiState;
        if (continuationImpl instanceof StopBasedMetroLandingUiStateFactory$getBottomSheetUiState$1) {
            stopBasedMetroLandingUiStateFactory$getBottomSheetUiState$1 = (StopBasedMetroLandingUiStateFactory$getBottomSheetUiState$1) continuationImpl;
            int i = stopBasedMetroLandingUiStateFactory$getBottomSheetUiState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopBasedMetroLandingUiStateFactory$getBottomSheetUiState$1.label = i - Integer.MIN_VALUE;
            } else {
                stopBasedMetroLandingUiStateFactory$getBottomSheetUiState$1 = new StopBasedMetroLandingUiStateFactory$getBottomSheetUiState$1(this, continuationImpl);
            }
        } else {
            stopBasedMetroLandingUiStateFactory$getBottomSheetUiState$1 = new StopBasedMetroLandingUiStateFactory$getBottomSheetUiState$1(this, continuationImpl);
        }
        Object obj = stopBasedMetroLandingUiStateFactory$getBottomSheetUiState$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = stopBasedMetroLandingUiStateFactory$getBottomSheetUiState$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            int i3 = WhenMappings.f5555a[stopBasedMetroLandingScreenDataState.k.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    return StopBasedMetroLandingScreenBottomSheetUiStateType.None.b;
                }
                throw new NoWhenBranchMatchedException();
            }
            Map map = stopBasedMetroLandingScreenDataState.l;
            if (map == null) {
                return StopBasedMetroLandingScreenBottomSheetUiStateType.None.b;
            }
            BottomSheetUiState bottomSheetUiState2 = new BottomSheetUiState(new BottomSheetUiSpec(new UIShape.Rectangle(ChaloThemeHelper.a().f, ChaloThemeHelper.a().f, 0.0f, 0.0f, 12), 14), new BottomSheetEventHandler(false, false, BottomSheetRequestHandler.Companion.a(new fa1(function1, 13)), 63));
            stopBasedMetroLandingUiStateFactory$getBottomSheetUiState$1.L$0 = bottomSheetUiState2;
            stopBasedMetroLandingUiStateFactory$getBottomSheetUiState$1.label = 1;
            Object objC = c(map, function1, stopBasedMetroLandingUiStateFactory$getBottomSheetUiState$1);
            if (objC == obj2) {
                return obj2;
            }
            obj = objC;
            bottomSheetUiState = bottomSheetUiState2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bottomSheetUiState = (BottomSheetUiState) stopBasedMetroLandingUiStateFactory$getBottomSheetUiState$1.L$0;
            ResultKt.b(obj);
        }
        return new StopBasedMetroLandingScreenBottomSheetUiStateType.PassengerSelection(bottomSheetUiState, (PassengerSelectionContainerUiState) obj);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object c(Map map, final Function1 function1, ContinuationImpl continuationImpl) {
        StopBasedMetroLandingUiStateFactory$getPassengerSelectionUiState$1 stopBasedMetroLandingUiStateFactory$getPassengerSelectionUiState$1;
        PassengerSelectionUISpec passengerSelectionUISpec;
        Function1 function2;
        CoroutineSingletons coroutineSingletons;
        List list;
        UiEventHandler uiEventHandlerA;
        PassengerSelectionUISpec passengerSelectionUISpec2;
        Function1 function3;
        TextUIState.ChaloTextUIState chaloTextUIState;
        ImageUIState imageUIState;
        ButtonUIStateFactory buttonUIStateFactory;
        if (continuationImpl instanceof StopBasedMetroLandingUiStateFactory$getPassengerSelectionUiState$1) {
            stopBasedMetroLandingUiStateFactory$getPassengerSelectionUiState$1 = (StopBasedMetroLandingUiStateFactory$getPassengerSelectionUiState$1) continuationImpl;
            int i = stopBasedMetroLandingUiStateFactory$getPassengerSelectionUiState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopBasedMetroLandingUiStateFactory$getPassengerSelectionUiState$1.label = i - Integer.MIN_VALUE;
            } else {
                stopBasedMetroLandingUiStateFactory$getPassengerSelectionUiState$1 = new StopBasedMetroLandingUiStateFactory$getPassengerSelectionUiState$1(this, continuationImpl);
            }
        } else {
            stopBasedMetroLandingUiStateFactory$getPassengerSelectionUiState$1 = new StopBasedMetroLandingUiStateFactory$getPassengerSelectionUiState$1(this, continuationImpl);
        }
        Object objB = stopBasedMetroLandingUiStateFactory$getPassengerSelectionUiState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = stopBasedMetroLandingUiStateFactory$getPassengerSelectionUiState$1.label;
        StringProvider stringProvider = this.f5554a;
        ChaloColorToken.AlmostBlackColor almostBlackColor = ChaloColorToken.AlmostBlackColor.f9756a;
        char c = 2;
        boolean z = false;
        boolean z2 = true;
        if (i2 != 0) {
            if (i2 == 1) {
                PassengerSelectionUISpec passengerSelectionUISpec3 = (PassengerSelectionUISpec) stopBasedMetroLandingUiStateFactory$getPassengerSelectionUiState$1.L$2;
                List list2 = (List) stopBasedMetroLandingUiStateFactory$getPassengerSelectionUiState$1.L$1;
                Function1 function4 = (Function1) stopBasedMetroLandingUiStateFactory$getPassengerSelectionUiState$1.L$0;
                ResultKt.b(objB);
                passengerSelectionUISpec = passengerSelectionUISpec3;
                list = list2;
                coroutineSingletons = coroutineSingletons2;
                function2 = function4;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) stopBasedMetroLandingUiStateFactory$getPassengerSelectionUiState$1.L$5;
                ImageUIState imageUIState2 = (ImageUIState) stopBasedMetroLandingUiStateFactory$getPassengerSelectionUiState$1.L$4;
                TextUIState.ChaloTextUIState chaloTextUIState2 = (TextUIState.ChaloTextUIState) stopBasedMetroLandingUiStateFactory$getPassengerSelectionUiState$1.L$3;
                PassengerSelectionUISpec passengerSelectionUISpec4 = (PassengerSelectionUISpec) stopBasedMetroLandingUiStateFactory$getPassengerSelectionUiState$1.L$2;
                ButtonUIStateFactory buttonUIStateFactory2 = (ButtonUIStateFactory) stopBasedMetroLandingUiStateFactory$getPassengerSelectionUiState$1.L$1;
                function3 = (Function1) stopBasedMetroLandingUiStateFactory$getPassengerSelectionUiState$1.L$0;
                ResultKt.b(objB);
                imageUIState = imageUIState2;
                chaloTextUIState = chaloTextUIState2;
                passengerSelectionUISpec2 = passengerSelectionUISpec4;
                buttonUIStateFactory = buttonUIStateFactory2;
            }
            return new PassengerSelectionContainerUiState(passengerSelectionUISpec2, chaloTextUIState, imageUIState, list, ButtonUIStateFactory.g(buttonUIStateFactory, (String) objB, new fa1(function3, 12), null, UIShape.d, true, 0.0f, 36));
        }
        ResultKt.b(objB);
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            final Map.Entry entry = (Map.Entry) it.next();
            boolean z3 = ((MetroPassengerTypeDataModel) entry.getValue()).c > ((MetroPassengerTypeDataModel) entry.getValue()).e ? z2 : z;
            ChaloColorToken.ShadyGray shadyGray = ChaloColorToken.ShadyGray.f9851a;
            ChaloColorToken.Orange2 orange2 = ChaloColorToken.Orange2.f9830a;
            ChaloColorToken chaloColorToken = z3 ? orange2 : shadyGray;
            boolean z4 = ((MetroPassengerTypeDataModel) entry.getValue()).c < ((MetroPassengerTypeDataModel) entry.getValue()).d ? z2 : z;
            ChaloColorToken chaloColorToken2 = z4 ? orange2 : shadyGray;
            CoroutineSingletons coroutineSingletons3 = coroutineSingletons2;
            Iterator it2 = it;
            TextUIState.ChaloTextUIState chaloTextUIState3 = new TextUIState.ChaloTextUIState(((MetroPassengerTypeDataModel) entry.getValue()).b, UITextStyle.BodyMedium, almostBlackColor, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
            IconType iconType = IconType.IC_PLUS;
            ImageUISize imageUISize = new ImageUISize(ChaloThemeHelper.a().i);
            UIContentScale uIContentScale = UIContentScale.Fit;
            UiEventHandler uiEventHandlerA2 = UiEventHandler.Companion.f9897a;
            if (z4) {
                final int i3 = 0;
                uiEventHandlerA = UiEventHandler.Companion.a(new Function0() { // from class: bb1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i3) {
                            case 0:
                                function1.invoke(new StopBasedMetroLandingScreenViewIntent.OnPassengerIncreaseCountClick((String) entry.getKey()));
                                break;
                            default:
                                function1.invoke(new StopBasedMetroLandingScreenViewIntent.OnPassengerDecreaseCountClick((String) entry.getKey()));
                                break;
                        }
                        return Unit.f17538a;
                    }
                });
            } else {
                uiEventHandlerA = uiEventHandlerA2;
            }
            ImageUIState imageUIState3 = new ImageUIState(iconType, (String) null, chaloColorToken2, imageUISize, uIContentScale, 0.0f, uiEventHandlerA, 98);
            IconType iconType2 = IconType.IC_MINUS;
            ImageUISize imageUISize2 = new ImageUISize(ChaloThemeHelper.a().i);
            if (z3) {
                final int i4 = 1;
                uiEventHandlerA2 = UiEventHandler.Companion.a(new Function0() { // from class: bb1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i4) {
                            case 0:
                                function1.invoke(new StopBasedMetroLandingScreenViewIntent.OnPassengerIncreaseCountClick((String) entry.getKey()));
                                break;
                            default:
                                function1.invoke(new StopBasedMetroLandingScreenViewIntent.OnPassengerDecreaseCountClick((String) entry.getKey()));
                                break;
                        }
                        return Unit.f17538a;
                    }
                });
            }
            arrayList.add(new PassengerSelectionItemUIState(chaloTextUIState3, new PassengerCounterUiState(new PassengerCounterSpec(null, 31), imageUIState3, new ImageUIState(iconType2, (String) null, chaloColorToken, imageUISize2, uIContentScale, 0.0f, uiEventHandlerA2, 98), new TextUIState.ChaloTextUIState(String.valueOf(((MetroPassengerTypeDataModel) entry.getValue()).c), UITextStyle.BodyLarge, almostBlackColor, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120))));
            it = it2;
            coroutineSingletons2 = coroutineSingletons3;
            stringProvider = stringProvider;
            c = 2;
            z = false;
            z2 = true;
        }
        CoroutineSingletons coroutineSingletons4 = coroutineSingletons2;
        float f = ChaloThemeHelper.a().h;
        passengerSelectionUISpec = new PassengerSelectionUISpec(new ChaloPadding(f, f, f, f));
        function2 = function1;
        stopBasedMetroLandingUiStateFactory$getPassengerSelectionUiState$1.L$0 = function2;
        stopBasedMetroLandingUiStateFactory$getPassengerSelectionUiState$1.L$1 = arrayList;
        stopBasedMetroLandingUiStateFactory$getPassengerSelectionUiState$1.L$2 = passengerSelectionUISpec;
        stopBasedMetroLandingUiStateFactory$getPassengerSelectionUiState$1.label = 1;
        Object objB2 = stringProvider.b(StringEnum.CHOOSE_NUMBER_OF_PASSENGERS, new Object[0], stopBasedMetroLandingUiStateFactory$getPassengerSelectionUiState$1);
        coroutineSingletons = coroutineSingletons4;
        if (objB2 != coroutineSingletons) {
            objB = objB2;
            list = arrayList;
        }
        return coroutineSingletons;
        TextUIState.ChaloTextUIState chaloTextUIState4 = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.DisplayMedium, almostBlackColor, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
        ImageUIState imageUIState4 = new ImageUIState(IconType.CLOSE_NEARBY, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().i), (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new fa1(function2, 11)), 118);
        stopBasedMetroLandingUiStateFactory$getPassengerSelectionUiState$1.L$0 = function2;
        ButtonUIStateFactory buttonUIStateFactory3 = ButtonUIStateFactory.f9921a;
        stopBasedMetroLandingUiStateFactory$getPassengerSelectionUiState$1.L$1 = buttonUIStateFactory3;
        stopBasedMetroLandingUiStateFactory$getPassengerSelectionUiState$1.L$2 = passengerSelectionUISpec;
        stopBasedMetroLandingUiStateFactory$getPassengerSelectionUiState$1.L$3 = chaloTextUIState4;
        stopBasedMetroLandingUiStateFactory$getPassengerSelectionUiState$1.L$4 = imageUIState4;
        stopBasedMetroLandingUiStateFactory$getPassengerSelectionUiState$1.L$5 = list;
        stopBasedMetroLandingUiStateFactory$getPassengerSelectionUiState$1.label = 2;
        objB = stringProvider.b(StringEnum.PROCEED_SENTENCE_CASE, new Object[0], stopBasedMetroLandingUiStateFactory$getPassengerSelectionUiState$1);
        if (objB != coroutineSingletons) {
            passengerSelectionUISpec2 = passengerSelectionUISpec;
            function3 = function2;
            chaloTextUIState = chaloTextUIState4;
            imageUIState = imageUIState4;
            buttonUIStateFactory = buttonUIStateFactory3;
            return new PassengerSelectionContainerUiState(passengerSelectionUISpec2, chaloTextUIState, imageUIState, list, ButtonUIStateFactory.g(buttonUIStateFactory, (String) objB, new fa1(function3, 12), null, UIShape.d, true, 0.0f, 36));
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x014b  */
    /* JADX WARN: Code duplicated, block: B:44:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:45:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:48:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:52:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:55:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:56:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:60:0x022c A[LOOP:0: B:58:0x0226->B:60:0x022c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x0312  */
    /* JADX WARN: Code duplicated, block: B:68:0x032e  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object d(StopBasedMetroLandingScreenDataState stopBasedMetroLandingScreenDataState, Function1 function1, ContinuationImpl continuationImpl) {
        StopBasedMetroLandingUiStateFactory$getViewState$1 stopBasedMetroLandingUiStateFactory$getViewState$1;
        int i;
        int i2;
        int i3;
        ChaloPadding chaloPadding;
        Function1 function2;
        StopBasedMetroLandingScreenDataState stopBasedMetroLandingScreenDataState2;
        ToolbarUiSpecs toolbarUiSpecs;
        ChaloPadding chaloPadding2;
        boolean z;
        Function1 function3;
        Object objA;
        ToolbarUIState toolbarUIState;
        ToolbarUIState toolbarUIState2;
        DialogUIStateFactory dialogUIStateFactory;
        StopBasedMetroLandingScreenDataState stopBasedMetroLandingScreenDataState3;
        ChaloPadding chaloPadding3;
        StopAppModel stopAppModel;
        String str;
        StopAppModel stopAppModel2;
        Object obj;
        boolean z2;
        ToolbarUIState toolbarUIState3;
        Object obj2;
        StopBasedMetroLandingScreenDataState stopBasedMetroLandingScreenDataState4;
        ChaloPadding chaloPadding4;
        StopBasedMetroFromToSelectionContainerUIState stopBasedMetroFromToSelectionContainerUIState;
        RecentlySearchedContainerSpec recentlySearchedContainerSpec;
        ArrayList arrayList;
        Object obj3;
        StopBasedMetroFromToSelectionContainerUIState stopBasedMetroFromToSelectionContainerUIState2;
        RecentlySearchedContainerUiState recentlySearchedContainerUiState;
        Object obj4;
        StopBasedMetroLandingUiStateFactory stopBasedMetroLandingUiStateFactory;
        Object objB;
        StopBasedMetroFromToSelectionContainerUIState stopBasedMetroFromToSelectionContainerUIState3;
        ToolbarUIState toolbarUIState4;
        RecentlySearchedContainerUiState recentlySearchedContainerUiState2;
        Object obj5;
        StopBasedMetroLandingUiStateFactory stopBasedMetroLandingUiStateFactory2;
        StopBasedMetroLandingScreenBottomSheetUiStateType stopBasedMetroLandingScreenBottomSheetUiStateType;
        StopBasedMetroLandingScreenBottomSheetUiStateType stopBasedMetroLandingScreenBottomSheetUiStateType2;
        ToolbarUIState toolbarUIState5;
        LoadingDialogUIState loadingDialogUIState;
        StopBasedMetroLandingUiStateFactory stopBasedMetroLandingUiStateFactory3;
        if (continuationImpl instanceof StopBasedMetroLandingUiStateFactory$getViewState$1) {
            stopBasedMetroLandingUiStateFactory$getViewState$1 = (StopBasedMetroLandingUiStateFactory$getViewState$1) continuationImpl;
            int i4 = stopBasedMetroLandingUiStateFactory$getViewState$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                stopBasedMetroLandingUiStateFactory$getViewState$1.label = i4 - Integer.MIN_VALUE;
            } else {
                stopBasedMetroLandingUiStateFactory$getViewState$1 = new StopBasedMetroLandingUiStateFactory$getViewState$1(this, continuationImpl);
            }
        } else {
            stopBasedMetroLandingUiStateFactory$getViewState$1 = new StopBasedMetroLandingUiStateFactory$getViewState$1(this, continuationImpl);
        }
        StopBasedMetroLandingUiStateFactory$getViewState$1 stopBasedMetroLandingUiStateFactory$getViewState$2 = stopBasedMetroLandingUiStateFactory$getViewState$1;
        Object objB2 = stopBasedMetroLandingUiStateFactory$getViewState$2.result;
        Object obj6 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = stopBasedMetroLandingUiStateFactory$getViewState$2.label;
        StringProvider stringProvider = this.f5554a;
        ChaloColorToken.ShadyGray shadyGray = ChaloColorToken.ShadyGray.f9851a;
        if (i5 == 0) {
            ResultKt.b(objB2);
            OperationalHoursAppModel operationalHoursAppModel = stopBasedMetroLandingScreenDataState.m;
            if (operationalHoursAppModel == null || this.c != null) {
                i = 2;
                i2 = 0;
                i3 = 1;
                chaloPadding = null;
            } else {
                String str2 = operationalHoursAppModel.f5674a;
                long j = operationalHoursAppModel.b;
                TimeUtilsContract timeUtilsContract = this.b;
                String strN = vo1.n(timeUtilsContract.e(j), " - ", timeUtilsContract.e(operationalHoursAppModel.c));
                UITextStyle uITextStyle = UITextStyle.BodySmall;
                i2 = 0;
                i = 2;
                i3 = 1;
                chaloPadding = null;
                this.c = new TextUIState.StyledTextUIState(CollectionsKt.S(new StyledTextDataUIState(str2, shadyGray, null, uITextStyle, null, null, null, 1012), new StyledTextDataUIState(strN, shadyGray, UIFontWeight.SemiBold, uITextStyle, null, null, null, 1008)), UITextAlign.Center, null, 28);
            }
            ToolbarUiSpecs toolbarUiSpecs2 = new ToolbarUiSpecs(ChaloColorToken.Transparent.f9864a, chaloPadding, 0.0f, 30);
            stopBasedMetroLandingUiStateFactory$getViewState$2.L$0 = stopBasedMetroLandingScreenDataState;
            function2 = function1;
            stopBasedMetroLandingUiStateFactory$getViewState$2.L$1 = function2;
            stopBasedMetroLandingUiStateFactory$getViewState$2.L$2 = toolbarUiSpecs2;
            stopBasedMetroLandingUiStateFactory$getViewState$2.label = i3;
            Object objB3 = stringProvider.b(StringEnum.METRO, new Object[i2], stopBasedMetroLandingUiStateFactory$getViewState$2);
            if (objB3 != obj6) {
                stopBasedMetroLandingScreenDataState2 = stopBasedMetroLandingScreenDataState;
                toolbarUiSpecs = toolbarUiSpecs2;
                objB2 = objB3;
                chaloPadding2 = chaloPadding;
            }
            return obj6;
        }
        if (i5 == 1) {
            ToolbarUiSpecs toolbarUiSpecs3 = (ToolbarUiSpecs) stopBasedMetroLandingUiStateFactory$getViewState$2.L$2;
            Function1 function4 = (Function1) stopBasedMetroLandingUiStateFactory$getViewState$2.L$1;
            stopBasedMetroLandingScreenDataState2 = (StopBasedMetroLandingScreenDataState) stopBasedMetroLandingUiStateFactory$getViewState$2.L$0;
            ResultKt.b(objB2);
            toolbarUiSpecs = toolbarUiSpecs3;
            function2 = function4;
            i = 2;
            i3 = 1;
            chaloPadding2 = null;
        } else {
            if (i5 == 2) {
                dialogUIStateFactory = (DialogUIStateFactory) stopBasedMetroLandingUiStateFactory$getViewState$2.L$3;
                toolbarUIState2 = (ToolbarUIState) stopBasedMetroLandingUiStateFactory$getViewState$2.L$2;
                function3 = (Function1) stopBasedMetroLandingUiStateFactory$getViewState$2.L$1;
                stopBasedMetroLandingScreenDataState3 = (StopBasedMetroLandingScreenDataState) stopBasedMetroLandingUiStateFactory$getViewState$2.L$0;
                ResultKt.b(objB2);
                z = false;
                i3 = 1;
                chaloPadding4 = null;
                dialogUIStateFactory.getClass();
                toolbarUIState = toolbarUIState2;
                stopBasedMetroLandingScreenDataState2 = stopBasedMetroLandingScreenDataState3;
                chaloPadding3 = chaloPadding4;
                objA = DialogUIStateFactory.a((String) objB2);
                stopAppModel = stopBasedMetroLandingScreenDataState2.i;
                if (stopAppModel != null) {
                    str = stopAppModel.b;
                } else {
                    str = chaloPadding3;
                }
                stopAppModel2 = stopBasedMetroLandingScreenDataState2.j;
                obj = chaloPadding3;
                if (stopAppModel2 != null) {
                    obj = stopAppModel2.b;
                }
                if (stopAppModel != null || stopAppModel2 == null) {
                    z2 = z;
                } else {
                    z2 = i3;
                }
                stopBasedMetroLandingUiStateFactory$getViewState$2.L$0 = stopBasedMetroLandingScreenDataState2;
                stopBasedMetroLandingUiStateFactory$getViewState$2.L$1 = function3;
                stopBasedMetroLandingUiStateFactory$getViewState$2.L$2 = toolbarUIState;
                stopBasedMetroLandingUiStateFactory$getViewState$2.L$3 = objA;
                stopBasedMetroLandingUiStateFactory$getViewState$2.label = 3;
                objB2 = e(str, obj, z2, function3, stopBasedMetroLandingUiStateFactory$getViewState$2);
                if (objB2 == obj6) {
                    toolbarUIState3 = toolbarUIState;
                    obj2 = objA;
                    stopBasedMetroLandingScreenDataState4 = stopBasedMetroLandingScreenDataState2;
                    stopBasedMetroFromToSelectionContainerUIState = (StopBasedMetroFromToSelectionContainerUIState) objB2;
                    recentlySearchedContainerSpec = new RecentlySearchedContainerSpec(new ChaloPadding(ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, ChaloThemeHelper.a().i));
                    List<RecentStopBasedTripAppModel> list = stopBasedMetroLandingScreenDataState4.h;
                    arrayList = new ArrayList(CollectionsKt.v(list, 10));
                    obj3 = obj2;
                    for (RecentStopBasedTripAppModel recentStopBasedTripAppModel : list) {
                        ChaloRecentlySearchedCardSpec chaloRecentlySearchedCardSpec = new ChaloRecentlySearchedCardSpec();
                        ImageUIState imageUIState = new ImageUIState(IconType.IC_FROM_TO_TINTED, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().B), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                        String str3 = recentStopBasedTripAppModel.g.b;
                        UITextStyle uITextStyle2 = UITextStyle.BodySmall;
                        UITextOverflow uITextOverflow = UITextOverflow.Ellipsis;
                        ArrayList arrayList2 = arrayList;
                        RecentlySearchedContainerUiState recentlySearchedContainerUiState3 = recentlySearchedContainerUiState;
                        ChaloColorToken.ShadyGray shadyGray2 = shadyGray;
                        shadyGray = shadyGray2;
                        arrayList2.add(new ChaloRecentlySearchedCardUiState(chaloRecentlySearchedCardSpec, imageUIState, new TextUIState.ChaloTextUIState(str3, uITextStyle2, (ChaloColorToken) null, 1, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, uITextOverflow, (UIFontStyle) null, (String) null, 7156), new TextUIState.ChaloTextUIState(recentStopBasedTripAppModel.h.b, uITextStyle2, shadyGray2, 1, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, uITextOverflow, (UIFontStyle) null, (String) null, 7152), UiEventHandler.Companion.a(new ri0(function3, recentStopBasedTripAppModel, 1))));
                        RecentlySearchedContainerUiState recentlySearchedContainerUiState4 = recentlySearchedContainerUiState3;
                        arrayList = arrayList2;
                        recentlySearchedContainerSpec = recentlySearchedContainerSpec;
                        obj3 = obj3;
                        toolbarUIState3 = toolbarUIState3;
                        stopBasedMetroLandingScreenDataState4 = stopBasedMetroLandingScreenDataState4;
                        stopBasedMetroFromToSelectionContainerUIState = stopBasedMetroFromToSelectionContainerUIState;
                        obj6 = obj6;
                    }
                    stopBasedMetroFromToSelectionContainerUIState2 = stopBasedMetroFromToSelectionContainerUIState;
                    recentlySearchedContainerUiState = new RecentlySearchedContainerUiState(recentlySearchedContainerSpec, arrayList);
                    stopBasedMetroLandingUiStateFactory$getViewState$2.L$0 = toolbarUIState3;
                    obj4 = obj3;
                    stopBasedMetroLandingUiStateFactory$getViewState$2.L$1 = obj4;
                    stopBasedMetroLandingUiStateFactory$getViewState$2.L$2 = stopBasedMetroFromToSelectionContainerUIState2;
                    stopBasedMetroLandingUiStateFactory$getViewState$2.L$3 = recentlySearchedContainerUiState;
                    stopBasedMetroLandingUiStateFactory$getViewState$2.label = 4;
                    stopBasedMetroLandingUiStateFactory = this;
                    objB = stopBasedMetroLandingUiStateFactory.b(stopBasedMetroLandingScreenDataState4, function3, stopBasedMetroLandingUiStateFactory$getViewState$2);
                    obj6 = obj6;
                    if (objB != obj6) {
                        stopBasedMetroFromToSelectionContainerUIState3 = stopBasedMetroFromToSelectionContainerUIState2;
                        objB2 = objB;
                        toolbarUIState4 = toolbarUIState3;
                        recentlySearchedContainerUiState2 = recentlySearchedContainerUiState;
                        stopBasedMetroLandingUiStateFactory2 = stopBasedMetroLandingUiStateFactory;
                        obj5 = obj4;
                        stopBasedMetroLandingScreenBottomSheetUiStateType = (StopBasedMetroLandingScreenBottomSheetUiStateType) objB2;
                        stopBasedMetroLandingUiStateFactory$getViewState$2.L$0 = toolbarUIState4;
                        stopBasedMetroLandingUiStateFactory$getViewState$2.L$1 = obj5;
                        stopBasedMetroLandingUiStateFactory$getViewState$2.L$2 = stopBasedMetroFromToSelectionContainerUIState3;
                        stopBasedMetroLandingUiStateFactory$getViewState$2.L$3 = recentlySearchedContainerUiState2;
                        stopBasedMetroLandingUiStateFactory$getViewState$2.L$4 = stopBasedMetroLandingScreenBottomSheetUiStateType;
                        stopBasedMetroLandingUiStateFactory$getViewState$2.label = 5;
                        objB2 = stopBasedMetroLandingUiStateFactory2.a(stopBasedMetroLandingUiStateFactory$getViewState$2);
                        if (objB2 != obj6) {
                            stopBasedMetroLandingScreenBottomSheetUiStateType2 = stopBasedMetroLandingScreenBottomSheetUiStateType;
                            toolbarUIState5 = toolbarUIState4;
                            loadingDialogUIState = obj5;
                            stopBasedMetroLandingUiStateFactory3 = stopBasedMetroLandingUiStateFactory2;
                        }
                    }
                }
                return obj6;
            }
            if (i5 == 3) {
                LoadingDialogUIState loadingDialogUIState2 = (LoadingDialogUIState) stopBasedMetroLandingUiStateFactory$getViewState$2.L$3;
                toolbarUIState3 = (ToolbarUIState) stopBasedMetroLandingUiStateFactory$getViewState$2.L$2;
                function3 = (Function1) stopBasedMetroLandingUiStateFactory$getViewState$2.L$1;
                StopBasedMetroLandingScreenDataState stopBasedMetroLandingScreenDataState5 = (StopBasedMetroLandingScreenDataState) stopBasedMetroLandingUiStateFactory$getViewState$2.L$0;
                ResultKt.b(objB2);
                stopBasedMetroLandingScreenDataState4 = stopBasedMetroLandingScreenDataState5;
                obj2 = loadingDialogUIState2;
                stopBasedMetroFromToSelectionContainerUIState = (StopBasedMetroFromToSelectionContainerUIState) objB2;
                recentlySearchedContainerSpec = new RecentlySearchedContainerSpec(new ChaloPadding(ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, ChaloThemeHelper.a().i));
                List<RecentStopBasedTripAppModel> list2 = stopBasedMetroLandingScreenDataState4.h;
                arrayList = new ArrayList(CollectionsKt.v(list2, 10));
                obj3 = obj2;
                while (r23.hasNext()) {
                    ChaloRecentlySearchedCardSpec chaloRecentlySearchedCardSpec2 = new ChaloRecentlySearchedCardSpec();
                    ImageUIState imageUIState2 = new ImageUIState(IconType.IC_FROM_TO_TINTED, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().B), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                    String str4 = recentStopBasedTripAppModel.g.b;
                    UITextStyle uITextStyle3 = UITextStyle.BodySmall;
                    UITextOverflow uITextOverflow2 = UITextOverflow.Ellipsis;
                    ArrayList arrayList3 = arrayList;
                    RecentlySearchedContainerUiState recentlySearchedContainerUiState5 = recentlySearchedContainerUiState4;
                    ChaloColorToken.ShadyGray shadyGray3 = shadyGray;
                    shadyGray = shadyGray3;
                    arrayList3.add(new ChaloRecentlySearchedCardUiState(chaloRecentlySearchedCardSpec2, imageUIState2, new TextUIState.ChaloTextUIState(str4, uITextStyle3, (ChaloColorToken) null, 1, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, uITextOverflow2, (UIFontStyle) null, (String) null, 7156), new TextUIState.ChaloTextUIState(recentStopBasedTripAppModel.h.b, uITextStyle3, shadyGray3, 1, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, uITextOverflow2, (UIFontStyle) null, (String) null, 7152), UiEventHandler.Companion.a(new ri0(function3, recentStopBasedTripAppModel, 1))));
                    RecentlySearchedContainerUiState recentlySearchedContainerUiState6 = recentlySearchedContainerUiState5;
                    arrayList = arrayList3;
                    recentlySearchedContainerSpec = recentlySearchedContainerSpec;
                    obj3 = obj3;
                    toolbarUIState3 = toolbarUIState3;
                    stopBasedMetroLandingScreenDataState4 = stopBasedMetroLandingScreenDataState4;
                    stopBasedMetroFromToSelectionContainerUIState = stopBasedMetroFromToSelectionContainerUIState;
                    obj6 = obj6;
                }
                stopBasedMetroFromToSelectionContainerUIState2 = stopBasedMetroFromToSelectionContainerUIState;
                recentlySearchedContainerUiState = new RecentlySearchedContainerUiState(recentlySearchedContainerSpec, arrayList);
                stopBasedMetroLandingUiStateFactory$getViewState$2.L$0 = toolbarUIState3;
                obj4 = obj3;
                stopBasedMetroLandingUiStateFactory$getViewState$2.L$1 = obj4;
                stopBasedMetroLandingUiStateFactory$getViewState$2.L$2 = stopBasedMetroFromToSelectionContainerUIState2;
                stopBasedMetroLandingUiStateFactory$getViewState$2.L$3 = recentlySearchedContainerUiState;
                stopBasedMetroLandingUiStateFactory$getViewState$2.label = 4;
                stopBasedMetroLandingUiStateFactory = this;
                objB = stopBasedMetroLandingUiStateFactory.b(stopBasedMetroLandingScreenDataState4, function3, stopBasedMetroLandingUiStateFactory$getViewState$2);
                obj6 = obj6;
                if (objB != obj6) {
                    stopBasedMetroFromToSelectionContainerUIState3 = stopBasedMetroFromToSelectionContainerUIState2;
                    objB2 = objB;
                    toolbarUIState4 = toolbarUIState3;
                    recentlySearchedContainerUiState2 = recentlySearchedContainerUiState;
                    stopBasedMetroLandingUiStateFactory2 = stopBasedMetroLandingUiStateFactory;
                    obj5 = obj4;
                    stopBasedMetroLandingScreenBottomSheetUiStateType = (StopBasedMetroLandingScreenBottomSheetUiStateType) objB2;
                    stopBasedMetroLandingUiStateFactory$getViewState$2.L$0 = toolbarUIState4;
                    stopBasedMetroLandingUiStateFactory$getViewState$2.L$1 = obj5;
                    stopBasedMetroLandingUiStateFactory$getViewState$2.L$2 = stopBasedMetroFromToSelectionContainerUIState3;
                    stopBasedMetroLandingUiStateFactory$getViewState$2.L$3 = recentlySearchedContainerUiState2;
                    stopBasedMetroLandingUiStateFactory$getViewState$2.L$4 = stopBasedMetroLandingScreenBottomSheetUiStateType;
                    stopBasedMetroLandingUiStateFactory$getViewState$2.label = 5;
                    objB2 = stopBasedMetroLandingUiStateFactory2.a(stopBasedMetroLandingUiStateFactory$getViewState$2);
                    if (objB2 != obj6) {
                        stopBasedMetroLandingScreenBottomSheetUiStateType2 = stopBasedMetroLandingScreenBottomSheetUiStateType;
                        toolbarUIState5 = toolbarUIState4;
                        loadingDialogUIState = obj5;
                        stopBasedMetroLandingUiStateFactory3 = stopBasedMetroLandingUiStateFactory2;
                    }
                }
                return obj6;
            }
            if (i5 == 4) {
                RecentlySearchedContainerUiState recentlySearchedContainerUiState7 = (RecentlySearchedContainerUiState) stopBasedMetroLandingUiStateFactory$getViewState$2.L$3;
                StopBasedMetroFromToSelectionContainerUIState stopBasedMetroFromToSelectionContainerUIState4 = (StopBasedMetroFromToSelectionContainerUIState) stopBasedMetroLandingUiStateFactory$getViewState$2.L$2;
                LoadingDialogUIState loadingDialogUIState3 = (LoadingDialogUIState) stopBasedMetroLandingUiStateFactory$getViewState$2.L$1;
                toolbarUIState4 = (ToolbarUIState) stopBasedMetroLandingUiStateFactory$getViewState$2.L$0;
                ResultKt.b(objB2);
                obj5 = loadingDialogUIState3;
                stopBasedMetroFromToSelectionContainerUIState3 = stopBasedMetroFromToSelectionContainerUIState4;
                recentlySearchedContainerUiState2 = recentlySearchedContainerUiState7;
                stopBasedMetroLandingUiStateFactory2 = this;
                stopBasedMetroLandingScreenBottomSheetUiStateType = (StopBasedMetroLandingScreenBottomSheetUiStateType) objB2;
                stopBasedMetroLandingUiStateFactory$getViewState$2.L$0 = toolbarUIState4;
                stopBasedMetroLandingUiStateFactory$getViewState$2.L$1 = obj5;
                stopBasedMetroLandingUiStateFactory$getViewState$2.L$2 = stopBasedMetroFromToSelectionContainerUIState3;
                stopBasedMetroLandingUiStateFactory$getViewState$2.L$3 = recentlySearchedContainerUiState2;
                stopBasedMetroLandingUiStateFactory$getViewState$2.L$4 = stopBasedMetroLandingScreenBottomSheetUiStateType;
                stopBasedMetroLandingUiStateFactory$getViewState$2.label = 5;
                objB2 = stopBasedMetroLandingUiStateFactory2.a(stopBasedMetroLandingUiStateFactory$getViewState$2);
                if (objB2 != obj6) {
                    stopBasedMetroLandingScreenBottomSheetUiStateType2 = stopBasedMetroLandingScreenBottomSheetUiStateType;
                    toolbarUIState5 = toolbarUIState4;
                    loadingDialogUIState = obj5;
                    stopBasedMetroLandingUiStateFactory3 = stopBasedMetroLandingUiStateFactory2;
                }
                return obj6;
            }
            if (i5 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            StopBasedMetroLandingScreenBottomSheetUiStateType stopBasedMetroLandingScreenBottomSheetUiStateType3 = (StopBasedMetroLandingScreenBottomSheetUiStateType) stopBasedMetroLandingUiStateFactory$getViewState$2.L$4;
            recentlySearchedContainerUiState2 = (RecentlySearchedContainerUiState) stopBasedMetroLandingUiStateFactory$getViewState$2.L$3;
            stopBasedMetroFromToSelectionContainerUIState3 = (StopBasedMetroFromToSelectionContainerUIState) stopBasedMetroLandingUiStateFactory$getViewState$2.L$2;
            LoadingDialogUIState loadingDialogUIState4 = (LoadingDialogUIState) stopBasedMetroLandingUiStateFactory$getViewState$2.L$1;
            ToolbarUIState toolbarUIState6 = (ToolbarUIState) stopBasedMetroLandingUiStateFactory$getViewState$2.L$0;
            ResultKt.b(objB2);
            stopBasedMetroLandingScreenBottomSheetUiStateType2 = stopBasedMetroLandingScreenBottomSheetUiStateType3;
            toolbarUIState5 = toolbarUIState6;
            loadingDialogUIState = loadingDialogUIState4;
            stopBasedMetroLandingUiStateFactory3 = this;
        }
        return new StopBasedMetroLandingScreenViewState(toolbarUIState5, loadingDialogUIState, stopBasedMetroFromToSelectionContainerUIState3, recentlySearchedContainerUiState2, stopBasedMetroLandingScreenBottomSheetUiStateType2, (MetroTicketBenefitsContainerUiState) objB2, stopBasedMetroLandingUiStateFactory3.c);
        ToolbarUIState toolbarUIState7 = new ToolbarUIState(toolbarUiSpecs, new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.DisplaySmall, ChaloColorToken.AlmostBlackColor.f9756a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), null, null, null, ChaloThemeHelper.c.f1917a, null, null, 220);
        if (stopBasedMetroLandingScreenDataState2.b) {
            z = false;
            stopBasedMetroLandingUiStateFactory$getViewState$2.L$0 = stopBasedMetroLandingScreenDataState2;
            stopBasedMetroLandingUiStateFactory$getViewState$2.L$1 = function2;
            stopBasedMetroLandingUiStateFactory$getViewState$2.L$2 = toolbarUIState7;
            DialogUIStateFactory dialogUIStateFactory2 = DialogUIStateFactory.f9989a;
            stopBasedMetroLandingUiStateFactory$getViewState$2.L$3 = dialogUIStateFactory2;
            stopBasedMetroLandingUiStateFactory$getViewState$2.label = i;
            objB2 = stringProvider.b(StringEnum.LOADING, new Object[0], stopBasedMetroLandingUiStateFactory$getViewState$2);
            if (objB2 != obj6) {
                toolbarUIState2 = toolbarUIState7;
                function3 = function2;
                dialogUIStateFactory = dialogUIStateFactory2;
                stopBasedMetroLandingScreenDataState3 = stopBasedMetroLandingScreenDataState2;
                chaloPadding4 = chaloPadding2;
                dialogUIStateFactory.getClass();
                toolbarUIState = toolbarUIState2;
                stopBasedMetroLandingScreenDataState2 = stopBasedMetroLandingScreenDataState3;
                chaloPadding3 = chaloPadding4;
                objA = DialogUIStateFactory.a((String) objB2);
            }
            return obj6;
        }
        z = false;
        function3 = function2;
        objA = chaloPadding2;
        toolbarUIState = toolbarUIState7;
        chaloPadding3 = chaloPadding2;
        stopAppModel = stopBasedMetroLandingScreenDataState2.i;
        if (stopAppModel != null) {
            str = stopAppModel.b;
        } else {
            str = chaloPadding3;
        }
        stopAppModel2 = stopBasedMetroLandingScreenDataState2.j;
        obj = chaloPadding3;
        if (stopAppModel2 != null) {
            obj = stopAppModel2.b;
        }
        if (stopAppModel != null) {
            z2 = z;
        } else {
            z2 = z;
        }
        stopBasedMetroLandingUiStateFactory$getViewState$2.L$0 = stopBasedMetroLandingScreenDataState2;
        stopBasedMetroLandingUiStateFactory$getViewState$2.L$1 = function3;
        stopBasedMetroLandingUiStateFactory$getViewState$2.L$2 = toolbarUIState;
        stopBasedMetroLandingUiStateFactory$getViewState$2.L$3 = objA;
        stopBasedMetroLandingUiStateFactory$getViewState$2.label = 3;
        objB2 = e(str, obj, z2, function3, stopBasedMetroLandingUiStateFactory$getViewState$2);
        if (objB2 == obj6) {
            toolbarUIState3 = toolbarUIState;
            obj2 = objA;
            stopBasedMetroLandingScreenDataState4 = stopBasedMetroLandingScreenDataState2;
            stopBasedMetroFromToSelectionContainerUIState = (StopBasedMetroFromToSelectionContainerUIState) objB2;
            recentlySearchedContainerSpec = new RecentlySearchedContainerSpec(new ChaloPadding(ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, ChaloThemeHelper.a().i));
            List<RecentStopBasedTripAppModel> list3 = stopBasedMetroLandingScreenDataState4.h;
            arrayList = new ArrayList(CollectionsKt.v(list3, 10));
            obj3 = obj2;
            while (r23.hasNext()) {
                ChaloRecentlySearchedCardSpec chaloRecentlySearchedCardSpec3 = new ChaloRecentlySearchedCardSpec();
                ImageUIState imageUIState3 = new ImageUIState(IconType.IC_FROM_TO_TINTED, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().B), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                String str5 = recentStopBasedTripAppModel.g.b;
                UITextStyle uITextStyle4 = UITextStyle.BodySmall;
                UITextOverflow uITextOverflow3 = UITextOverflow.Ellipsis;
                ArrayList arrayList4 = arrayList;
                RecentlySearchedContainerUiState recentlySearchedContainerUiState8 = recentlySearchedContainerUiState6;
                ChaloColorToken.ShadyGray shadyGray4 = shadyGray;
                shadyGray = shadyGray4;
                arrayList4.add(new ChaloRecentlySearchedCardUiState(chaloRecentlySearchedCardSpec3, imageUIState3, new TextUIState.ChaloTextUIState(str5, uITextStyle4, (ChaloColorToken) null, 1, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, uITextOverflow3, (UIFontStyle) null, (String) null, 7156), new TextUIState.ChaloTextUIState(recentStopBasedTripAppModel.h.b, uITextStyle4, shadyGray4, 1, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, uITextOverflow3, (UIFontStyle) null, (String) null, 7152), UiEventHandler.Companion.a(new ri0(function3, recentStopBasedTripAppModel, 1))));
                RecentlySearchedContainerUiState recentlySearchedContainerUiState9 = recentlySearchedContainerUiState8;
                arrayList = arrayList4;
                recentlySearchedContainerSpec = recentlySearchedContainerSpec;
                obj3 = obj3;
                toolbarUIState3 = toolbarUIState3;
                stopBasedMetroLandingScreenDataState4 = stopBasedMetroLandingScreenDataState4;
                stopBasedMetroFromToSelectionContainerUIState = stopBasedMetroFromToSelectionContainerUIState;
                obj6 = obj6;
            }
            stopBasedMetroFromToSelectionContainerUIState2 = stopBasedMetroFromToSelectionContainerUIState;
            recentlySearchedContainerUiState = new RecentlySearchedContainerUiState(recentlySearchedContainerSpec, arrayList);
            stopBasedMetroLandingUiStateFactory$getViewState$2.L$0 = toolbarUIState3;
            obj4 = obj3;
            stopBasedMetroLandingUiStateFactory$getViewState$2.L$1 = obj4;
            stopBasedMetroLandingUiStateFactory$getViewState$2.L$2 = stopBasedMetroFromToSelectionContainerUIState2;
            stopBasedMetroLandingUiStateFactory$getViewState$2.L$3 = recentlySearchedContainerUiState;
            stopBasedMetroLandingUiStateFactory$getViewState$2.label = 4;
            stopBasedMetroLandingUiStateFactory = this;
            objB = stopBasedMetroLandingUiStateFactory.b(stopBasedMetroLandingScreenDataState4, function3, stopBasedMetroLandingUiStateFactory$getViewState$2);
            obj6 = obj6;
            if (objB != obj6) {
                stopBasedMetroFromToSelectionContainerUIState3 = stopBasedMetroFromToSelectionContainerUIState2;
                objB2 = objB;
                toolbarUIState4 = toolbarUIState3;
                recentlySearchedContainerUiState2 = recentlySearchedContainerUiState;
                stopBasedMetroLandingUiStateFactory2 = stopBasedMetroLandingUiStateFactory;
                obj5 = obj4;
                stopBasedMetroLandingScreenBottomSheetUiStateType = (StopBasedMetroLandingScreenBottomSheetUiStateType) objB2;
                stopBasedMetroLandingUiStateFactory$getViewState$2.L$0 = toolbarUIState4;
                stopBasedMetroLandingUiStateFactory$getViewState$2.L$1 = obj5;
                stopBasedMetroLandingUiStateFactory$getViewState$2.L$2 = stopBasedMetroFromToSelectionContainerUIState3;
                stopBasedMetroLandingUiStateFactory$getViewState$2.L$3 = recentlySearchedContainerUiState2;
                stopBasedMetroLandingUiStateFactory$getViewState$2.L$4 = stopBasedMetroLandingScreenBottomSheetUiStateType;
                stopBasedMetroLandingUiStateFactory$getViewState$2.label = 5;
                objB2 = stopBasedMetroLandingUiStateFactory2.a(stopBasedMetroLandingUiStateFactory$getViewState$2);
                if (objB2 != obj6) {
                    stopBasedMetroLandingScreenBottomSheetUiStateType2 = stopBasedMetroLandingScreenBottomSheetUiStateType;
                    toolbarUIState5 = toolbarUIState4;
                    loadingDialogUIState = obj5;
                    stopBasedMetroLandingUiStateFactory3 = stopBasedMetroLandingUiStateFactory2;
                    return new StopBasedMetroLandingScreenViewState(toolbarUIState5, loadingDialogUIState, stopBasedMetroFromToSelectionContainerUIState3, recentlySearchedContainerUiState2, stopBasedMetroLandingScreenBottomSheetUiStateType2, (MetroTicketBenefitsContainerUiState) objB2, stopBasedMetroLandingUiStateFactory3.c);
                }
            }
        }
        return obj6;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0136  */
    /* JADX WARN: Code duplicated, block: B:38:0x0169  */
    /* JADX WARN: Code duplicated, block: B:39:0x018c  */
    /* JADX WARN: Code duplicated, block: B:43:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:46:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:50:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:53:0x0219  */
    /* JADX WARN: Code duplicated, block: B:54:0x023c  */
    /* JADX WARN: Code duplicated, block: B:58:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object e(String str, String str2, boolean z, Function1 function1, ContinuationImpl continuationImpl) {
        StopBasedMetroLandingUiStateFactory$metroFromToContainer$1 stopBasedMetroLandingUiStateFactory$metroFromToContainer$1;
        String str3;
        boolean z2;
        ChaloTextStyleHelper chaloTextStyleHelper;
        Function1 function2;
        String str4;
        FromToStopIconUIState fromToStopIconUIState;
        boolean z3;
        String str5;
        String str6;
        Function1 function3;
        TextUIState.ChaloTextUIState chaloTextUIState;
        UITextStyle uITextStyle;
        Function1 function4;
        String str7;
        UITextAlign uITextAlign;
        TextUIState.StyledTextUIState styledTextUIState;
        StopSelectionUIState stopSelectionUIState;
        boolean z4;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        FromToStopIconUIState fromToStopIconUIState2;
        StringProvider stringProvider;
        Object objB;
        boolean z5;
        Function1 function5;
        StopSelectionUIState stopSelectionUIState2;
        String str8;
        UITextStyle uITextStyle2;
        StopSelectionUIState stopSelectionUIState3;
        FromToStopIconUIState fromToStopIconUIState3;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        TextUIState.StyledTextUIState styledTextUIState2;
        StopSelectionUIState stopSelectionUIState4;
        ImageUIState imageUIState;
        ButtonUIStateFactory buttonUIStateFactory;
        boolean z6;
        Function1 function6;
        TextUIState.ChaloTextUIState chaloTextUIState4;
        FromToStopIconUIState fromToStopIconUIState4;
        StopSelectionUIState stopSelectionUIState5;
        ImageUIState imageUIState2;
        if (continuationImpl instanceof StopBasedMetroLandingUiStateFactory$metroFromToContainer$1) {
            stopBasedMetroLandingUiStateFactory$metroFromToContainer$1 = (StopBasedMetroLandingUiStateFactory$metroFromToContainer$1) continuationImpl;
            int i = stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.label = i - Integer.MIN_VALUE;
            } else {
                stopBasedMetroLandingUiStateFactory$metroFromToContainer$1 = new StopBasedMetroLandingUiStateFactory$metroFromToContainer$1(this, continuationImpl);
            }
        } else {
            stopBasedMetroLandingUiStateFactory$metroFromToContainer$1 = new StopBasedMetroLandingUiStateFactory$metroFromToContainer$1(this, continuationImpl);
        }
        Object objB2 = stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.label;
        ChaloColorToken.ShadyGray shadyGray = ChaloColorToken.ShadyGray.f9851a;
        StringProvider stringProvider2 = this.f5554a;
        if (i2 == 0) {
            ResultKt.b(objB2);
            stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$0 = str;
            str3 = str2;
            stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$1 = str3;
            stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$2 = function1;
            ChaloTextStyleHelper chaloTextStyleHelper2 = ChaloTextStyleHelper.f10078a;
            stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$3 = chaloTextStyleHelper2;
            z2 = z;
            stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.Z$0 = z2;
            stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.label = 1;
            objB2 = stringProvider2.b(StringEnum.BUY_QR_TICKET, new Object[0], stopBasedMetroLandingUiStateFactory$metroFromToContainer$1);
            if (objB2 != coroutineSingletons) {
                chaloTextStyleHelper = chaloTextStyleHelper2;
                function2 = function1;
                str4 = str;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            boolean z7 = stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.Z$0;
            ChaloTextStyleHelper chaloTextStyleHelper3 = (ChaloTextStyleHelper) stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$3;
            function2 = (Function1) stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$2;
            str3 = (String) stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$1;
            str4 = (String) stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$0;
            ResultKt.b(objB2);
            z2 = z7;
            chaloTextStyleHelper = chaloTextStyleHelper3;
        } else {
            if (i2 == 2) {
                z3 = stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.Z$0;
                fromToStopIconUIState = (FromToStopIconUIState) stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$4;
                chaloTextUIState = (TextUIState.ChaloTextUIState) stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$3;
                function3 = (Function1) stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$2;
                str6 = (String) stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$1;
                String str9 = (String) stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$0;
                ResultKt.b(objB2);
                str5 = str9;
                String str10 = (String) objB2;
                if (str5 != null || str5.length() == 0) {
                    uITextStyle = UITextStyle.BodyLarge;
                } else {
                    uITextStyle = UITextStyle.BodySmall;
                }
                TextUIState.ChaloTextUIState chaloTextUIState5 = chaloTextUIState;
                function4 = function3;
                str7 = str6;
                FromToStopIconUIState fromToStopIconUIState5 = fromToStopIconUIState;
                UITextStyle uITextStyle3 = uITextStyle;
                uITextAlign = null;
                TextUIState.ChaloTextUIState chaloTextUIState6 = new TextUIState.ChaloTextUIState(str10, uITextStyle3, shadyGray, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                if (str5 != null) {
                    styledTextUIState = new TextUIState.StyledTextUIState(CollectionsKt.R(new StyledTextDataUIState(str5, null, null, UITextStyle.BodyLarge, null, null, null, 1014)), null, UITextOverflow.Ellipsis, 18);
                } else {
                    styledTextUIState = null;
                }
                stopSelectionUIState = new StopSelectionUIState(null, chaloTextUIState6, styledTextUIState, null, null, UiEventHandler.Companion.a(new fa1(function4, 14)), 25);
                z4 = false;
                stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$0 = str7;
                stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$1 = function4;
                chaloTextUIState2 = chaloTextUIState5;
                stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$2 = chaloTextUIState2;
                fromToStopIconUIState2 = fromToStopIconUIState5;
                stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$3 = fromToStopIconUIState2;
                stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$4 = stopSelectionUIState;
                stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.Z$0 = z3;
                stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.label = 3;
                stringProvider = stringProvider2;
                objB = stringProvider.b(StringEnum.TO, new Object[0], stopBasedMetroLandingUiStateFactory$metroFromToContainer$1);
                if (objB != coroutineSingletons) {
                    z5 = z3;
                    function5 = function4;
                    stopSelectionUIState2 = stopSelectionUIState;
                    str8 = str7;
                    String str11 = (String) objB;
                    if (str8 != null) {
                        uITextStyle2 = UITextStyle.BodyLarge;
                    } else {
                        uITextStyle2 = UITextStyle.BodyLarge;
                    }
                    stopSelectionUIState3 = stopSelectionUIState2;
                    fromToStopIconUIState3 = fromToStopIconUIState2;
                    chaloTextUIState3 = chaloTextUIState2;
                    StringProvider stringProvider3 = stringProvider;
                    boolean z8 = z5;
                    TextUIState.ChaloTextUIState chaloTextUIState7 = new TextUIState.ChaloTextUIState(str11, uITextStyle2, shadyGray, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                    if (str8 != null) {
                        styledTextUIState2 = new TextUIState.StyledTextUIState(CollectionsKt.R(new StyledTextDataUIState(str8, null, null, UITextStyle.BodyLarge, null, null, null, 1014)), uITextAlign, UITextOverflow.Ellipsis, 18);
                    } else {
                        styledTextUIState2 = uITextAlign;
                    }
                    stopSelectionUIState4 = new StopSelectionUIState(null, chaloTextUIState7, styledTextUIState2, null, null, UiEventHandler.Companion.a(new fa1(function5, 15)), 25);
                    imageUIState = new ImageUIState(IconType.PB_SWAP_ICON, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().m), UIContentScale.Fit, 0.0f, UiEventHandler.Companion.a(new fa1(function5, 16)), 102);
                    stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$0 = function5;
                    buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                    stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$1 = buttonUIStateFactory;
                    stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$2 = chaloTextUIState3;
                    stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$3 = fromToStopIconUIState3;
                    stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$4 = stopSelectionUIState3;
                    stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$5 = stopSelectionUIState4;
                    stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$6 = imageUIState;
                    z6 = z8;
                    stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.Z$0 = z6;
                    stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.label = 4;
                    objB2 = stringProvider3.b(StringEnum.SEARCH, new Object[0], stopBasedMetroLandingUiStateFactory$metroFromToContainer$1);
                    if (objB2 != coroutineSingletons) {
                        function6 = function5;
                        chaloTextUIState4 = chaloTextUIState3;
                        fromToStopIconUIState4 = fromToStopIconUIState3;
                        stopSelectionUIState5 = stopSelectionUIState3;
                        imageUIState2 = imageUIState;
                    }
                }
                return coroutineSingletons;
            }
            if (i2 == 3) {
                boolean z9 = stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.Z$0;
                StopSelectionUIState stopSelectionUIState6 = (StopSelectionUIState) stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$4;
                FromToStopIconUIState fromToStopIconUIState6 = (FromToStopIconUIState) stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$3;
                TextUIState.ChaloTextUIState chaloTextUIState8 = (TextUIState.ChaloTextUIState) stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$2;
                Function1 function7 = (Function1) stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$1;
                String str12 = (String) stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$0;
                ResultKt.b(objB2);
                z5 = z9;
                chaloTextUIState2 = chaloTextUIState8;
                function5 = function7;
                str8 = str12;
                stopSelectionUIState2 = stopSelectionUIState6;
                stringProvider = stringProvider2;
                objB = objB2;
                fromToStopIconUIState2 = fromToStopIconUIState6;
                z4 = false;
                uITextAlign = null;
                String str13 = (String) objB;
                if (str8 != null || str8.length() == 0) {
                    uITextStyle2 = UITextStyle.BodyLarge;
                } else {
                    uITextStyle2 = UITextStyle.BodySmall;
                }
                stopSelectionUIState3 = stopSelectionUIState2;
                fromToStopIconUIState3 = fromToStopIconUIState2;
                chaloTextUIState3 = chaloTextUIState2;
                StringProvider stringProvider4 = stringProvider;
                boolean z10 = z5;
                TextUIState.ChaloTextUIState chaloTextUIState9 = new TextUIState.ChaloTextUIState(str13, uITextStyle2, shadyGray, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                if (str8 != null) {
                    styledTextUIState2 = new TextUIState.StyledTextUIState(CollectionsKt.R(new StyledTextDataUIState(str8, null, null, UITextStyle.BodyLarge, null, null, null, 1014)), uITextAlign, UITextOverflow.Ellipsis, 18);
                } else {
                    styledTextUIState2 = uITextAlign;
                }
                stopSelectionUIState4 = new StopSelectionUIState(null, chaloTextUIState9, styledTextUIState2, null, null, UiEventHandler.Companion.a(new fa1(function5, 15)), 25);
                imageUIState = new ImageUIState(IconType.PB_SWAP_ICON, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().m), UIContentScale.Fit, 0.0f, UiEventHandler.Companion.a(new fa1(function5, 16)), 102);
                stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$0 = function5;
                buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$1 = buttonUIStateFactory;
                stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$2 = chaloTextUIState3;
                stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$3 = fromToStopIconUIState3;
                stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$4 = stopSelectionUIState3;
                stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$5 = stopSelectionUIState4;
                stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$6 = imageUIState;
                z6 = z10;
                stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.Z$0 = z6;
                stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.label = 4;
                objB2 = stringProvider4.b(StringEnum.SEARCH, new Object[0], stopBasedMetroLandingUiStateFactory$metroFromToContainer$1);
                if (objB2 != coroutineSingletons) {
                    function6 = function5;
                    chaloTextUIState4 = chaloTextUIState3;
                    fromToStopIconUIState4 = fromToStopIconUIState3;
                    stopSelectionUIState5 = stopSelectionUIState3;
                    imageUIState2 = imageUIState;
                }
                return coroutineSingletons;
            }
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z11 = stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.Z$0;
            ImageUIState imageUIState3 = (ImageUIState) stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$6;
            stopSelectionUIState4 = (StopSelectionUIState) stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$5;
            StopSelectionUIState stopSelectionUIState7 = (StopSelectionUIState) stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$4;
            FromToStopIconUIState fromToStopIconUIState7 = (FromToStopIconUIState) stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$3;
            TextUIState.ChaloTextUIState chaloTextUIState10 = (TextUIState.ChaloTextUIState) stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$2;
            buttonUIStateFactory = (ButtonUIStateFactory) stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$1;
            function6 = (Function1) stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$0;
            ResultKt.b(objB2);
            imageUIState2 = imageUIState3;
            stopSelectionUIState5 = stopSelectionUIState7;
            fromToStopIconUIState4 = fromToStopIconUIState7;
            chaloTextUIState4 = chaloTextUIState10;
            z6 = z11;
        }
        return new StopBasedMetroFromToSelectionContainerUIState(chaloTextUIState4, fromToStopIconUIState4, stopSelectionUIState5, stopSelectionUIState4, imageUIState2, ButtonUIStateFactory.g(buttonUIStateFactory, (String) objB2, new fa1(function6, 17), null, UIShape.d, z6, 0.0f, 36));
        TextUIState.ChaloTextUIState chaloTextUIStateE = ChaloTextStyleHelper.e(chaloTextStyleHelper, (String) objB2, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
        FromToStopIconUIState fromToStopIconUIState8 = new FromToStopIconUIState();
        stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$0 = str4;
        stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$1 = str3;
        stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$2 = function2;
        stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$3 = chaloTextUIStateE;
        stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$4 = fromToStopIconUIState8;
        stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.Z$0 = z2;
        stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.label = 2;
        Object objB3 = stringProvider2.b(StringEnum.FROM, new Object[0], stopBasedMetroLandingUiStateFactory$metroFromToContainer$1);
        if (objB3 != coroutineSingletons) {
            fromToStopIconUIState = fromToStopIconUIState8;
            z3 = z2;
            str5 = str4;
            str6 = str3;
            function3 = function2;
            chaloTextUIState = chaloTextUIStateE;
            objB2 = objB3;
            String str14 = (String) objB2;
            if (str5 != null) {
                uITextStyle = UITextStyle.BodyLarge;
            } else {
                uITextStyle = UITextStyle.BodyLarge;
            }
            TextUIState.ChaloTextUIState chaloTextUIState11 = chaloTextUIState;
            function4 = function3;
            str7 = str6;
            FromToStopIconUIState fromToStopIconUIState9 = fromToStopIconUIState;
            UITextStyle uITextStyle4 = uITextStyle;
            uITextAlign = null;
            TextUIState.ChaloTextUIState chaloTextUIState12 = new TextUIState.ChaloTextUIState(str14, uITextStyle4, shadyGray, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
            if (str5 != null) {
                styledTextUIState = new TextUIState.StyledTextUIState(CollectionsKt.R(new StyledTextDataUIState(str5, null, null, UITextStyle.BodyLarge, null, null, null, 1014)), null, UITextOverflow.Ellipsis, 18);
            } else {
                styledTextUIState = null;
            }
            stopSelectionUIState = new StopSelectionUIState(null, chaloTextUIState12, styledTextUIState, null, null, UiEventHandler.Companion.a(new fa1(function4, 14)), 25);
            z4 = false;
            stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$0 = str7;
            stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$1 = function4;
            chaloTextUIState2 = chaloTextUIState11;
            stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$2 = chaloTextUIState2;
            fromToStopIconUIState2 = fromToStopIconUIState9;
            stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$3 = fromToStopIconUIState2;
            stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$4 = stopSelectionUIState;
            stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.Z$0 = z3;
            stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.label = 3;
            stringProvider = stringProvider2;
            objB = stringProvider.b(StringEnum.TO, new Object[0], stopBasedMetroLandingUiStateFactory$metroFromToContainer$1);
            if (objB != coroutineSingletons) {
                z5 = z3;
                function5 = function4;
                stopSelectionUIState2 = stopSelectionUIState;
                str8 = str7;
                String str15 = (String) objB;
                if (str8 != null) {
                    uITextStyle2 = UITextStyle.BodyLarge;
                } else {
                    uITextStyle2 = UITextStyle.BodyLarge;
                }
                stopSelectionUIState3 = stopSelectionUIState2;
                fromToStopIconUIState3 = fromToStopIconUIState2;
                chaloTextUIState3 = chaloTextUIState2;
                StringProvider stringProvider5 = stringProvider;
                boolean z12 = z5;
                TextUIState.ChaloTextUIState chaloTextUIState13 = new TextUIState.ChaloTextUIState(str15, uITextStyle2, shadyGray, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                if (str8 != null) {
                    styledTextUIState2 = new TextUIState.StyledTextUIState(CollectionsKt.R(new StyledTextDataUIState(str8, null, null, UITextStyle.BodyLarge, null, null, null, 1014)), uITextAlign, UITextOverflow.Ellipsis, 18);
                } else {
                    styledTextUIState2 = uITextAlign;
                }
                stopSelectionUIState4 = new StopSelectionUIState(null, chaloTextUIState13, styledTextUIState2, null, null, UiEventHandler.Companion.a(new fa1(function5, 15)), 25);
                imageUIState = new ImageUIState(IconType.PB_SWAP_ICON, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().m), UIContentScale.Fit, 0.0f, UiEventHandler.Companion.a(new fa1(function5, 16)), 102);
                stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$0 = function5;
                buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$1 = buttonUIStateFactory;
                stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$2 = chaloTextUIState3;
                stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$3 = fromToStopIconUIState3;
                stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$4 = stopSelectionUIState3;
                stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$5 = stopSelectionUIState4;
                stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.L$6 = imageUIState;
                z6 = z12;
                stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.Z$0 = z6;
                stopBasedMetroLandingUiStateFactory$metroFromToContainer$1.label = 4;
                objB2 = stringProvider5.b(StringEnum.SEARCH, new Object[0], stopBasedMetroLandingUiStateFactory$metroFromToContainer$1);
                if (objB2 != coroutineSingletons) {
                    function6 = function5;
                    chaloTextUIState4 = chaloTextUIState3;
                    fromToStopIconUIState4 = fromToStopIconUIState3;
                    stopSelectionUIState5 = stopSelectionUIState3;
                    imageUIState2 = imageUIState;
                    return new StopBasedMetroFromToSelectionContainerUIState(chaloTextUIState4, fromToStopIconUIState4, stopSelectionUIState5, stopSelectionUIState4, imageUIState2, ButtonUIStateFactory.g(buttonUIStateFactory, (String) objB2, new fa1(function6, 17), null, UIShape.d, z6, 0.0f, 36));
                }
            }
        }
        return coroutineSingletons;
    }
}

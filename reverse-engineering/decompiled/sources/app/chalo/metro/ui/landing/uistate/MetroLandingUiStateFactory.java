package app.chalo.metro.ui.landing.uistate;

import androidx.compose.ui.graphics.Color;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.metro.ui.landing.MetroLandingScreenBottomSheetType;
import app.chalo.metro.ui.uistate.ProductBannerSpec;
import app.chalo.metro.ui.uistate.ProductBannerUIState;
import app.chalo.ondc.model.app.OndcMetroRouteSearchAppModel;
import app.chalo.productbooking.common.data.models.app.OriginDestinationAdditionalRouteInfoAppModel;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.ChaloColorToken_androidKt;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.button.ButtonUIStateFactory;
import app.chalo.uistate.components.FromToStopIconUIState;
import app.chalo.uistate.components.StopSelectionUIState;
import app.chalo.uistate.divider.DividerOrientation;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.ChaloTextStyleHelper;
import app.chalo.uistate.text.StyledTextDataUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import defpackage.wg0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/landing/uistate/MetroLandingUiStateFactory;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MetroLandingUiStateFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringProvider f5525a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5526a;

        static {
            int[] iArr = new int[MetroLandingScreenBottomSheetType.values().length];
            try {
                iArr[MetroLandingScreenBottomSheetType.LineSelectionBottomSheet.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MetroLandingScreenBottomSheetType.None.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f5526a = iArr;
        }
    }

    public MetroLandingUiStateFactory(StringProvider stringProvider) {
        this.f5525a = stringProvider;
    }

    public static ChaloColorToken d(OndcMetroRouteSearchAppModel ondcMetroRouteSearchAppModel) {
        OriginDestinationAdditionalRouteInfoAppModel originDestinationAdditionalRouteInfoAppModel = ondcMetroRouteSearchAppModel.i;
        boolean z = originDestinationAdditionalRouteInfoAppModel instanceof OriginDestinationAdditionalRouteInfoAppModel.Metro;
        ChaloColorToken.DarkGreyColor darkGreyColor = ChaloColorToken.DarkGreyColor.f9784a;
        if (z) {
            return new ChaloColorToken.Custom(ChaloColorToken_androidKt.a(Color.INSTANCE, ((OriginDestinationAdditionalRouteInfoAppModel.Metro) originDestinationAdditionalRouteInfoAppModel).b, ChaloColorTokenKt.c(darkGreyColor)));
        }
        if (Intrinsics.d(originDestinationAdditionalRouteInfoAppModel, OriginDestinationAdditionalRouteInfoAppModel.Bus.b) || originDestinationAdditionalRouteInfoAppModel == null) {
            return darkGreyColor;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0184  */
    /* JADX WARN: Code duplicated, block: B:36:0x0202  */
    /* JADX WARN: Code duplicated, block: B:40:0x0269  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(ContinuationImpl continuationImpl) {
        MetroLandingUiStateFactory$getBenefitContainerUIState$1 metroLandingUiStateFactory$getBenefitContainerUIState$1;
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
        if (continuationImpl instanceof MetroLandingUiStateFactory$getBenefitContainerUIState$1) {
            metroLandingUiStateFactory$getBenefitContainerUIState$1 = (MetroLandingUiStateFactory$getBenefitContainerUIState$1) continuationImpl;
            int i4 = metroLandingUiStateFactory$getBenefitContainerUIState$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                metroLandingUiStateFactory$getBenefitContainerUIState$1.label = i4 - Integer.MIN_VALUE;
            } else {
                metroLandingUiStateFactory$getBenefitContainerUIState$1 = new MetroLandingUiStateFactory$getBenefitContainerUIState$1(this, continuationImpl);
            }
        } else {
            metroLandingUiStateFactory$getBenefitContainerUIState$1 = new MetroLandingUiStateFactory$getBenefitContainerUIState$1(this, continuationImpl);
        }
        Object objB2 = metroLandingUiStateFactory$getBenefitContainerUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = metroLandingUiStateFactory$getBenefitContainerUIState$1.label;
        ChaloColorToken.AlmostBlackColor almostBlackColor = ChaloColorToken.AlmostBlackColor.f9756a;
        StringProvider stringProvider2 = this.f5525a;
        if (i5 == 0) {
            ResultKt.b(objB2);
            metroLandingUiStateFactory$getBenefitContainerUIState$1.label = 1;
            objB2 = stringProvider2.b(StringEnum.WHY_QR_TICKETS, new Object[0], metroLandingUiStateFactory$getBenefitContainerUIState$1);
            if (objB2 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i5 == 1) {
            ResultKt.b(objB2);
        } else {
            if (i5 == 2) {
                imageUIState = (ImageUIState) metroLandingUiStateFactory$getBenefitContainerUIState$1.L$2;
                productBannerSpec = (ProductBannerSpec) metroLandingUiStateFactory$getBenefitContainerUIState$1.L$1;
                chaloTextUIState = (TextUIState.ChaloTextUIState) metroLandingUiStateFactory$getBenefitContainerUIState$1.L$0;
                ResultKt.b(objB2);
                stringProvider = stringProvider2;
                productBannerUIState = new ProductBannerUIState(productBannerSpec, new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodyMedium, almostBlackColor, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), imageUIState);
                metroTicketBenefitUiStateArr = new MetroTicketBenefitUiState[3];
                imageUIState2 = new ImageUIState(IconType.IC_ADD_TO_HOME, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().B), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                metroLandingUiStateFactory$getBenefitContainerUIState$1.L$0 = chaloTextUIState;
                metroLandingUiStateFactory$getBenefitContainerUIState$1.L$1 = productBannerUIState;
                metroLandingUiStateFactory$getBenefitContainerUIState$1.L$2 = metroTicketBenefitUiStateArr;
                metroLandingUiStateFactory$getBenefitContainerUIState$1.L$3 = metroTicketBenefitUiStateArr;
                metroLandingUiStateFactory$getBenefitContainerUIState$1.L$4 = imageUIState2;
                metroLandingUiStateFactory$getBenefitContainerUIState$1.I$0 = 0;
                metroLandingUiStateFactory$getBenefitContainerUIState$1.label = 3;
                objB = stringProvider.b(StringEnum.PAY_FAST_DIGITALLY, new Object[0], metroLandingUiStateFactory$getBenefitContainerUIState$1);
                if (objB != coroutineSingletons) {
                    i = 0;
                    productBannerUIState2 = productBannerUIState;
                    metroTicketBenefitUiStateArr2 = metroTicketBenefitUiStateArr;
                    productBannerUIState3 = productBannerUIState2;
                    metroTicketBenefitUiStateArr[i] = new MetroTicketBenefitUiState(imageUIState2, new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodyMedium, almostBlackColor, 2, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8144), new DividerUIState(0.0f, null, DividerOrientation.Vertical, 3));
                    imageUIState3 = new ImageUIState(IconType.RECHARGE_CHALO_PAY_WALLET_ICON, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().B), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                    metroLandingUiStateFactory$getBenefitContainerUIState$1.L$0 = chaloTextUIState;
                    metroLandingUiStateFactory$getBenefitContainerUIState$1.L$1 = productBannerUIState3;
                    metroLandingUiStateFactory$getBenefitContainerUIState$1.L$2 = metroTicketBenefitUiStateArr2;
                    metroLandingUiStateFactory$getBenefitContainerUIState$1.L$3 = metroTicketBenefitUiStateArr2;
                    metroLandingUiStateFactory$getBenefitContainerUIState$1.L$4 = imageUIState3;
                    metroLandingUiStateFactory$getBenefitContainerUIState$1.I$0 = 1;
                    metroLandingUiStateFactory$getBenefitContainerUIState$1.label = 4;
                    objB2 = stringProvider.b(StringEnum.NO_WAITING_IN_LINE, new Object[0], metroLandingUiStateFactory$getBenefitContainerUIState$1);
                    if (objB2 != coroutineSingletons) {
                        i2 = 1;
                        chaloTextUIState2 = chaloTextUIState;
                        metroTicketBenefitUiStateArr3 = metroTicketBenefitUiStateArr2;
                        metroTicketBenefitUiStateArr3[i2] = new MetroTicketBenefitUiState(imageUIState3, new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodyMedium, almostBlackColor, 2, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8144), new DividerUIState(0.0f, null, DividerOrientation.Vertical, 3));
                        imageUIState4 = new ImageUIState(IconType.IC_QUICK_VALIDATION, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().B), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                        metroLandingUiStateFactory$getBenefitContainerUIState$1.L$0 = chaloTextUIState2;
                        metroLandingUiStateFactory$getBenefitContainerUIState$1.L$1 = productBannerUIState3;
                        metroLandingUiStateFactory$getBenefitContainerUIState$1.L$2 = metroTicketBenefitUiStateArr2;
                        metroLandingUiStateFactory$getBenefitContainerUIState$1.L$3 = metroTicketBenefitUiStateArr2;
                        metroLandingUiStateFactory$getBenefitContainerUIState$1.L$4 = imageUIState4;
                        metroLandingUiStateFactory$getBenefitContainerUIState$1.I$0 = 2;
                        metroLandingUiStateFactory$getBenefitContainerUIState$1.label = 5;
                        objB2 = stringProvider.b(StringEnum.QUICK_VALIDATION, new Object[0], metroLandingUiStateFactory$getBenefitContainerUIState$1);
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
                int i6 = metroLandingUiStateFactory$getBenefitContainerUIState$1.I$0;
                imageUIState2 = (ImageUIState) metroLandingUiStateFactory$getBenefitContainerUIState$1.L$4;
                MetroTicketBenefitUiState[] metroTicketBenefitUiStateArr6 = (MetroTicketBenefitUiState[]) metroLandingUiStateFactory$getBenefitContainerUIState$1.L$3;
                MetroTicketBenefitUiState[] metroTicketBenefitUiStateArr7 = (MetroTicketBenefitUiState[]) metroLandingUiStateFactory$getBenefitContainerUIState$1.L$2;
                ProductBannerUIState productBannerUIState5 = (ProductBannerUIState) metroLandingUiStateFactory$getBenefitContainerUIState$1.L$1;
                chaloTextUIState = (TextUIState.ChaloTextUIState) metroLandingUiStateFactory$getBenefitContainerUIState$1.L$0;
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
                metroLandingUiStateFactory$getBenefitContainerUIState$1.L$0 = chaloTextUIState;
                metroLandingUiStateFactory$getBenefitContainerUIState$1.L$1 = productBannerUIState3;
                metroLandingUiStateFactory$getBenefitContainerUIState$1.L$2 = metroTicketBenefitUiStateArr2;
                metroLandingUiStateFactory$getBenefitContainerUIState$1.L$3 = metroTicketBenefitUiStateArr2;
                metroLandingUiStateFactory$getBenefitContainerUIState$1.L$4 = imageUIState3;
                metroLandingUiStateFactory$getBenefitContainerUIState$1.I$0 = 1;
                metroLandingUiStateFactory$getBenefitContainerUIState$1.label = 4;
                objB2 = stringProvider.b(StringEnum.NO_WAITING_IN_LINE, new Object[0], metroLandingUiStateFactory$getBenefitContainerUIState$1);
                if (objB2 != coroutineSingletons) {
                    i2 = 1;
                    chaloTextUIState2 = chaloTextUIState;
                    metroTicketBenefitUiStateArr3 = metroTicketBenefitUiStateArr2;
                    metroTicketBenefitUiStateArr3[i2] = new MetroTicketBenefitUiState(imageUIState3, new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodyMedium, almostBlackColor, 2, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8144), new DividerUIState(0.0f, null, DividerOrientation.Vertical, 3));
                    imageUIState4 = new ImageUIState(IconType.IC_QUICK_VALIDATION, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().B), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                    metroLandingUiStateFactory$getBenefitContainerUIState$1.L$0 = chaloTextUIState2;
                    metroLandingUiStateFactory$getBenefitContainerUIState$1.L$1 = productBannerUIState3;
                    metroLandingUiStateFactory$getBenefitContainerUIState$1.L$2 = metroTicketBenefitUiStateArr2;
                    metroLandingUiStateFactory$getBenefitContainerUIState$1.L$3 = metroTicketBenefitUiStateArr2;
                    metroLandingUiStateFactory$getBenefitContainerUIState$1.L$4 = imageUIState4;
                    metroLandingUiStateFactory$getBenefitContainerUIState$1.I$0 = 2;
                    metroLandingUiStateFactory$getBenefitContainerUIState$1.label = 5;
                    objB2 = stringProvider.b(StringEnum.QUICK_VALIDATION, new Object[0], metroLandingUiStateFactory$getBenefitContainerUIState$1);
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
                i2 = metroLandingUiStateFactory$getBenefitContainerUIState$1.I$0;
                imageUIState3 = (ImageUIState) metroLandingUiStateFactory$getBenefitContainerUIState$1.L$4;
                MetroTicketBenefitUiState[] metroTicketBenefitUiStateArr8 = (MetroTicketBenefitUiState[]) metroLandingUiStateFactory$getBenefitContainerUIState$1.L$3;
                MetroTicketBenefitUiState[] metroTicketBenefitUiStateArr9 = (MetroTicketBenefitUiState[]) metroLandingUiStateFactory$getBenefitContainerUIState$1.L$2;
                ProductBannerUIState productBannerUIState6 = (ProductBannerUIState) metroLandingUiStateFactory$getBenefitContainerUIState$1.L$1;
                chaloTextUIState2 = (TextUIState.ChaloTextUIState) metroLandingUiStateFactory$getBenefitContainerUIState$1.L$0;
                ResultKt.b(objB2);
                productBannerUIState3 = productBannerUIState6;
                metroTicketBenefitUiStateArr3 = metroTicketBenefitUiStateArr8;
                stringProvider = stringProvider2;
                metroTicketBenefitUiStateArr2 = metroTicketBenefitUiStateArr9;
                metroTicketBenefitUiStateArr3[i2] = new MetroTicketBenefitUiState(imageUIState3, new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodyMedium, almostBlackColor, 2, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8144), new DividerUIState(0.0f, null, DividerOrientation.Vertical, 3));
                imageUIState4 = new ImageUIState(IconType.IC_QUICK_VALIDATION, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().B), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                metroLandingUiStateFactory$getBenefitContainerUIState$1.L$0 = chaloTextUIState2;
                metroLandingUiStateFactory$getBenefitContainerUIState$1.L$1 = productBannerUIState3;
                metroLandingUiStateFactory$getBenefitContainerUIState$1.L$2 = metroTicketBenefitUiStateArr2;
                metroLandingUiStateFactory$getBenefitContainerUIState$1.L$3 = metroTicketBenefitUiStateArr2;
                metroLandingUiStateFactory$getBenefitContainerUIState$1.L$4 = imageUIState4;
                metroLandingUiStateFactory$getBenefitContainerUIState$1.I$0 = 2;
                metroLandingUiStateFactory$getBenefitContainerUIState$1.label = 5;
                objB2 = stringProvider.b(StringEnum.QUICK_VALIDATION, new Object[0], metroLandingUiStateFactory$getBenefitContainerUIState$1);
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
            i3 = metroLandingUiStateFactory$getBenefitContainerUIState$1.I$0;
            imageUIState5 = (ImageUIState) metroLandingUiStateFactory$getBenefitContainerUIState$1.L$4;
            metroTicketBenefitUiStateArr4 = (MetroTicketBenefitUiState[]) metroLandingUiStateFactory$getBenefitContainerUIState$1.L$3;
            metroTicketBenefitUiStateArr5 = (MetroTicketBenefitUiState[]) metroLandingUiStateFactory$getBenefitContainerUIState$1.L$2;
            productBannerUIState4 = (ProductBannerUIState) metroLandingUiStateFactory$getBenefitContainerUIState$1.L$1;
            chaloTextUIState3 = (TextUIState.ChaloTextUIState) metroLandingUiStateFactory$getBenefitContainerUIState$1.L$0;
            ResultKt.b(objB2);
        }
        metroTicketBenefitUiStateArr4[i3] = new MetroTicketBenefitUiState(imageUIState5, new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodyMedium, almostBlackColor, 2, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8144), new DividerUIState(0.0f, null, DividerOrientation.Vertical, 3));
        return new MetroTicketBenefitsContainerUiState(new MetroTicketBenefitsContainerSpec(), chaloTextUIState3, CollectionsKt.S(metroTicketBenefitUiStateArr5), productBannerUIState4);
        TextUIState.ChaloTextUIState chaloTextUIState4 = new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodyMedium, ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
        productBannerSpec = new ProductBannerSpec();
        imageUIState = new ImageUIState(IconType.IC_CHECK_ICON, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().i), UIContentScale.Fit, 0.0f, (UiEventHandler) null, 230);
        metroLandingUiStateFactory$getBenefitContainerUIState$1.L$0 = chaloTextUIState4;
        metroLandingUiStateFactory$getBenefitContainerUIState$1.L$1 = productBannerSpec;
        metroLandingUiStateFactory$getBenefitContainerUIState$1.L$2 = imageUIState;
        metroLandingUiStateFactory$getBenefitContainerUIState$1.label = 2;
        Object objB3 = stringProvider2.b(StringEnum.TRUSTED_BY_10M_PLUS_INDIANS, new Object[0], metroLandingUiStateFactory$getBenefitContainerUIState$1);
        if (objB3 != coroutineSingletons) {
            chaloTextUIState = chaloTextUIState4;
            objB2 = objB3;
            stringProvider = stringProvider2;
            productBannerUIState = new ProductBannerUIState(productBannerSpec, new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodyMedium, almostBlackColor, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), imageUIState);
            metroTicketBenefitUiStateArr = new MetroTicketBenefitUiState[3];
            imageUIState2 = new ImageUIState(IconType.IC_ADD_TO_HOME, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().B), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
            metroLandingUiStateFactory$getBenefitContainerUIState$1.L$0 = chaloTextUIState;
            metroLandingUiStateFactory$getBenefitContainerUIState$1.L$1 = productBannerUIState;
            metroLandingUiStateFactory$getBenefitContainerUIState$1.L$2 = metroTicketBenefitUiStateArr;
            metroLandingUiStateFactory$getBenefitContainerUIState$1.L$3 = metroTicketBenefitUiStateArr;
            metroLandingUiStateFactory$getBenefitContainerUIState$1.L$4 = imageUIState2;
            metroLandingUiStateFactory$getBenefitContainerUIState$1.I$0 = 0;
            metroLandingUiStateFactory$getBenefitContainerUIState$1.label = 3;
            objB = stringProvider.b(StringEnum.PAY_FAST_DIGITALLY, new Object[0], metroLandingUiStateFactory$getBenefitContainerUIState$1);
            if (objB != coroutineSingletons) {
                i = 0;
                productBannerUIState2 = productBannerUIState;
                metroTicketBenefitUiStateArr2 = metroTicketBenefitUiStateArr;
                productBannerUIState3 = productBannerUIState2;
                metroTicketBenefitUiStateArr[i] = new MetroTicketBenefitUiState(imageUIState2, new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodyMedium, almostBlackColor, 2, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8144), new DividerUIState(0.0f, null, DividerOrientation.Vertical, 3));
                imageUIState3 = new ImageUIState(IconType.RECHARGE_CHALO_PAY_WALLET_ICON, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().B), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                metroLandingUiStateFactory$getBenefitContainerUIState$1.L$0 = chaloTextUIState;
                metroLandingUiStateFactory$getBenefitContainerUIState$1.L$1 = productBannerUIState3;
                metroLandingUiStateFactory$getBenefitContainerUIState$1.L$2 = metroTicketBenefitUiStateArr2;
                metroLandingUiStateFactory$getBenefitContainerUIState$1.L$3 = metroTicketBenefitUiStateArr2;
                metroLandingUiStateFactory$getBenefitContainerUIState$1.L$4 = imageUIState3;
                metroLandingUiStateFactory$getBenefitContainerUIState$1.I$0 = 1;
                metroLandingUiStateFactory$getBenefitContainerUIState$1.label = 4;
                objB2 = stringProvider.b(StringEnum.NO_WAITING_IN_LINE, new Object[0], metroLandingUiStateFactory$getBenefitContainerUIState$1);
                if (objB2 != coroutineSingletons) {
                    i2 = 1;
                    chaloTextUIState2 = chaloTextUIState;
                    metroTicketBenefitUiStateArr3 = metroTicketBenefitUiStateArr2;
                    metroTicketBenefitUiStateArr3[i2] = new MetroTicketBenefitUiState(imageUIState3, new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodyMedium, almostBlackColor, 2, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8144), new DividerUIState(0.0f, null, DividerOrientation.Vertical, 3));
                    imageUIState4 = new ImageUIState(IconType.IC_QUICK_VALIDATION, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().B), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                    metroLandingUiStateFactory$getBenefitContainerUIState$1.L$0 = chaloTextUIState2;
                    metroLandingUiStateFactory$getBenefitContainerUIState$1.L$1 = productBannerUIState3;
                    metroLandingUiStateFactory$getBenefitContainerUIState$1.L$2 = metroTicketBenefitUiStateArr2;
                    metroLandingUiStateFactory$getBenefitContainerUIState$1.L$3 = metroTicketBenefitUiStateArr2;
                    metroLandingUiStateFactory$getBenefitContainerUIState$1.L$4 = imageUIState4;
                    metroLandingUiStateFactory$getBenefitContainerUIState$1.I$0 = 2;
                    metroLandingUiStateFactory$getBenefitContainerUIState$1.label = 5;
                    objB2 = stringProvider.b(StringEnum.QUICK_VALIDATION, new Object[0], metroLandingUiStateFactory$getBenefitContainerUIState$1);
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

    /* JADX WARN: Code duplicated, block: B:21:0x009c  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:30:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:41:0x0126  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00f1 -> B:37:0x00f5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0128 -> B:38:0x011b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(app.chalo.metro.ui.landing.MetroLandingScreenDataState r34, kotlin.jvm.functions.Function1 r35, kotlin.coroutines.jvm.internal.ContinuationImpl r36) {
        /*
            Method dump skipped, instruction units count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.metro.ui.landing.uistate.MetroLandingUiStateFactory.b(app.chalo.metro.ui.landing.MetroLandingScreenDataState, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x017d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0182  */
    /* JADX WARN: Code duplicated, block: B:38:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:41:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:42:0x0209  */
    /* JADX WARN: Code duplicated, block: B:46:0x022d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0239  */
    /* JADX WARN: Code duplicated, block: B:54:0x0244  */
    /* JADX WARN: Code duplicated, block: B:57:0x0275  */
    /* JADX WARN: Code duplicated, block: B:58:0x0299  */
    /* JADX WARN: Code duplicated, block: B:61:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:62:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:65:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:69:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:72:0x0321  */
    /* JADX WARN: Code duplicated, block: B:73:0x0346  */
    /* JADX WARN: Code duplicated, block: B:77:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    public final Object c(OndcMetroRouteSearchAppModel ondcMetroRouteSearchAppModel, String str, String str2, boolean z, boolean z2, Function1 function1, ContinuationImpl continuationImpl) {
        MetroLandingUiStateFactory$getMetroFromToContainer$1 metroLandingUiStateFactory$getMetroFromToContainer$1;
        String str3;
        String str4;
        Function1 function2;
        boolean z3;
        boolean z4;
        OndcMetroRouteSearchAppModel ondcMetroRouteSearchAppModel2;
        TextUIState.StyledTextUIState styledTextUIState;
        ChaloColorToken chaloColorTokenD;
        ChaloTextStyleHelper chaloTextStyleHelper;
        Object objB;
        TextUIState.StyledTextUIState styledTextUIState2;
        boolean z5;
        Function1 function3;
        String str5;
        ChaloColorToken chaloColorToken;
        boolean z6;
        TextUIState.ChaloTextUIState chaloTextUIStateE;
        StopSelectionUIState stopSelectionUIState;
        FromToStopIconUIState fromToStopIconUIState;
        int i;
        Object objB2;
        TextUIState.ChaloTextUIState chaloTextUIState;
        String str6;
        Function1 function4;
        String str7;
        UITextStyle uITextStyle;
        Function1 function5;
        String str8;
        int i2;
        TextUIState.StyledTextUIState styledTextUIState3;
        StopSelectionUIState stopSelectionUIState2;
        StringProvider stringProvider;
        Object objB3;
        CoroutineSingletons coroutineSingletons;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        StopSelectionUIState stopSelectionUIState3;
        StopSelectionUIState stopSelectionUIState4;
        String str9;
        Function1 function6;
        UITextStyle uITextStyle2;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        CoroutineSingletons coroutineSingletons2;
        TextUIState.StyledTextUIState styledTextUIState4;
        StopSelectionUIState stopSelectionUIState5;
        ImageUIState imageUIState;
        ButtonUIStateFactory buttonUIStateFactory;
        Object objB4;
        StopSelectionUIState stopSelectionUIState6;
        ButtonUIStateFactory buttonUIStateFactory2;
        StopSelectionUIState stopSelectionUIState7;
        Function1 function7;
        StopSelectionUIState stopSelectionUIState8;
        FromToStopIconUIState fromToStopIconUIState2;
        TextUIState.ChaloTextUIState chaloTextUIState4;
        ImageUIState imageUIState2;
        if (continuationImpl instanceof MetroLandingUiStateFactory$getMetroFromToContainer$1) {
            metroLandingUiStateFactory$getMetroFromToContainer$1 = (MetroLandingUiStateFactory$getMetroFromToContainer$1) continuationImpl;
            int i3 = metroLandingUiStateFactory$getMetroFromToContainer$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                metroLandingUiStateFactory$getMetroFromToContainer$1.label = i3 - Integer.MIN_VALUE;
            } else {
                metroLandingUiStateFactory$getMetroFromToContainer$1 = new MetroLandingUiStateFactory$getMetroFromToContainer$1(this, continuationImpl);
            }
        } else {
            metroLandingUiStateFactory$getMetroFromToContainer$1 = new MetroLandingUiStateFactory$getMetroFromToContainer$1(this, continuationImpl);
        }
        Object objB5 = metroLandingUiStateFactory$getMetroFromToContainer$1.result;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = metroLandingUiStateFactory$getMetroFromToContainer$1.label;
        ChaloColorToken.ShadyGray shadyGray = ChaloColorToken.ShadyGray.f9851a;
        StringProvider stringProvider2 = this.f5525a;
        if (i4 == 0) {
            ResultKt.b(objB5);
            if (ondcMetroRouteSearchAppModel != null) {
                styledTextUIState = new TextUIState.StyledTextUIState(CollectionsKt.R(new StyledTextDataUIState(ondcMetroRouteSearchAppModel.b, null, null, UITextStyle.BodyLarge, null, null, null, 1014)), null, null, 30);
                str3 = str;
                str4 = str2;
                z3 = z;
                z4 = z2;
                function2 = function1;
                ondcMetroRouteSearchAppModel2 = ondcMetroRouteSearchAppModel;
                if (ondcMetroRouteSearchAppModel2 != null) {
                    chaloColorTokenD = d(ondcMetroRouteSearchAppModel2);
                } else {
                    chaloColorTokenD = null;
                }
                metroLandingUiStateFactory$getMetroFromToContainer$1.L$0 = str3;
                metroLandingUiStateFactory$getMetroFromToContainer$1.L$1 = str4;
                metroLandingUiStateFactory$getMetroFromToContainer$1.L$2 = function2;
                metroLandingUiStateFactory$getMetroFromToContainer$1.L$3 = styledTextUIState;
                metroLandingUiStateFactory$getMetroFromToContainer$1.L$4 = chaloColorTokenD;
                chaloTextStyleHelper = ChaloTextStyleHelper.f10078a;
                metroLandingUiStateFactory$getMetroFromToContainer$1.L$5 = chaloTextStyleHelper;
                metroLandingUiStateFactory$getMetroFromToContainer$1.Z$0 = z3;
                metroLandingUiStateFactory$getMetroFromToContainer$1.Z$1 = z4;
                metroLandingUiStateFactory$getMetroFromToContainer$1.label = 2;
                objB = stringProvider2.b(StringEnum.BUY_QR_TICKET, new Object[0], metroLandingUiStateFactory$getMetroFromToContainer$1);
                if (objB != coroutineSingletons3) {
                    boolean z7 = z3;
                    styledTextUIState2 = styledTextUIState;
                    objB5 = objB;
                    z5 = z7;
                    function3 = function2;
                    str5 = str3;
                    chaloColorToken = chaloColorTokenD;
                    z6 = z4;
                    chaloTextUIStateE = ChaloTextStyleHelper.e(chaloTextStyleHelper, (String) objB5, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                    if (z5) {
                        stopSelectionUIState = new StopSelectionUIState(null, null, styledTextUIState2, new ImageUIState(IconType.IC_ORANGE_ARROW_RIGHT, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 90.0f, (UiEventHandler) null, 190), new ImageUIState(IconType.IC_METRO_LINE, (String) null, chaloColorToken, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 250), UiEventHandler.Companion.a(new wg0(function3, 9)), 1);
                    } else {
                        stopSelectionUIState = null;
                    }
                    fromToStopIconUIState = new FromToStopIconUIState();
                    i = 0;
                    metroLandingUiStateFactory$getMetroFromToContainer$1.L$0 = str5;
                    metroLandingUiStateFactory$getMetroFromToContainer$1.L$1 = str4;
                    metroLandingUiStateFactory$getMetroFromToContainer$1.L$2 = function3;
                    metroLandingUiStateFactory$getMetroFromToContainer$1.L$3 = chaloTextUIStateE;
                    metroLandingUiStateFactory$getMetroFromToContainer$1.L$4 = stopSelectionUIState;
                    metroLandingUiStateFactory$getMetroFromToContainer$1.L$5 = fromToStopIconUIState;
                    metroLandingUiStateFactory$getMetroFromToContainer$1.Z$0 = z6;
                    metroLandingUiStateFactory$getMetroFromToContainer$1.label = 3;
                    objB2 = stringProvider2.b(StringEnum.FROM, new Object[0], metroLandingUiStateFactory$getMetroFromToContainer$1);
                    if (objB2 != coroutineSingletons3) {
                        chaloTextUIState = chaloTextUIStateE;
                        objB5 = objB2;
                        str6 = str5;
                        function4 = function3;
                        str7 = str4;
                        String str10 = (String) objB5;
                        if (str6 != null) {
                            uITextStyle = UITextStyle.BodyLarge;
                        } else {
                            uITextStyle = UITextStyle.BodyLarge;
                        }
                        UITextStyle uITextStyle3 = uITextStyle;
                        function5 = function4;
                        str8 = str7;
                        i2 = i;
                        TextUIState.ChaloTextUIState chaloTextUIState5 = new TextUIState.ChaloTextUIState(str10, uITextStyle3, shadyGray, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                        if (str6 != null) {
                            styledTextUIState3 = new TextUIState.StyledTextUIState(CollectionsKt.R(new StyledTextDataUIState(str6, null, null, UITextStyle.BodyLarge, null, null, null, 1014)), null, UITextOverflow.Ellipsis, 18);
                        } else {
                            styledTextUIState3 = null;
                        }
                        stopSelectionUIState2 = new StopSelectionUIState(null, chaloTextUIState5, styledTextUIState3, null, null, UiEventHandler.Companion.a(new wg0(function5, 10)), 25);
                        metroLandingUiStateFactory$getMetroFromToContainer$1.L$0 = str8;
                        metroLandingUiStateFactory$getMetroFromToContainer$1.L$1 = function5;
                        metroLandingUiStateFactory$getMetroFromToContainer$1.L$2 = chaloTextUIState;
                        metroLandingUiStateFactory$getMetroFromToContainer$1.L$3 = stopSelectionUIState;
                        metroLandingUiStateFactory$getMetroFromToContainer$1.L$4 = fromToStopIconUIState;
                        metroLandingUiStateFactory$getMetroFromToContainer$1.L$5 = stopSelectionUIState2;
                        metroLandingUiStateFactory$getMetroFromToContainer$1.Z$0 = z6;
                        metroLandingUiStateFactory$getMetroFromToContainer$1.label = 4;
                        stringProvider = stringProvider2;
                        objB3 = stringProvider.b(StringEnum.TO, new Object[i2], metroLandingUiStateFactory$getMetroFromToContainer$1);
                        coroutineSingletons = coroutineSingletons3;
                        if (objB3 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        chaloTextUIState2 = chaloTextUIState;
                        stopSelectionUIState3 = stopSelectionUIState;
                        stopSelectionUIState4 = stopSelectionUIState2;
                        str9 = str8;
                        function6 = function5;
                        objB5 = objB3;
                        String str11 = (String) objB5;
                        if (str9 != null) {
                            uITextStyle2 = UITextStyle.BodyLarge;
                        } else {
                            uITextStyle2 = UITextStyle.BodyLarge;
                        }
                        StringProvider stringProvider3 = stringProvider;
                        chaloTextUIState3 = chaloTextUIState2;
                        coroutineSingletons2 = coroutineSingletons;
                        TextUIState.ChaloTextUIState chaloTextUIState6 = new TextUIState.ChaloTextUIState(str11, uITextStyle2, shadyGray, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                        if (str9 != null) {
                            styledTextUIState4 = new TextUIState.StyledTextUIState(CollectionsKt.R(new StyledTextDataUIState(str9, null, null, UITextStyle.BodyLarge, null, null, null, 1014)), null, UITextOverflow.Ellipsis, 18);
                        } else {
                            styledTextUIState4 = null;
                        }
                        stopSelectionUIState5 = new StopSelectionUIState(null, chaloTextUIState6, styledTextUIState4, null, null, UiEventHandler.Companion.a(new wg0(function6, 11)), 25);
                        imageUIState = new ImageUIState(IconType.PB_SWAP_ICON, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().m), UIContentScale.Fit, 0.0f, UiEventHandler.Companion.a(new wg0(function6, 12)), 102);
                        metroLandingUiStateFactory$getMetroFromToContainer$1.L$0 = function6;
                        metroLandingUiStateFactory$getMetroFromToContainer$1.L$1 = chaloTextUIState3;
                        metroLandingUiStateFactory$getMetroFromToContainer$1.L$2 = stopSelectionUIState3;
                        metroLandingUiStateFactory$getMetroFromToContainer$1.L$3 = fromToStopIconUIState;
                        metroLandingUiStateFactory$getMetroFromToContainer$1.L$4 = stopSelectionUIState4;
                        metroLandingUiStateFactory$getMetroFromToContainer$1.L$5 = stopSelectionUIState5;
                        metroLandingUiStateFactory$getMetroFromToContainer$1.L$6 = imageUIState;
                        buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                        metroLandingUiStateFactory$getMetroFromToContainer$1.L$7 = buttonUIStateFactory;
                        metroLandingUiStateFactory$getMetroFromToContainer$1.Z$0 = z6;
                        metroLandingUiStateFactory$getMetroFromToContainer$1.label = 5;
                        objB4 = stringProvider3.b(StringEnum.SEARCH_SENTENCE_CASE, new Object[i2], metroLandingUiStateFactory$getMetroFromToContainer$1);
                        if (objB4 == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                        objB5 = objB4;
                        stopSelectionUIState6 = stopSelectionUIState4;
                        buttonUIStateFactory2 = buttonUIStateFactory;
                        stopSelectionUIState7 = stopSelectionUIState5;
                        function7 = function6;
                        stopSelectionUIState8 = stopSelectionUIState3;
                        fromToStopIconUIState2 = fromToStopIconUIState;
                        chaloTextUIState4 = chaloTextUIState3;
                        imageUIState2 = imageUIState;
                        return new MetroFromToSelectionContainerUIState(chaloTextUIState4, fromToStopIconUIState2, stopSelectionUIState8, stopSelectionUIState6, stopSelectionUIState7, imageUIState2, ButtonUIStateFactory.g(buttonUIStateFactory2, (String) objB5, new wg0(function7, 13), null, null, z6, 0.0f, 44));
                    }
                }
            } else {
                metroLandingUiStateFactory$getMetroFromToContainer$1.L$0 = ondcMetroRouteSearchAppModel;
                str3 = str;
                metroLandingUiStateFactory$getMetroFromToContainer$1.L$1 = str3;
                str4 = str2;
                metroLandingUiStateFactory$getMetroFromToContainer$1.L$2 = str4;
                function2 = function1;
                metroLandingUiStateFactory$getMetroFromToContainer$1.L$3 = function2;
                z3 = z;
                metroLandingUiStateFactory$getMetroFromToContainer$1.Z$0 = z3;
                z4 = z2;
                metroLandingUiStateFactory$getMetroFromToContainer$1.Z$1 = z4;
                metroLandingUiStateFactory$getMetroFromToContainer$1.label = 1;
                objB5 = stringProvider2.b(StringEnum.SELECT_LINE, new Object[0], metroLandingUiStateFactory$getMetroFromToContainer$1);
                if (objB5 != coroutineSingletons3) {
                    ondcMetroRouteSearchAppModel2 = ondcMetroRouteSearchAppModel;
                }
            }
            return coroutineSingletons3;
        }
        if (i4 == 1) {
            boolean z8 = metroLandingUiStateFactory$getMetroFromToContainer$1.Z$1;
            boolean z9 = metroLandingUiStateFactory$getMetroFromToContainer$1.Z$0;
            Function1 function8 = (Function1) metroLandingUiStateFactory$getMetroFromToContainer$1.L$3;
            str4 = (String) metroLandingUiStateFactory$getMetroFromToContainer$1.L$2;
            String str12 = (String) metroLandingUiStateFactory$getMetroFromToContainer$1.L$1;
            ondcMetroRouteSearchAppModel2 = (OndcMetroRouteSearchAppModel) metroLandingUiStateFactory$getMetroFromToContainer$1.L$0;
            ResultKt.b(objB5);
            function2 = function8;
            str3 = str12;
            z4 = z8;
            z3 = z9;
        } else {
            if (i4 == 2) {
                z6 = metroLandingUiStateFactory$getMetroFromToContainer$1.Z$1;
                z5 = metroLandingUiStateFactory$getMetroFromToContainer$1.Z$0;
                chaloTextStyleHelper = (ChaloTextStyleHelper) metroLandingUiStateFactory$getMetroFromToContainer$1.L$5;
                chaloColorToken = (ChaloColorToken) metroLandingUiStateFactory$getMetroFromToContainer$1.L$4;
                styledTextUIState2 = (TextUIState.StyledTextUIState) metroLandingUiStateFactory$getMetroFromToContainer$1.L$3;
                function3 = (Function1) metroLandingUiStateFactory$getMetroFromToContainer$1.L$2;
                str4 = (String) metroLandingUiStateFactory$getMetroFromToContainer$1.L$1;
                str5 = (String) metroLandingUiStateFactory$getMetroFromToContainer$1.L$0;
                ResultKt.b(objB5);
                chaloTextUIStateE = ChaloTextStyleHelper.e(chaloTextStyleHelper, (String) objB5, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                if (z5) {
                    stopSelectionUIState = new StopSelectionUIState(null, null, styledTextUIState2, new ImageUIState(IconType.IC_ORANGE_ARROW_RIGHT, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 90.0f, (UiEventHandler) null, 190), new ImageUIState(IconType.IC_METRO_LINE, (String) null, chaloColorToken, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 250), UiEventHandler.Companion.a(new wg0(function3, 9)), 1);
                } else {
                    stopSelectionUIState = null;
                }
                fromToStopIconUIState = new FromToStopIconUIState();
                i = 0;
                metroLandingUiStateFactory$getMetroFromToContainer$1.L$0 = str5;
                metroLandingUiStateFactory$getMetroFromToContainer$1.L$1 = str4;
                metroLandingUiStateFactory$getMetroFromToContainer$1.L$2 = function3;
                metroLandingUiStateFactory$getMetroFromToContainer$1.L$3 = chaloTextUIStateE;
                metroLandingUiStateFactory$getMetroFromToContainer$1.L$4 = stopSelectionUIState;
                metroLandingUiStateFactory$getMetroFromToContainer$1.L$5 = fromToStopIconUIState;
                metroLandingUiStateFactory$getMetroFromToContainer$1.Z$0 = z6;
                metroLandingUiStateFactory$getMetroFromToContainer$1.label = 3;
                objB2 = stringProvider2.b(StringEnum.FROM, new Object[0], metroLandingUiStateFactory$getMetroFromToContainer$1);
                if (objB2 != coroutineSingletons3) {
                    chaloTextUIState = chaloTextUIStateE;
                    objB5 = objB2;
                    str6 = str5;
                    function4 = function3;
                    str7 = str4;
                    String str13 = (String) objB5;
                    if (str6 != null) {
                        uITextStyle = UITextStyle.BodyLarge;
                    } else {
                        uITextStyle = UITextStyle.BodyLarge;
                    }
                    UITextStyle uITextStyle4 = uITextStyle;
                    function5 = function4;
                    str8 = str7;
                    i2 = i;
                    TextUIState.ChaloTextUIState chaloTextUIState7 = new TextUIState.ChaloTextUIState(str13, uITextStyle4, shadyGray, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                    if (str6 != null) {
                        styledTextUIState3 = new TextUIState.StyledTextUIState(CollectionsKt.R(new StyledTextDataUIState(str6, null, null, UITextStyle.BodyLarge, null, null, null, 1014)), null, UITextOverflow.Ellipsis, 18);
                    } else {
                        styledTextUIState3 = null;
                    }
                    stopSelectionUIState2 = new StopSelectionUIState(null, chaloTextUIState7, styledTextUIState3, null, null, UiEventHandler.Companion.a(new wg0(function5, 10)), 25);
                    metroLandingUiStateFactory$getMetroFromToContainer$1.L$0 = str8;
                    metroLandingUiStateFactory$getMetroFromToContainer$1.L$1 = function5;
                    metroLandingUiStateFactory$getMetroFromToContainer$1.L$2 = chaloTextUIState;
                    metroLandingUiStateFactory$getMetroFromToContainer$1.L$3 = stopSelectionUIState;
                    metroLandingUiStateFactory$getMetroFromToContainer$1.L$4 = fromToStopIconUIState;
                    metroLandingUiStateFactory$getMetroFromToContainer$1.L$5 = stopSelectionUIState2;
                    metroLandingUiStateFactory$getMetroFromToContainer$1.Z$0 = z6;
                    metroLandingUiStateFactory$getMetroFromToContainer$1.label = 4;
                    stringProvider = stringProvider2;
                    objB3 = stringProvider.b(StringEnum.TO, new Object[i2], metroLandingUiStateFactory$getMetroFromToContainer$1);
                    coroutineSingletons = coroutineSingletons3;
                    if (objB3 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    chaloTextUIState2 = chaloTextUIState;
                    stopSelectionUIState3 = stopSelectionUIState;
                    stopSelectionUIState4 = stopSelectionUIState2;
                    str9 = str8;
                    function6 = function5;
                    objB5 = objB3;
                    String str14 = (String) objB5;
                    if (str9 != null) {
                        uITextStyle2 = UITextStyle.BodyLarge;
                    } else {
                        uITextStyle2 = UITextStyle.BodyLarge;
                    }
                    StringProvider stringProvider4 = stringProvider;
                    chaloTextUIState3 = chaloTextUIState2;
                    coroutineSingletons2 = coroutineSingletons;
                    TextUIState.ChaloTextUIState chaloTextUIState8 = new TextUIState.ChaloTextUIState(str14, uITextStyle2, shadyGray, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                    if (str9 != null) {
                        styledTextUIState4 = new TextUIState.StyledTextUIState(CollectionsKt.R(new StyledTextDataUIState(str9, null, null, UITextStyle.BodyLarge, null, null, null, 1014)), null, UITextOverflow.Ellipsis, 18);
                    } else {
                        styledTextUIState4 = null;
                    }
                    stopSelectionUIState5 = new StopSelectionUIState(null, chaloTextUIState8, styledTextUIState4, null, null, UiEventHandler.Companion.a(new wg0(function6, 11)), 25);
                    imageUIState = new ImageUIState(IconType.PB_SWAP_ICON, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().m), UIContentScale.Fit, 0.0f, UiEventHandler.Companion.a(new wg0(function6, 12)), 102);
                    metroLandingUiStateFactory$getMetroFromToContainer$1.L$0 = function6;
                    metroLandingUiStateFactory$getMetroFromToContainer$1.L$1 = chaloTextUIState3;
                    metroLandingUiStateFactory$getMetroFromToContainer$1.L$2 = stopSelectionUIState3;
                    metroLandingUiStateFactory$getMetroFromToContainer$1.L$3 = fromToStopIconUIState;
                    metroLandingUiStateFactory$getMetroFromToContainer$1.L$4 = stopSelectionUIState4;
                    metroLandingUiStateFactory$getMetroFromToContainer$1.L$5 = stopSelectionUIState5;
                    metroLandingUiStateFactory$getMetroFromToContainer$1.L$6 = imageUIState;
                    buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                    metroLandingUiStateFactory$getMetroFromToContainer$1.L$7 = buttonUIStateFactory;
                    metroLandingUiStateFactory$getMetroFromToContainer$1.Z$0 = z6;
                    metroLandingUiStateFactory$getMetroFromToContainer$1.label = 5;
                    objB4 = stringProvider4.b(StringEnum.SEARCH_SENTENCE_CASE, new Object[i2], metroLandingUiStateFactory$getMetroFromToContainer$1);
                    if (objB4 == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                    objB5 = objB4;
                    stopSelectionUIState6 = stopSelectionUIState4;
                    buttonUIStateFactory2 = buttonUIStateFactory;
                    stopSelectionUIState7 = stopSelectionUIState5;
                    function7 = function6;
                    stopSelectionUIState8 = stopSelectionUIState3;
                    fromToStopIconUIState2 = fromToStopIconUIState;
                    chaloTextUIState4 = chaloTextUIState3;
                    imageUIState2 = imageUIState;
                }
                return coroutineSingletons3;
            }
            if (i4 == 3) {
                z6 = metroLandingUiStateFactory$getMetroFromToContainer$1.Z$0;
                fromToStopIconUIState = (FromToStopIconUIState) metroLandingUiStateFactory$getMetroFromToContainer$1.L$5;
                stopSelectionUIState = (StopSelectionUIState) metroLandingUiStateFactory$getMetroFromToContainer$1.L$4;
                TextUIState.ChaloTextUIState chaloTextUIState9 = (TextUIState.ChaloTextUIState) metroLandingUiStateFactory$getMetroFromToContainer$1.L$3;
                function4 = (Function1) metroLandingUiStateFactory$getMetroFromToContainer$1.L$2;
                str7 = (String) metroLandingUiStateFactory$getMetroFromToContainer$1.L$1;
                String str15 = (String) metroLandingUiStateFactory$getMetroFromToContainer$1.L$0;
                ResultKt.b(objB5);
                str6 = str15;
                chaloTextUIState = chaloTextUIState9;
                i = 0;
                String str16 = (String) objB5;
                if (str6 != null || str6.length() == 0) {
                    uITextStyle = UITextStyle.BodyLarge;
                } else {
                    uITextStyle = UITextStyle.BodySmall;
                }
                UITextStyle uITextStyle5 = uITextStyle;
                function5 = function4;
                str8 = str7;
                i2 = i;
                TextUIState.ChaloTextUIState chaloTextUIState10 = new TextUIState.ChaloTextUIState(str16, uITextStyle5, shadyGray, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                if (str6 != null) {
                    styledTextUIState3 = new TextUIState.StyledTextUIState(CollectionsKt.R(new StyledTextDataUIState(str6, null, null, UITextStyle.BodyLarge, null, null, null, 1014)), null, UITextOverflow.Ellipsis, 18);
                } else {
                    styledTextUIState3 = null;
                }
                stopSelectionUIState2 = new StopSelectionUIState(null, chaloTextUIState10, styledTextUIState3, null, null, UiEventHandler.Companion.a(new wg0(function5, 10)), 25);
                metroLandingUiStateFactory$getMetroFromToContainer$1.L$0 = str8;
                metroLandingUiStateFactory$getMetroFromToContainer$1.L$1 = function5;
                metroLandingUiStateFactory$getMetroFromToContainer$1.L$2 = chaloTextUIState;
                metroLandingUiStateFactory$getMetroFromToContainer$1.L$3 = stopSelectionUIState;
                metroLandingUiStateFactory$getMetroFromToContainer$1.L$4 = fromToStopIconUIState;
                metroLandingUiStateFactory$getMetroFromToContainer$1.L$5 = stopSelectionUIState2;
                metroLandingUiStateFactory$getMetroFromToContainer$1.Z$0 = z6;
                metroLandingUiStateFactory$getMetroFromToContainer$1.label = 4;
                stringProvider = stringProvider2;
                objB3 = stringProvider.b(StringEnum.TO, new Object[i2], metroLandingUiStateFactory$getMetroFromToContainer$1);
                coroutineSingletons = coroutineSingletons3;
                if (objB3 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                chaloTextUIState2 = chaloTextUIState;
                stopSelectionUIState3 = stopSelectionUIState;
                stopSelectionUIState4 = stopSelectionUIState2;
                str9 = str8;
                function6 = function5;
                objB5 = objB3;
                String str17 = (String) objB5;
                if (str9 != null) {
                    uITextStyle2 = UITextStyle.BodyLarge;
                } else {
                    uITextStyle2 = UITextStyle.BodyLarge;
                }
                StringProvider stringProvider5 = stringProvider;
                chaloTextUIState3 = chaloTextUIState2;
                coroutineSingletons2 = coroutineSingletons;
                TextUIState.ChaloTextUIState chaloTextUIState11 = new TextUIState.ChaloTextUIState(str17, uITextStyle2, shadyGray, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                if (str9 != null) {
                    styledTextUIState4 = new TextUIState.StyledTextUIState(CollectionsKt.R(new StyledTextDataUIState(str9, null, null, UITextStyle.BodyLarge, null, null, null, 1014)), null, UITextOverflow.Ellipsis, 18);
                } else {
                    styledTextUIState4 = null;
                }
                stopSelectionUIState5 = new StopSelectionUIState(null, chaloTextUIState11, styledTextUIState4, null, null, UiEventHandler.Companion.a(new wg0(function6, 11)), 25);
                imageUIState = new ImageUIState(IconType.PB_SWAP_ICON, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().m), UIContentScale.Fit, 0.0f, UiEventHandler.Companion.a(new wg0(function6, 12)), 102);
                metroLandingUiStateFactory$getMetroFromToContainer$1.L$0 = function6;
                metroLandingUiStateFactory$getMetroFromToContainer$1.L$1 = chaloTextUIState3;
                metroLandingUiStateFactory$getMetroFromToContainer$1.L$2 = stopSelectionUIState3;
                metroLandingUiStateFactory$getMetroFromToContainer$1.L$3 = fromToStopIconUIState;
                metroLandingUiStateFactory$getMetroFromToContainer$1.L$4 = stopSelectionUIState4;
                metroLandingUiStateFactory$getMetroFromToContainer$1.L$5 = stopSelectionUIState5;
                metroLandingUiStateFactory$getMetroFromToContainer$1.L$6 = imageUIState;
                buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                metroLandingUiStateFactory$getMetroFromToContainer$1.L$7 = buttonUIStateFactory;
                metroLandingUiStateFactory$getMetroFromToContainer$1.Z$0 = z6;
                metroLandingUiStateFactory$getMetroFromToContainer$1.label = 5;
                objB4 = stringProvider5.b(StringEnum.SEARCH_SENTENCE_CASE, new Object[i2], metroLandingUiStateFactory$getMetroFromToContainer$1);
                if (objB4 == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                objB5 = objB4;
                stopSelectionUIState6 = stopSelectionUIState4;
                buttonUIStateFactory2 = buttonUIStateFactory;
                stopSelectionUIState7 = stopSelectionUIState5;
                function7 = function6;
                stopSelectionUIState8 = stopSelectionUIState3;
                fromToStopIconUIState2 = fromToStopIconUIState;
                chaloTextUIState4 = chaloTextUIState3;
                imageUIState2 = imageUIState;
            } else if (i4 == 4) {
                z6 = metroLandingUiStateFactory$getMetroFromToContainer$1.Z$0;
                StopSelectionUIState stopSelectionUIState9 = (StopSelectionUIState) metroLandingUiStateFactory$getMetroFromToContainer$1.L$5;
                FromToStopIconUIState fromToStopIconUIState3 = (FromToStopIconUIState) metroLandingUiStateFactory$getMetroFromToContainer$1.L$4;
                StopSelectionUIState stopSelectionUIState10 = (StopSelectionUIState) metroLandingUiStateFactory$getMetroFromToContainer$1.L$3;
                TextUIState.ChaloTextUIState chaloTextUIState12 = (TextUIState.ChaloTextUIState) metroLandingUiStateFactory$getMetroFromToContainer$1.L$2;
                Function1 function9 = (Function1) metroLandingUiStateFactory$getMetroFromToContainer$1.L$1;
                String str18 = (String) metroLandingUiStateFactory$getMetroFromToContainer$1.L$0;
                ResultKt.b(objB5);
                stopSelectionUIState4 = stopSelectionUIState9;
                fromToStopIconUIState = fromToStopIconUIState3;
                stopSelectionUIState3 = stopSelectionUIState10;
                chaloTextUIState2 = chaloTextUIState12;
                function6 = function9;
                str9 = str18;
                stringProvider = stringProvider2;
                coroutineSingletons = coroutineSingletons3;
                i2 = 0;
                String str19 = (String) objB5;
                if (str9 != null || str9.length() == 0) {
                    uITextStyle2 = UITextStyle.BodyLarge;
                } else {
                    uITextStyle2 = UITextStyle.BodySmall;
                }
                StringProvider stringProvider6 = stringProvider;
                chaloTextUIState3 = chaloTextUIState2;
                coroutineSingletons2 = coroutineSingletons;
                TextUIState.ChaloTextUIState chaloTextUIState13 = new TextUIState.ChaloTextUIState(str19, uITextStyle2, shadyGray, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                if (str9 != null) {
                    styledTextUIState4 = new TextUIState.StyledTextUIState(CollectionsKt.R(new StyledTextDataUIState(str9, null, null, UITextStyle.BodyLarge, null, null, null, 1014)), null, UITextOverflow.Ellipsis, 18);
                } else {
                    styledTextUIState4 = null;
                }
                stopSelectionUIState5 = new StopSelectionUIState(null, chaloTextUIState13, styledTextUIState4, null, null, UiEventHandler.Companion.a(new wg0(function6, 11)), 25);
                imageUIState = new ImageUIState(IconType.PB_SWAP_ICON, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().m), UIContentScale.Fit, 0.0f, UiEventHandler.Companion.a(new wg0(function6, 12)), 102);
                metroLandingUiStateFactory$getMetroFromToContainer$1.L$0 = function6;
                metroLandingUiStateFactory$getMetroFromToContainer$1.L$1 = chaloTextUIState3;
                metroLandingUiStateFactory$getMetroFromToContainer$1.L$2 = stopSelectionUIState3;
                metroLandingUiStateFactory$getMetroFromToContainer$1.L$3 = fromToStopIconUIState;
                metroLandingUiStateFactory$getMetroFromToContainer$1.L$4 = stopSelectionUIState4;
                metroLandingUiStateFactory$getMetroFromToContainer$1.L$5 = stopSelectionUIState5;
                metroLandingUiStateFactory$getMetroFromToContainer$1.L$6 = imageUIState;
                buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                metroLandingUiStateFactory$getMetroFromToContainer$1.L$7 = buttonUIStateFactory;
                metroLandingUiStateFactory$getMetroFromToContainer$1.Z$0 = z6;
                metroLandingUiStateFactory$getMetroFromToContainer$1.label = 5;
                objB4 = stringProvider6.b(StringEnum.SEARCH_SENTENCE_CASE, new Object[i2], metroLandingUiStateFactory$getMetroFromToContainer$1);
                if (objB4 == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                objB5 = objB4;
                stopSelectionUIState6 = stopSelectionUIState4;
                buttonUIStateFactory2 = buttonUIStateFactory;
                stopSelectionUIState7 = stopSelectionUIState5;
                function7 = function6;
                stopSelectionUIState8 = stopSelectionUIState3;
                fromToStopIconUIState2 = fromToStopIconUIState;
                chaloTextUIState4 = chaloTextUIState3;
                imageUIState2 = imageUIState;
            } else {
                if (i4 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z6 = metroLandingUiStateFactory$getMetroFromToContainer$1.Z$0;
                ButtonUIStateFactory buttonUIStateFactory3 = (ButtonUIStateFactory) metroLandingUiStateFactory$getMetroFromToContainer$1.L$7;
                ImageUIState imageUIState3 = (ImageUIState) metroLandingUiStateFactory$getMetroFromToContainer$1.L$6;
                StopSelectionUIState stopSelectionUIState11 = (StopSelectionUIState) metroLandingUiStateFactory$getMetroFromToContainer$1.L$5;
                StopSelectionUIState stopSelectionUIState12 = (StopSelectionUIState) metroLandingUiStateFactory$getMetroFromToContainer$1.L$4;
                FromToStopIconUIState fromToStopIconUIState4 = (FromToStopIconUIState) metroLandingUiStateFactory$getMetroFromToContainer$1.L$3;
                StopSelectionUIState stopSelectionUIState13 = (StopSelectionUIState) metroLandingUiStateFactory$getMetroFromToContainer$1.L$2;
                TextUIState.ChaloTextUIState chaloTextUIState14 = (TextUIState.ChaloTextUIState) metroLandingUiStateFactory$getMetroFromToContainer$1.L$1;
                function7 = (Function1) metroLandingUiStateFactory$getMetroFromToContainer$1.L$0;
                ResultKt.b(objB5);
                imageUIState2 = imageUIState3;
                chaloTextUIState4 = chaloTextUIState14;
                stopSelectionUIState7 = stopSelectionUIState11;
                fromToStopIconUIState2 = fromToStopIconUIState4;
                stopSelectionUIState6 = stopSelectionUIState12;
                stopSelectionUIState8 = stopSelectionUIState13;
                buttonUIStateFactory2 = buttonUIStateFactory3;
            }
        }
        return new MetroFromToSelectionContainerUIState(chaloTextUIState4, fromToStopIconUIState2, stopSelectionUIState8, stopSelectionUIState6, stopSelectionUIState7, imageUIState2, ButtonUIStateFactory.g(buttonUIStateFactory2, (String) objB5, new wg0(function7, 13), null, null, z6, 0.0f, 44));
        styledTextUIState = new TextUIState.StyledTextUIState(CollectionsKt.R(new StyledTextDataUIState((String) objB5, null, null, UITextStyle.BodyLarge, null, null, null, 1014)), null, null, 30);
        if (ondcMetroRouteSearchAppModel2 != null) {
            chaloColorTokenD = d(ondcMetroRouteSearchAppModel2);
        } else {
            chaloColorTokenD = null;
        }
        metroLandingUiStateFactory$getMetroFromToContainer$1.L$0 = str3;
        metroLandingUiStateFactory$getMetroFromToContainer$1.L$1 = str4;
        metroLandingUiStateFactory$getMetroFromToContainer$1.L$2 = function2;
        metroLandingUiStateFactory$getMetroFromToContainer$1.L$3 = styledTextUIState;
        metroLandingUiStateFactory$getMetroFromToContainer$1.L$4 = chaloColorTokenD;
        chaloTextStyleHelper = ChaloTextStyleHelper.f10078a;
        metroLandingUiStateFactory$getMetroFromToContainer$1.L$5 = chaloTextStyleHelper;
        metroLandingUiStateFactory$getMetroFromToContainer$1.Z$0 = z3;
        metroLandingUiStateFactory$getMetroFromToContainer$1.Z$1 = z4;
        metroLandingUiStateFactory$getMetroFromToContainer$1.label = 2;
        objB = stringProvider2.b(StringEnum.BUY_QR_TICKET, new Object[0], metroLandingUiStateFactory$getMetroFromToContainer$1);
        if (objB != coroutineSingletons3) {
            boolean z10 = z3;
            styledTextUIState2 = styledTextUIState;
            objB5 = objB;
            z5 = z10;
            function3 = function2;
            str5 = str3;
            chaloColorToken = chaloColorTokenD;
            z6 = z4;
            chaloTextUIStateE = ChaloTextStyleHelper.e(chaloTextStyleHelper, (String) objB5, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
            if (z5) {
                stopSelectionUIState = new StopSelectionUIState(null, null, styledTextUIState2, new ImageUIState(IconType.IC_ORANGE_ARROW_RIGHT, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 90.0f, (UiEventHandler) null, 190), new ImageUIState(IconType.IC_METRO_LINE, (String) null, chaloColorToken, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 250), UiEventHandler.Companion.a(new wg0(function3, 9)), 1);
            } else {
                stopSelectionUIState = null;
            }
            fromToStopIconUIState = new FromToStopIconUIState();
            i = 0;
            metroLandingUiStateFactory$getMetroFromToContainer$1.L$0 = str5;
            metroLandingUiStateFactory$getMetroFromToContainer$1.L$1 = str4;
            metroLandingUiStateFactory$getMetroFromToContainer$1.L$2 = function3;
            metroLandingUiStateFactory$getMetroFromToContainer$1.L$3 = chaloTextUIStateE;
            metroLandingUiStateFactory$getMetroFromToContainer$1.L$4 = stopSelectionUIState;
            metroLandingUiStateFactory$getMetroFromToContainer$1.L$5 = fromToStopIconUIState;
            metroLandingUiStateFactory$getMetroFromToContainer$1.Z$0 = z6;
            metroLandingUiStateFactory$getMetroFromToContainer$1.label = 3;
            objB2 = stringProvider2.b(StringEnum.FROM, new Object[0], metroLandingUiStateFactory$getMetroFromToContainer$1);
            if (objB2 != coroutineSingletons3) {
                chaloTextUIState = chaloTextUIStateE;
                objB5 = objB2;
                str6 = str5;
                function4 = function3;
                str7 = str4;
                String str110 = (String) objB5;
                if (str6 != null) {
                    uITextStyle = UITextStyle.BodyLarge;
                } else {
                    uITextStyle = UITextStyle.BodyLarge;
                }
                UITextStyle uITextStyle6 = uITextStyle;
                function5 = function4;
                str8 = str7;
                i2 = i;
                TextUIState.ChaloTextUIState chaloTextUIState15 = new TextUIState.ChaloTextUIState(str110, uITextStyle6, shadyGray, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                if (str6 != null) {
                    styledTextUIState3 = new TextUIState.StyledTextUIState(CollectionsKt.R(new StyledTextDataUIState(str6, null, null, UITextStyle.BodyLarge, null, null, null, 1014)), null, UITextOverflow.Ellipsis, 18);
                } else {
                    styledTextUIState3 = null;
                }
                stopSelectionUIState2 = new StopSelectionUIState(null, chaloTextUIState15, styledTextUIState3, null, null, UiEventHandler.Companion.a(new wg0(function5, 10)), 25);
                metroLandingUiStateFactory$getMetroFromToContainer$1.L$0 = str8;
                metroLandingUiStateFactory$getMetroFromToContainer$1.L$1 = function5;
                metroLandingUiStateFactory$getMetroFromToContainer$1.L$2 = chaloTextUIState;
                metroLandingUiStateFactory$getMetroFromToContainer$1.L$3 = stopSelectionUIState;
                metroLandingUiStateFactory$getMetroFromToContainer$1.L$4 = fromToStopIconUIState;
                metroLandingUiStateFactory$getMetroFromToContainer$1.L$5 = stopSelectionUIState2;
                metroLandingUiStateFactory$getMetroFromToContainer$1.Z$0 = z6;
                metroLandingUiStateFactory$getMetroFromToContainer$1.label = 4;
                stringProvider = stringProvider2;
                objB3 = stringProvider.b(StringEnum.TO, new Object[i2], metroLandingUiStateFactory$getMetroFromToContainer$1);
                coroutineSingletons = coroutineSingletons3;
                if (objB3 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                chaloTextUIState2 = chaloTextUIState;
                stopSelectionUIState3 = stopSelectionUIState;
                stopSelectionUIState4 = stopSelectionUIState2;
                str9 = str8;
                function6 = function5;
                objB5 = objB3;
                String str111 = (String) objB5;
                if (str9 != null) {
                    uITextStyle2 = UITextStyle.BodyLarge;
                } else {
                    uITextStyle2 = UITextStyle.BodyLarge;
                }
                StringProvider stringProvider7 = stringProvider;
                chaloTextUIState3 = chaloTextUIState2;
                coroutineSingletons2 = coroutineSingletons;
                TextUIState.ChaloTextUIState chaloTextUIState16 = new TextUIState.ChaloTextUIState(str111, uITextStyle2, shadyGray, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                if (str9 != null) {
                    styledTextUIState4 = new TextUIState.StyledTextUIState(CollectionsKt.R(new StyledTextDataUIState(str9, null, null, UITextStyle.BodyLarge, null, null, null, 1014)), null, UITextOverflow.Ellipsis, 18);
                } else {
                    styledTextUIState4 = null;
                }
                stopSelectionUIState5 = new StopSelectionUIState(null, chaloTextUIState16, styledTextUIState4, null, null, UiEventHandler.Companion.a(new wg0(function6, 11)), 25);
                imageUIState = new ImageUIState(IconType.PB_SWAP_ICON, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().m), UIContentScale.Fit, 0.0f, UiEventHandler.Companion.a(new wg0(function6, 12)), 102);
                metroLandingUiStateFactory$getMetroFromToContainer$1.L$0 = function6;
                metroLandingUiStateFactory$getMetroFromToContainer$1.L$1 = chaloTextUIState3;
                metroLandingUiStateFactory$getMetroFromToContainer$1.L$2 = stopSelectionUIState3;
                metroLandingUiStateFactory$getMetroFromToContainer$1.L$3 = fromToStopIconUIState;
                metroLandingUiStateFactory$getMetroFromToContainer$1.L$4 = stopSelectionUIState4;
                metroLandingUiStateFactory$getMetroFromToContainer$1.L$5 = stopSelectionUIState5;
                metroLandingUiStateFactory$getMetroFromToContainer$1.L$6 = imageUIState;
                buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                metroLandingUiStateFactory$getMetroFromToContainer$1.L$7 = buttonUIStateFactory;
                metroLandingUiStateFactory$getMetroFromToContainer$1.Z$0 = z6;
                metroLandingUiStateFactory$getMetroFromToContainer$1.label = 5;
                objB4 = stringProvider7.b(StringEnum.SEARCH_SENTENCE_CASE, new Object[i2], metroLandingUiStateFactory$getMetroFromToContainer$1);
                if (objB4 == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                objB5 = objB4;
                stopSelectionUIState6 = stopSelectionUIState4;
                buttonUIStateFactory2 = buttonUIStateFactory;
                stopSelectionUIState7 = stopSelectionUIState5;
                function7 = function6;
                stopSelectionUIState8 = stopSelectionUIState3;
                fromToStopIconUIState2 = fromToStopIconUIState;
                chaloTextUIState4 = chaloTextUIState3;
                imageUIState2 = imageUIState;
                return new MetroFromToSelectionContainerUIState(chaloTextUIState4, fromToStopIconUIState2, stopSelectionUIState8, stopSelectionUIState6, stopSelectionUIState7, imageUIState2, ButtonUIStateFactory.g(buttonUIStateFactory2, (String) objB5, new wg0(function7, 13), null, null, z6, 0.0f, 44));
            }
        }
        return coroutineSingletons3;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x035d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0372 A[LOOP:1: B:102:0x036c->B:104:0x0372, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x0407  */
    /* JADX WARN: Code duplicated, block: B:110:0x0424  */
    /* JADX WARN: Code duplicated, block: B:114:0x0348 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0150  */
    /* JADX WARN: Code duplicated, block: B:40:0x018f  */
    /* JADX WARN: Code duplicated, block: B:43:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:46:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:49:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:51:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:52:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:55:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:56:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:59:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:62:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:63:0x01eb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:65:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:67:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:69:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:70:0x01fd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:74:0x0206 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x0221  */
    /* JADX WARN: Code duplicated, block: B:79:0x0225  */
    /* JADX WARN: Code duplicated, block: B:81:0x0232  */
    /* JADX WARN: Code duplicated, block: B:83:0x0238  */
    /* JADX WARN: Code duplicated, block: B:86:0x0270  */
    /* JADX WARN: Code duplicated, block: B:89:0x0285  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code duplicated, block: B:91:0x0297  */
    /* JADX WARN: Code duplicated, block: B:92:0x029e  */
    /* JADX WARN: Code duplicated, block: B:94:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:99:0x0352  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00eb, code lost:
    
        if (r3 == r8) goto L109;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(app.chalo.metro.ui.landing.MetroLandingScreenDataState r42, kotlin.jvm.functions.Function1 r43, kotlin.coroutines.jvm.internal.ContinuationImpl r44) {
        /*
            Method dump skipped, instruction units count: 1081
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.metro.ui.landing.uistate.MetroLandingUiStateFactory.e(app.chalo.metro.ui.landing.MetroLandingScreenDataState, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}

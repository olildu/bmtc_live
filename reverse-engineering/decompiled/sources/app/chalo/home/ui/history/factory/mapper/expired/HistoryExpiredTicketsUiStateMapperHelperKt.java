package app.chalo.home.ui.history.factory.mapper.expired;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.data.RefundInfoAppModel;
import app.chalo.data.RefundStatus;
import app.chalo.home.ui.history.uistate.regularbusticket.ProductBannerSpec;
import app.chalo.home.ui.history.uistate.regularbusticket.ProductBannerUiState;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class HistoryExpiredTicketsUiStateMapperHelperKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3462a;

        static {
            int[] iArr = new int[RefundStatus.values().length];
            try {
                iArr[RefundStatus.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RefundStatus.NOT_ALLOWED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RefundStatus.REFUNDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RefundStatus.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f3462a = iArr;
        }
    }

    public static final ProductBannerUiState a(RefundInfoAppModel refundInfoAppModel) {
        Intrinsics.i(refundInfoAppModel, "<this>");
        RefundStatus refundStatus = refundInfoAppModel.f2396a;
        int i = refundStatus == null ? -1 : WhenMappings.f3462a[refundStatus.ordinal()];
        if (i != -1) {
            ChaloColorToken.AlmostBlackColor almostBlackColor = ChaloColorToken.AlmostBlackColor.f9756a;
            if (i == 1) {
                return new ProductBannerUiState(new ProductBannerSpec(0.0f, 11, ChaloColorToken.LightOrangeSpf.f9817a), new TextUIState.ChaloTextUIState(refundInfoAppModel.b, UITextStyle.BodyMedium, almostBlackColor, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new ImageUIState(IconType.IC_RELOAD, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), null);
            }
            ChaloColorToken.Black black = ChaloColorToken.Black.f9759a;
            ChaloColorToken.LightGray lightGray = ChaloColorToken.LightGray.f9814a;
            if (i == 2) {
                return new ProductBannerUiState(new ProductBannerSpec(0.0f, 11, lightGray), new TextUIState.ChaloTextUIState(refundInfoAppModel.b, UITextStyle.BodyMedium, almostBlackColor, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new ImageUIState(IconType.IC_ALERT_TRIANGLE, (String) null, black, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 242), null);
            }
            if (i == 3) {
                return new ProductBannerUiState(new ProductBannerSpec(0.0f, 11, lightGray), new TextUIState.ChaloTextUIState(refundInfoAppModel.b, UITextStyle.BodyMedium, almostBlackColor, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new ImageUIState(IconType.IC_REFUND_COMPLETE, (String) null, black, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 242), null);
            }
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return null;
    }
}

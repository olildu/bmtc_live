package app.chalo.productpurchase.productselection.ui;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.ImageUrlUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import defpackage.fr0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ProductSelectionContractKt {
    public static final ProductSelectionSectionItemUIState.ProductItemUIState a(String str, IconType iconType, ImageUrlUIState imageUrlUIState, String title, String str2, String str3, float f, fr0 fr0Var) {
        TextUIState.ChaloTextUIState chaloTextUIState;
        Intrinsics.i(title, "title");
        ProductItemUISpec productItemUISpec = new ProductItemUISpec(new ChaloPadding((str == null || str.length() == 0) && iconType == null ? ChaloThemeHelper.a().g : ChaloThemeHelper.a().f1916a, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, Dp.m7278constructorimpl(ChaloThemeHelper.a().h + ChaloThemeHelper.a().d)));
        TextUIState.ChaloTextUIState chaloTextUIState2 = str != null ? new TextUIState.ChaloTextUIState(str, UITextStyle.BodySmall, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184) : null;
        ImageUIState imageUIState = iconType != null ? new ImageUIState(iconType, (String) null, (ChaloColorToken) null, new ImageUISize(Dp.m7276boximpl(Dp.m7278constructorimpl(ChaloThemeHelper.a().i - ChaloThemeHelper.a().d)), Dp.m7276boximpl(ChaloThemeHelper.a().r)), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246) : null;
        TextUIState.ChaloTextUIState chaloTextUIState3 = new TextUIState.ChaloTextUIState(title, UITextStyle.DisplayMedium, ChaloColorToken.Black_87.f9768a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, vo1.B("PL_", title, "_title"), 4088);
        if (str2 != null) {
            chaloTextUIState = new TextUIState.ChaloTextUIState(str2, UITextStyle.BodyLarge, ChaloColorToken.Black_60.f9766a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, str2.length() == 0 ? null : vo1.B("PL_", title, "_body"), 4088);
        } else {
            chaloTextUIState = null;
        }
        return new ProductSelectionSectionItemUIState.ProductItemUIState(productItemUISpec, chaloTextUIState2, imageUIState, imageUrlUIState, chaloTextUIState3, chaloTextUIState, str3 != null ? new TextUIState.ChaloTextUIState(str3, UITextStyle.BodyMedium, ChaloColorToken.DiscountGreen.f9789a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184) : null, fr0Var != null ? UiEventHandler.Companion.a(fr0Var) : null, f);
    }

    public static final ProductSelectionListHeader b(Integer num, String text) {
        Intrinsics.i(text, "text");
        return new ProductSelectionListHeader(new TextUIState.ChaloTextUIState(text, UITextStyle.DisplayMedium, ChaloColorToken.Black_87.f9768a, 0, (UITextAlign) null, UIFontWeight.Bold, num, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7992), null);
    }
}

package app.chalo.productpurchase.passselection.ui;

import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002*\"\u0010\u0003\"\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¨\u0006\u0004"}, d2 = {"", "", "Lapp/chalo/productpurchase/productselection/data/models/app/SuperPassProductConfigSubCategoryResponseAppModel;", "SuperPassSubCategoryMap", "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PassSelectionContractKt {
    public static final PassPlanAnnouncementUIState a(String text, boolean z) {
        Intrinsics.i(text, "text");
        return new PassPlanAnnouncementUIState(z ? ChaloColorToken.DiscountGreen2.f9790a : ChaloColorToken.OrangeBackground.f9832a, new TextUIState.ChaloTextUIState(text, UITextStyle.BodyMedium, z ? ChaloColorToken.DiscountGreen.f9789a : ChaloColorToken.Black_90.f9769a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
    }
}

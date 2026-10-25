package app.chalo.premiumbus.ui.slotselection;

import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.components.TextWithFilledTrailingIconUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PassPurchaseNudgeCardUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PassPurchaseNudgeCardUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PassPurchaseNudgeCardUISpecs f7831a;
    public final TextUIState.ChaloTextUIState b;
    public final ImageUIState c;
    public final TextWithFilledTrailingIconUIState d;
    public final UiEventHandler e;

    public PassPurchaseNudgeCardUIState(TextUIState.ChaloTextUIState title, ImageUIState imageUIState, TextWithFilledTrailingIconUIState textWithFilledTrailingIconUIState, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
        PassPurchaseNudgeCardUISpecs passPurchaseNudgeCardUISpecs = new PassPurchaseNudgeCardUISpecs();
        Intrinsics.i(title, "title");
        this.f7831a = passPurchaseNudgeCardUISpecs;
        this.b = title;
        this.c = imageUIState;
        this.d = textWithFilledTrailingIconUIState;
        this.e = uiEventHandler$Companion$fromLambda$1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassPurchaseNudgeCardUIState)) {
            return false;
        }
        PassPurchaseNudgeCardUIState passPurchaseNudgeCardUIState = (PassPurchaseNudgeCardUIState) obj;
        return Intrinsics.d(this.f7831a, passPurchaseNudgeCardUIState.f7831a) && Intrinsics.d(this.b, passPurchaseNudgeCardUIState.b) && Intrinsics.d(this.c, passPurchaseNudgeCardUIState.c) && Intrinsics.d(this.d, passPurchaseNudgeCardUIState.d) && Intrinsics.d(this.e, passPurchaseNudgeCardUIState.e);
    }

    public final int hashCode() {
        int iF = r30.f(this.b, this.f7831a.hashCode() * 31, 961);
        ImageUIState imageUIState = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((iF + (imageUIState == null ? 0 : imageUIState.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "PassPurchaseNudgeCardUIState(specs=" + this.f7831a + ", title=" + this.b + ", subTitle=null, icon=" + this.c + ", buttonWithArrowUIState=" + this.d + ", uiEventHandler=" + this.e + ")";
    }
}

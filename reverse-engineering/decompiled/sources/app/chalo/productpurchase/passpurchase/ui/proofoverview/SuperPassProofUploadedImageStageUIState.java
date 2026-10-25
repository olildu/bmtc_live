package app.chalo.productpurchase.passpurchase.ui.proofoverview;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.components.CircularProgressIndicatorUIState;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
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
import defpackage.nf1;
import defpackage.pk0;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofUploadedImageStageUIState;", "", "Proof", "Loader", "AddImgPlaceholder", "Companion", "Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofUploadedImageStageUIState$AddImgPlaceholder;", "Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofUploadedImageStageUIState$Loader;", "Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofUploadedImageStageUIState$Proof;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SuperPassProofUploadedImageStageUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Companion f8495a = new Companion();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofUploadedImageStageUIState$AddImgPlaceholder;", "Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofUploadedImageStageUIState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AddImgPlaceholder extends SuperPassProofUploadedImageStageUIState {
        public final ImageUIState b;
        public final TextUIState.ChaloTextUIState c;
        public final UiEventHandler$Companion$fromLambda$1 d;

        public AddImgPlaceholder(UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1, ImageUIState imageUIState, TextUIState.ChaloTextUIState chaloTextUIState) {
            this.b = imageUIState;
            this.c = chaloTextUIState;
            this.d = uiEventHandler$Companion$fromLambda$1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AddImgPlaceholder)) {
                return false;
            }
            AddImgPlaceholder addImgPlaceholder = (AddImgPlaceholder) obj;
            return this.b.equals(addImgPlaceholder.b) && this.c.equals(addImgPlaceholder.c) && this.d.equals(addImgPlaceholder.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + r30.f(this.c, this.b.hashCode() * 31, 31);
        }

        public final String toString() {
            return nf1.n(pk0.n("AddImgPlaceholder(addImage=", this.b, ", addImageText=", this.c, ", eventHandler="), this.d, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofUploadedImageStageUIState$Companion;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static AddImgPlaceholder a(String text, Function0 function0) {
            Intrinsics.i(text, "text");
            return new AddImgPlaceholder(UiEventHandler.Companion.a(function0), new ImageUIState(IconType.IC_ADD, (String) null, (ChaloColorToken) null, new ImageUISize(Dp.m7278constructorimpl(ChaloThemeHelper.a().h - ChaloThemeHelper.a().c)), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), new TextUIState.ChaloTextUIState(text, UITextStyle.BodySmall, ChaloColorToken.Black_70.f9767a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofUploadedImageStageUIState$Loader;", "Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofUploadedImageStageUIState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Loader extends SuperPassProofUploadedImageStageUIState {
        public final CircularProgressIndicatorUIState b;

        public Loader(CircularProgressIndicatorUIState circularProgressIndicatorUIState) {
            this.b = circularProgressIndicatorUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loader) && Intrinsics.d(this.b, ((Loader) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Loader(loader=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofUploadedImageStageUIState$Proof;", "Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofUploadedImageStageUIState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Proof extends SuperPassProofUploadedImageStageUIState {
        public final SuperProofImageUIState b;

        public Proof(SuperProofImageUIState superProofImageUIState) {
            this.b = superProofImageUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Proof) && Intrinsics.d(this.b, ((Proof) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Proof(proofImage=" + this.b + ")";
        }
    }
}

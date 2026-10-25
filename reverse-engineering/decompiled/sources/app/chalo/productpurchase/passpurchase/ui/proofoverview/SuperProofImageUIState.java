package app.chalo.productpurchase.passpurchase.ui.proofoverview;

import app.chalo.compose.theme.UIShape;
import app.chalo.fileupload.picker.BitmapImage;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.image.UIContentScale;
import defpackage.gf;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperProofImageUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SuperProofImageUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8498a;
    public final BitmapImage b;
    public final UiEventHandler$Companion$fromLambda$1 c;
    public final UIContentScale d;
    public final UIShape e;

    public SuperProofImageUIState(String str, BitmapImage bitmapImage, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1, UIContentScale contentScale, UIShape shape) {
        Intrinsics.i(contentScale, "contentScale");
        Intrinsics.i(shape, "shape");
        this.f8498a = str;
        this.b = bitmapImage;
        this.c = uiEventHandler$Companion$fromLambda$1;
        this.d = contentScale;
        this.e = shape;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperProofImageUIState)) {
            return false;
        }
        SuperProofImageUIState superProofImageUIState = (SuperProofImageUIState) obj;
        return Intrinsics.d(this.f8498a, superProofImageUIState.f8498a) && Intrinsics.d(this.b, superProofImageUIState.b) && Intrinsics.d(this.c, superProofImageUIState.c) && this.d == superProofImageUIState.d && Intrinsics.d(this.e, superProofImageUIState.e);
    }

    public final int hashCode() {
        String str = this.f8498a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BitmapImage bitmapImage = this.b;
        return this.e.hashCode() + ((this.d.hashCode() + gf.a(this.c, (iHashCode + (bitmapImage != null ? bitmapImage.hashCode() : 0)) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperProofImageUIState(imageUrl=");
        sb.append(this.f8498a);
        sb.append(", bitmapImage=");
        sb.append(this.b);
        sb.append(", eventHandler=");
        sb.append(this.c);
        sb.append(", contentScale=");
        sb.append(this.d);
        sb.append(", shape=");
        return gf.j(sb, this.e, ")");
    }

    public SuperProofImageUIState(String str, BitmapImage bitmapImage, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1, UIContentScale uIContentScale, int i) {
        this(str, bitmapImage, uiEventHandler$Companion$fromLambda$1, (i & 8) != 0 ? UIContentScale.Crop : uIContentScale, UIShape.f1926a);
    }
}

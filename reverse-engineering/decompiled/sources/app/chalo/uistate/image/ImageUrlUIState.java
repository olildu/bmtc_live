package app.chalo.uistate.image;

import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import defpackage.dd;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/image/ImageUrlUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ImageUrlUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10037a;
    public final String b;
    public final ImageUISize c;
    public final UIContentScale d;
    public final float e;
    public final UiEventHandler f;

    public ImageUrlUIState(String imgUrl, ImageUISize imageUISize, UIContentScale contentScale, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1, int i) {
        String str = (i & 2) != 0 ? null : "Route availability banner";
        imageUISize = (i & 8) != 0 ? null : imageUISize;
        contentScale = (i & 16) != 0 ? UIContentScale.Fit : contentScale;
        uiEventHandler$Companion$fromLambda$1 = (i & 64) != 0 ? null : uiEventHandler$Companion$fromLambda$1;
        Intrinsics.i(imgUrl, "imgUrl");
        Intrinsics.i(contentScale, "contentScale");
        this.f10037a = imgUrl;
        this.b = str;
        this.c = imageUISize;
        this.d = contentScale;
        this.e = 1.0f;
        this.f = uiEventHandler$Companion$fromLambda$1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageUrlUIState)) {
            return false;
        }
        ImageUrlUIState imageUrlUIState = (ImageUrlUIState) obj;
        return Intrinsics.d(this.f10037a, imageUrlUIState.f10037a) && Intrinsics.d(this.b, imageUrlUIState.b) && Intrinsics.d(this.c, imageUrlUIState.c) && this.d == imageUrlUIState.d && Float.compare(this.e, imageUrlUIState.e) == 0 && Intrinsics.d(this.f, imageUrlUIState.f);
    }

    public final int hashCode() {
        int iHashCode = this.f10037a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 961;
        ImageUISize imageUISize = this.c;
        int iA = r30.a(this.e, (this.d.hashCode() + ((iHashCode2 + (imageUISize == null ? 0 : imageUISize.hashCode())) * 31)) * 31, 31);
        UiEventHandler uiEventHandler = this.f;
        return iA + (uiEventHandler != null ? uiEventHandler.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("ImageUrlUIState(imgUrl=", this.f10037a, ", contentDescription=", this.b, ", tint=null, size=");
        sbE.append(this.c);
        sbE.append(", contentScale=");
        sbE.append(this.d);
        sbE.append(", alpha=");
        sbE.append(this.e);
        sbE.append(", eventHandler=");
        sbE.append(this.f);
        sbE.append(")");
        return sbE.toString();
    }
}

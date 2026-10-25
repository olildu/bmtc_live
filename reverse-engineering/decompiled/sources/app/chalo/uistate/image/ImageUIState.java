package app.chalo.uistate.image;

import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/image/ImageUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ImageUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IconType f10035a;
    public final String b;
    public final ChaloColorToken c;
    public final ImageUISize d;
    public final UIContentScale e;
    public final float f;
    public final float g;
    public final UiEventHandler h;

    public ImageUIState(IconType img, String str, ChaloColorToken chaloColorToken, ImageUISize imageUISize, UIContentScale contentScale, float f, float f2, UiEventHandler uiEventHandler) {
        Intrinsics.i(img, "img");
        Intrinsics.i(contentScale, "contentScale");
        this.f10035a = img;
        this.b = str;
        this.c = chaloColorToken;
        this.d = imageUISize;
        this.e = contentScale;
        this.f = f;
        this.g = f2;
        this.h = uiEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageUIState)) {
            return false;
        }
        ImageUIState imageUIState = (ImageUIState) obj;
        return this.f10035a == imageUIState.f10035a && Intrinsics.d(this.b, imageUIState.b) && Intrinsics.d(this.c, imageUIState.c) && Intrinsics.d(this.d, imageUIState.d) && this.e == imageUIState.e && Float.compare(this.f, imageUIState.f) == 0 && Float.compare(this.g, imageUIState.g) == 0 && Intrinsics.d(this.h, imageUIState.h);
    }

    public final int hashCode() {
        int iHashCode = this.f10035a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ChaloColorToken chaloColorToken = this.c;
        int iHashCode3 = (iHashCode2 + (chaloColorToken == null ? 0 : chaloColorToken.hashCode())) * 31;
        ImageUISize imageUISize = this.d;
        int iA = r30.a(this.g, r30.a(this.f, (this.e.hashCode() + ((iHashCode3 + (imageUISize == null ? 0 : imageUISize.hashCode())) * 31)) * 31, 31), 31);
        UiEventHandler uiEventHandler = this.h;
        return iA + (uiEventHandler != null ? uiEventHandler.hashCode() : 0);
    }

    public final String toString() {
        return "ImageUIState(img=" + this.f10035a + ", contentDescription=" + this.b + ", tint=" + this.c + ", size=" + this.d + ", contentScale=" + this.e + ", alpha=" + this.f + ", rotation=" + this.g + ", eventHandler=" + this.h + ")";
    }

    public /* synthetic */ ImageUIState(IconType iconType, String str, ChaloColorToken chaloColorToken, ImageUISize imageUISize, UIContentScale uIContentScale, float f, UiEventHandler uiEventHandler, int i) {
        this(iconType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : chaloColorToken, (i & 8) != 0 ? null : imageUISize, (i & 16) != 0 ? UIContentScale.Fit : uIContentScale, (i & 32) != 0 ? 1.0f : 0.3f, (i & 64) != 0 ? 0.0f : f, (i & 128) != 0 ? null : uiEventHandler);
    }
}

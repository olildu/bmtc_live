package app.chalo.ridehailing.feedback;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.pk0;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridehailing/feedback/ImageWithBorderUISpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ImageWithBorderUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BorderUISpec f9134a;
    public final ChaloPadding b;
    public final ChaloColorToken c;

    public ImageWithBorderUISpecs(BorderUISpec borderUISpec, ChaloPadding chaloPadding, ChaloColorToken chaloColorToken) {
        this.f9134a = borderUISpec;
        this.b = chaloPadding;
        this.c = chaloColorToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageWithBorderUISpecs)) {
            return false;
        }
        ImageWithBorderUISpecs imageWithBorderUISpecs = (ImageWithBorderUISpecs) obj;
        return Intrinsics.d(this.f9134a, imageWithBorderUISpecs.f9134a) && Intrinsics.d(this.b, imageWithBorderUISpecs.b) && Intrinsics.d(this.c, imageWithBorderUISpecs.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + r30.c(this.b, this.f9134a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageWithBorderUISpecs(border=");
        sb.append(this.f9134a);
        sb.append(", padding=");
        sb.append(this.b);
        sb.append(", backgroundColor=");
        return pk0.j(sb, this.c, ")");
    }
}

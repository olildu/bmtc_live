package app.chalo.ridehailing.feedback;

import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.bottomsheet.DrawType;
import defpackage.nf1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridehailing/feedback/ImageWithBorderUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ImageWithBorderUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageWithBorderUISpecs f9135a;
    public final DrawType b;
    public final UiEventHandler$Companion$fromLambda$1 c;

    public ImageWithBorderUIState(ImageWithBorderUISpecs imageWithBorderUISpecs, DrawType drawType, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
        this.f9135a = imageWithBorderUISpecs;
        this.b = drawType;
        this.c = uiEventHandler$Companion$fromLambda$1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageWithBorderUIState)) {
            return false;
        }
        ImageWithBorderUIState imageWithBorderUIState = (ImageWithBorderUIState) obj;
        return this.f9135a.equals(imageWithBorderUIState.f9135a) && this.b.equals(imageWithBorderUIState.b) && this.c.equals(imageWithBorderUIState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f9135a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageWithBorderUIState(specs=");
        sb.append(this.f9135a);
        sb.append(", rating=");
        sb.append(this.b);
        sb.append(", eventHandler=");
        return nf1.n(sb, this.c, ")");
    }
}

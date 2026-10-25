package app.chalo.uistate.multimodal;

import app.chalo.compose.theme.ShapedContentUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.py;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/multimodal/FromAndToStopUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FromAndToStopUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FromAndToStopUISpecs f10040a;
    public final ShapedContentUIState b;
    public final ShapedContentUIState c;
    public final TextUIState.ChaloTextUIState d;
    public final TextUIState.ChaloTextUIState e;

    public FromAndToStopUIState(FromAndToStopUISpecs fromAndToStopUISpecs, ShapedContentUIState shapedContentUIState, ShapedContentUIState shapedContentUIState2, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2) {
        this.f10040a = fromAndToStopUISpecs;
        this.b = shapedContentUIState;
        this.c = shapedContentUIState2;
        this.d = chaloTextUIState;
        this.e = chaloTextUIState2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FromAndToStopUIState)) {
            return false;
        }
        FromAndToStopUIState fromAndToStopUIState = (FromAndToStopUIState) obj;
        return Intrinsics.d(this.f10040a, fromAndToStopUIState.f10040a) && Intrinsics.d(this.b, fromAndToStopUIState.b) && Intrinsics.d(this.c, fromAndToStopUIState.c) && Intrinsics.d(this.d, fromAndToStopUIState.d) && Intrinsics.d(this.e, fromAndToStopUIState.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + r30.f(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.f10040a.hashCode() * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FromAndToStopUIState(specs=");
        sb.append(this.f10040a);
        sb.append(", fromStopIndicator=");
        sb.append(this.b);
        sb.append(", toStopIndicator=");
        sb.append(this.c);
        sb.append(", fromStopTextUIState=");
        sb.append(this.d);
        sb.append(", toStopTextUIState=");
        return py.f(sb, this.e, ")");
    }

    public /* synthetic */ FromAndToStopUIState(ShapedContentUIState shapedContentUIState, ShapedContentUIState shapedContentUIState2, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2) {
        this(new FromAndToStopUISpecs(null, 63), shapedContentUIState, shapedContentUIState2, chaloTextUIState, chaloTextUIState2);
    }
}

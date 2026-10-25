package app.chalo.uistate.text;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import defpackage.t8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/text/TitleSubtitleUiSpecs;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TitleSubtitleUiSpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f10096a;
    public final float b;

    public TitleSubtitleUiSpecs(ChaloPadding chaloPadding, float f) {
        this.f10096a = chaloPadding;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TitleSubtitleUiSpecs)) {
            return false;
        }
        TitleSubtitleUiSpecs titleSubtitleUiSpecs = (TitleSubtitleUiSpecs) obj;
        return Intrinsics.d(this.f10096a, titleSubtitleUiSpecs.f10096a) && Dp.m7283equalsimpl0(this.b, titleSubtitleUiSpecs.b);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.b) + (this.f10096a.hashCode() * 31);
    }

    public final String toString() {
        return t8.h("TitleSubtitleUiSpecs(contentPadding=", this.f10096a, ", titleAndSubtitleSpacing=", Dp.m7289toStringimpl(this.b), ")");
    }

    public TitleSubtitleUiSpecs(float f, int i) {
        this(new ChaloPadding(0.0f, 0.0f, 3), (i & 2) != 0 ? ChaloThemeHelper.a().b : f);
    }
}

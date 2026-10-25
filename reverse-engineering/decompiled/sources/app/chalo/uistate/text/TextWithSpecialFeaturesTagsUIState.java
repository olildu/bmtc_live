package app.chalo.uistate.text;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import defpackage.b3;
import defpackage.uf0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/text/TextWithSpecialFeaturesTagsUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TextWithSpecialFeaturesTagsUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10094a;
    public final float b;
    public final int c;

    public TextWithSpecialFeaturesTagsUIState(List data, float f, int i) {
        Intrinsics.i(data, "data");
        this.f10094a = data;
        this.b = f;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextWithSpecialFeaturesTagsUIState)) {
            return false;
        }
        TextWithSpecialFeaturesTagsUIState textWithSpecialFeaturesTagsUIState = (TextWithSpecialFeaturesTagsUIState) obj;
        return Intrinsics.d(this.f10094a, textWithSpecialFeaturesTagsUIState.f10094a) && Dp.m7283equalsimpl0(this.b, textWithSpecialFeaturesTagsUIState.b) && this.c == textWithSpecialFeaturesTagsUIState.c;
    }

    public final int hashCode() {
        return uf0.a(this.b, this.f10094a.hashCode() * 31, 31) + this.c;
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.b);
        StringBuilder sb = new StringBuilder("TextWithSpecialFeaturesTagsUIState(data=");
        sb.append(this.f10094a);
        sb.append(", spaceBetweenSpecialFeature=");
        sb.append(strM7289toStringimpl);
        sb.append(", maxLines=");
        return b3.f(")", this.c, sb);
    }

    public TextWithSpecialFeaturesTagsUIState(List list) {
        this(list, ChaloThemeHelper.a().d, Integer.MAX_VALUE);
    }
}

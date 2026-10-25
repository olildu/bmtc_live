package app.chalo.uistate.cardwithtextleftandrighticon;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.pk0;
import defpackage.uf0;
import defpackage.vo1;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/cardwithtextleftandrighticon/CardWithTextLeftAndRightIconUiSpecs;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CardWithTextLeftAndRightIconUiSpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9925a;
    public final UIShape b;
    public final ChaloColorToken c;
    public final float d;
    public final float e;

    public CardWithTextLeftAndRightIconUiSpecs() {
        float f = ChaloThemeHelper.a().h;
        UIShape.Rectangle cardShape = UIShape.f;
        float f2 = ChaloThemeHelper.a().f;
        float f3 = ChaloThemeHelper.a().d;
        Intrinsics.i(cardShape, "cardShape");
        this.f9925a = f;
        this.b = cardShape;
        this.c = ChaloColorToken.White.f9870a;
        this.d = f2;
        this.e = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardWithTextLeftAndRightIconUiSpecs)) {
            return false;
        }
        CardWithTextLeftAndRightIconUiSpecs cardWithTextLeftAndRightIconUiSpecs = (CardWithTextLeftAndRightIconUiSpecs) obj;
        return Dp.m7283equalsimpl0(this.f9925a, cardWithTextLeftAndRightIconUiSpecs.f9925a) && Intrinsics.d(this.b, cardWithTextLeftAndRightIconUiSpecs.b) && Intrinsics.d(this.c, cardWithTextLeftAndRightIconUiSpecs.c) && Dp.m7283equalsimpl0(this.d, cardWithTextLeftAndRightIconUiSpecs.d) && Dp.m7283equalsimpl0(this.e, cardWithTextLeftAndRightIconUiSpecs.e);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.e) + uf0.a(this.d, z40.b(this.c, pk0.b(this.b, Dp.m7284hashCodeimpl(this.f9925a) * 31, 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.f9925a);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.d);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.e);
        StringBuilder sb = new StringBuilder("CardWithTextLeftAndRightIconUiSpecs(contentPadding=");
        sb.append(strM7289toStringimpl);
        sb.append(", cardShape=");
        sb.append(this.b);
        sb.append(", cardBackgroundColorToken=");
        sb.append(this.c);
        sb.append(", imageAndTextSpacing=");
        sb.append(strM7289toStringimpl2);
        sb.append(", cardElevation=");
        return vo1.p(sb, strM7289toStringimpl3, ")");
    }
}

package app.chalo.checkout.ui.screen.payment;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.gf;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/CardLabelUiSpec;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CardLabelUiSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f1507a;
    public final UIShape b;

    public CardLabelUiSpec(ChaloPadding chaloPadding, UIShape itemShape) {
        Intrinsics.i(itemShape, "itemShape");
        this.f1507a = chaloPadding;
        this.b = itemShape;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardLabelUiSpec)) {
            return false;
        }
        CardLabelUiSpec cardLabelUiSpec = (CardLabelUiSpec) obj;
        if (!this.f1507a.equals(cardLabelUiSpec.f1507a)) {
            return false;
        }
        ChaloColorToken.LightOrangeSpf lightOrangeSpf = ChaloColorToken.LightOrangeSpf.f9817a;
        return lightOrangeSpf.equals(lightOrangeSpf) && Intrinsics.d(this.b, cardLabelUiSpec.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (((this.f1507a.hashCode() * 31) + 335687566) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardLabelUiSpec(padding=");
        sb.append(this.f1507a);
        sb.append(", backGroundColorToken=");
        sb.append(ChaloColorToken.LightOrangeSpf.f9817a);
        sb.append(", itemShape=");
        return gf.j(sb, this.b, ")");
    }
}

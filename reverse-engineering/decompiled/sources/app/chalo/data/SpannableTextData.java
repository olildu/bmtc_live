package app.chalo.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/data/SpannableTextData;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SpannableTextData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2399a;
    public final IntRange b;

    public SpannableTextData(String text, IntRange intRange) {
        Intrinsics.i(text, "text");
        this.f2399a = text;
        this.b = intRange;
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
        if (!(obj instanceof SpannableTextData)) {
            return false;
        }
        SpannableTextData spannableTextData = (SpannableTextData) obj;
        if (!Intrinsics.d(this.f2399a, spannableTextData.f2399a)) {
            return false;
        }
        SpanType.TypeFace.Bold bold = SpanType.TypeFace.Bold.f2398a;
        return bold.equals(bold) && this.b.equals(spannableTextData.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (((this.f2399a.hashCode() * 31) - 1933958502) * 31);
    }

    public final String toString() {
        return "SpannableTextData(text=" + this.f2399a + ", spanType=" + SpanType.TypeFace.Bold.f2398a + ", range=" + this.b + ")";
    }
}

package defpackage;

import androidx.core.content.IntentSanitizer;
import androidx.core.util.Predicate;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ht0 implements Predicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15860a;
    public final /* synthetic */ Predicate b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ht0(Predicate predicate, Predicate predicate2, int i) {
        this.f15860a = i;
        this.b = predicate;
        this.c = predicate2;
    }

    @Override // androidx.core.util.Predicate
    public final /* synthetic */ Predicate and(Predicate predicate) {
        int i = this.f15860a;
        return it0.a(this, predicate);
    }

    @Override // androidx.core.util.Predicate
    public final /* synthetic */ Predicate negate() {
        switch (this.f15860a) {
            case 0:
                break;
            case 1:
                break;
        }
        return it0.b(this);
    }

    @Override // androidx.core.util.Predicate
    public final /* synthetic */ Predicate or(Predicate predicate) {
        int i = this.f15860a;
        return it0.c(this, predicate);
    }

    @Override // androidx.core.util.Predicate
    public final boolean test(Object obj) {
        switch (this.f15860a) {
            case 0:
                return it0.f(this.b, (Predicate) this.c, obj);
            case 1:
                return it0.d(this.b, (Predicate) this.c, obj);
            default:
                return IntentSanitizer.Builder.lambda$allowExtra$13((Class) this.c, this.b, obj);
        }
    }

    public /* synthetic */ ht0(Class cls, Predicate predicate) {
        this.f15860a = 2;
        this.c = cls;
        this.b = predicate;
    }
}

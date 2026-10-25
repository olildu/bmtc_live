package defpackage;

import android.content.ClipData;
import android.content.ComponentName;
import android.content.UriMatcher;
import android.net.Uri;
import androidx.core.content.UriMatcherCompat;
import androidx.core.util.Predicate;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zs implements Predicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20228a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zs(Object obj, int i) {
        this.f20228a = i;
        this.b = obj;
    }

    @Override // androidx.core.util.Predicate
    public final /* synthetic */ Predicate and(Predicate predicate) {
        int i = this.f20228a;
        return it0.a(this, predicate);
    }

    @Override // androidx.core.util.Predicate
    public final /* synthetic */ Predicate negate() {
        switch (this.f20228a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return it0.b(this);
    }

    @Override // androidx.core.util.Predicate
    public final /* synthetic */ Predicate or(Predicate predicate) {
        int i = this.f20228a;
        return it0.c(this, predicate);
    }

    @Override // androidx.core.util.Predicate
    public final boolean test(Object obj) {
        switch (this.f20228a) {
            case 0:
                return ((java.util.function.Predicate) this.b).test((ClipData.Item) obj);
            case 1:
                return ((ComponentName) this.b).equals((ComponentName) obj);
            case 2:
                return this.b.equals(obj);
            case 3:
                return it0.e((Predicate) this.b, obj);
            default:
                return UriMatcherCompat.lambda$asPredicate$0((UriMatcher) this.b, (Uri) obj);
        }
    }
}

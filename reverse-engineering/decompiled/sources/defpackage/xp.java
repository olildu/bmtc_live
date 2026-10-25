package defpackage;

import androidx.emoji2.text.flatbuffer.Utf8Old;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.ImmutableSet;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class xp implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20041a;

    public /* synthetic */ xp(int i) {
        this.f20041a = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f20041a) {
            case 0:
                return ImmutableSet.h();
            case 1:
                ImmutableRangeSet immutableRangeSet = ImmutableRangeSet.b;
                return new ImmutableRangeSet.Builder();
            case 2:
                return ImmutableList.i();
            default:
                return Utf8Old.lambda$static$0();
        }
    }
}

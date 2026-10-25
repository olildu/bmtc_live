package defpackage;

import io.ktor.utils.io.core.ByteReadPacketKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlinx.io.Source;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class mo implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18414a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mo(Object obj, int i) {
        this.f18414a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws Exception {
        switch (this.f18414a) {
            case 0:
                return CollectionsKt.R(this.b);
            case 1:
                return ByteReadPacketKt.a((byte[]) this.b);
            case 2:
                return ((Source) this.b).peek();
            case 3:
                ((Source) this.b).close();
                return Unit.f17538a;
            default:
                return this.b;
        }
    }
}

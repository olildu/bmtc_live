package defpackage;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import okio.RealBufferedSource;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class eq1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15580a;
    public final /* synthetic */ Ref.ObjectRef b;
    public final /* synthetic */ RealBufferedSource c;
    public final /* synthetic */ Ref.ObjectRef d;
    public final /* synthetic */ Ref.ObjectRef e;

    public /* synthetic */ eq1(Ref.ObjectRef objectRef, RealBufferedSource realBufferedSource, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3, int i) {
        this.f15580a = i;
        this.b = objectRef;
        this.c = realBufferedSource;
        this.d = objectRef2;
        this.e = objectRef3;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r12v12, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r12v14, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r12v16, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r12v24, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r12v26, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r12v31, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r12v33, types: [T, java.lang.Long] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int i = this.f15580a;
        int iIntValue = ((Integer) obj).intValue();
        Long l = (Long) obj2;
        switch (i) {
            case 0:
                long jLongValue = l.longValue();
                if (iIntValue == 21589) {
                    if (jLongValue < 1) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    RealBufferedSource realBufferedSource = this.c;
                    byte b = realBufferedSource.readByte();
                    boolean z = (b & 1) == 1;
                    boolean z2 = (b & 2) == 2;
                    boolean z3 = (b & 4) == 4;
                    long j = z ? 5L : 1L;
                    if (z2) {
                        j += 4;
                    }
                    if (z3) {
                        j += 4;
                    }
                    if (jLongValue < j) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    if (z) {
                        this.b.element = Integer.valueOf(realBufferedSource.c());
                    }
                    if (z2) {
                        this.d.element = Integer.valueOf(realBufferedSource.c());
                    }
                    if (z3) {
                        this.e.element = Integer.valueOf(realBufferedSource.c());
                    }
                }
                return Unit.f17538a;
            case 1:
                long jLongValue2 = l.longValue();
                if (iIntValue == 1) {
                    Ref.ObjectRef objectRef = this.b;
                    if (objectRef.element != 0) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
                    }
                    if (jLongValue2 != 24) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                    }
                    RealBufferedSource realBufferedSource2 = this.c;
                    objectRef.element = Long.valueOf(realBufferedSource2.d());
                    this.d.element = Long.valueOf(realBufferedSource2.d());
                    this.e.element = Long.valueOf(realBufferedSource2.d());
                }
                return Unit.f17538a;
            default:
                long jLongValue3 = l.longValue();
                if (iIntValue == 1) {
                    Ref.ObjectRef objectRef2 = this.b;
                    if (objectRef2.element != 0) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
                    }
                    if (jLongValue3 != 24) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                    }
                    RealBufferedSource realBufferedSource3 = this.c;
                    objectRef2.element = Long.valueOf(realBufferedSource3.d());
                    this.d.element = Long.valueOf(realBufferedSource3.d());
                    this.e.element = Long.valueOf(realBufferedSource3.d());
                }
                return Unit.f17538a;
        }
    }

    public /* synthetic */ eq1(RealBufferedSource realBufferedSource, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3) {
        this.f15580a = 0;
        this.c = realBufferedSource;
        this.b = objectRef;
        this.d = objectRef2;
        this.e = objectRef3;
    }
}

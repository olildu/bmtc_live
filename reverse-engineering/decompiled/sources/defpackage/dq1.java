package defpackage;

import io.github.alexzhirkevich.compottie.ZipFilesKt;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import okio.RealBufferedSource;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class dq1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15486a;
    public final /* synthetic */ Ref.BooleanRef b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Ref.LongRef d;
    public final /* synthetic */ RealBufferedSource e;
    public final /* synthetic */ Ref.LongRef f;
    public final /* synthetic */ Ref.LongRef g;
    public final /* synthetic */ Ref.ObjectRef h;
    public final /* synthetic */ Ref.ObjectRef i;
    public final /* synthetic */ Ref.ObjectRef j;

    public /* synthetic */ dq1(Ref.BooleanRef booleanRef, long j, Ref.LongRef longRef, RealBufferedSource realBufferedSource, Ref.LongRef longRef2, Ref.LongRef longRef3, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3, int i) {
        this.f15486a = i;
        this.b = booleanRef;
        this.c = j;
        this.d = longRef;
        this.e = realBufferedSource;
        this.f = longRef2;
        this.g = longRef3;
        this.h = objectRef;
        this.i = objectRef2;
        this.j = objectRef3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int i = this.f15486a;
        int iIntValue = ((Integer) obj).intValue();
        Long l = (Long) obj2;
        switch (i) {
            case 0:
                long jLongValue = l.longValue();
                RealBufferedSource realBufferedSource = this.e;
                if (iIntValue == 1) {
                    Ref.BooleanRef booleanRef = this.b;
                    if (booleanRef.element) {
                        throw new IOException("bad zip: zip64 extra repeated");
                    }
                    booleanRef.element = true;
                    if (jLongValue < this.c) {
                        throw new IOException("bad zip: zip64 extra too short");
                    }
                    Ref.LongRef longRef = this.d;
                    long jD = longRef.element;
                    if (jD == BodyPartID.bodyIdMax) {
                        jD = realBufferedSource.d();
                    }
                    longRef.element = jD;
                    Ref.LongRef longRef2 = this.f;
                    longRef2.element = longRef2.element == BodyPartID.bodyIdMax ? realBufferedSource.d() : 0L;
                    Ref.LongRef longRef3 = this.g;
                    longRef3.element = longRef3.element == BodyPartID.bodyIdMax ? realBufferedSource.d() : 0L;
                } else if (iIntValue == 10) {
                    if (jLongValue < 4) {
                        throw new IOException("bad zip: NTFS extra too short");
                    }
                    realBufferedSource.skip(4L);
                    ZipFilesKt.d(realBufferedSource, (int) (jLongValue - 4), new eq1(this.h, realBufferedSource, this.i, this.j, 1));
                }
                return Unit.f17538a;
            default:
                long jLongValue2 = l.longValue();
                RealBufferedSource realBufferedSource2 = this.e;
                if (iIntValue == 1) {
                    Ref.BooleanRef booleanRef2 = this.b;
                    if (booleanRef2.element) {
                        throw new IOException("bad zip: zip64 extra repeated");
                    }
                    booleanRef2.element = true;
                    if (jLongValue2 < this.c) {
                        throw new IOException("bad zip: zip64 extra too short");
                    }
                    Ref.LongRef longRef4 = this.d;
                    long jD2 = longRef4.element;
                    if (jD2 == BodyPartID.bodyIdMax) {
                        jD2 = realBufferedSource2.d();
                    }
                    longRef4.element = jD2;
                    Ref.LongRef longRef5 = this.f;
                    longRef5.element = longRef5.element == BodyPartID.bodyIdMax ? realBufferedSource2.d() : 0L;
                    Ref.LongRef longRef6 = this.g;
                    longRef6.element = longRef6.element == BodyPartID.bodyIdMax ? realBufferedSource2.d() : 0L;
                } else if (iIntValue == 10) {
                    if (jLongValue2 < 4) {
                        throw new IOException("bad zip: NTFS extra too short");
                    }
                    realBufferedSource2.skip(4L);
                    okio.internal.ZipFilesKt.e(realBufferedSource2, (int) (jLongValue2 - 4), new eq1(this.h, realBufferedSource2, this.i, this.j, 2));
                }
                return Unit.f17538a;
        }
    }
}

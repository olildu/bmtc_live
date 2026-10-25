package defpackage;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import app.chalo.utils.PlatformFeature;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class f0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15600a;
    public final /* synthetic */ MutableState b;
    public final /* synthetic */ Density c;

    public /* synthetic */ f0(MutableState mutableState, Density density, int i) {
        this.f15600a = i;
        this.b = mutableState;
        this.c = density;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long jMo5941getSizeYbymL2g;
        long jMo5941getSizeYbymL2g2;
        long j;
        LayoutCoordinates coordinates = (LayoutCoordinates) obj;
        switch (this.f15600a) {
            case 0:
                Intrinsics.i(coordinates, "coordinates");
                jMo5941getSizeYbymL2g = coordinates.mo5941getSizeYbymL2g();
                j = jMo5941getSizeYbymL2g & BodyPartID.bodyIdMax;
                gf.q(this.b, this.c, (int) j);
                break;
            case 1:
                Intrinsics.i(coordinates, "it");
                jMo5941getSizeYbymL2g = coordinates.mo5941getSizeYbymL2g();
                j = jMo5941getSizeYbymL2g & BodyPartID.bodyIdMax;
                gf.q(this.b, this.c, (int) j);
                break;
            case 2:
                Intrinsics.i(coordinates, "it");
                this.b.setValue(Boolean.valueOf(Dp.m7277compareTo0680j_4(this.c.mo401toDpu2uoSUM((int) (coordinates.mo5941getSizeYbymL2g() & BodyPartID.bodyIdMax)), PlatformFeature.f10436a) > 0));
                break;
            case 3:
                Intrinsics.i(coordinates, "it");
                jMo5941getSizeYbymL2g = coordinates.mo5941getSizeYbymL2g();
                j = jMo5941getSizeYbymL2g & BodyPartID.bodyIdMax;
                gf.q(this.b, this.c, (int) j);
                break;
            case 4:
                Intrinsics.i(coordinates, "it");
                this.b.setValue(Boolean.valueOf(Dp.m7277compareTo0680j_4(this.c.mo401toDpu2uoSUM((int) (coordinates.mo5941getSizeYbymL2g() & BodyPartID.bodyIdMax)), PlatformFeature.f10436a) > 0));
                break;
            case 5:
                Intrinsics.i(coordinates, "it");
                jMo5941getSizeYbymL2g = coordinates.mo5941getSizeYbymL2g();
                j = jMo5941getSizeYbymL2g & BodyPartID.bodyIdMax;
                gf.q(this.b, this.c, (int) j);
                break;
            case 6:
                Intrinsics.i(coordinates, "it");
                this.b.setValue(Boolean.valueOf(Dp.m7277compareTo0680j_4(this.c.mo401toDpu2uoSUM((int) (coordinates.mo5941getSizeYbymL2g() & BodyPartID.bodyIdMax)), PlatformFeature.f10436a) > 0));
                break;
            case 7:
                Intrinsics.i(coordinates, "it");
                this.b.setValue(Boolean.valueOf(Dp.m7277compareTo0680j_4(this.c.mo401toDpu2uoSUM((int) (coordinates.mo5941getSizeYbymL2g() & BodyPartID.bodyIdMax)), PlatformFeature.f10436a) > 0));
                break;
            case 8:
                Intrinsics.i(coordinates, "it");
                jMo5941getSizeYbymL2g = coordinates.mo5941getSizeYbymL2g();
                j = jMo5941getSizeYbymL2g & BodyPartID.bodyIdMax;
                gf.q(this.b, this.c, (int) j);
                break;
            case 9:
                Intrinsics.i(coordinates, "it");
                jMo5941getSizeYbymL2g = coordinates.mo5941getSizeYbymL2g();
                j = jMo5941getSizeYbymL2g & BodyPartID.bodyIdMax;
                gf.q(this.b, this.c, (int) j);
                break;
            case 10:
                Intrinsics.i(coordinates, "it");
                jMo5941getSizeYbymL2g2 = coordinates.mo5941getSizeYbymL2g();
                j = jMo5941getSizeYbymL2g2 >> 32;
                gf.q(this.b, this.c, (int) j);
                break;
            case 11:
                Intrinsics.i(coordinates, "it");
                jMo5941getSizeYbymL2g = coordinates.mo5941getSizeYbymL2g();
                j = jMo5941getSizeYbymL2g & BodyPartID.bodyIdMax;
                gf.q(this.b, this.c, (int) j);
                break;
            case 12:
                Intrinsics.i(coordinates, "it");
                jMo5941getSizeYbymL2g2 = coordinates.mo5941getSizeYbymL2g();
                j = jMo5941getSizeYbymL2g2 >> 32;
                gf.q(this.b, this.c, (int) j);
                break;
            case 13:
                Intrinsics.i(coordinates, "it");
                jMo5941getSizeYbymL2g = coordinates.mo5941getSizeYbymL2g();
                j = jMo5941getSizeYbymL2g & BodyPartID.bodyIdMax;
                gf.q(this.b, this.c, (int) j);
                break;
            case 14:
                Intrinsics.i(coordinates, "it");
                jMo5941getSizeYbymL2g = coordinates.mo5941getSizeYbymL2g();
                j = jMo5941getSizeYbymL2g & BodyPartID.bodyIdMax;
                gf.q(this.b, this.c, (int) j);
                break;
            case 15:
                Intrinsics.i(coordinates, "it");
                jMo5941getSizeYbymL2g = coordinates.mo5941getSizeYbymL2g();
                j = jMo5941getSizeYbymL2g & BodyPartID.bodyIdMax;
                gf.q(this.b, this.c, (int) j);
                break;
            case 16:
                Intrinsics.i(coordinates, "it");
                jMo5941getSizeYbymL2g = coordinates.mo5941getSizeYbymL2g();
                j = jMo5941getSizeYbymL2g & BodyPartID.bodyIdMax;
                gf.q(this.b, this.c, (int) j);
                break;
            case 17:
                Intrinsics.i(coordinates, "it");
                jMo5941getSizeYbymL2g2 = coordinates.mo5941getSizeYbymL2g();
                j = jMo5941getSizeYbymL2g2 >> 32;
                gf.q(this.b, this.c, (int) j);
                break;
            case 18:
                Intrinsics.i(coordinates, "it");
                jMo5941getSizeYbymL2g = coordinates.mo5941getSizeYbymL2g();
                j = jMo5941getSizeYbymL2g & BodyPartID.bodyIdMax;
                gf.q(this.b, this.c, (int) j);
                break;
            case 19:
                Intrinsics.i(coordinates, "it");
                jMo5941getSizeYbymL2g = coordinates.mo5941getSizeYbymL2g();
                j = jMo5941getSizeYbymL2g & BodyPartID.bodyIdMax;
                gf.q(this.b, this.c, (int) j);
                break;
            case 20:
                Intrinsics.i(coordinates, "it");
                jMo5941getSizeYbymL2g = coordinates.mo5941getSizeYbymL2g();
                j = jMo5941getSizeYbymL2g & BodyPartID.bodyIdMax;
                gf.q(this.b, this.c, (int) j);
                break;
            case 21:
                Intrinsics.i(coordinates, "it");
                jMo5941getSizeYbymL2g = coordinates.mo5941getSizeYbymL2g();
                j = jMo5941getSizeYbymL2g & BodyPartID.bodyIdMax;
                gf.q(this.b, this.c, (int) j);
                break;
            case 22:
                Intrinsics.i(coordinates, "it");
                jMo5941getSizeYbymL2g = coordinates.mo5941getSizeYbymL2g();
                j = jMo5941getSizeYbymL2g & BodyPartID.bodyIdMax;
                gf.q(this.b, this.c, (int) j);
                break;
            case 23:
                Intrinsics.i(coordinates, "it");
                if (Dp.m7277compareTo0680j_4(this.c.mo401toDpu2uoSUM((int) (coordinates.mo5941getSizeYbymL2g() & BodyPartID.bodyIdMax)), Dp.m7278constructorimpl(0)) > 0) {
                    this.b.setValue(Boolean.TRUE);
                }
                break;
            case 24:
                Intrinsics.i(coordinates, "it");
                if (Dp.m7277compareTo0680j_4(this.c.mo401toDpu2uoSUM((int) (coordinates.mo5941getSizeYbymL2g() & BodyPartID.bodyIdMax)), Dp.m7278constructorimpl(0)) > 0) {
                    this.b.setValue(Boolean.TRUE);
                }
                break;
            case 25:
                Intrinsics.i(coordinates, "it");
                jMo5941getSizeYbymL2g = coordinates.mo5941getSizeYbymL2g();
                j = jMo5941getSizeYbymL2g & BodyPartID.bodyIdMax;
                gf.q(this.b, this.c, (int) j);
                break;
            case 26:
                Intrinsics.i(coordinates, "it");
                jMo5941getSizeYbymL2g = coordinates.mo5941getSizeYbymL2g();
                j = jMo5941getSizeYbymL2g & BodyPartID.bodyIdMax;
                gf.q(this.b, this.c, (int) j);
                break;
            case 27:
                Intrinsics.i(coordinates, "it");
                jMo5941getSizeYbymL2g = coordinates.mo5941getSizeYbymL2g();
                j = jMo5941getSizeYbymL2g & BodyPartID.bodyIdMax;
                gf.q(this.b, this.c, (int) j);
                break;
            case 28:
                Intrinsics.i(coordinates, "it");
                jMo5941getSizeYbymL2g = coordinates.mo5941getSizeYbymL2g();
                j = jMo5941getSizeYbymL2g & BodyPartID.bodyIdMax;
                gf.q(this.b, this.c, (int) j);
                break;
            default:
                Intrinsics.i(coordinates, "it");
                if (Dp.m7277compareTo0680j_4(this.c.mo401toDpu2uoSUM((int) (coordinates.mo5941getSizeYbymL2g() & BodyPartID.bodyIdMax)), Dp.m7278constructorimpl(0)) > 0) {
                    this.b.setValue(Boolean.TRUE);
                }
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ f0(Density density, MutableState mutableState, int i) {
        this.f15600a = i;
        this.c = density;
        this.b = mutableState;
    }
}

package defpackage;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class mh implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18398a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Density c;

    public /* synthetic */ mh(Density density, Function1 function1, int i) {
        this.f18398a = i;
        this.c = density;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutCoordinates coordinates = (LayoutCoordinates) obj;
        switch (this.f18398a) {
            case 0:
                Intrinsics.i(coordinates, "coordinates");
                this.b.invoke(Dp.m7276boximpl(this.c.mo400toDpu2uoSUM((((int) (BodyPartID.bodyIdMax & coordinates.mo5941getSizeYbymL2g())) / 2.0f) + Float.intBitsToFloat((int) (LayoutCoordinatesKt.positionInParent(coordinates) & BodyPartID.bodyIdMax)))));
                break;
            case 1:
                Intrinsics.i(coordinates, "it");
                int iMo5941getSizeYbymL2g = (int) (coordinates.mo5941getSizeYbymL2g() & BodyPartID.bodyIdMax);
                Density toDp = this.c;
                Intrinsics.i(toDp, "$this$toDp");
                this.b.invoke(Dp.m7276boximpl(toDp.mo401toDpu2uoSUM(iMo5941getSizeYbymL2g)));
                break;
            case 2:
                Intrinsics.i(coordinates, "it");
                this.b.invoke(Dp.m7276boximpl(this.c.mo401toDpu2uoSUM((int) (coordinates.mo5941getSizeYbymL2g() & BodyPartID.bodyIdMax))));
                break;
            case 3:
                Intrinsics.i(coordinates, "it");
                this.b.invoke(Dp.m7276boximpl(this.c.mo401toDpu2uoSUM((int) (coordinates.mo5941getSizeYbymL2g() & BodyPartID.bodyIdMax))));
                break;
            default:
                Intrinsics.i(coordinates, "coordinates");
                this.b.invoke(Dp.m7276boximpl(this.c.mo401toDpu2uoSUM((int) (coordinates.mo5941getSizeYbymL2g() & BodyPartID.bodyIdMax))));
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ mh(Function1 function1, Density density, int i) {
        this.f18398a = i;
        this.b = function1;
        this.c = density;
    }
}

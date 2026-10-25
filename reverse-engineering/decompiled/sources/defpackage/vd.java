package defpackage;

import androidx.compose.material3.NavigationBarKt;
import androidx.compose.material3.NavigationItemKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.IntSize;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vd implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19825a;
    public final /* synthetic */ MutableIntState b;

    public /* synthetic */ vd(MutableIntState mutableIntState, int i) {
        this.f19825a = i;
        this.b = mutableIntState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19825a) {
            case 0:
                this.b.setIntValue(((Integer) obj).intValue());
                return Unit.f17538a;
            case 1:
                LayoutCoordinates it = (LayoutCoordinates) obj;
                Intrinsics.i(it, "it");
                int iMo5941getSizeYbymL2g = (int) (it.mo5941getSizeYbymL2g() & BodyPartID.bodyIdMax);
                MutableIntState mutableIntState = this.b;
                if (iMo5941getSizeYbymL2g > mutableIntState.getIntValue()) {
                    mutableIntState.setIntValue((int) (BodyPartID.bodyIdMax & it.mo5941getSizeYbymL2g()));
                }
                return Unit.f17538a;
            case 2:
                return NavigationBarKt.NavigationBarItem$lambda$8$lambda$7(this.b, (IntSize) obj);
            case 3:
                return NavigationItemKt.NavigationItem_8Df7sds$lambda$4$lambda$3(this.b, (IntSize) obj);
            case 4:
                return NavigationItemKt.AnimatedNavigationItem_DQd_Gtc$lambda$15$lambda$14(this.b, (IntSize) obj);
            case 5:
                this.b.setIntValue((int) (((IntSize) obj).m7449unboximpl() & BodyPartID.bodyIdMax));
                return Unit.f17538a;
            case 6:
                this.b.setIntValue((int) (((IntSize) obj).m7449unboximpl() & BodyPartID.bodyIdMax));
                return Unit.f17538a;
            case 7:
                this.b.setIntValue(((Integer) obj).intValue());
                return Unit.f17538a;
            case 8:
                ((Integer) obj).intValue();
                this.b.setIntValue(0);
                return Unit.f17538a;
            case 9:
                int iIntValue = ((Integer) obj).intValue();
                if (iIntValue < 0) {
                    iIntValue = 0;
                }
                this.b.setIntValue(iIntValue);
                return Unit.f17538a;
            default:
                ((Integer) obj).intValue();
                this.b.setIntValue(0);
                return Unit.f17538a;
        }
    }
}

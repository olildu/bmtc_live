package defpackage;

import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.ExposedDropdownMenuKt;
import androidx.compose.material3.WindowBoundsCalculator;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import app.chalo.home.ui.home.HomePageDisplayItemData;
import app.chalo.home.ui.regularbus.RegularBusPageDisplayItemData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vv implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19870a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ vv(FiniteAnimationSpec finiteAnimationSpec, FiniteAnimationSpec finiteAnimationSpec2, FiniteAnimationSpec finiteAnimationSpec3, int i, FiniteAnimationSpec finiteAnimationSpec4) {
        this.f19870a = 0;
        this.c = finiteAnimationSpec;
        this.d = finiteAnimationSpec2;
        this.e = finiteAnimationSpec3;
        this.b = i;
        this.f = finiteAnimationSpec4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19870a) {
            case 0:
                return DatePickerKt.SwitchableDateEntryContent_KaiTk9E$lambda$21$lambda$20((FiniteAnimationSpec) this.c, (FiniteAnimationSpec) this.d, (FiniteAnimationSpec) this.e, this.b, (FiniteAnimationSpec) this.f, (AnimatedContentTransitionScope) obj);
            case 1:
                return ExposedDropdownMenuKt.ExposedDropdownMenuBox$lambda$15$lambda$14((WindowBoundsCalculator) this.c, this.b, (MutableState) this.d, (MutableIntState) this.e, (MutableIntState) this.f, (LayoutCoordinates) obj);
            case 2:
                Density density = (Density) this.c;
                SnapshotStateMap snapshotStateMap = (SnapshotStateMap) this.d;
                HomePageDisplayItemData homePageDisplayItemData = (HomePageDisplayItemData) this.e;
                SnapshotStateMap snapshotStateMap2 = (SnapshotStateMap) this.f;
                LayoutCoordinates it = (LayoutCoordinates) obj;
                Intrinsics.i(it, "it");
                if (Dp.m7277compareTo0680j_4(density.mo401toDpu2uoSUM((int) (it.mo5941getSizeYbymL2g() & BodyPartID.bodyIdMax)), Dp.m7278constructorimpl(0)) > 0) {
                    snapshotStateMap.put(homePageDisplayItemData.b, Boolean.TRUE);
                    snapshotStateMap2.put(homePageDisplayItemData.b, Boolean.valueOf(this.b != 0));
                } else {
                    String str = homePageDisplayItemData.b;
                    Boolean bool = Boolean.FALSE;
                    snapshotStateMap.put(str, bool);
                    snapshotStateMap2.put(homePageDisplayItemData.b, bool);
                }
                return Unit.f17538a;
            default:
                Density density2 = (Density) this.c;
                SnapshotStateMap snapshotStateMap3 = (SnapshotStateMap) this.d;
                RegularBusPageDisplayItemData regularBusPageDisplayItemData = (RegularBusPageDisplayItemData) this.e;
                SnapshotStateMap snapshotStateMap4 = (SnapshotStateMap) this.f;
                LayoutCoordinates it2 = (LayoutCoordinates) obj;
                Intrinsics.i(it2, "it");
                if (Dp.m7277compareTo0680j_4(density2.mo401toDpu2uoSUM((int) (it2.mo5941getSizeYbymL2g() & BodyPartID.bodyIdMax)), Dp.m7278constructorimpl(0)) > 0) {
                    snapshotStateMap3.put(regularBusPageDisplayItemData.b, Boolean.TRUE);
                    snapshotStateMap4.put(regularBusPageDisplayItemData.b, Boolean.valueOf(this.b != 0));
                } else {
                    String str2 = regularBusPageDisplayItemData.b;
                    Boolean bool2 = Boolean.FALSE;
                    snapshotStateMap3.put(str2, bool2);
                    snapshotStateMap4.put(regularBusPageDisplayItemData.b, bool2);
                }
                return Unit.f17538a;
        }
    }

    public /* synthetic */ vv(WindowBoundsCalculator windowBoundsCalculator, int i, MutableState mutableState, MutableIntState mutableIntState, MutableIntState mutableIntState2) {
        this.f19870a = 1;
        this.c = windowBoundsCalculator;
        this.b = i;
        this.d = mutableState;
        this.e = mutableIntState;
        this.f = mutableIntState2;
    }

    public /* synthetic */ vv(Density density, SnapshotStateMap snapshotStateMap, Object obj, SnapshotStateMap snapshotStateMap2, int i, int i2) {
        this.f19870a = i2;
        this.c = density;
        this.d = snapshotStateMap;
        this.e = obj;
        this.f = snapshotStateMap2;
        this.b = i;
    }
}

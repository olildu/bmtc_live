package defpackage;

import androidx.compose.material3.BottomSheetDefaults;
import androidx.compose.material3.TabRowDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dc implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15446a = 0;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Shape f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ dc(BottomSheetDefaults bottomSheetDefaults, Modifier modifier, float f, float f2, Shape shape, long j, int i, int i2) {
        this.i = bottomSheetDefaults;
        this.b = modifier;
        this.c = f;
        this.d = f2;
        this.f = shape;
        this.e = j;
        this.g = i;
        this.h = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15446a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return BottomSheetDefaults.DragHandle_lgZ2HuY$lambda$2((BottomSheetDefaults) this.i, this.b, this.c, this.d, this.f, this.e, this.g, this.h, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return TabRowDefaults.PrimaryIndicator_10LGxhE$lambda$1((TabRowDefaults) this.i, this.b, this.c, this.d, this.e, this.f, this.g, this.h, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ dc(TabRowDefaults tabRowDefaults, Modifier modifier, float f, float f2, long j, Shape shape, int i, int i2) {
        this.i = tabRowDefaults;
        this.b = modifier;
        this.c = f;
        this.d = f2;
        this.e = j;
        this.f = shape;
        this.g = i;
        this.h = i2;
    }
}

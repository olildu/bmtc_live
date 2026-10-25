package defpackage;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.ModalBottomSheetProperties;
import androidx.compose.material3.ModalBottomSheet_androidKt;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jj0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17412a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ SheetState d;
    public final /* synthetic */ float e;
    public final /* synthetic */ Shape f;
    public final /* synthetic */ long g;
    public final /* synthetic */ long h;
    public final /* synthetic */ float i;
    public final /* synthetic */ long j;
    public final /* synthetic */ Function2 k;
    public final /* synthetic */ ModalBottomSheetProperties l;
    public final /* synthetic */ Function3 m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;
    public final /* synthetic */ Object q;

    public /* synthetic */ jj0(Function0 function0, Modifier modifier, SheetState sheetState, float f, Shape shape, long j, long j2, float f2, long j3, Function2 function2, Object obj, ModalBottomSheetProperties modalBottomSheetProperties, Function3 function3, int i, int i2, int i3, int i4) {
        this.f17412a = i4;
        this.b = function0;
        this.c = modifier;
        this.d = sheetState;
        this.e = f;
        this.f = shape;
        this.g = j;
        this.h = j2;
        this.i = f2;
        this.j = j3;
        this.k = function2;
        this.q = obj;
        this.l = modalBottomSheetProperties;
        this.m = function3;
        this.n = i;
        this.o = i2;
        this.p = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17412a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return ModalBottomSheetKt.ModalBottomSheet_dYc4hso$lambda$14(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, (Function2) this.q, this.l, this.m, this.n, this.o, this.p, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return ModalBottomSheet_androidKt.ModalBottomSheet_dYc4hso$lambda$0(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, (WindowInsets) this.q, this.l, this.m, this.n, this.o, this.p, (Composer) obj, iIntValue2);
        }
    }
}

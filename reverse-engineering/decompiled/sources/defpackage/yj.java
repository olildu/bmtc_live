package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.TextStyle;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import com.google.android.gms.maps.model.Cap;
import com.google.maps.android.compose.PolylineKt;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class yj implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20114a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ float d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Serializable g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Function k;

    public /* synthetic */ yj(String str, boolean z, Modifier modifier, TextStyle textStyle, Shape shape, float f, long j, Function0 function0, int i, int i2) {
        this.g = str;
        this.c = z;
        this.h = modifier;
        this.i = textStyle;
        this.j = shape;
        this.d = f;
        this.b = j;
        this.k = function0;
        this.e = i;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20114a) {
            case 0:
                ((Integer) obj2).getClass();
                ChaloFilledButtonKt.f((String) this.g, this.c, (Modifier) this.h, (TextStyle) this.i, (Shape) this.j, this.d, this.b, (Function0) this.k, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.e | 1), this.f);
                break;
            default:
                ((Integer) obj2).getClass();
                PolylineKt.b((ArrayList) this.g, (List) this.h, this.b, (Cap) this.i, (Cap) this.j, this.c, this.d, (Function1) this.k, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.e | 1), RecomposeScopeImplKt.updateChangedFlags(this.f));
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ yj(ArrayList arrayList, List list, long j, Cap cap, Cap cap2, boolean z, float f, Function1 function1, int i, int i2) {
        this.g = arrayList;
        this.h = list;
        this.b = j;
        this.i = cap;
        this.j = cap2;
        this.c = z;
        this.d = f;
        this.k = function1;
        this.e = i;
        this.f = i2;
    }
}

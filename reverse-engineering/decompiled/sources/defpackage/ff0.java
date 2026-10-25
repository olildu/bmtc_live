package defpackage;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.ListItemColors;
import androidx.compose.material3.ListItemKt;
import androidx.compose.material3.SearchBarColors;
import androidx.compose.material3.SearchBarKt;
import androidx.compose.material3.SearchBarScrollBehavior;
import androidx.compose.material3.SearchBarState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ff0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15636a = 1;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ ff0(SearchBarState searchBarState, Function2 function2, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f, float f2, WindowInsets windowInsets, SearchBarScrollBehavior searchBarScrollBehavior, int i, int i2) {
        this.h = searchBarState;
        this.b = function2;
        this.c = modifier;
        this.i = shape;
        this.j = searchBarColors;
        this.d = f;
        this.e = f2;
        this.k = windowInsets;
        this.l = searchBarScrollBehavior;
        this.f = i;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15636a) {
            case 0:
                return ListItemKt.ListItem_HXNGIdc$lambda$6(this.b, this.c, (Function2) this.h, (Function2) this.i, (Function2) this.j, (Function2) this.k, (ListItemColors) this.l, this.d, this.e, this.f, this.g, (Composer) obj, ((Integer) obj2).intValue());
            default:
                return SearchBarKt.TopSearchBar_qKj4JfE$lambda$5((SearchBarState) this.h, this.b, this.c, (Shape) this.i, (SearchBarColors) this.j, this.d, this.e, (WindowInsets) this.k, (SearchBarScrollBehavior) this.l, this.f, this.g, (Composer) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ ff0(Function2 function2, Modifier modifier, Function2 function3, Function2 function4, Function2 function5, Function2 function6, ListItemColors listItemColors, float f, float f2, int i, int i2) {
        this.b = function2;
        this.c = modifier;
        this.h = function3;
        this.i = function4;
        this.j = function5;
        this.k = function6;
        this.l = listItemColors;
        this.d = f;
        this.e = f2;
        this.f = i;
        this.g = i2;
    }
}

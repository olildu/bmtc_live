package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import app.chalo.compose.components.bottomsheet.UserRatingBottomSheetKt;
import app.chalo.providers.iconassetprovider.IconType;
import coil3.compose.SubcomposeAsyncImageKt;
import coil3.compose.internal.AsyncImageState;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rn1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19227a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Function1 h;
    public final /* synthetic */ Function3 i;
    public final /* synthetic */ Modifier j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;

    public /* synthetic */ rn1(int i, IconType iconType, String str, String str2, List list, String str3, Function1 function1, Function3 function3, Modifier modifier, int i2, int i3, int i4) {
        this.f19227a = i4;
        this.b = i;
        this.c = iconType;
        this.d = str;
        this.e = str2;
        this.f = list;
        this.g = str3;
        this.h = function1;
        this.i = function3;
        this.j = modifier;
        this.k = i2;
        this.l = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19227a) {
            case 0:
                ((Integer) obj2).getClass();
                UserRatingBottomSheetKt.a(this.b, (IconType) this.c, this.d, (String) this.e, (List) this.f, (String) this.g, this.h, this.i, this.j, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.k | 1), this.l);
                break;
            case 1:
                ((Integer) obj2).getClass();
                UserRatingBottomSheetKt.a(this.b, (IconType) this.c, this.d, (String) this.e, (List) this.f, (String) this.g, this.h, this.i, this.j, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.k | 1), this.l);
                break;
            default:
                ((Integer) obj2).getClass();
                SubcomposeAsyncImageKt.a((AsyncImageState) this.c, this.d, this.j, this.h, (Function1) this.e, (Alignment) this.g, (ContentScale) this.f, this.b, this.i, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.k | 1), RecomposeScopeImplKt.updateChangedFlags(this.l));
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ rn1(AsyncImageState asyncImageState, String str, Modifier modifier, Function1 function1, Function1 function2, Alignment alignment, ContentScale contentScale, int i, Function3 function3, int i2, int i3) {
        this.f19227a = 2;
        this.c = asyncImageState;
        this.d = str;
        this.j = modifier;
        this.h = function1;
        this.e = function2;
        this.g = alignment;
        this.f = contentScale;
        this.b = i;
        this.i = function3;
        this.k = i2;
        this.l = i3;
    }
}

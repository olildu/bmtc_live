package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.home.ui.profile.ProfileDrawerCardAvatarKt;
import app.chalo.providers.iconassetprovider.IconType;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zx0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20239a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ float e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    public /* synthetic */ zx0(Modifier modifier, Shape shape, float f, float f2, Function3 function3, int i, int i2) {
        this.f20239a = 2;
        this.f = modifier;
        this.b = shape;
        this.c = f;
        this.e = f2;
        this.d = function3;
        this.g = i;
        this.h = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f20239a;
        Unit unit = Unit.f17538a;
        int i2 = this.g;
        Object obj3 = this.d;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                Set set = ProfileDrawerCardAvatarKt.f3591a;
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                ProfileDrawerCardAvatarKt.a((String) obj4, this.c, (IconType) obj3, this.e, this.f, (Composer) obj, iUpdateChangedFlags, this.h);
                break;
            case 1:
                ((Integer) obj2).getClass();
                Set set2 = ProfileDrawerCardAvatarKt.f3591a;
                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                ProfileDrawerCardAvatarKt.a((String) obj4, this.c, (IconType) obj3, this.e, this.f, (Composer) obj, iUpdateChangedFlags2, this.h);
                break;
            default:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags3 = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                ChaloRoundedCardKt.b(this.f, (Shape) obj4, this.c, this.e, (Function3) obj3, (Composer) obj, iUpdateChangedFlags3, this.h);
                break;
        }
        return unit;
    }

    public /* synthetic */ zx0(String str, float f, IconType iconType, float f2, Modifier modifier, int i, int i2, int i3) {
        this.f20239a = i3;
        this.b = str;
        this.c = f;
        this.d = iconType;
        this.e = f2;
        this.f = modifier;
        this.g = i;
        this.h = i2;
    }
}

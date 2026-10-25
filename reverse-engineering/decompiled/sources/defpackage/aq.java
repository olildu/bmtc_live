package defpackage;

import com.google.android.material.color.utilities.DynamicColor;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class aq implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11135a;

    public /* synthetic */ aq(int i) {
        this.f11135a = i;
    }

    public /* synthetic */ Function andThen(Function function) {
        int i = this.f11135a;
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f11135a) {
            case 0:
                return ((ImmutableSet.Builder) obj).k();
            case 1:
                return ((ImmutableList.Builder) obj).j();
            case 2:
                ((DynamicScheme) obj).getClass();
                return null;
            case 3:
                MaterialDynamicColors.e((DynamicScheme) obj);
                throw null;
            case 4:
                ((DynamicScheme) obj).getClass();
                return null;
            case 5:
                MaterialDynamicColors.e((DynamicScheme) obj);
                throw null;
            case 6:
                ((DynamicScheme) obj).getClass();
                return null;
            case 7:
                throw null;
            case 8:
                ((DynamicScheme) obj).getClass();
                return null;
            case 9:
                throw null;
            case 10:
                ((DynamicScheme) obj).getClass();
                return null;
            case 11:
                throw null;
            case 12:
                ((DynamicScheme) obj).getClass();
                return null;
            case 13:
                throw null;
            case 14:
                ((DynamicScheme) obj).getClass();
                return null;
            case 15:
                throw null;
            case 16:
                throw null;
            case 17:
                ((DynamicScheme) obj).getClass();
                return null;
            case 18:
                throw null;
            case 19:
                throw null;
            case 20:
                ((DynamicScheme) obj).getClass();
                return null;
            case 21:
                MaterialDynamicColors.d((DynamicScheme) obj);
                throw null;
            case 22:
                ((DynamicScheme) obj).getClass();
                return null;
            case 23:
                throw null;
            case 24:
                ((DynamicScheme) obj).getClass();
                return null;
            case 25:
                ((DynamicScheme) obj).getClass();
                return null;
            case 26:
                throw null;
            case 27:
                ((DynamicScheme) obj).getClass();
                return null;
            case 28:
                throw null;
            default:
                return new DynamicColor("background", new aq(22), new aq(23), true, null, null, null);
        }
    }

    public /* synthetic */ Function compose(Function function) {
        int i = this.f11135a;
        return Function$CC.$default$compose(this, function);
    }
}

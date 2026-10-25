package defpackage;

import androidx.compose.material3.carousel.CarouselPagerState;
import androidx.compose.material3.carousel.CarouselState;
import androidx.compose.runtime.internal.ComposableLambda;
import app.chalo.premiumbus.ui.slotselection.compose.ComposableSingletons$PremiumBusScrollableTabRowKt;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KType;
import kotlinx.serialization.SerializersCacheKt;
import kotlinx.serialization.internal.SerializerCache;
import okhttp3.Handshake;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class af implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f281a;
    public final /* synthetic */ List b;

    public /* synthetic */ af(List list, int i) {
        this.f281a = i;
        this.b = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f281a;
        List list = this.b;
        switch (i) {
            case 0:
                return Integer.valueOf(list.size());
            case 1:
                return Integer.valueOf(CarouselPagerState.Saver$lambda$2$lambda$1(list));
            case 2:
                return Integer.valueOf(CarouselState.Saver$lambda$3$lambda$2(list));
            case 3:
                return Integer.valueOf(list.size());
            case 4:
                return Integer.valueOf(list.size());
            case 5:
                ComposableLambda composableLambda = ComposableSingletons$PremiumBusScrollableTabRowKt.f7906a;
                return Integer.valueOf(list.size());
            case 6:
                return Integer.valueOf(list.size());
            case 7:
                return Handshake.Companion.get$lambda$3(list);
            case 8:
                return Handshake.Companion.handshake$lambda$2(list);
            case 9:
                return Integer.valueOf(list.size());
            case 10:
                return Integer.valueOf(list.size());
            case 11:
                return Integer.valueOf(list.size());
            case 12:
                return Integer.valueOf(list.size());
            case 13:
                return Integer.valueOf(list.size());
            case 14:
                return Integer.valueOf(list.size());
            case 15:
                SerializerCache serializerCache = SerializersCacheKt.f18094a;
                return ((KType) list.get(0)).getF17621a();
            default:
                SerializerCache serializerCache2 = SerializersCacheKt.f18094a;
                return ((KType) list.get(0)).getF17621a();
        }
    }
}

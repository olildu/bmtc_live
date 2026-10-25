package defpackage;

import android.content.Context;
import coil3.ImageLoader;
import coil3.SingletonImageLoader;
import coil3.SingletonImageLoaderKt;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class m91 implements SingletonImageLoader.Factory {
    @Override // coil3.SingletonImageLoader.Factory
    public final ImageLoader a(Context context) {
        m91 m91Var = SingletonImageLoaderKt.f11473a;
        ImageLoader.Builder builder = new ImageLoader.Builder(context);
        builder.d.f11464a.put(SingletonImageLoaderKt.b, Unit.f17538a);
        return builder.a();
    }
}

package app.chalo.providers.stringprovider;

import android.content.Context;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/providers/stringprovider/AndroidPlatformStringOverrideProvider;", "Lapp/chalo/providers/stringprovider/PlatformStringOverrideProvider;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AndroidPlatformStringOverrideProvider implements PlatformStringOverrideProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8865a;

    public AndroidPlatformStringOverrideProvider(Context context) {
        this.f8865a = context;
    }

    @Override // app.chalo.providers.stringprovider.PlatformStringOverrideProvider
    public final Object a(String str, Object[] objArr) {
        Context context = this.f8865a;
        int identifier = context.getResources().getIdentifier(str, TypedValues.Custom.S_STRING, context.getPackageName());
        if (identifier == 0) {
            return null;
        }
        return context.getString(identifier, Arrays.copyOf(objArr, objArr.length));
    }
}

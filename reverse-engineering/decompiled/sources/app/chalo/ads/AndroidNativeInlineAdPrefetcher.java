package app.chalo.ads;

import com.google.android.gms.ads.nativead.NativeAd;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/ads/AndroidNativeInlineAdPrefetcher;", "", "InteractionListener", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface AndroidNativeInlineAdPrefetcher {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/AndroidNativeInlineAdPrefetcher$InteractionListener;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface InteractionListener {
        void a();

        void b();
    }

    NativeAd a(String str, Map map);

    Object b(String str, Map map, ContinuationImpl continuationImpl);

    void c(String str, Map map);

    void d(NativeAd nativeAd, NativeInlineAdKt$NativeInlineAd$4$1$bindLoadedAd$6 nativeInlineAdKt$NativeInlineAd$4$1$bindLoadedAd$6);
}

package app.chalo.juspay;

import kotlin.Metadata;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/HyperServiceHolderSDK;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface HyperServiceHolderSDK {
    void a(int i, int i2, Object obj);

    boolean b();

    void c(JsonObject jsonObject);

    void d(JsonObject jsonObject);

    void e(JuspaySdkAdapterImpl$juspayResultHandler$2$1 juspaySdkAdapterImpl$juspayResultHandler$2$1);

    boolean onBackPressed();

    void terminate();
}

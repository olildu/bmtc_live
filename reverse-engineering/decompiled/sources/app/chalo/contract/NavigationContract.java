package app.chalo.contract;

import app.chalo.scenes.PopUpToConfig;
import app.chalo.scenes.args.SceneArgs;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/contract/NavigationContract;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface NavigationContract {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ SceneArgs a(NavigationContract navigationContract, String str, String str2, String str3, ProductTypeForReceipt productTypeForReceipt, int i) {
            if ((i & 4) != 0) {
                str3 = null;
            }
            return navigationContract.a(str, str2, str3, productTypeForReceipt);
        }

        public static /* synthetic */ void b(NavigationContract navigationContract, String str, String str2, String str3, String str4, String str5, PopUpToConfig.Finish finish, int i) {
            if ((i & 4) != 0) {
                str3 = null;
            }
            if ((i & 32) != 0) {
                finish = null;
            }
            navigationContract.b(str, str2, str3, str4, str5, finish);
        }
    }

    SceneArgs a(String str, String str2, String str3, ProductTypeForReceipt productTypeForReceipt);

    void b(String str, String str2, String str3, String str4, String str5, PopUpToConfig popUpToConfig);

    void c(SceneArgs sceneArgs);
}

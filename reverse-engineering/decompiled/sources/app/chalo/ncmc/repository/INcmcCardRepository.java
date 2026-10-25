package app.chalo.ncmc.repository;

import app.chalo.models.CardRechargeConfiguration;
import app.chalo.ncmc.data.appmodel.IntentHashRequestAppModel;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/repository/INcmcCardRepository;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface INcmcCardRepository {
    Object a(String str, ContinuationImpl continuationImpl, boolean z);

    Object b(int i, String str, String str2, String str3, String str4, ContinuationImpl continuationImpl);

    Object c(String str, ContinuationImpl continuationImpl);

    Object d(String str, ContinuationImpl continuationImpl);

    Serializable e(String str, ContinuationImpl continuationImpl);

    Object f(IntentHashRequestAppModel intentHashRequestAppModel, ContinuationImpl continuationImpl);

    Object g(String str, String str2, String str3, String str4, ContinuationImpl continuationImpl);

    Object h(String str, ContinuationImpl continuationImpl);

    Object i(long j, String str, String str2, String str3, String str4, String str5, Continuation continuation);

    Object j(String str, ContinuationImpl continuationImpl);

    Object k(long j, String str, String str2, String str3, ContinuationImpl continuationImpl);

    Object l(String str, long j, CardRechargeConfiguration cardRechargeConfiguration, String str2, ContinuationImpl continuationImpl);

    Object m(int i, String str, String str2, String str3, String str4, Continuation continuation);

    Object n(String str, String str2, String str3, ContinuationImpl continuationImpl, boolean z);

    Serializable o(int i, String str, ContinuationImpl continuationImpl);
}

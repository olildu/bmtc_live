package app.chalo.sos.feature;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/sos/feature/SosContactsFeature;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SosContactsFeature {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    Object a(Continuation continuation);

    Object b(String str, Continuation continuation);

    SosContactsFeatureImpl$getAllSosContact$$inlined$map$1 c();

    Object d(List list, ContinuationImpl continuationImpl);

    Object e(SosContact sosContact, ContinuationImpl continuationImpl);

    Object f(SosContact sosContact, Continuation continuation);

    Object g(Continuation continuation);

    SosContactsFeatureImpl$getSosMessage$$inlined$map$1 h();

    Object i(long j, Continuation continuation);
}

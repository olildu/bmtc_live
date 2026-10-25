package app.chalo.ncmc.domain;

import app.chalo.ncmc.data.CardOptions;
import app.chalo.ncmc.data.LinkCardConfig;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import in.juspay.hypersdk.analytics.LogConstants;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/domain/GetLinkCardConfigUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetLinkCardConfigUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GetChaloCardExpOptionsUseCase f6238a;
    public final CityProvider b;

    public GetLinkCardConfigUseCase(GetChaloCardExpOptionsUseCase getChaloCardExpOptionsUseCase, CityProvider cityProvider) {
        this.f6238a = getChaloCardExpOptionsUseCase;
        this.b = cityProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        GetLinkCardConfigUseCase$invoke$1 getLinkCardConfigUseCase$invoke$1;
        LinkCardConfig linkCardConfig;
        Object obj;
        Object next;
        if (continuationImpl instanceof GetLinkCardConfigUseCase$invoke$1) {
            getLinkCardConfigUseCase$invoke$1 = (GetLinkCardConfigUseCase$invoke$1) continuationImpl;
            int i = getLinkCardConfigUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getLinkCardConfigUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getLinkCardConfigUseCase$invoke$1 = new GetLinkCardConfigUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getLinkCardConfigUseCase$invoke$1 = new GetLinkCardConfigUseCase$invoke$1(this, continuationImpl);
        }
        Object obj2 = getLinkCardConfigUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getLinkCardConfigUseCase$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(obj2);
            LinkCardConfig.INSTANCE.getClass();
            LinkCardConfig linkCardConfig2 = LinkCardConfig.i;
            getLinkCardConfigUseCase$invoke$1.L$0 = linkCardConfig2;
            getLinkCardConfigUseCase$invoke$1.label = 1;
            Object objA = this.f6238a.a(getLinkCardConfigUseCase$invoke$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            linkCardConfig = linkCardConfig2;
            obj2 = objA;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            linkCardConfig = (LinkCardConfig) getLinkCardConfigUseCase$invoke$1.L$0;
            ResultKt.b(obj2);
        }
        CardOptions cardOptions = (CardOptions) obj2;
        if (cardOptions != null) {
            List list = cardOptions.b;
            String strB = CityProviderKt.b(this.b);
            if (strB != null) {
                String lowerCase = strB.toLowerCase(Locale.ROOT);
                Intrinsics.h(lowerCase, "toLowerCase(...)");
                List list2 = list;
                Iterator it = list2.iterator();
                do {
                    obj = null;
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.d(((LinkCardConfig) next).f6030a, lowerCase));
                LinkCardConfig linkCardConfig3 = (LinkCardConfig) next;
                if (linkCardConfig3 != null) {
                    return linkCardConfig3;
                }
                for (Object obj3 : list2) {
                    if (Intrinsics.d(((LinkCardConfig) obj3).f6030a, LogConstants.DEFAULT_CHANNEL)) {
                        obj = obj3;
                        break;
                    }
                }
                LinkCardConfig linkCardConfig4 = (LinkCardConfig) obj;
                if (linkCardConfig4 != null) {
                    return linkCardConfig4;
                }
            }
        }
        return linkCardConfig;
    }
}

package app.chalo.ncmc.remote;

import app.chalo.models.CreateCardRechargeOrderRequestApiModel;
import app.chalo.ncmc.data.NcmcOfflineRechargeConfirmRequestModel;
import app.chalo.ncmc.data.NcmcOfflineRechargeRequestApiModel;
import app.chalo.ncmc.data.NcmcOnlineCardRechargeRequestApiModel;
import app.chalo.ncmc.data.apirequestmodel.BlockNCMCCardApiRequestModel;
import app.chalo.ncmc.data.apirequestmodel.ChangeNcmcCardPinApiRequestModel;
import app.chalo.ncmc.data.apirequestmodel.IntentHashRequestApiModel;
import app.chalo.ncmc.data.apirequestmodel.LinkChaloCardRequestApiModel;
import app.chalo.ncmc.domain.CardValidationRequestApiModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/remote/INcmcCardRemoteDataSource;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface INcmcCardRemoteDataSource {
    Object a(String str, ContinuationImpl continuationImpl, boolean z);

    Object b(int i, String str, String str2, String str3, String str4, ContinuationImpl continuationImpl);

    Object c(String str, ContinuationImpl continuationImpl);

    Object d(String str, ContinuationImpl continuationImpl);

    Object e(String str, ContinuationImpl continuationImpl);

    Object f(ChangeNcmcCardPinApiRequestModel changeNcmcCardPinApiRequestModel, ContinuationImpl continuationImpl);

    Object g(String str, ContinuationImpl continuationImpl);

    Object h(BlockNCMCCardApiRequestModel blockNCMCCardApiRequestModel, ContinuationImpl continuationImpl);

    Object i(NcmcOfflineRechargeRequestApiModel ncmcOfflineRechargeRequestApiModel, ContinuationImpl continuationImpl);

    Object j(CreateCardRechargeOrderRequestApiModel createCardRechargeOrderRequestApiModel, ContinuationImpl continuationImpl);

    Object k(LinkChaloCardRequestApiModel linkChaloCardRequestApiModel, ContinuationImpl continuationImpl);

    Object l(CardValidationRequestApiModel cardValidationRequestApiModel, ContinuationImpl continuationImpl);

    Object m(NcmcOnlineCardRechargeRequestApiModel ncmcOnlineCardRechargeRequestApiModel, ContinuationImpl continuationImpl);

    Object n(NcmcOfflineRechargeConfirmRequestModel ncmcOfflineRechargeConfirmRequestModel, ContinuationImpl continuationImpl);

    Object o(IntentHashRequestApiModel intentHashRequestApiModel, ContinuationImpl continuationImpl);
}

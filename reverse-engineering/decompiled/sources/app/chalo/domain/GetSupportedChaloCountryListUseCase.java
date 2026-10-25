package app.chalo.domain;

import app.chalo.config.ChaloPhoneNumberCountry;
import app.chalo.config.CountryPhoneNumberConfig;
import app.chalo.utils.ChaloCountryDetails;
import app.chalo.utils.ChaloSupportedCountry;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/domain/GetSupportedChaloCountryListUseCase;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetSupportedChaloCountryListUseCase {
    public static ArrayList a() {
        List<ChaloCountryDetails> list = ChaloSupportedCountry.f10417a;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
        for (ChaloCountryDetails chaloCountryDetails : list) {
            ChaloPhoneNumberCountry.Companion companion = ChaloPhoneNumberCountry.INSTANCE;
            String str = chaloCountryDetails.f10416a;
            companion.getClass();
            ChaloPhoneNumberCountry chaloPhoneNumberCountryA = ChaloPhoneNumberCountry.Companion.a(str);
            Integer num = (Integer) CollectionsKt.H(chaloCountryDetails.d);
            arrayList.add(new CountryPhoneNumberConfig(chaloPhoneNumberCountryA, chaloCountryDetails.b, chaloCountryDetails.c, num != null ? num.intValue() : 0));
        }
        return arrayList;
    }
}

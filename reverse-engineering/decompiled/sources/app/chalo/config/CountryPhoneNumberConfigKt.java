package app.chalo.config;

import app.chalo.providers.iconassetprovider.IconType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CountryPhoneNumberConfigKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1939a;

        static {
            int[] iArr = new int[ChaloPhoneNumberCountry.values().length];
            try {
                iArr[ChaloPhoneNumberCountry.India.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChaloPhoneNumberCountry.Philippines.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChaloPhoneNumberCountry.Thailand.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ChaloPhoneNumberCountry.Fiji.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ChaloPhoneNumberCountry.Peru.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ChaloPhoneNumberCountry.Unknown.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f1939a = iArr;
        }
    }

    public static final IconType a(ChaloPhoneNumberCountry chaloPhoneNumberCountry) {
        Intrinsics.i(chaloPhoneNumberCountry, "<this>");
        switch (WhenMappings.f1939a[chaloPhoneNumberCountry.ordinal()]) {
            case 1:
                return IconType.IC_FLAG_INDIA;
            case 2:
                return IconType.IC_FLAG_PHILIPPINES;
            case 3:
                return IconType.IC_FLAG_THAILAND;
            case 4:
                return IconType.IC_FLAG_FIJI;
            case 5:
                return IconType.IC_FLAG_PERU;
            case 6:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}

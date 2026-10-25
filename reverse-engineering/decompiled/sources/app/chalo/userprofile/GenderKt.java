package app.chalo.userprofile;

import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class GenderKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10303a;

        static {
            int[] iArr = new int[Gender.values().length];
            try {
                iArr[Gender.MALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Gender.FEMALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Gender.OTHER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Gender.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f10303a = iArr;
        }
    }

    public static final StringEnum a(Gender gender) {
        Intrinsics.i(gender, "<this>");
        int i = WhenMappings.f10303a[gender.ordinal()];
        if (i == 1) {
            return StringEnum.MALE;
        }
        if (i == 2) {
            return StringEnum.FEMALE;
        }
        if (i == 3) {
            return StringEnum.OTHER_SEX;
        }
        if (i == 4) {
            return StringEnum.NOT_SET;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final IconType b(Gender gender, IconType fallbackGenderIcon) {
        Intrinsics.i(gender, "<this>");
        Intrinsics.i(fallbackGenderIcon, "fallbackGenderIcon");
        int i = WhenMappings.f10303a[gender.ordinal()];
        if (i == 1) {
            return IconType.IC_USER_MALE;
        }
        if (i == 2) {
            return IconType.IC_USER_FEMALE;
        }
        if (i == 3) {
            return IconType.IC_USER_TRANSGENDER;
        }
        if (i == 4) {
            return fallbackGenderIcon;
        }
        throw new NoWhenBranchMatchedException();
    }
}

package app.chalo.validationsdk.blevalidation.ui;

import defpackage.r30;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/BleValidationState;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BleValidationState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BleValidationLayoutType f10610a;
    public final BleValidationLayoutInfo b;
    public final ValidationProcessSpecificInfo c;
    public final BleValidationBottomsheetType d;
    public final BleValidationBottomsheetInfo e;
    public final boolean f;
    public final BleValidationDialogInfo g;
    public final boolean h;
    public final List i;
    public final BleValidationMetaData j;

    public BleValidationState(BleValidationLayoutType layoutType, BleValidationLayoutInfo bleValidationLayoutInfo, ValidationProcessSpecificInfo validationProcessSpecificInfo, BleValidationBottomsheetType bleValidationBottomsheetType, BleValidationBottomsheetInfo bleValidationBottomsheetInfo, boolean z, BleValidationDialogInfo bleValidationDialogInfo, boolean z2, List bleDebuggingMessageList, BleValidationMetaData bleValidationMetaData) {
        Intrinsics.i(layoutType, "layoutType");
        Intrinsics.i(bleValidationBottomsheetType, "bleValidationBottomsheetType");
        Intrinsics.i(bleDebuggingMessageList, "bleDebuggingMessageList");
        this.f10610a = layoutType;
        this.b = bleValidationLayoutInfo;
        this.c = validationProcessSpecificInfo;
        this.d = bleValidationBottomsheetType;
        this.e = bleValidationBottomsheetInfo;
        this.f = z;
        this.g = bleValidationDialogInfo;
        this.h = z2;
        this.i = bleDebuggingMessageList;
        this.j = bleValidationMetaData;
    }

    public static BleValidationState a(BleValidationState bleValidationState, BleValidationLayoutType bleValidationLayoutType, BleValidationLayoutInfo bleValidationLayoutInfo, ValidationProcessSpecificInfo validationProcessSpecificInfo, BleValidationBottomsheetType bleValidationBottomsheetType, BleValidationBottomsheetInfo bleValidationBottomsheetInfo, boolean z, BleValidationDialogInfo bleValidationDialogInfo, boolean z2, ArrayList arrayList, BleValidationMetaData bleValidationMetaData, int i) {
        if ((i & 1) != 0) {
            bleValidationLayoutType = bleValidationState.f10610a;
        }
        BleValidationLayoutType layoutType = bleValidationLayoutType;
        if ((i & 2) != 0) {
            bleValidationLayoutInfo = bleValidationState.b;
        }
        BleValidationLayoutInfo bleValidationLayoutInfo2 = bleValidationLayoutInfo;
        if ((i & 4) != 0) {
            validationProcessSpecificInfo = bleValidationState.c;
        }
        ValidationProcessSpecificInfo validationProcessSpecificInfo2 = validationProcessSpecificInfo;
        if ((i & 8) != 0) {
            bleValidationBottomsheetType = bleValidationState.d;
        }
        BleValidationBottomsheetType bleValidationBottomsheetType2 = bleValidationBottomsheetType;
        BleValidationBottomsheetInfo bleValidationBottomsheetInfo2 = (i & 16) != 0 ? bleValidationState.e : bleValidationBottomsheetInfo;
        boolean z3 = (i & 32) != 0 ? bleValidationState.f : z;
        BleValidationDialogInfo bleValidationDialogInfo2 = (i & 64) != 0 ? bleValidationState.g : bleValidationDialogInfo;
        boolean z4 = (i & 128) != 0 ? bleValidationState.h : z2;
        List bleDebuggingMessageList = (i & 256) != 0 ? bleValidationState.i : arrayList;
        BleValidationMetaData bleValidationMetaData2 = (i & 512) != 0 ? bleValidationState.j : bleValidationMetaData;
        bleValidationState.getClass();
        bleValidationState.getClass();
        bleValidationState.getClass();
        Intrinsics.i(layoutType, "layoutType");
        Intrinsics.i(validationProcessSpecificInfo2, "validationProcessSpecificInfo");
        Intrinsics.i(bleValidationBottomsheetType2, "bleValidationBottomsheetType");
        Intrinsics.i(bleDebuggingMessageList, "bleDebuggingMessageList");
        return new BleValidationState(layoutType, bleValidationLayoutInfo2, validationProcessSpecificInfo2, bleValidationBottomsheetType2, bleValidationBottomsheetInfo2, z3, bleValidationDialogInfo2, z4, bleDebuggingMessageList, bleValidationMetaData2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleValidationState)) {
            return false;
        }
        BleValidationState bleValidationState = (BleValidationState) obj;
        return this.f10610a == bleValidationState.f10610a && Intrinsics.d(this.b, bleValidationState.b) && Intrinsics.d(this.c, bleValidationState.c) && this.d == bleValidationState.d && Intrinsics.d(this.e, bleValidationState.e) && this.f == bleValidationState.f && Intrinsics.d(this.g, bleValidationState.g) && this.h == bleValidationState.h && Intrinsics.d(this.i, bleValidationState.i) && Intrinsics.d(this.j, bleValidationState.j);
    }

    public final int hashCode() {
        int iHashCode = this.f10610a.hashCode() * 31;
        BleValidationLayoutInfo bleValidationLayoutInfo = this.b;
        int iHashCode2 = (this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (bleValidationLayoutInfo == null ? 0 : bleValidationLayoutInfo.hashCode())) * 31)) * 31)) * 31;
        BleValidationBottomsheetInfo bleValidationBottomsheetInfo = this.e;
        int iHashCode3 = (((iHashCode2 + (bleValidationBottomsheetInfo == null ? 0 : bleValidationBottomsheetInfo.hashCode())) * 31) + (this.f ? 1231 : 1237)) * 31;
        BleValidationDialogInfo bleValidationDialogInfo = this.g;
        int iB = r30.b((((iHashCode3 + (bleValidationDialogInfo == null ? 0 : bleValidationDialogInfo.hashCode())) * 31) + (this.h ? 1231 : 1237)) * 31, 31, this.i);
        BleValidationMetaData bleValidationMetaData = this.j;
        return ((iB + (bleValidationMetaData != null ? bleValidationMetaData.hashCode() : 0)) * 961) + 1237;
    }

    public final String toString() {
        return "BleValidationState(layoutType=" + this.f10610a + ", bleValidationLayoutInfo=" + this.b + ", validationProcessSpecificInfo=" + this.c + ", bleValidationBottomsheetType=" + this.d + ", bleValidationBottomsheetInfo=" + this.e + ", shouldShowBleValidationExpiredDialog=" + this.f + ", bleValidationExpiredDialogInfo=" + this.g + ", shouldShowLoader=" + this.h + ", bleDebuggingMessageList=" + this.i + ", bleValidationMetaData=" + this.j + ", iosValidationOptions=null, shouldDismissBleFlow=false)";
    }

    public BleValidationState() {
        this(BleValidationLayoutType.BLE_VALIDATION, null, new ValidationProcessSpecificInfo(null, null, 31, null, false), BleValidationBottomsheetType.NONE, null, false, null, false, EmptyList.f17557a, null);
    }
}

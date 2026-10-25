package defpackage;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class gm1 {
    public static int a(String str) {
        str.getClass();
        switch (str) {
            case "dimension":
                return TypedValues.Custom.TYPE_DIMENSION;
            case "reference":
                return TypedValues.Custom.TYPE_REFERENCE;
            case "string":
                return TypedValues.Custom.TYPE_STRING;
            case "boolean":
                return TypedValues.Custom.TYPE_BOOLEAN;
            case "color":
                return TypedValues.Custom.TYPE_COLOR;
            case "float":
                return TypedValues.Custom.TYPE_FLOAT;
            case "integer":
                return 900;
            default:
                return -1;
        }
    }
}
